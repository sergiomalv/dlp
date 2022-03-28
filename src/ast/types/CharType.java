package ast.types;

import visitor.Visitor;

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
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public String toString() {
        return "char";
    }
}
