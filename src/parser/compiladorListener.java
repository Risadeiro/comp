// Generated from compilador.g4 by ANTLR 4.7.1
package src.parser;

	import src.datastructures.compiladorSymbol;
	import src.datastructures.compiladorVariable;
	import src.datastructures.compiladorSymbolTable;
	import src.exceptions.compiladorSemanticException;
	import src.ast.compiladorProgram;
	import src.ast.AbstractCommand;
	import src.ast.CommandLeitura;
	import src.ast.CommandEscrita;
	import src.ast.CommandAtribuicao;
	import src.ast.CommandDecisao;
	import src.ast.CommandEnquanto;
	import src.ast.CommandFaca;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladorParser}.
 */
public interface compiladorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(compiladorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(compiladorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(compiladorParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(compiladorParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(compiladorParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(compiladorParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(compiladorParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(compiladorParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(compiladorParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(compiladorParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(compiladorParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(compiladorParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(compiladorParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(compiladorParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(compiladorParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(compiladorParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(compiladorParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(compiladorParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void enterCmdselecao(compiladorParser.CmdselecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void exitCmdselecao(compiladorParser.CmdselecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#cmdfaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdfaca(compiladorParser.CmdfacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#cmdfaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdfaca(compiladorParser.CmdfacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#cmdenquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdenquanto(compiladorParser.CmdenquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#cmdenquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdenquanto(compiladorParser.CmdenquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(compiladorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(compiladorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(compiladorParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(compiladorParser.TermoContext ctx);
}