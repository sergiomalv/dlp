package ast.types;

import ast.AstNode;
import visitor.Visitor;

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
    public static DoubleType getDoubleType(){
        if (doubleType == null){
            doubleType = new DoubleType();
        }
        return doubleType;
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
    public int numberOfBytes() {
        return 4;
    }

    @Override
    public char suffix() {
        return 'f';
    }

    @Override
    public String toString() {
        return "double";
    }
}
