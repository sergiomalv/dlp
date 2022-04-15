package ast.expressions;

import ast.AstNode;
import ast.types.Type;

/**
 * Interface that represents an expression
 * @autor Sergio
 */
public interface Expression extends AstNode {

    boolean getLValue();

    void setLValue(Boolean lValue);

    Type getType();

    void setType(Type type);
}
