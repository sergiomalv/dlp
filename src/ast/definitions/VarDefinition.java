package ast.definitions;

import ast.statements.AbstractStatement;
import ast.statements.Statement;
import ast.types.Type;
import visitor.Visitor;

import java.util.List;

/**
 * Represents a definition of variables
 * @author Sergio
 */
public class VarDefinition extends AbstractDefinition implements Statement {

    //Variables of the class
    int offset;     // Actual offset of the field

    /**
     * Constructor of a definition of variables
     * @param line
     * @param column
     * @param type
     */
    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return this.getName()  + ": " + this.getType();
    }
}
