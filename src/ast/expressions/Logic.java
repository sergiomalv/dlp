package ast.expressions;

/**
 * Represents a logic expression
 * @author Sergio
 */
public class Logic extends AbstractExpression {

    // Variables of the class
    private Expression left;    // Left expression
    private Expression right;   // Right expression

    /**
     * Constructor of a logic expression
     * @param line
     * @param column
     * @param left, left expression
     * @param right, right expression
     */
    public Logic(int line, int column, Expression left, Expression right) {
        super(line, column);
        checkParams(left, right);
        this.left = left;
        this.right = right;
    }

    /**
     * Check the params of the constructor
     * @param expressions
     */
    private void checkParams(Expression... expressions){
        for (Expression expression : expressions){
            if (expression == null){
                throw new IllegalArgumentException("Expression shouldn't be null");
            }
        }
    }
}
