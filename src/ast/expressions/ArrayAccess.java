package ast.expressions;

/**
 * Represents one access to an array
 * @author Sergio
 */
public class ArrayAccess extends AbstractExpression{

    // Variables of the class
    private Expression left;    // Left expression
    private Expression right;   // Right expression

    /**
     * Constructor of an array access
     * @param line
     * @param column
     * @param left, left expression
     * @param right, right expression
     */
    public ArrayAccess(int line, int column, Expression left, Expression right) {
        super(line, column);
        checkParams(left, right);
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
                throw new IllegalArgumentException("Expressions shouldn't be null");
            }
        }
    }

    @Override
    public String toString() {
        return this.left.toString() + "[" + this.right.toString() + "]";
    }
}
