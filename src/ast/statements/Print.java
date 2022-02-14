package ast.statements;

import ast.expressions.Expression;

import java.util.List;

/**
 * Represents a print statement
 * @author Sergio
 */
public class Print extends AbstractStatement{

    // Variables of the class
    private List<Expression> expressions;   // Expressions that prints

    /**
     * Constructor of the print statement
     * @param line
     * @param column
     * @param expressions, expressions that prints
     */
    public Print(int line, int column, List<Expression> expressions) {
        super(line, column);
        checkParams(expressions);
        this.expressions = expressions;
    }

    /**
     * Check the expressions of the return
     * @param expressions
     */
    private void checkParams(List<Expression> expressions){
        if (expressions == null){
            throw new IllegalArgumentException("The list of expressions shouldn't be null");
        }
        if (expressions.isEmpty()){
            throw new IllegalArgumentException("There has to be at least an expression");
        }

        for (Expression expression : expressions){
            if (expression == null){
                throw new IllegalArgumentException("Expression shouldn't be null");
            }
        }
    }
}
