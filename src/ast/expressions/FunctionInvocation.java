package ast.expressions;

import ast.statements.Statement;
import ast.types.Type;
import visitor.Visitor;

import java.util.List;

/**
 * Represents the invocation of a function expression
 * @author Sergio
 */
public class FunctionInvocation extends AbstractExpression implements Statement {

    // Variables of the class
    private Variable var;   // Variable of the invocation
    private List<Expression> expressions;   // Args of the function

    /**
     * Constructor of invocation of one function
     * @param line
     * @param column
     * @param var
     */
    public FunctionInvocation(int line, int column, Variable var, List<Expression> expressions) {
        super(line, column);
        checkParams(var, expressions);
        this.var = var;
        this.expressions = expressions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    /**
     * Check the variable of the constructor
     * @param var
     */
    private void checkParams(Variable var, List<Expression> expressions){
        if (var == null){
            throw new IllegalArgumentException("Var shouldn't be null or empty");
        }
        if (expressions == null){
            throw new IllegalArgumentException("List of expressions shouldn't be null");
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

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Variable getVar() {
        return var;
    }
}
