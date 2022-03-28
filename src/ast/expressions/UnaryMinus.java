package ast.expressions;

import visitor.Visitor;

/**
 * Represents an unary minus expression (-"expr")
 * @author Sergio
 */
public class UnaryMinus extends AbstractExpression{

    // Variables of the class
    private Expression expression;

    /**
     * Constructor of a unary minus expression
     * @param line
     * @param column
     * @param expression
     */
    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        checkParams(expression);
        this.expression = expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
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
    public String toString() {
        return "-" + expression.toString();
    }

    public Expression getExpression() {
        return expression;
    }
}
