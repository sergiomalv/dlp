package ast.expressions;

import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public String toString() {
        return value+"";
    }
}
