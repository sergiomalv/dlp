package visitor;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

/**
 * Interface of visitor
 */
public interface Visitor<TP,TR> {

    TR visit(Program p, TP tp);
    // Package definitions
    TR visit(VarDefinition v, TP tp);
    TR visit(FuncDefinition f, TP tp);
    // Package expressions
    TR visit(Arithmetic a, TP tp);
    TR visit(ArrayAccess a, TP tp);
    TR visit(Cast c, TP tp);
    TR visit(CharLiteral c, TP tp);
    TR visit(Comparison c, TP tp);
    TR visit(DoubleLiteral d, TP tp);
    TR visit(FieldAccess f, TP tp);
    TR visit(FunctionInvocation f, TP tp);
    TR visit(IntLiteral i, TP tp);
    TR visit(Logic l, TP tp);
    TR visit(Not n, TP tp);
    TR visit(UnaryMinus u, TP tp);
    TR visit(Variable v, TP tp);
    // Package statements
    TR visit(Assignment a, TP tp);
    TR visit(IfElse i, TP tp);
    TR visit(Input i, TP tp);
    TR visit(Print p, TP tp);
    TR visit(Return r, TP tp);
    TR visit(While w, TP tp);
    // Package types
    TR visit(ArrayType a, TP tp);
    TR visit(CharType c, TP tp);
    TR visit(DoubleType d, TP tp);
    TR visit(ErrorType e, TP tp );
    TR visit(FieldType f, TP tp);
    TR visit(FunctionType f, TP tp);
    TR visit(IntType i, TP tp);
    TR visit(StructType s, TP tp);
    TR visit(VoidType v, TP tp);
    TR visit(For f, TP tp);
    TR visit(Pow pow, TP tp);
}
