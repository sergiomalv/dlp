package ast.statements;

import ast.expressions.Expression;

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

    /**
     * Check the params of the constructor
     * @param expressions
     */
    private void checkParams(List<Expression> expressions){
        if (expressions.isEmpty()){
            throw new IllegalArgumentException("There has to be at least an expression");
        }
        for (Expression expression : expressions){
            throw new IllegalArgumentException("Expression shouldn't be null");
        }
    }
}
