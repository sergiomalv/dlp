package ast.types;

import visitor.Visitor;

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
    public static IntType getIntType(){
        if (intType == null){
            intType = new IntType();
        }
        return intType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public String toString() {
        return "int";
    }
}
