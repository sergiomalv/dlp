package ast.expressions;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an arithmetic expression
 * @author Sergio
 */
public class Arithmetic extends AbstractExpression{

    // Variables of the class
    private Expression left;    // Left expression
    private Expression right;   // Right expression
    private String operator;    // Operator

    /**
     * Constructor of an arithmetic expression
     * @param line
     * @param column
     * @param left, left expression
     * @param right, right expression
     * @param operator, operator
     */
    public Arithmetic(int line, int column, Expression left, Expression right, String operator) {
        super(line, column);
        checkParam(left, right, operator);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    /**
     * Check the expressions of the constructor
     * @param left, left expression
     * @param right, right expression
     * @param operator, operator
     */
    private void checkParam(Expression left, Expression right, String operator){
        List<Expression> expressions = new ArrayList<Expression>();
        expressions.add(left);
        expressions.add(right);
        for (Expression expression : expressions){
            if (expression == null) {
                throw new IllegalArgumentException("Expression shouldn't be null");
            }
        }
        if (operator.trim().equals("") || operator == null){
            throw new IllegalArgumentException("Operator shouldn't be null or empty");
        }
    }

    @Override
    public String toString() {
        return this.left + " " + this.operator + " " + this.right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }
}
