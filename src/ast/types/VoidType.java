package ast.types;

import visitor.Visitor;

/**
 * Represents an instance of VoidType
 * Singleton patron
 * @author Sergio
 */
public class VoidType extends AbstractType{

    /**
     * Private constructor of VoidType, line and column must be 0
     */
    public VoidType() { super(0, 0); }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public String toString() {
        return "";
    }
}
