package ast.expressions;

/**
 * Represents a char expression
 * @author Sergio
 */
public class CharLiteral extends AbstractExpression {

    // Variables of the class
    private char value;     // Value of the char

    /**
     * Constructor of a char
     * @param line
     * @param column
     * @param value, value of the char
     */
    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
