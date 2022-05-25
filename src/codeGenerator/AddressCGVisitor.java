package codeGenerator;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.ArrayType;
import ast.types.IntType;
import ast.types.StructType;

public class AddressCGVisitor extends AbstractCGVisitor<FuncDefinition, Void>{

    // Variables of the class
    private CodeGenerator codeGenerator;
    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    @Override
    public Void visit(Variable variable, FuncDefinition unused){
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
    public Void visit(ArrayAccess arrayAccess, FuncDefinition unused){
        /*
        Address[[Indexing: expression_1 -> expression_2 expression_3]]()=
	        Address[[expression_2]]()
	        Value[[expression_3]]()
	        <PUSHI> expression_1.type.numberofbytes
	        <MULTI>
	        <ADDI>
         */
        arrayAccess.getLeft().accept(this, unused);
        arrayAccess.getRight().accept(this.valueCGVisitor, unused);
        ArrayType array = (ArrayType) arrayAccess.getLeft().getType();
        codeGenerator.push(array.getOf().numberOfBytes());
        codeGenerator.mul(IntType.getIntType());
        codeGenerator.add(IntType.getIntType());
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, FuncDefinition unused){
        /*
        Address[[FieldAccess: expression_1 -> expression_2 ID]]()=
	        Address[[expression_2]]()
            <PUSHI> expression_2.type.id.offset
	        <ADDI>
         */
        fieldAccess.getExpression().accept(this, unused);
        StructType type = (StructType) fieldAccess.getExpression().getType();
        codeGenerator.push(type.getField(fieldAccess.getFieldName()).getOffset());
        codeGenerator.add(IntType.getIntType());
        return null;
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor){
        this.valueCGVisitor = valueCGVisitor;
    }


}
