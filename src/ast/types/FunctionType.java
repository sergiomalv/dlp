package ast.types;

import ast.definitions.VarDefinition;

import java.util.List;

/**
 * Represents a function type
 * @author Sergio
 */
public class FunctionType extends AbstractType{

    // Variables of the class
    private Type type;  // Type of return
    private List<VarDefinition> parameters; // Parametres of the function

    /**
     * Constructor of a function
     * @param line
     * @param column
     * @param type, type of return
     */
    public FunctionType(int line, int column, Type type, List<VarDefinition> parameters) {
        super(line, column);
        this.type = type;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "(" + parameters.toString() + "): " + type;
    }
}
