package ast.expressions;

/**
 * Represents a comparison of 2 expressions
 */
public class Comparison extends AbstractExpression{

    // Variables of the class
    private Expression left;    // Left expression
    private Expression right;   // Right expression
    private String operator;    // Operator of the comparison expression

    /**
     * Constructor of the comparison
     * @param line
     * @param column
     * @param left, left expression
     * @param right, right expression
     * @param operator, operator of the comparison
     */
    public Comparison(int line, int column, Expression left, Expression right, String operator) {
        super(line, column);
        checkParams(left,right, operator);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    /**
     * Check the expressions of the constructor
     * @param left, left expression
     * @param right, right expression
     * @param operator, operator of the comparison
     */
    private void checkParams(Expression left, Expression right, String operator){
        if (left == null || right == null){
            throw new IllegalArgumentException("Expression shouldn't be null");
        }

        if (operator.trim().isEmpty() ||operator == null){
            throw new IllegalArgumentException("Operator shouldn't be null");
        }
    }
}
