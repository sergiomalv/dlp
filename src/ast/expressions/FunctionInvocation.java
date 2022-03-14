package ast.expressions;

import ast.statements.Statement;

import java.util.List;

/**
 * Represents the invocation of a function expression
 * @author Sergio
 */
public class FunctionInvocation extends AbstractExpression implements Statement {

    // Variables of the class
    private String var;   // Variable of the invocation
    private List<Expression> expressions;   // Args of the function

    /**
     * Constructor of invocation of one function
     * @param line
     * @param column
     * @param var
     */
    public FunctionInvocation(int line, int column, String var, List<Expression> expressions) {
        super(line, column);
        checkParams(var, expressions);
        this.var = var;
        this.expressions = expressions;
    }

    /**
     * Check the variable of the constructor
     * @param var
     */
    private void checkParams(String var, List<Expression> expressions){
        if (var == null || var.trim().isEmpty()){
            throw new IllegalArgumentException("Var shouldn't be null or empty");
        }
        if (expressions == null){
            throw new IllegalArgumentException("List of expressions shouldn't be null");
        }
        for (Expression expression : expressions){
            if (expression == null){
                throw new IllegalArgumentException("Expression shouldn't be null");
            }
        }
    }

    @Override
    public String toString() {
        String result = var.toString() + "(";
        int counter = 0;
        for (Expression expression : expressions){
            if (counter == expressions.size()-1){
                result += expression;
            } else {
                result += expression + ", ";
            }
            counter++;
        }
        return result;
    }
}
