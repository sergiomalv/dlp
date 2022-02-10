package ast.Types;

/**
 * Abstract class that represents a type
 * @author Sergio
 */
public abstract class AbstractType implements Type{

    // Class's variables
    private int line;   // Shows information about the line
    private int column; // Shows information about the column

    /**
     * Constructor of the class
     * @param line
     * @param column
     */
    public AbstractType(int line, int column){
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
