package ast.Types;

/**
 * Represents an instance of IntType
 * Singleton patron
 * @author Sergio
 */
public class IntType extends AbstractType{

    // Instance of IntType
    private static IntType intType = null;

    /**
     * Private constructor of IntType, line and column must be 0
     */
    private IntType() { super(0, 0); }

    /**
     * Return the instance of IntType or create if it's null
     * @return intType
     */
    public static IntType getCharType(){
        if (intType == null){
            intType = new IntType();
        }
        return intType;
    }
}
