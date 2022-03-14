package ast.definitions;

import ast.AstNode;
import ast.types.Type;

/**
 * Represents a definition
 * @author Sergio
 */
public interface Definition extends Type {

    /**
     * Return the type of definition
     * @return type
     */
    public Type getType();
}
