package codeGenerator;

import ast.CodeGenerator;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.types.IntType;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void>{

    // Variables of the class
    private CodeGenerator codeGenerator;
    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    @Override
    public Void visit(Variable variable, Void unused){
        /*
        Address[[Variable: expression -> ID]]()=
	        if (expression.definition.scope == 0){ //GLOBAL
		        <PUSHA> expression.definition.offset
	        else
		        <PUSHA BP>
		        <PUSHI> expression.definition.offset
		        <ADDI>
         */
        if (variable.getDefinition().getScope() == 0){
            codeGenerator.pusha(((VarDefinition)variable.getDefinition()).getOffset());
        } else {
            codeGenerator.pushBP();
            codeGenerator.push(((VarDefinition)variable.getDefinition()).getOffset());
            codeGenerator.add(IntType.getIntType());
        }
        return null;
    }
}
