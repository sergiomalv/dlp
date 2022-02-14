package ast.expressions;

/**
 * Represents the invocation of a function expression
 * @author Sergio
 */
public class FunctionInvocation extends AbstractExpression{

    // Variables of the class
    private Variable var;   // Variable of the invocation

    /**
     * Constructor of invocation of one function
     * @param line
     * @param column
     * @param var
     */
    public FunctionInvocation(int line, int column, Variable var) {
        super(line, column);
        checkParams(var);
        this.var = var;
    }

    /**
     * Check the variable of the constructor
     * @param var
     */
    private void checkParams(Variable var){
        if (var == null){
            throw new IllegalArgumentException("Var shouldn't be null");
        }
    }
}
