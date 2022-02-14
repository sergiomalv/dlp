package ast.definitions;

import ast.AstNode;
import ast.types.Type;

/**
 * Represents a definition
 * @author Sergio
 */
public interface Definition extends AstNode {

    /**
     * Return the name of a definition
     * @return name
     */
    public String getName();

    /**
     * Return the type of definition
     * @return type
     */
    public Type getType();
}
