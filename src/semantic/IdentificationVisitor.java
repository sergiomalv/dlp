package semantic;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.types.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    // Variables of the class
    SymbolTable symbolTable;

    public IdentificationVisitor(){
        symbolTable = new SymbolTable();
    }

    @Override
    public Void visit(VarDefinition definition, Void unused) {
        if (!symbolTable.insert(definition)){
            new ErrorType(definition.getLine(), definition.getColumn(), definition.toString());
        }
        return null;
    }

    @Override
    public Void visit(FuncDefinition definition, Void unused){
        if (!symbolTable.insert(definition)){
            new ErrorType(definition.getLine(), definition.getColumn(), definition.toString());
        }
        symbolTable.set();
        super.visit(definition, unused);
        symbolTable.reset();
        return null;
    }

    @Override
    public Void visit(Variable variable, Void unused){
        variable.setDefinition(symbolTable.find(variable.getName()));

        if (variable.getDefinition() == null){
            variable.setDefinition(new VarDefinition(variable.getLine(), variable.getColumn(),
                    new ErrorType(variable.getLine(), variable.getColumn(), variable.toString()),
                    variable.getName()));
        }
        return null;
    }
}
