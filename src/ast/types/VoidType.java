package ast.types;

/**
 * Represents an instance of VoidType
 * Singleton patron
 * @author Sergio
 */
public class VoidType extends AbstractType{

    // Instance of VoidType
    private static VoidType voidType = null;

    /**
     * Private constructor of VoidType, line and column must be 0
     */
    private VoidType() { super(0, 0); }

    /**
     * Return the instance of VoidType or create if it's null
     * @return voidType
     */
    public static VoidType getVoidType(){
        if (voidType == null){
            voidType = new VoidType();
        }
        return voidType;
    }

    @Override
    public String toString() {
        return "";
    }
}
