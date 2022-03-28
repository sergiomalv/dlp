package ast.statements;

import ast.definitions.VarDefinition;
import ast.expressions.Expression;
import ast.expressions.Variable;
import visitor.Visitor;

import java.util.List;

/**
 * Represents an invocation statement
 * @author Sergio
 */
public class Invocation extends AbstractStatement{

    // Variables of the class
    private String var; // Name of the function
    private List<VarDefinition> expressions; // Args of the function

    /**
     * Constructor of an invocation statement
     * @param line
     * @param column
     * @param expressions
     * @param var
     */
    public Invocation(int line, int column, String var, List<VarDefinition> expressions) {
        super(line, column);
        checkParams(var);
        this.var = var;
        this.expressions = expressions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    /**
     * Checks the identifier of the constructor
     * @param var
     */
    private void checkParams(String var){
        if (var.trim().isEmpty() || var == null) {
            throw new IllegalArgumentException("Identifier shouldn't be null or empty");
        }
    }

    @Override
    public String toString() {
        String result = var + "(";
        int counter = 0;
        for (VarDefinition expression : expressions){
            if (expressions.size() -1 == counter){
                result += expression + ")" + ";";
            } else {
                result += expression + ", ";
            }
            counter++;
        }
        return result;
    }

    public List<VarDefinition> getExpressions() {
        return expressions;
    }
}
