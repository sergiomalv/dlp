package ast.types;

public class ErrorType extends AbstractType{

    // Variables of the class
    private String message;

    /**
     * Constructor of the class
     *
     * @param line
     * @param column
     * @param message
     */
    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
    }

    @Override
    public String toString() {
        return "There is an error in line: " + this.line + " ,column: " + column +
                " at declaration " + message;
    }
}
