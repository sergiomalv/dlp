package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

/**
 * Represents a print statement
 * @author Sergio
 */
public class Print extends AbstractStatement{

    // Variables of the class
    private List<Expression> expressions;   // Expressions that prints

    /**
     * Constructor of the print statement
     * @param line
     * @param column
     * @param expressions, expressions that prints
     */
    public Print(int line, int column, List<Expression> expressions) {
        super(line, column);
        checkParams(expressions);
        this.expressions = expressions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    /**
     * Check the expressions of the return
     * @param expressions
     */
    private void checkParams(List<Expression> expressions){
        if (expressions.isEmpty()){
            throw new IllegalArgumentException("There has to be at least an expression");
        }

        for (Expression expression : expressions){
            if (expression == null){
                throw new IllegalArgumentException("Expression shouldn't be null");
            }
        }
    }

    @Override
    public String toString() {
        String result = "print ";
        int counter = 0;
        for (Expression expression : this.expressions){
           if (expressions.size() -1 == counter){
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
}
