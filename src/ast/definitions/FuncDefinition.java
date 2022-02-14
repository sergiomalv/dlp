package ast.definitions;

import ast.statements.AbstractStatement;
import ast.statements.Statement;
import ast.types.Type;

import java.util.List;

/**
 * Represents a definition of a function
 * @author Sergio
 */
public class FuncDefinition extends AbstractDefinition {

    // Variables of the class
    private List<Statement> statements; // Statements of the function

    /**
     * Constructor of a function definition
     * @param line
     * @param column
     * @param statements, list of statements
     */
    public FuncDefinition(int line, int column, String name, Type type, List<Statement> statements) {
        super(line, column, name, type);
        checkParams(statements);
        this.statements = statements;
    }

    /**
     * Check the statements of the constructor
     * @param statements
     */
    private void checkParams(List<Statement> statements){
        if (statements == null){
            throw new IllegalArgumentException("The list of statements shouldn't be null");
        }
        for (Statement statement : statements){
            if (statement == null){
                throw new IllegalArgumentException("Statement shouldn't be null");
            }
        }
    }
}
