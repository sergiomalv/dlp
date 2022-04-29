package ast.types;

import ast.AstNode;
import ast.expressions.Expression;

import java.util.List;

/**
 * Interface of types
 */
public interface Type extends AstNode {

    boolean isLogical();
    Type arithmetic(Type type, AstNode node);
    Type arithmetic(AstNode node);
    Type comparison(Type type, AstNode node);
    Type logical(Type type, AstNode node);
    Type logical(AstNode node);
    Type promotesTo(Type type, AstNode node);
    Type dot(String name, AstNode node);
    Type squareBrackets(Type type, AstNode node);
    boolean isBuiltin();
    Type canBeCasted(Type type, AstNode node);
    Type parenthesis(List<Expression> expressions, AstNode node);
    int numberOfBytes();
    char suffix();
}
