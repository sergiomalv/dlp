package ast.types;

import ast.definitions.VarDefinition;
import visitor.Visitor;

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
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public String toString() {
        return "(" + parameters.toString() + "): " + type;
    }

    public Type getType() {
        return type;
    }

    public List<VarDefinition> getParameters() {
        return parameters;
    }
}
