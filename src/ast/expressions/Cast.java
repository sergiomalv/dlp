package ast.expressions;

import ast.types.Type;

/**
 * Represents a cast
 * @autor Sergio
 */
public class Cast extends AbstractExpression{
    // Variables of the class
    private Type type;      //Type of the cast

    /**
     * Constructor of the cast
     * @param line
     * @param column
     * @param type
     */
    public Cast(int line, int column, Type type) {
        super(line, column);
        checkParams(type);
        this.type = type;
    }

    /**
     * Check the type of the cast
     * @param type
     */
    private void checkParams(Type type){
        if (type == null){
            throw new IllegalArgumentException("Type shouldn't be null");
        }
    }
}
