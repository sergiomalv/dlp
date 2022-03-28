package ast.expressions;

import visitor.Visitor;

/**
 * Represents one access to a field
 * @author Sergio
 */
public class FieldAccess extends AbstractExpression{

    // Variables of the class
    private Expression expression;  // Expression of the field
    private String fieldName;       // Name of the field

    /**
     * Constructor of the field access
     * @param line
     * @param column
     * @param expression, expression of the field
     * @param fieldName, name of the field
     */
    public FieldAccess(int line, int column, Expression expression, String fieldName) {
        super(line, column);
        checkParams(expression, fieldName);
        this.expression = expression;
        this.fieldName = fieldName;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    /**
     * Check the params of the constructor
     * @param expression
     * @param fieldName
     */
    private void checkParams(Expression expression, String fieldName){
        if (expression == null){
            throw new IllegalArgumentException("Expression shouldn't be null");
        }
        if (fieldName.trim().isEmpty() || fieldName == null){
            throw new IllegalArgumentException("Invalid name");
        }
    }

    @Override
    public String toString() {
        return expression.toString() + "." + fieldName;
    }

    public Expression getExpression() {
        return expression;
    }
}
