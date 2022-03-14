package ast.types;

/**
 * Represents an instance of CharType
 * Singleton patron
 * @author Sergio
 */
public class CharType extends AbstractType{

    // Instance of IntType
    private static CharType charType = null;

    /**
     * Private constructor of ChartType, line and column must be 0
     */
    private CharType() { super(0, 0); }

    /**
     * Return the instance of ChartType or create if it's null
     * @return chartType
     */
    public static CharType getCharType(){
        if (charType == null){
            charType = new CharType();
        }
        return charType;
    }

    @Override
    public String toString() {
        return "char";
    }
}
