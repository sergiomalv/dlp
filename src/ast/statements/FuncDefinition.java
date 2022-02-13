package ast.statements;

import java.util.List;

/**
 * Represents a definition of a function
 * @author Sergio
 */
public class FuncDefinition extends AbstractStatement{

    // Variables of the class
    private List<Statement> statements; // Statements of the function

    /**
     * Constructor of a function definition
     * @param line
     * @param column
     * @param statements, list of statements
     */
    public FuncDefinition(int line, int column, List<Statement> statements) {
        super(line, column);
        checkParams(statements);
        this.statements = statements;
    }

    /**
     * Check the statements of the constructor
     * @param statements
     */
    private void checkParams(List<Statement> statements){
        for (Statement statement : statements){
            if (statement == null){
                throw new IllegalArgumentException("Statement shouldn't be null");
            }
        }
    }
}
