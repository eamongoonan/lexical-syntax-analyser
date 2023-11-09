// Generated from ccal.g4 by ANTLR 4.13.1
package ccal;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ccalParser}.
 */
public interface ccalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ccalParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ccalParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ccalParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(ccalParser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(ccalParser.Decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ccalParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ccalParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(ccalParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(ccalParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConst_decl(ccalParser.Const_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConst_decl(ccalParser.Const_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_list(ccalParser.Function_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_list(ccalParser.Function_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ccalParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ccalParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ccalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ccalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(ccalParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(ccalParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_parameter_list(ccalParser.Nemp_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_parameter_list(ccalParser.Nemp_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ccalParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ccalParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(ccalParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(ccalParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ccalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ccalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ccalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ccalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_arith_op(ccalParser.Binary_arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_arith_op(ccalParser.Binary_arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterFrag(ccalParser.FragContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitFrag(ccalParser.FragContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ccalParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ccalParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(ccalParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(ccalParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(ccalParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(ccalParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccalParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_arg_list(ccalParser.Nemp_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccalParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_arg_list(ccalParser.Nemp_arg_listContext ctx);
}