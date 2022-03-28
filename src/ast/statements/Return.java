package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

/**
 * Represents a return statement
 * @author Sergio
 */
public class Return extends AbstractStatement{

    // Variables of the class
    private Expression expression;  // Expression that returns

    /**
     * Constructor of the return
     * @param line
     * @param column
     * @param expression, expression that returns
     */
    public Return(int line, int column, Expression expression) {
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
        return "return " + expression.toString() + ";";
    }

    public Expression getExpression() {
        return expression;
    }
}
