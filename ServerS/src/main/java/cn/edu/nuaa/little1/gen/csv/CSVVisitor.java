// Generated from E:/Users/zongz/Desktop/little1/ServerS/src/main/java/cn/edu/nuaa/little1/grammer\CSV.g4 by ANTLR 4.8
package cn.edu.nuaa.little1.gen.csv;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSVParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSVVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CSVParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHdr(CSVParser.HdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(CSVParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link CSVParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(CSVParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link CSVParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CSVParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CSVParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(CSVParser.EmptyContext ctx);
}