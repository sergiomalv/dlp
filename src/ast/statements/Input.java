package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

/**
 * Represents a input statement
 * @author Sergio
 */
public class Input extends AbstractStatement {

    // Variables of the class
    List<Expression> expressions;   //Expressions of the input

    /**
     * Constructor of the input
     * @param line
     * @param column
     * @param expressions, expressions of the input
     */
    public Input(int line, int column, List<Expression> expressions) {
        super(line, column);
        checkParams(expressions);
        this.expressions = expressions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    /**
     * Check the params of the constructor
     * @param expressions
     */
    private void checkParams(List<Expression> expressions){
        if (expressions == null){
            throw new IllegalArgumentException("The list of expressions shouldn't be null");
        }
        if (expressions.isEmpty()){
            throw new IllegalArgumentException("There has to be at least an expression");
        }

        for (Expression expression : expressions) {
            if (expression == null)
                throw new IllegalArgumentException("Expression shouldn't be null");
        }
    }

    @Override
    public String toString() {
        String result = "input ";
        int counter = 0;
        for (Expression expression : expressions){
            if (counter == expressions.size() -1){
                result += expression;
            } else {
                result += expression + ", ";
            }
        }
        return result;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }
}
