package codeGenerator;

import ast.CodeGenerator;
import ast.expressions.*;
import ast.types.ArrayType;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void>{

    private CodeGenerator codeGenerator;
    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    @Override
    public Void visit(Variable variable, Void unused){
        /*
        Value[[Variable : expression -> ID]]()=
			Address[[expression]]()
			<LOAD> expression.type
         */
        variable.accept(addressCGVisitor, null);
        codeGenerator.load(variable.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Arithmetic arithmetic, Void unused){
        /*
        Value[[Arithmetic : expression -> left: expression right: expression operator: String]]()=
            Value[[left]]()
            Value[[right]]()
            <Arithmetic> expression.left.type operator
         */
        arithmetic.getLeft().accept(this, null);
        arithmetic.getRight().accept(this, null);
        codeGenerator.arithmetic(arithmetic.getOperator(), arithmetic.getType());
        return null;
    }

    @Override
    public Void visit(ArrayAccess arrayAccess, Void unused){
        /*
        Value[[ArrayAccess: expression -> left: expression right: expression]]()=
            Address[[ArrayAccess]]
            <LOAD> ArrayAccess.type
         */
        arrayAccess.accept(addressCGVisitor, null);
        codeGenerator.out(arrayAccess.getType());
        return null;
    }

    @Override
    public Void visit(Cast cast, Void unused){
        /*
        Value[[Cast: expression -> type : Type expr]]()=
            Value[[Cast]]
            <CAST> expr cast.type
         */
        cast.getExpression().accept(this, null);
        codeGenerator.cast(cast.getExpression().getType(), cast.getType());
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Void unused){
        /*
        Value[[CharLiteral : expression -> literal]]()=
            <PUSHB> CharLiteral.value
         */
        codeGenerator.push(charLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void unused){
        /*
        Value[[Comparison : expression -> left: expression right: expression operator: string]]()=
            Value[[left]]
            Value[[right]]
            <COMPARISON> operator comparison.type
         */
        comparison.getLeft().accept(this, null);
        comparison.getRight().accept(this, null);
        codeGenerator.comparison(comparison.getOperator(), comparison.getType());
        return null;
    }

    @Override
    public Void visit(DoubleLiteral doubleLiteral, Void unused){
        /*
        Value[[CharLiteral : expression -> literal]]()=
            <PUSHF> CharLiteral.value
         */
        codeGenerator.push(doubleLiteral.getValue());
        return null;
    }
}
