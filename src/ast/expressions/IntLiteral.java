package ast.expressions;

/**
 * Represents an integer expression
 * @author Sergio
 */
public class IntLiteral extends AbstractExpression{

    // Variables of the class
    private int value;  // Value of the integer

    /**
     * Constructor of an integer expression
     * @param line
     * @param column
     * @param value, value of the integer
     */
    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }
}
