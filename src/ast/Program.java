package ast;

import ast.definitions.Definition;
import ast.statements.Statement;
import visitor.Visitor;

import java.util.List;

/**
 * Represents a program, first node of the AST
 * @author Sergio
 */
public class Program implements AstNode{

    // Variables of the class
    private int line;
    private int column;
    private List<Definition> definitions;   // List of definitions

    /**
     * Constructor of a program
     * @param line
     * @param column
     * @param definitions
     */
    public Program(int line, int column, List<Definition> definitions){
        checkParams(line, column, definitions);
        this.line = line;
        this.column = column;
        this.definitions = definitions;
    }

    /**
     * @return line
     */
    @Override
    public int getLine() {
        return 0;
    }

    /**
     * @return column
     */
    @Override
    public int getColumn() {
        return 0;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    /**
     * Check the params of the constructor
     * @param line
     * @param column
     * @param definitions
     */
    private void checkParams(int line, int column, List<Definition> definitions){
        if (line < 0){
            throw new IllegalArgumentException("The line must be at least 0");
        }
        if (column < 0){
            throw new IllegalArgumentException("The size must be at least 0");
        }
        if (definitions == null){
            throw new IllegalArgumentException("The list of definitions shouldn't be null");
        }

    }

    @Override
    public String toString() {
        String result = "";
        for (Definition def : definitions){
            result += def.toString() + "\n";
        }
        return result;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }
}
