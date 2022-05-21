package ast.expressions;

import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public String toString() {
        return this.value + "";
    }

    public double getValue() {
        return value;
    }
}
