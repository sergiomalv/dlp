// Generated from C:/Universidad/2do trimestre/Desarrollo de Lenguajes de Programación/Laboratorio/workspace/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(PmmParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(PmmParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#createVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateVar(PmmParser.CreateVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(PmmParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#parametres}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametres(PmmParser.ParametresContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#bodyFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyFunction(PmmParser.BodyFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#sentences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentences(PmmParser.SentencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(PmmParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(PmmParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#conditionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBody(PmmParser.ConditionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#functionMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionMain(PmmParser.FunctionMainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
}