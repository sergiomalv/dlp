package codeGenerator;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Expression;
import ast.expressions.FunctionInvocation;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor<FuncDefinition, Void> {

    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;
    private CodeGenerator codeGenerator;

    public ExecuteCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
        addressCGVisitor = new AddressCGVisitor(codeGenerator);
        valueCGVisitor = new ValueCGVisitor(codeGenerator);
        addressCGVisitor.setValueCGVisitor(valueCGVisitor);
        valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
    }

    @Override
    public Void visit(Program program, FuncDefinition unused){
        /*
        Execute[[Program: Program -> Definition*]]()=
                FOR (Definition de : definition*)
                    if instance of VarDefinition
                        Execute[[de]]()
                <Call MAIN>
	            <HALT>
                FOR(Definition de : definition*)
                    if instance of FuncDefinition
                        execute[[de]]()
         */
        for (Definition de : program.getDefinitions()){
            if (de instanceof VarDefinition){
                de.accept(this, unused);
            }
        }
        codeGenerator.functionComment("Invocation to the main function");
        codeGenerator.call("main");
        codeGenerator.halt();
        for(Definition de : program.getDefinitions()){
            if (de instanceof FuncDefinition){
                de.accept(this, unused);
            }
        }
        return null;
    }

    @Override
    public Void visit(VarDefinition varDefinition, FuncDefinition unused){
        codeGenerator.commentVariables(varDefinition.getType() + " " + varDefinition.getName() +
                " (offset " + varDefinition.getOffset() + ")");
        return null;
    }
    @Override
    public Void visit(FuncDefinition funcDefinition, FuncDefinition unused){
        /*
        Execute[[FuncDefinition : definition -> name : String type statements*]]()=
            <ENTER> definition.localVariablesBytes
            for (VarDefinition varDefinition : ((FunctionType) funcDefinition.getType()).parameters)
                Execute[[varDefinition]]
            for (VarDefinition varDefinition : funcDefinition.variables)
                Execute[[varDefinition]]
            for (Statements state : statements*)
                Execute[[state]]
            if (type.returnType instance of VoidType)
                <RET> 0 <,> definition.localVariablesBytes <,> type.numberOfBytes
         */
        codeGenerator.line(funcDefinition.getLine());
        codeGenerator.label(funcDefinition.getName());

        codeGenerator.commentVariables("Parameters");
        for (VarDefinition varDefinition : ((FunctionType) funcDefinition.getType()).getParameters()){
            varDefinition.accept(this, unused);
        }
        codeGenerator.commentVariables("Local variables");
        for (VarDefinition varDefinition : funcDefinition.getVariables()){
            varDefinition.accept(this, unused);
        }

        codeGenerator.enter(funcDefinition.getLocalVariablesBytes() * -1);

        for (Statement state : funcDefinition.getStatements()){
            state.accept(this, funcDefinition);
        }
        if (((FunctionType)funcDefinition.getType()).getType() instanceof VoidType){
            codeGenerator.ret(0, funcDefinition.getLocalVariablesBytes() * -1,
                    funcDefinition.getType().numberOfBytes());
        }
        return null;
    }

    @Override
    public Void visit(Assignment assignment, FuncDefinition unused){
        /*
        Execute[[Assignment : statement -> left : expr right : expr]]()=
            Address[[left]]
            Value[[right]]
            <STORE> left.type
         */
        codeGenerator.line(assignment.getLine());
        codeGenerator.commentVariables("Assignment");
        assignment.getLeft().accept(addressCGVisitor, unused);
        assignment.getRight().accept(valueCGVisitor, unused);
        codeGenerator.store(assignment.getLeft().getType());
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, FuncDefinition unused){
        /*
        Execute[[FunctionInvocation: statement -> var : Variable expression*]]()
	        Value[[(expression)statement]]()
	        if(((expression)statement).type instance of Void)
		        <POP>((expression)statement).type
         */
        codeGenerator.line(functionInvocation.getLine());
        functionInvocation.accept(valueCGVisitor, unused);
        if (!(functionInvocation.getType() instanceof VoidType)){
            codeGenerator.pop(functionInvocation.getType());
        }
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, FuncDefinition unused){
        /*
        Execute[[IfElse : statement -> expr ifBody: statement* elseBody: statement*]]()=
	        int else = cg.getLabel();
            int end = cg.getLabel();
            Value[[expr]]()
            <JZ label_> else
            for(statement st: ifBody)
                Execute[[st]]()
            <JMP label_> end
            <LABEL_> else <:>
            for(statement st: elseBody)
                Execute[[st]]()
            <JMP label_> end
            <LABEL_> end <:>
         */
        codeGenerator.line(ifElse.getLine());
        int elseN = codeGenerator.getLabel();
        int end = codeGenerator.getLabel();
        ifElse.getExpression().accept(valueCGVisitor, unused);
        codeGenerator.jz("else" + elseN);
        for (Statement st : ifElse.getIfBody()){
            st.accept(this, unused);
        }
        codeGenerator.jmp("end" + end);
        codeGenerator.label("else" + elseN);
        for (Statement st : ifElse.getElseBody()){
            st.accept(this, unused);
        }
        codeGenerator.jmp("end" + end);
        codeGenerator.label("end" + end);
        return null;
    }

    @Override
    public Void visit(Input input, FuncDefinition unused){
        /*
        Execute[[Input : Statement -> expression]]()=
		    Address[[expression]]()
		    <IN> expression.type
		    <STORE> expression.type
         */
        codeGenerator.line(input.getLine());
        for (Expression expr : input.getExpressions()){
            codeGenerator.commentVariables("Read");
            expr.accept(addressCGVisitor, unused);
            codeGenerator.in(expr.getType());
            codeGenerator.store(expr.getType());
        }
        return null;
    }

    @Override
    public Void visit(Print print,FuncDefinition unused){
        /*
        Execute[[Print : Statement -> expression]]()=
		    Value[[expression]]()
		    <OUT> expression.type.suffix
         */
        for(Expression expr : print.getExpressions()){
            codeGenerator.line(print.getLine());
            codeGenerator.commentVariables("Write");
            expr.accept(valueCGVisitor, unused);
            codeGenerator.out(expr.getType());
        }
        return null;
    }

    @Override
    public Void visit(Return returnN, FuncDefinition unused){
        /*
        Execute[[Return: statement -> expression]](FunctionDefinition)=
	        Value[[expression]]()
	        <RET> expression.type.numberOfBytes <,> funcDefinition.localVariableBytes <,>
	            funcDefinition.type.numberOfBytes
         */
        codeGenerator.line(returnN.getLine());
        codeGenerator.commentVariables("Return");
        returnN.getExpression().accept(valueCGVisitor, unused);
        codeGenerator.ret(returnN.getExpression().getType().numberOfBytes(), unused.getLocalVariablesBytes() * -1,
                ((FunctionType)unused.getType()).parameters());
        return null;
    }

    @Override
    public Void visit(While whileN, FuncDefinition unused){
        /*
        execute[[While: statement -> expression statements*]]()=
            int condition = cg.getLabel();
            int end = cg.getLabel();
            <LABEL_> condition <:>
            Value[[expression]]()
            <JZ label_> end
            for(statement st: statements*)
                Execute[[st]]()
            <JMP label_> condition
            <LABEL_> end <:>
         */
        codeGenerator.line(whileN.getLine());
        int condition = codeGenerator.getLabel();
        int end = codeGenerator.getLabel();
        codeGenerator.label("condition" + condition);
        whileN.getExpression().accept(valueCGVisitor, unused);
        codeGenerator.jz("end" + end);
        for (Statement state : whileN.getStatements()){
            state.accept(this, unused);
        }
        codeGenerator.jmp("condition" + condition);
        codeGenerator.label("end" + end);
        return null;
    }

}
