package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

/**
 * Represents a assignment statement
 * @return Sergio
 */
public class Assignment extends AbstractStatement{

    // Variables of the class
    private Expression left;    // Left expression
    private Expression right;   // Right expression

    /**
     * Constructor of the assignment
     * @param line
     * @param column
     * @param left, left expression
     * @param right, right expression
     */
    public Assignment(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public String toString() {
        return left.toString() + "= " + right.toString();
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
