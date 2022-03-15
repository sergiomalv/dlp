package errorhandler;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    // Variables of the class
    private List<ErrorType> errors;
    // Instance of ErrorHandler
    private static ErrorHandler errorHandler = null;

    private ErrorHandler() {
        errors = new ArrayList<ErrorType>();
    }

    public static ErrorHandler getErrorHandler(){
        if (errorHandler == null){
            errorHandler = new ErrorHandler();
        }
        return errorHandler;
    }

    public boolean hasErrors(){
        return !this.errors.isEmpty();
    }

    public void showErrors(PrintStream p){
        for (ErrorType error : errors){
            p.println(error);
        }
    }

    public void addError(ErrorType error){
        errors.add(error);
    }
}
