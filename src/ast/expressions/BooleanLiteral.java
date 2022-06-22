package ast.expressions;

import visitor.Visitor;

public class BooleanLiteral extends AbstractExpression{

    // Variables of the class
    private int value;

    /**
     * Constructor of the class
     *
     * @param line
     * @param column
     */
    public BooleanLiteral(int line, int column, boolean value) {
        super(line, column);
        assignValue(value);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    public String toString() {
        return this.value + "\n";
    }

    private void assignValue(boolean value){
        if (value){
            this.value = 1;
        } else {
            this.value = 0;
        }
    }

    public int getValue() {return this.value; }
}
