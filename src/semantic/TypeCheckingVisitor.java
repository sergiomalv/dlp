package semantic;

import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

    @Override
    public Void visit(Variable v, Void unused) {
        v.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Arithmetic a, Void unused) {
        a.setLValue(false);
        super.visit(a, unused);
        return null;
    }

    @Override
    public Void visit(Assignment a, Void unused) {
        super.visit(a, unused);
        if (!a.getLeft().getLValue()){
            new ErrorType(a.getLine(), a.getColumn(), a.toString());
        }
        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Void unused) {
        a.setLValue(true);
        super.visit(a, unused);
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
        return null;
    }

    @Override
    public Void visit(Comparison c, Void unused) {
        c.setLValue(false);
        super.visit(c, unused);
        return null;
    }

    @Override
    public Void visit(DoubleLiteral d, Void unused) {
        d.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess f, Void unused) {
        f.setLValue(true);
        super.visit(f, unused);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation f, Void unused) {
        f.setLValue(false);
        super.visit(f, unused);
        return null;
    }

    @Override
    public Void visit(IntLiteral i, Void unused) {
        i.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Logic l, Void unused) {
        l.setLValue(false);
        super.visit(l, unused);
        return null;
    }

    @Override
    public Void visit(Not n, Void unused) {
        n.setLValue(false);
        super.visit(n, unused);
        return null;
    }

    @Override
    public Void visit(UnaryMinus u, Void unused) {
        u.setLValue(false);
        super.visit(u, unused);
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
}
