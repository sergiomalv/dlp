package ast.definitions;

import ast.types.Type;
import visitor.Visitor;

/**
 * Abstract class that represents a definition
 * @author Sergio
 */
public abstract class AbstractDefinition implements Definition {

    // Variables of the class
    private int line;   // Shows information about the line
    private int column; // Shows information about the column
    private Type type;  // Show the type of definition
    private String name;    //Name of the definition

    public AbstractDefinition(int line, int column, Type type, String name){
        checkParams(line, column);
        this.line = line;
        this.column = column;
        this.type = type;
        this.name = name;
    }

    /**
     * @return line
     */
    @Override
    public int getLine() { return this.line; }

    /**
     * @return column
     */
    @Override
    public int getColumn() { return this.column; }

    /**
     * @return type
     */
    @Override
    public Type getType() { return this.type; }

    /**
     * @return name
     */
    public String getName() { return this.name; }

    /**
     * Check the params of the constructor
     * @param line
     * @param column
     */
    private void checkParams(int line, int column){
        if (line < 0){
            throw new IllegalArgumentException("The line must be at least 0");
        }
        if (column < 0){
            throw new IllegalArgumentException("The size must be at least 0");
        }
    }
}
