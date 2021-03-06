package ast.definitions;

import ast.expressions.Variable;
import ast.statements.AbstractStatement;
import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.Type;
import visitor.Visitor;

import java.util.List;

/**
 * Represents a definition of a function
 * @author Sergio
 */
public class FuncDefinition extends AbstractDefinition {

    // Variables of the class
    private List<Statement> statements; // Statements of the function
    private List<VarDefinition> variables;   // Variables of the function
    private int localVariablesBytes = 0;

    /**
     * Constructor of a function definition
     * @param line
     * @param column
     * @param statements, list of statements
     */
    public FuncDefinition(int line, int column, String name, Type type, List<VarDefinition> variables,
                          List<Statement> statements) {
        super(line, column, type, name);
        checkParams(statements);
        this.statements = statements;
        this.variables = variables;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    /**
     * Check the statements of the constructor
     * @param statements
     */
    private void checkParams(List<Statement> statements){
        if (statements == null){
            throw new IllegalArgumentException("The list of statements shouldn't be null");
        }
    }

    @Override
    public String toString() {
        String result= "def " + this.getName() + "(): " + this.getType() + "{\n";
        for (VarDefinition var : variables){
            result += var.toString() +"\n";
        }
        for (Statement st : statements){
            result += st.toString() + "\n";
        }

        return result;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public int getLocalVariablesBytes() {
        return localVariablesBytes;
    }

    public void setLocalVariablesBytes(int localVariablesBytes) {
        this.localVariablesBytes = localVariablesBytes;
    }

    public List<VarDefinition> getVariables() {
        return variables;
    }
}
