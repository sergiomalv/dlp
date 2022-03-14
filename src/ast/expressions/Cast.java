package ast.expressions;

import ast.types.Type;

/**
 * Represents a cast
 * @autor Sergio
 */
public class Cast extends AbstractExpression{
    // Variables of the class
    private Type type;      //Type of the cast
    private Expression expression;  // Expression to cast

    /**
     * Constructor of the cast
     * @param line
     * @param column
     * @param type
     * @param expression
     */
    public Cast(int line, int column, Type type, Expression expression) {
        super(line, column);
        checkParams(type, expression);
        this.type = type;
        this.expression = expression;
    }

    /**
     * Check the type of the cast and the expression
     * @param type
     */
    private void checkParams(Type type, Expression expression){
        if (type == null){
            throw new IllegalArgumentException("Type shouldn't be null");
        }
        if (expression == null){
            throw new IllegalArgumentException("Expression shouldn't be null");
        }
    }

    @Override
    public String toString() {
        return "(" + type.toString() + ")" + " " + expression.toString();
    }
}
