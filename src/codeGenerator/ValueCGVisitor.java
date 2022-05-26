package codeGenerator;

import ast.definitions.FuncDefinition;
import ast.expressions.*;
import ast.types.IntType;
import ast.types.StructType;

public class ValueCGVisitor extends AbstractCGVisitor<FuncDefinition, Void>{

    private CodeGenerator codeGenerator;
    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    @Override
    public Void visit(Variable variable, FuncDefinition unused){
        /*
        Value[[Variable : expression -> ID]]()=
			Address[[expression]]()
			<LOAD> expression.type
         */
        variable.accept(addressCGVisitor, unused);
        codeGenerator.load(variable.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Arithmetic arithmetic, FuncDefinition unused){
        /*
        Value[[Arithmetic : expression -> left: expression right: expression operator: String]]()=
            Value[[left]]()
            Value[[right]]()
            <Arithmetic> expression.left.type <,> operator
         */
        arithmetic.getLeft().accept(this, unused);
        arithmetic.getRight().accept(this, unused);
        codeGenerator.arithmetic(arithmetic.getOperator(), arithmetic.getType());
        return null;
    }

    @Override
    public Void visit(Pow p, FuncDefinition unused){
        /*
        Value[[Pow : expression -> left : expr right : expr]]()=

         */
        int i = 1;
        int fin = p.getRight();
        p.getLeft().accept(this, unused);
        while (i < fin){
            p.getLeft().accept(this, unused);
            codeGenerator.mul(p.getLeft().getType());
            i++;
        }
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, FuncDefinition unused){
        /*
        Value[[ArrayAccess: expression -> left: expression right: expression]]()=
            Address[[ArrayAccess]]()
            <LOAD> ArrayAccess.type
         */
        arrayAccess.accept(addressCGVisitor, unused);
        codeGenerator.load(arrayAccess.getType());
        return null;
    }

    @Override
    public Void visit(Cast cast, FuncDefinition unused){
        /*
        Value[[Cast: expression -> type : Type expr]]()=
            Value[[Cast]]()
            <CAST> expr <,> cast.type
         */
        cast.getExpression().accept(this, unused);
        codeGenerator.cast(cast.getExpression().getType(), cast.getType());
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, FuncDefinition unused){
        /*
        Value[[CharLiteral : expression -> literal]]()=
            <PUSHB> CharLiteral.value
         */
        codeGenerator.push(charLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(Comparison comparison, FuncDefinition unused){
        /*
        Value[[Comparison : expression -> left: expression right: expression operator: String]]()=
            Value[[left]]()
            Value[[right]]()
            <COMPARISON> operator <,> comparison.type
         */
        comparison.getLeft().accept(this, unused);
        comparison.getRight().accept(this, unused);
        codeGenerator.comparison(comparison.getOperator(), comparison.getType());
        return null;
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, FuncDefinition unused){
        /*
        Value[[CharLiteral : expression -> literal]]()=
            <PUSHF> CharLiteral.value
         */
        codeGenerator.push(doubleLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, FuncDefinition unused){
        /*
        Value[[FieldAccess : expr -> fieldName : String]]()=
            Address[[expr]]()
            <LOAD> expr.type
         */
        fieldAccess.accept(addressCGVisitor, unused);
        codeGenerator.load(((StructType) fieldAccess.getExpression().getType()).getField(fieldAccess.getFieldName())
                .getType());
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, FuncDefinition unused){
        /*
        Value[[FunctionInvocation: expression_1 -> expression_2 expression_3*]]()
	        for(expression e : expression_3*)
		        value[[e]]()
	    <CALL> expression_2.name
         */
        for (Expression expr : functionInvocation.getExpressions()){
            expr.accept(this, unused);
        }
        codeGenerator.call(functionInvocation.getVar().getName());
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, FuncDefinition unused){
        /*
        Value[[IntLiteral : expr -> value: int]]()=
            <PUSHI> expr.value
         */
        codeGenerator.push(intLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(Logic logic, FuncDefinition unused){
        /*
        Value[[Logic : expression -> left: expression right: expression operator: String]]()=
            Value[[left]]()
            Value[[right]]()
            <LOGIC> operator <,> comparison.type
         */
        logic.getLeft().accept(this, unused);
        logic.getRight().accept(this, unused);
        codeGenerator.logic(logic.getOperator());
        return null;
    }

    @Override
    public Void visit(Not not, FuncDefinition unused){
        /*
        Value[[Not : expression -> expr]]()=
            Value[[expr]]()
            <NOT>
         */
        not.getExpression().accept(this, unused);
        codeGenerator.not();
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, FuncDefinition unused){
        /*
        Value[[UnaryMinus : expression -> expr]]()=
            <PUSHI> 0
            <CAST> Int <,> expr.type
            Value[[expr]]()
            <SUB>
         */
        codeGenerator.push(0);
        codeGenerator.cast(IntType.getIntType(), unaryMinus.getType());
        unaryMinus.getExpression().accept(this, unused);
        codeGenerator.sub(unaryMinus.getType());
        return null;
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }
}
