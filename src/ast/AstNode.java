package ast;

/**
 * Interface that represents a node of the tree
 * Shows information about the column and line when are an error
 * @author Sergio Murillo
 */
public interface AstNode {

    /**
     * Returns the line
     * @return line
     */
    public int getLine();

    /**
     * Returns the column
     * @return the column
     */
    public int getColumn();
}
