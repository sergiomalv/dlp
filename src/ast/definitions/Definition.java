package ast.definitions;

import ast.AstNode;
import ast.types.Type;

/**
 * Represents a definition
 * @author Sergio
 */
public interface Definition extends AstNode {

    /**
     * Return the type of definition
     * @return type
     */
    public Type getType();

    /**
     * Return the actual scope of definition
     * @return scope
     */
    public int getScope();

    /**
     * Set the scope of definition
     * @param scope
     */
    public void setScope (int scope);

    /**
     * Return the name of the definition
     * @return
     */
    public String getName();
}
