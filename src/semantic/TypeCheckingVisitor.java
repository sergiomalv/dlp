package semantic;

import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

    @Override
    public Void visit(Variable v, Void unused) {
        v.setLValue(true);
        v.setType(v.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Arithmetic a, Void unused) {
        a.setLValue(false);
        super.visit(a, unused);
        a.setType(a.getLeft().getType().arithmetic(a.getRight().getType(), a));
        return null;
    }

    @Override
    public Void visit(Assignment a, Void unused) {
        super.visit(a, unused);
        if (!a.getLeft().getLValue()){
            new ErrorType(a.getLine(), a.getColumn(), a.toString());
        }
        a.getLeft().setType(a.getRight().getType().promotesTo(a.getLeft().getType(), a));
        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Void unused) {
        a.setLValue(true);
        super.visit(a, unused);
        a.setType(a.getLeft().getType().squareBrackets(a.getRight().getType(), a));
        return null;
    }

    @Override
    public Void visit(Cast c, Void unused) {
        c.setLValue(false);
        super.visit(c, unused);
        return null;
    }

    @Override
    public Void visit(CharLiteral c, Void unused) {
        c.setLValue(false);
        c.setType(CharType.getCharType());
        return null;
    }

    @Override
    public Void visit(Comparison c, Void unused) {
        c.setLValue(false);
        super.visit(c, unused);
        c.setType(c.getLeft().getType().comparison(c.getRight().getType(), c));
        return null;
    }

    @Override
    public Void visit(DoubleLiteral d, Void unused) {
        d.setLValue(false);
        d.setType(DoubleType.getDoubleType());
        return null;
    }

    @Override
    public Void visit(FieldAccess f, Void unused) {
        f.setLValue(true);
        super.visit(f, unused);
        f.setType(f.getExpression().getType().dot(f.getFieldName(), f));
        return null;
    }

    @Override
    public Void visit(FunctionInvocation f, Void unused) {
        f.setLValue(false);
        super.visit(f, unused);
        f.setType(f.getVar().getType().parenthesis(f.getExpressions(), f));
        return null;
    }

    @Override
    public Void visit(IntLiteral i, Void unused) {
        i.setLValue(false);
        i.setType(IntType.getIntType());
        return null;
    }

    @Override
    public Void visit(Logic l, Void unused) {
        l.setLValue(false);
        super.visit(l, unused);
        l.setType(l.getLeft().getType().logical(l.getRight().getType(), l));
        return null;
    }

    @Override
    public Void visit(Not n, Void unused) {
        n.setLValue(false);
        super.visit(n, unused);
        n.setType(n.getExpression().getType().logical(n));
        return null;
    }

    @Override
    public Void visit(UnaryMinus u, Void unused) {
        u.setLValue(false);
        super.visit(u, unused);
        u.setType(u.getType().arithmetic(u.getType(), u));
        return null;
    }

    @Override
    public Void visit(Input i, Void unused){
        super.visit(i, unused);
        i.getExpressions().forEach(expression -> {
            if (!expression.getLValue()){
                new ErrorType(expression.getLine(), expression.getColumn(), expression.toString());
            }
        });
        return null;
    }

    @Override
    public Void visit(IfElse i, Void unused){
        super.visit(i, unused);
        if(!i.getExpression().getType().isLogical()){
            new ErrorType(i.getExpression().getLine(), i.getExpression().getColumn(), i.getExpression().toString());
        }

        return null;
    }

    @Override
    public Void visit(While w, Void unused){
        super.visit(w, unused);
        if (!w.getExpression().getType().isLogical()){
            new ErrorType(w.getExpression().getLine(), w.getExpression().getColumn(), w.getExpression().toString());
        }

        return null;
    }

    @Override
    public Void visit(Return r, Void unused){
        super.visit(r, unused);
        r.getExpression().setType(r.getExpression().getType().promotesTo(r.getExpression().getType(), r));

        return null;
    }
}
