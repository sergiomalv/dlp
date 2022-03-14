package ast.statements;

import ast.expressions.Expression;

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
    public String toString() {
        return left.toString() + "= " + right.toString();
    }
}
