package ast.expressions;

import ast.AstNode;

/**
 * Interface that represents an expression
 * @autor Sergio
 */
public interface Expression extends AstNode {

    boolean getLValue();

    void setLValue(Boolean lValue);
}
