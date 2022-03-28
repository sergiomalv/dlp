package visitor;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

/**
 * Abstract implementation of Visitor
 */
public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {

    @Override
    public TR visit(Program p, TP tp) {
        p.getDefinitions().forEach(definition -> definition.accept(this, tp));
        return null;
    }

    @Override
    public TR visit(VarDefinition v, TP tp) {
        v.getType().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(FuncDefinition f, TP tp) {
        f.getVariables().forEach(varDefinition -> varDefinition.accept(this, tp));
        f.getStatements().forEach(statement -> statement.accept(this, tp));
        return null;
    }

    @Override
    public TR visit(Arithmetic a, TP tp) {
        a.getLeft().accept(this, tp);
        a.getRight().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(ArrayAccess a, TP tp) {
        a.getLeft().accept(this, tp);
        a.getRight().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(Cast c, TP tp) {
        c.getType().accept(this, tp);
        c.getExpression().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(CharLiteral c, TP tp) {
        return null;
    }

    @Override
    public TR visit(Comparison c, TP tp) {
        c.getLeft().accept(this, tp);
        c.getRight().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(DoubleLiteral d, TP tp) {
        return null;
    }

    @Override
    public TR visit(FieldAccess f, TP tp) {
        f.getExpression().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation f, TP tp) {
        f.getExpressions().forEach(expression -> expression.accept(this, tp));
        return null;
    }

    @Override
    public TR visit(IntLiteral i, TP tp) {
        return null;
    }

    @Override
    public TR visit(Logic l, TP tp) {
        l.getLeft().accept(this, tp);
        l.getRight().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(Not n, TP tp) {
        n.getExpression().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(UnaryMinus u, TP tp) {
        u.getExpression().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(Variable v, TP tp) {
        return null;
    }

    @Override
    public TR visit(Assignment a, TP tp) {
        a.getLeft().accept(this, tp);
        a.getRight().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(IfElse i, TP tp) {
        i.getExpression().accept(this, tp);
        i.getIfBody().forEach(statement -> statement.accept(this, tp));
        i.getElseBody().forEach(statement -> statement.accept(this, tp));
        return null;
    }

    @Override
    public TR visit(Input i, TP tp) {
        i.getExpressions().forEach(expression -> expression.accept(this, tp));
        return null;
    }

    @Override
    public TR visit(Invocation i, TP tp) {
        i.getExpressions().forEach(varDefinition -> varDefinition.accept(this, tp));
        return null;
    }

    @Override
    public TR visit(Print p, TP tp) {
        p.getExpressions().forEach(expression -> expression.accept(this, tp));
        return null;
    }

    @Override
    public TR visit(Return r, TP tp) {
        r.getExpression().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(While w, TP tp) {
        w.getExpression().accept(this, tp);
        w.getStatements().forEach(statement -> statement.accept(this, tp));
        return null;
    }

    @Override
    public TR visit(ArrayType a, TP tp) {
        a.getType().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(CharType c, TP tp) {
        return null;
    }

    @Override
    public TR visit(DoubleType d, TP tp) {
        return null;
    }

    @Override
    public TR visit(ErrorType e, TP tp) {
        return null;
    }

    @Override
    public TR visit(FieldType f, TP tp) {
        f.getType().accept(this, tp);
        return null;
    }

    @Override
    public TR visit(FunctionType f, TP tp) {
        f.getType().accept(this, tp);
        f.getParameters().forEach(varDefinition -> varDefinition.accept(this, tp));
        return null;
    }

    @Override
    public TR visit(IntType i, TP tp) {
        return null;
    }

    @Override
    public TR visit(StructType s, TP tp) {
        s.getFields().forEach(fieldType -> fieldType.accept(this, tp));
        return null;
    }

    @Override
    public TR visit(VoidType v, TP tp) {
        return null;
    }
}
