package ast.statements;

import ast.expressions.Expression;

import java.util.List;

/**
 * Represents an If-Else statement
 * @author Sergio
 */
public class IfElse extends AbstractStatement {

    // Variables of the class
    private Expression expression;      // Expression of the condition
    private List<Statement> ifBody;     // Statements of "if"
    private List<Statement> elseBody;   // Statements of "else"

    /**
     * Constructor of the If - Else statement
     * @param line
     * @param column
     * @param expression, the condition
     * @param ifBody, statements of "if"
     * @param elseBody, statements of "else"
     */
    public IfElse(int line, int column, Expression expression, List<Statement> ifBody,
                  List<Statement> elseBody) {
        super(line, column);
        checkParams(expression, ifBody, elseBody);
        this.expression = expression;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    /**
     * Check the expression and statements of the constructor
     * @param expression, condition
     * @param ifBody, statements of "if"
     * @param elseBody, statements of "else"
     */
    private void checkParams(Expression expression, List<Statement> ifBody, List<Statement> elseBody){
        if (expression == null){
            throw new IllegalArgumentException("Expression shouldn't be null");
        }
        for (Statement statement : ifBody){
            if (statement == null){
                throw new IllegalArgumentException("Statement shouldn't be null");
            }
        }
        for (Statement statement : elseBody){
            if (statement == null){
                throw new IllegalArgumentException("Statement shouldn't be null");
            }
        }
    }
}
