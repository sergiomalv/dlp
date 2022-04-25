package ast.types;

import ast.AstNode;
import ast.expressions.Expression;

import java.util.List;

/**
 * Abstract class that represents a type
 * @author Sergio
 */
public abstract class AbstractType implements Type{

    // Class's variables
    int line;   // Shows information about the line
    int column; // Shows information about the column

    /**
     * Constructor of the class
     * @param line
     * @param column
     */
    public AbstractType(int line, int column){
        checkParams(line, column);
        this.line = line;
        this.column = column;
    }

    /**
     * @return line
     */
    @Override
    public int getLine() {
        return this.line;
    }

    /**
     * @return column
     */
    @Override
    public int getColumn() {
        return this.column;
    }

    @Override
    public boolean isLogical(){
        return false;
    }

    @Override
    public Type arithmetic(Type type, AstNode node){
        return new ErrorType(node.getLine(), node.getColumn(), "Can't do a operation between left and right");
    }

    @Override
    public Type arithmetic(AstNode node){
        return new ErrorType(node.getLine(), node.getColumn(), "Can't do a operation between left and right");
    }

    @Override
    public Type comparison(Type type, AstNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't compare this expression");
    }

    @Override
    public Type logical(Type type, AstNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't do this logical operation");
    }

    @Override
    public Type logical(AstNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't do this logical operation");
    }

    @Override
    public Type promotesTo(Type type, AstNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't promote this");
    }

    @Override
    public Type dot(String name, AstNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't access");
    }

    @Override
    public Type squareBrackets(Type type, AstNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't access");
    }

    @Override
    public boolean isBuiltin() {
        return false;
    }

    @Override
    public Type canBeCasted(Type type, AstNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't be casted");
    }

    @Override
    public Type parenthesis(List<Expression> expressions, AstNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't analyze the parenthesis");
    }

    @Override
    public int numberOfBytes(){
        throw new IllegalStateException();
    }

    /**
     * Check the params of the constructor
     * @param line, at least 0
     * @param column, at least 0
     */
    private void checkParams(int line, int column){
        if (line < 0){
            throw new IllegalArgumentException("The line must be at least 0");
        }
        if (column < 0){
            throw new IllegalArgumentException("The size must be at least 0");
        }
    }
}
