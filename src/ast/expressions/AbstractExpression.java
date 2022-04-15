package ast.expressions;

import ast.types.Type;

/**
 * Abstract class that represents an expression
 * @author Sergio
 */
public abstract class AbstractExpression implements Expression{

    // Class's variables
    private int line;   // Shows information about the line
    private int column; // Shows information about the column
    boolean lValue;  // Shows if an expression can be on the left side of an assignment
    Type type;      // Type of the expression

    /**
     * Constructor of the class
     * @param line
     * @param column
     */
    public AbstractExpression(int line, int column){
        checkParams(line, column);
        this.line = line;
        this.column = column;
    }

    /**
     * @return line
     */
    @Override
    public int getLine() {
        return this.line;
    }

    /**
     * @return column
     */
    @Override
    public int getColumn() {
        return this.column;
    }

    @Override
    public boolean getLValue() {
        return this.lValue;
    }

    @Override
    public void setLValue(Boolean lValue) {
        this.lValue = lValue;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Check the params of the constructor
     * @param line, at least 0
     * @param column, at least 0
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
