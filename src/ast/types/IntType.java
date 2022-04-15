package ast.types;

import ast.AstNode;
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
    public boolean isLogical(){
        return true;
    }

    @Override
    public Type arithmetic(Type type, AstNode node) {
        if (type.equals(this) || type instanceof ErrorType){
            return type;
        }

        return super.arithmetic(type, node);
    }

    @Override
    public Type arithmetic(AstNode node) {
        return this;
    }

    @Override
    public Type comparison(Type type, AstNode node) {
        if (type.equals(this) || type instanceof ErrorType){
            return type;
        }

        return super.comparison(type, node);
    }

    @Override
    public Type logical(Type type, AstNode node) {
        if (type.equals(this) || type instanceof ErrorType){
            return type;
        }

        return super.logical(type, node);
    }

    @Override
    public Type logical(AstNode node) {
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
    public boolean isBuiltin() {
        return true;
    }

    @Override
    public Type canBeCasted(Type type, AstNode node) {
        if (type.equals(this) || type.equals(DoubleType.getDoubleType()) ||
            type.equals(CharType.getCharType())){
            return this;
        }

        return super.canBeCasted(type, node);
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
