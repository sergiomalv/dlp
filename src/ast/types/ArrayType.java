package ast.types;

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
        checkParams(dimension,type);
        this.dimension = dimension;
        this.type = type;
    }

    /**
     * Check the params of the constructor
     * @param number, must be bigger than 0
     * @param type, shouldn't be null
     */
    private void checkParams(int number, Type type){
        if (number <= 0){
            throw new IllegalArgumentException("The size must be bigger than 0");
        }
        if (type == null){
            throw new IllegalArgumentException("Type shouldn't be null");
        }
    }

}
