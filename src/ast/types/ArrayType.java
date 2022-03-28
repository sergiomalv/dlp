package ast.types;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

/**
 * Represents an array, it must have a size > 0
 * @author Sergio
 */
public class ArrayType extends AbstractType{

    // Variables of the class
    private int dimension;   // Size of the array
    private Type type;  // Type of the array

    /**
     * Constructor of an array
     * @param line
     * @param column
     * @param dimension, size of the array
     * @param type, type of the array
     */
    public ArrayType(int line, int column, int dimension, Type type) {
        super(line, column);
        checkParams(type);
        this.dimension = dimension;
        this.type = type;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    /**
     * Check the params of the constructor
     * @param type, shouldn't be null
     */
    private void checkParams(Type type){
        if (type == null){
            throw new IllegalArgumentException("Type shouldn't be null");
        }
    }

    @Override
    public String toString() {
        return "[" + dimension + "]" + type.toString();
    }

    public Type getType() {
        return type;
    }
}
