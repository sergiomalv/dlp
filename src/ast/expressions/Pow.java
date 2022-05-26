package ast.expressions;

import visitor.Visitor;

public class Pow extends AbstractExpression{

    // Variables of the class
    private Expression left;    // Left expression
    private int  right;   // Right expression

    public Pow(int line, int column, Expression left, int right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    public Expression getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}
