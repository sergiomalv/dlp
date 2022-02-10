package ast.expressions;

/**
 * Represents a comparison of 2 expressions
 */
public class Comparison extends AbstractExpression{

    // Variables of the class
    private Expression left;    // Left expression
    private Expression right;   // Right expression

    /**
     * Constructor of the comparison
     * @param line
     * @param column
     * @param left, left expression
     * @param right, right expression
     */
    public Comparison(int line, int column, Expression left, Expression right) {
        super(line, column);
        checkParams(left,right);
        this.left = left;
        this.right = right;
    }

    /**
     * Check the expressions of the constructor
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
