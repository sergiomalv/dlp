package ast.types;

import ast.AstNode;
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
    public Type arithmetic(Type type, AstNode node) {
        if (type.equals(this)){
            return IntType.getIntType();
        }

        if (type instanceof ErrorType){
            return type;
        }

        return super.arithmetic(type, node);
    }

    @Override
    public Type comparison(Type type, AstNode node) {
        if (type.equals(this) || type instanceof ErrorType){
            return IntType.getIntType();
        }

        return super.comparison(type, node);
    }

    @Override
    public Type promotesTo(Type type, AstNode node) {
        if (type.equals(this) || type instanceof ErrorType){
            return type;
        }

        return super.promotesTo(type, node);
    }

    @Override
    public boolean isBuiltin() {
        return true;
    }

    @Override
    public Type canBeCasted(Type type, AstNode node) {
        if (type.equals(this) || type.equals(IntType.getIntType()) ||
                type.equals(DoubleType.getDoubleType())){
            return this;
        }

        return super.canBeCasted(type, node);
    }

    @Override
    public Type arithmetic(AstNode node) {
        return this;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public char suffix() {
        return 'b';
    }

    @Override
    public String toString() {
        return "char";
    }
}
