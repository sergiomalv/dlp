package ast.expressions;

import visitor.Visitor;

/**
 * Represents not expression
 * @author Sergio
 */
public class Not extends AbstractExpression{
    // Variables of the class
    private Expression expression;

    /**
     * Constructor of the not expression
     * @param line
     * @param column
     * @param expression
     */
    public Not(int line, int column, Expression expression) {
        super(line, column);
        checkParams(expression);
        this.expression = expression;
    }

    /**
     * Check the expression of the constructor
     * @param expression
     */
    private void checkParams(Expression expression){
        if (expression == null){
            throw new IllegalArgumentException("Expression shouldn't be null");
        }
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public String toString() {
        return "!" + expression.toString();
    }

    public Expression getExpression() {
        return expression;
    }
}
