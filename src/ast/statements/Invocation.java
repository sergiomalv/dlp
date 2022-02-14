package ast.statements;

/**
 * Represents an invocation statement
 */
public class Invocation extends AbstractStatement{

    /**
     * Constructor of an invocation statement
     * @param line
     * @param column
     */
    public Invocation(int line, int column) {
        super(line, column);
    }
}
