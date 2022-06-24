package ast.types;

import ast.AstNode;
import visitor.Visitor;

/**
 * Represents an array, it must have a size > 0
 * @author Sergio
 */
public class ArrayType extends AbstractType{

    // Variables of the class
    private int dimension;   // Size of the array
    private Type of;  // Type of the array

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
        this.of = type;
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
    public Type squareBrackets(Type type, AstNode node) {
        if (type.equals(IntType.getIntType()) || type instanceof ErrorType){
            return this.of;
        }
        return super.squareBrackets(type, node);
    }

    @Override
    public int numberOfBytes() {
        return dimension * of.numberOfBytes();
    }

    @Override
    public String toString() {
        return "[" + dimension + "]" + of.toString();
    }

    public Type getOf() {
        return of;
    }

    public int getDimension(){
        return  dimension;
    }
}
