package ast.Types;

/**
 * Represents an instance of DoubleType
 * Singleton patron
 * @author Sergio
 */
public class DoubleType extends AbstractType{

    // Instance of DoubleType
    private static DoubleType doubleType = null;

    /**
     * Private constructor of DoubleType, line and column must be 0
     */
    private DoubleType() { super(0, 0); }

    /**
     * Return the instance of DoubleType or create if it's null
     * @return doubleType
     */
    public static DoubleType getCharType(){
        if (doubleType == null){
            doubleType = new DoubleType();
        }
        return doubleType;
    }
}
