package ast.statements;

import ast.expressions.Expression;

import java.util.List;

/**
 * Represents a while loop
 * @author Sergio
 */
public class While extends AbstractStatement {

    // Variables of the class
    private Expression expression;  // Expression of the condition
    List<Statement> statements;     // Statements of the loop

    /**
     * Constructor of the while loop
     * @param line
     * @param column
     * @param expression, expression of the loop
     * @param statements, statements of the loop
     */
    public While(int line, int column, Expression expression, List<Statement> statements) {
        super(line, column);
        checkParams(expression, statements);
        this.expression = expression;
        this.statements = statements;
    }

    private void checkParams(Expression expression, List<Statement> statements){
        if (expression == null){
            throw new IllegalArgumentException("Expression shouldn't be null");
        }
        for (Statement statement : statements){
            if (statement == null){
                throw new IllegalArgumentException("Statement shouldn't be null");
            }
        }
    }
}