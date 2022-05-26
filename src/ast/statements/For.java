package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;


public class For extends AbstractStatement {

    // Variables of the class
    Statement assignment;
    Expression condition;
    Statement increment;
    List<Statement> statements;

    public For(int line, int column, Statement assignment, Expression condition, Statement increment, List<Statement> statements) {
        super(line, column);
        this.assignment = assignment;
        this.condition = condition;
        this.increment = increment;
        this.statements = statements;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    public Statement getAssignment() {
        return assignment;
    }

    public Expression getCondition() {
        return condition;
    }

    public Statement getIncrement() {
        return increment;
    }

    public List<Statement> getStatements() {
        return statements;
    }
}
