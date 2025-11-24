// Generated from LinguagemA.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguagemAParser}.
 */
public interface LinguagemAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguagemAParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LinguagemAParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LinguagemAParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(LinguagemAParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(LinguagemAParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(LinguagemAParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(LinguagemAParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(LinguagemAParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(LinguagemAParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstDecl}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(LinguagemAParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstDecl}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(LinguagemAParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(LinguagemAParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(LinguagemAParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(LinguagemAParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(LinguagemAParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(LinguagemAParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(LinguagemAParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LinguagemAParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LinguagemAParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LinguagemAParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LinguagemAParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LinguagemAParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LinguagemAParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNull(LinguagemAParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNull(LinguagemAParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(LinguagemAParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(LinguagemAParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegation(LinguagemAParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegation(LinguagemAParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(LinguagemAParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(LinguagemAParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LinguagemAParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LinguagemAParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelational(LinguagemAParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelational(LinguagemAParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(LinguagemAParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(LinguagemAParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(LinguagemAParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(LinguagemAParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(LinguagemAParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(LinguagemAParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(LinguagemAParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(LinguagemAParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(LinguagemAParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(LinguagemAParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LinguagemAParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LinguagemAParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolFalse(LinguagemAParser.BoolFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolFalse(LinguagemAParser.BoolFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(LinguagemAParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(LinguagemAParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquality(LinguagemAParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquality(LinguagemAParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolTrue(LinguagemAParser.BoolTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolTrue(LinguagemAParser.BoolTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(LinguagemAParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(LinguagemAParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LinguagemAParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LinguagemAParser.TypeContext ctx);
}