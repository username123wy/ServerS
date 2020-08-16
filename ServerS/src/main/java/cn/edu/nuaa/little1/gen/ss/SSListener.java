// Generated from E:/Users/zongz/Desktop/little1/ServerS/src/main/java/cn/edu/nuaa/little1/grammer\SS.g4 by ANTLR 4.8
package cn.edu.nuaa.little1.gen.ss;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SSParser}.
 */
public interface SSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SSParser#ss}.
	 * @param ctx the parse tree
	 */
	void enterSs(SSParser.SsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSParser#ss}.
	 * @param ctx the parse tree
	 */
	void exitSs(SSParser.SsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSParser#query_list}.
	 * @param ctx the parse tree
	 */
	void enterQuery_list(SSParser.Query_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSParser#query_list}.
	 * @param ctx the parse tree
	 */
	void exitQuery_list(SSParser.Query_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSParser#simple_query}.
	 * @param ctx the parse tree
	 */
	void enterSimple_query(SSParser.Simple_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSParser#simple_query}.
	 * @param ctx the parse tree
	 */
	void exitSimple_query(SSParser.Simple_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SSParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SSParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSParser#equal_query}.
	 * @param ctx the parse tree
	 */
	void enterEqual_query(SSParser.Equal_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSParser#equal_query}.
	 * @param ctx the parse tree
	 */
	void exitEqual_query(SSParser.Equal_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSParser#not_equal_query}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal_query(SSParser.Not_equal_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSParser#not_equal_query}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal_query(SSParser.Not_equal_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSParser#case_insensitive_equal_query}.
	 * @param ctx the parse tree
	 */
	void enterCase_insensitive_equal_query(SSParser.Case_insensitive_equal_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSParser#case_insensitive_equal_query}.
	 * @param ctx the parse tree
	 */
	void exitCase_insensitive_equal_query(SSParser.Case_insensitive_equal_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SSParser#contain_query}.
	 * @param ctx the parse tree
	 */
	void enterContain_query(SSParser.Contain_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SSParser#contain_query}.
	 * @param ctx the parse tree
	 */
	void exitContain_query(SSParser.Contain_queryContext ctx);
}