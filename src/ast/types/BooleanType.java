package ast.types;

import ast.AstNode;
import visitor.Visitor;

public class BooleanType extends AbstractType{

    // Instance of BooleanType
    private static BooleanType booleanType = null;

    /**
     * Constructor of the class
     */
    private BooleanType() {
        super(0,0);
    }

    /**
     * Return the instance of DoubleType or create if it's null
     * @return doubleType
     */
    public static BooleanType getBooleanType(){
        if (booleanType == null){
            booleanType = new BooleanType();
        }
        return booleanType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }


    @Override
    public boolean isLogical(){ return true; }

    @Override
    public Type logical(Type type, AstNode node){
        if (type.equals(this) || type instanceof ErrorType){
            return type;
        }

        return super.logical(type, node);
    }
    @Override
    public Type logical(AstNode node){
        return this;
    }

    @Override
    public Type promotesTo(Type type, AstNode node) {
        if (type.equals(this) || type instanceof ErrorType){
            return type;
        }

        return super.promotesTo(type, node);
    }

    @Override
    public char suffix() {
        return 'i';
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public String toString() {
        return "boolean";
    }
}
