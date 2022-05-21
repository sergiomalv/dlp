package codeGenerator;

import ast.CodeGenerator;
import ast.definitions.VarDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.ArrayType;
import ast.types.IntType;
import ast.types.StructType;

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

    @Override
    public Void visit(ArrayAccess arrayAccess, Void unused){
        /*
        address[[Indexing: expression_1 -> expression_2 expression_3]]()=
	        address[[expression_2]]()
	        value[[expression_3]]()
	        <PUSHI> expression_1.type.numberofbytes
	        <MULTI>
	        <ADDI>
         */
        arrayAccess.getLeft().accept(this, null);
        arrayAccess.getRight().accept(this.valueCGVisitor, null);
        ArrayType array = (ArrayType) arrayAccess.getLeft().getType();
        codeGenerator.push(array.numberOfBytes());
        codeGenerator.mul(IntType.getIntType());
        codeGenerator.add(IntType.getIntType());
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void unused){
        /*
        address[[FieldAccess: expression_1 -> expression_2 ID]]()=
	        address[[expression_2]]()
            <PUSHI> expression_2.type.id.offset
	        <ADDI>
         */
        fieldAccess.accept(this, null);
        StructType type = (StructType) fieldAccess.getType();
        codeGenerator.push(type.getField(fieldAccess.getFieldName()).getOffset());
        codeGenerator.add(IntType.getIntType());
        return null;
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor){
        this.valueCGVisitor = valueCGVisitor;
    }
}
