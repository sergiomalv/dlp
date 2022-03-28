package ast.types;

import errorhandler.ErrorHandler;
import visitor.Visitor;

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
        ErrorHandler.getErrorHandler().addError(this);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public String toString() {
        return "There is an error in line: " + this.line + " ,column: " + column +
                " at declaration " + message;
    }
}
