// Generated from LinguagemA.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinguagemAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinguagemAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinguagemAParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LinguagemAParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(LinguagemAParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(LinguagemAParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(LinguagemAParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstDecl}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(LinguagemAParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(LinguagemAParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDecl}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(LinguagemAParser.ArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(LinguagemAParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LinguagemAParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link LinguagemAParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LinguagemAParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LinguagemAParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(LinguagemAParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LinguagemAParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(LinguagemAParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(LinguagemAParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(LinguagemAParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(LinguagemAParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LinguagemAParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(LinguagemAParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LinguagemAParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(LinguagemAParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(LinguagemAParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LinguagemAParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFalse(LinguagemAParser.BoolFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LinguagemAParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(LinguagemAParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTrue(LinguagemAParser.BoolTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link LinguagemAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(LinguagemAParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LinguagemAParser.TypeContext ctx);
}