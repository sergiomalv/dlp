package ast.expressions;

import ast.definitions.Definition;
import visitor.Visitor;

/**
 * Represents a variable
 * @author Sergio
 */
public class Variable extends AbstractExpression {

    // Variables of the class
    private String name;
    private Definition definition;

    /**
     * Constructor of a variable
     * @param line
     * @param column
     * @param name, identify the variable
     */
    public Variable(int line, int column, String name) {
        super(line, column);
        checkParams(name);
        this.name = name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    /**
     * Check the name of the variable
     * @param name
     */
    private void checkParams(String name){
        if (name.trim().isEmpty() || name == null){
            throw new IllegalArgumentException("Invalid name");
        }
    }

    @Override
    public String toString() {
        return this.name;
    }

    public Definition getDefinition() {
        return definition;
    }
}
