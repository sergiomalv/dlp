package codeGenerator;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.Visitor;

public class AbstractCGVisitor<TP, TR> implements Visitor<TP, TR> {
    @Override
    public TR visit(Program p, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(VarDefinition v, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FuncDefinition f, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Arithmetic a, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(ArrayAccess a, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Cast c, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(CharLiteral c, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Comparison c, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(DoubleLiteral d, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FieldAccess f, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FunctionInvocation f, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(IntLiteral i, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Logic l, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Not n, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(UnaryMinus u, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Variable v, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Assignment a, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(IfElse i, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Input i, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Print p, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Return r, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(While w, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(ArrayType a, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(CharType c, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(DoubleType d, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(ErrorType e, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FieldType f, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FunctionType f, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(IntType i, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(StructType s, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(VoidType v, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(For f, TP tp) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Pow p, TP tp) {throw new IllegalStateException(); }
}
