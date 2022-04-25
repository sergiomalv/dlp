package codeGenerator;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.types.FieldType;
import ast.types.FunctionType;
import ast.types.StructType;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Boolean, Void> {

    // Helpers
    int beforeGlobal = 0;
    int beforeParam = 0;
    int beforeLocal = 0;

    @Override
    public Void visit(VarDefinition v, Boolean unused) {
        super.visit(v, unused);
        // Global variable
        if (v.getScope() == 0){
            v.setOffset(beforeGlobal);
            beforeGlobal += v.getType().numberOfBytes();
        } else {
            if (!unused){    // Local variable
                beforeLocal += v.getType().numberOfBytes();
                v.setOffset(-beforeLocal);
            } else {        // Param variable
                v.setOffset(beforeParam + 4);
            }
        }

        return null;
    }

    @Override
    public Void visit(FieldType f, Boolean unused) {
        f.setOffset(f.numberOfBytes());

        return null;
    }

    @Override
    public Void visit(FunctionType f, Boolean aBoolean) {
        beforeParam = 0;
        for (int i = f.getParameters().size() - 1; i >= 0; i--){
            f.getParameters().get(i).accept(this, true);
            beforeParam += f.getParameters().get(i).getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(FuncDefinition f, Boolean aBoolean) {
        beforeLocal = 0;
        f.getType().accept(this, aBoolean);
        for (VarDefinition varDefinition : f.getVariables()){
            varDefinition.accept(this, false);
            //beforeLocal += varDefinition.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(StructType s, Boolean aBoolean) {
        int fieldsOffset = 0;
        for (FieldType field : s.getFields()){
            field.accept(this, false);
            field.setOffset(fieldsOffset);
            fieldsOffset += field.getType().numberOfBytes();
        }
        return null;
    }
}
