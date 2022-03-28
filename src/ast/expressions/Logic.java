package ast.expressions;

import visitor.Visitor;

/**
 * Represents a logic expression
 * @author Sergio
 */
public class Logic extends AbstractExpression {

    // Variables of the class
    private Expression left;    // Left expression
    private Expression right;   // Right expression
    private String operator;    // Operator of the logic expression

    /**
     * Constructor of a logic expression
     * @param line
     * @param column
     * @param left, left expression
     * @param right, right expression
     * @param operator, operator of the expression
     */
    public Logic(int line, int column, Expression left, Expression right, String operator) {
        super(line, column);
        checkParams(left, right, operator);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    /**
     * Check the params of the constructor
     * @param left, left expression
     * @param right, right expression
     * @param operator, operator of the expression
     */
    private void checkParams(Expression left, Expression right, String operator){
        if (left == null ||right == null){
            throw new IllegalArgumentException("Expression shouldn't be null");
        }

        if (operator.trim().isEmpty() || operator == null){
            throw new IllegalArgumentException("Operator is invalid");
        }
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    public String toString() {
        return left.toString() + " " + operator + " " + right.toString();
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
