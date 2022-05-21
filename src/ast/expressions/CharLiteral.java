package ast.expressions;

import visitor.Visitor;

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
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public String toString() {
        return value + "";
    }

    public char getValue() {
        return value;
    }
}
