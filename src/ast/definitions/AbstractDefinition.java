package ast.definitions;

import ast.types.Type;

/**
 * Abstract class that represents a definition
 * @author Sergio
 */
public class AbstractDefinition implements Definition {

    // Variables of the class
    private int line;   // Shows information about the line
    private int column; // Shows information about the column
    private String name;    // Shows the name of the definition
    private Type type;  // Show the type of definition

    public AbstractDefinition(int line, int column, String name, Type type){
        checkParams(line, column, name, type);
        this.line = line;
        this.column = column;
        this.name = name;
        this.type = type;
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
     * @return name
     */
    @Override
    public String getName() { return this.name; }

    /**
     * @return type
     */
    @Override
    public Type getType() { return this.type; }

    /**
     * Check the params of the constructor
     * @param line
     * @param column
     * @param name
     * @param type
     */
    private void checkParams(int line, int column, String name, Type type){
        if (line < 0){
            throw new IllegalArgumentException("The line must be at least 0");
        }
        if (column < 0){
            throw new IllegalArgumentException("The size must be at least 0");
        }
        if (name.trim().isEmpty() || name == null){
            throw new IllegalArgumentException("Invalid name");
        }
        if (type == null){
            throw new IllegalArgumentException("The type shouldn't be null");
        }
    }
}
