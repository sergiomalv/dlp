package ast.expressions;

/**
 * Represents a double expression
 * @author Sergio
 */
public class DoubleLiteral extends AbstractExpression {

    // Variables of the class
    private double value;   // Value of the double

    /**
     * Constructor of a double
     * @param line
     * @param column
     */
    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }
}
