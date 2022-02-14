package ast.expressions;

/**
 * Represents an arithmetic expression
 * @author Sergio
 */
public class Arithmetic extends AbstractExpression{

    // Variables of the class
    private Expression left;    // Left expression
    private Expression right;   // Right expression

    /**
     * Constructor of an arithmetic expression
     * @param line
     * @param column
     * @param left, left expression
     * @param right, right expression
     */
    public Arithmetic(int line, int column, Expression left, Expression right) {
        super(line, column);
        checkParam(left, right);
        this.left = left;
        this.right = right;
    }

    /**
     * Check the expressions of the constructor
     * @param expressions
     */
    private void checkParam(Expression... expressions){
        for (Expression expression : expressions){
            if (expression == null) {
                throw new IllegalArgumentException("Expression shouldn't be null");
            }
        }
    }
}
