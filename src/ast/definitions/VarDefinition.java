package ast.definitions;

import ast.statements.AbstractStatement;
import ast.statements.Statement;
import ast.types.Type;

import java.util.List;

/**
 * Represents a definition of variables
 * @author Sergio
 */
public class VarDefinition extends AbstractDefinition implements Statement {

    /**
     * Constructor of a definition of variables
     * @param line
     * @param column
     * @param type
     */
    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }

    @Override
    public String toString() {
        return this.getName()  + ": " + this.getType();
    }
}
