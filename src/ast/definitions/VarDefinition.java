package ast.definitions;

import ast.statements.AbstractStatement;
import ast.statements.Statement;
import ast.types.Type;

/**
 * Represents a definition of variables
 * @author Sergio
 */
public class VarDefinition extends AbstractDefinition implements Statement {

    /**
     * Constructor of a definition of variables
     * @param line
     * @param column
     * @param name
     * @param type
     */
    public VarDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }
}
