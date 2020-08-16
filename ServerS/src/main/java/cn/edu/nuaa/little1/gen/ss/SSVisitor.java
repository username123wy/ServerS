// Generated from E:/Users/zongz/Desktop/little1/ServerS/src/main/java/cn/edu/nuaa/little1/grammer\SS.g4 by ANTLR 4.8
package cn.edu.nuaa.little1.gen.ss;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SSParser#ss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSs(SSParser.SsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSParser#query_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_list(SSParser.Query_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSParser#simple_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_query(SSParser.Simple_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SSParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSParser#equal_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_query(SSParser.Equal_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSParser#not_equal_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal_query(SSParser.Not_equal_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSParser#case_insensitive_equal_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_insensitive_equal_query(SSParser.Case_insensitive_equal_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SSParser#contain_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContain_query(SSParser.Contain_queryContext ctx);
}