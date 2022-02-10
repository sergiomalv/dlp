package ast.types;

/**
 * Represents a function type
 * @author Sergio
 */
public class FunctionType extends AbstractType{

    // Variables of the class
    private Type type;  // Type of return

    /**
     * Constructor of a function
     * @param line
     * @param column
     * @param type, type of return
     */
    public FunctionType(int line, int column, Type type) {
        super(line, column);
        checkParam(type);
        this.type = type;
    }

    /**
     * Check the type of the constructor
     * @param type, type of the field
     */
    private void checkParam(Type type){
        if (type == null){
            throw new IllegalArgumentException("Type shouldn't be null");
        }
    }
}
