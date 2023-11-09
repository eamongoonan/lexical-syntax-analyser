// Generated from ccal.g4 by ANTLR 4.13.1
package ccal;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ccalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ccalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ccalParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ccalParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_list(ccalParser.Decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(ccalParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(ccalParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_decl(ccalParser.Const_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_list(ccalParser.Function_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ccalParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ccalParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(ccalParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNemp_parameter_list(ccalParser.Nemp_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ccalParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(ccalParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ccalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ccalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#binary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_arith_op(ccalParser.Binary_arith_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrag(ccalParser.FragContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ccalParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(ccalParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(ccalParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccalParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNemp_arg_list(ccalParser.Nemp_arg_listContext ctx);
}