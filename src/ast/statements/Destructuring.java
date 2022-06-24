package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class Destructuring extends AbstractStatement{

    // Variables of the class
    List<Expression> left;
    Expression right;

    public Destructuring(int line, int column, List<Expression> left, Expression right){
        super(line, column);
        this.left = left;
        this.right = right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public String toString() {
        return left.toString() + " = " + right.toString();
    }

    public List<Expression> getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

}
