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
	import src.ast.CommandTamanho;
	import src.ast.CommandEnquanto;
	import src.ast.CommandFaca;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, AP=16, FP=17, 
		SC=18, OP=19, ATTR=20, VIR=21, ACH=22, FCH=23, OPREL=24, ID=25, NUMBER=26, 
		TEXT=27, VECTOR=28, WS=29;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdtamanho = 6, RULE_cmdleitura = 7, RULE_cmdescrita = 8, 
		RULE_cmdattrib = 9, RULE_cmdselecao = 10, RULE_cmdfaca = 11, RULE_cmdenquanto = 12, 
		RULE_expr = 13, RULE_termo = 14;
	public static final String[] ruleNames = {
		"prog", "decl", "declaravar", "tipo", "bloco", "cmd", "cmdtamanho", "cmdleitura", 
		"cmdescrita", "cmdattrib", "cmdselecao", "cmdfaca", "cmdenquanto", "expr", 
		"termo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'inicio'", "'fim'", "'numero'", "'texto'", "'booleano'", "'caracter'", 
		"'inteiro'", "'numero[]'", "'tamanho'", "'leia'", "'escreva'", "'se'", 
		"'senao'", "'faca'", "'enquanto'", "'('", "')'", "';'", null, "'='", "','", 
		"'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", 
		"FCH", "OPREL", "ID", "NUMBER", "TEXT", "VECTOR", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "compilador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private int _tipo;
		private String _varName;
		private String _varValue;
		private compiladorSymbolTable symbolTable = new compiladorSymbolTable();
		private compiladorSymbol symbol;
		private compiladorProgram program = new compiladorProgram();
		private ArrayList<AbstractCommand> curThread;
		private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
		private String _readID;
		private String _writeID;
	    private int _exprTam;
		private String _exprID;
		private String _exprContent;
		private String _exprDecision;
		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;
		private ArrayList<AbstractCommand> lista;
		
		public void verificaID(String id){
			if (!symbolTable.exists(id)){
				throw new compiladorSemanticException("Symbol "+id+" not declared");
			}
		}
		
		public void exibeComandos(){
			for (AbstractCommand c: program.getComandos()){
				System.out.println(c);
			}
		}
		
		public void generateCode(){
			program.generateTarget();
		}

	public compiladorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			decl();
			setState(32);
			bloco();
			setState(33);
			match(T__1);
			  program.setVarTable(symbolTable);
			           	  program.setComandos(stack.pop());

			           
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				declaravar();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(compiladorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(compiladorParser.ID, i);
		}
		public TerminalNode SC() { return getToken(compiladorParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(compiladorParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(compiladorParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			tipo();
			setState(42);
			match(ID);

				                  _varName = _input.LT(-1).getText();
				                  _varValue = null;
				                  symbol = new compiladorVariable(_varName, _tipo, _varValue);
				                  if (!symbolTable.exists(_varName)){
				                     symbolTable.add(symbol);	
				                  }
				                  else{
				                  	 throw new compiladorSemanticException("Symbol "+_varName+" already declared");
				                  }
			                    
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(44);
				match(VIR);
				setState(45);
				match(ID);

					                  _varName = _input.LT(-1).getText();
					                  _varValue = null;
					                  symbol = new compiladorVariable(_varName, _tipo, _varValue);
					                  if (!symbolTable.exists(_varName)){
					                     symbolTable.add(symbol);	
					                  }
					                  else{
					                  	 throw new compiladorSemanticException("Symbol "+_varName+" already declared");
					                  }
				                    
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__2);
				 _tipo = compiladorVariable.NUMBER;  
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(T__3);
				 _tipo = compiladorVariable.TEXT;  
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(T__4);
				 _tipo = compiladorVariable.BOOLEAN;  
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(T__5);
				 _tipo = compiladorVariable.CHAR;  
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				match(T__6);
				 _tipo = compiladorVariable.INT;  
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				match(T__7);
				 _tipo = compiladorVariable.VECTOR;  
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 curThread = new ArrayList<AbstractCommand>(); 
				        stack.push(curThread);  
			          
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				cmd();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdselecaoContext cmdselecao() {
			return getRuleContext(CmdselecaoContext.class,0);
		}
		public CmdfacaContext cmdfaca() {
			return getRuleContext(CmdfacaContext.class,0);
		}
		public CmdenquantoContext cmdenquanto() {
			return getRuleContext(CmdenquantoContext.class,0);
		}
		public CmdtamanhoContext cmdtamanho() {
			return getRuleContext(CmdtamanhoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				cmdleitura();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				cmdescrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				cmdattrib();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				cmdselecao();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				cmdfaca();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				cmdenquanto();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				cmdtamanho();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdtamanhoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(compiladorParser.AP, 0); }
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode FP() { return getToken(compiladorParser.FP, 0); }
		public CmdtamanhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdtamanho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterCmdtamanho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitCmdtamanho(this);
		}
	}

	public final CmdtamanhoContext cmdtamanho() throws RecognitionException {
		CmdtamanhoContext _localctx = new CmdtamanhoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdtamanho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__8);
			setState(84);
			match(AP);
			setState(85);
			match(ID);
			 verificaID(_input.LT(-1).getText());
			                              _readID = _input.LT(-1).getText();
			                            
			setState(87);
			match(FP);

			                    compiladorVariable var = (compiladorVariable)symbolTable.get(_readID);
			                    CommandTamanho cmd = new CommandTamanho(_readID, var);
			                    stack.peek().add(cmd);
			                  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(compiladorParser.AP, 0); }
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode FP() { return getToken(compiladorParser.FP, 0); }
		public TerminalNode SC() { return getToken(compiladorParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__9);
			setState(91);
			match(AP);
			setState(92);
			match(ID);
			 verificaID(_input.LT(-1).getText());
			                     	  _readID = _input.LT(-1).getText();
			                        
			setState(94);
			match(FP);
			setState(95);
			match(SC);

			              	compiladorVariable var = (compiladorVariable)symbolTable.get(_readID);
			              	CommandLeitura cmd = new CommandLeitura(_readID, var);
			              	stack.peek().add(cmd);
			              
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdescritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(compiladorParser.AP, 0); }
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode FP() { return getToken(compiladorParser.FP, 0); }
		public TerminalNode SC() { return getToken(compiladorParser.SC, 0); }
		public CmdtamanhoContext cmdtamanho() {
			return getRuleContext(CmdtamanhoContext.class,0);
		}
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdescrita);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__10);
				setState(99);
				match(AP);
				setState(100);
				match(ID);
				 verificaID(_input.LT(-1).getText());
					                  _writeID = _input.LT(-1).getText();
				                     
				setState(102);
				match(FP);
				setState(103);
				match(SC);

				               	  CommandEscrita cmd = new CommandEscrita(_writeID);
				               	  stack.peek().add(cmd);
				               
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(105);
				match(T__10);
				setState(106);
				match(AP);
				 curThread = new ArrayList<AbstractCommand>();
				                                                                         stack.push(curThread);
				                                                                       
				setState(108);
				cmdtamanho();

				                                                                        listaTrue = stack.pop();
				                                                                     
				setState(110);
				match(FP);
				setState(111);
				match(SC);

				                                                                      		CommandEscrita cmd = new CommandEscrita(listaTrue);
				                                                                      		stack.peek().add(cmd);
				                                                                      	
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdattribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(compiladorParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(compiladorParser.SC, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ID);
			 verificaID(_input.LT(-1).getText());
			                    _exprID = _input.LT(-1).getText();
			                   
			setState(118);
			match(ATTR);
			 _exprContent = ""; 
			setState(120);
			expr();
			setState(121);
			match(SC);

			               	 	CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent, _exprTam);
			               	 	stack.peek().add(cmd);
			               
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdselecaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(compiladorParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(compiladorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(compiladorParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(compiladorParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(compiladorParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(compiladorParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(compiladorParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(compiladorParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(compiladorParser.FCH, i);
		}
		public TerminalNode NUMBER() { return getToken(compiladorParser.NUMBER, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdselecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdselecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterCmdselecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitCmdselecao(this);
		}
	}

	public final CmdselecaoContext cmdselecao() throws RecognitionException {
		CmdselecaoContext _localctx = new CmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__11);
			setState(125);
			match(AP);
			setState(126);
			match(ID);
			 _exprDecision = _input.LT(-1).getText(); 
			setState(128);
			match(OPREL);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprDecision += _input.LT(-1).getText(); 
			setState(132);
			match(FP);
			setState(133);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				cmd();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0) );
			setState(140);
			match(FCH);

			                       listaTrue = stack.pop();	
			                    
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(142);
				match(T__12);
				setState(143);
				match(ACH);

				                   	 	curThread = new ArrayList<AbstractCommand>();
				                   	 	stack.push(curThread);
				                   	 
				{
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					cmd();
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0) );
				}
				setState(150);
				match(FCH);

				                   		listaFalse = stack.pop();
				                   		CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
				                   		stack.peek().add(cmd);
				                   	
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdfacaContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(compiladorParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(compiladorParser.FCH, 0); }
		public TerminalNode AP() { return getToken(compiladorParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(compiladorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(compiladorParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(compiladorParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(compiladorParser.FP, 0); }
		public TerminalNode SC() { return getToken(compiladorParser.SC, 0); }
		public TerminalNode NUMBER() { return getToken(compiladorParser.NUMBER, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdfacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdfaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterCmdfaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitCmdfaca(this);
		}
	}

	public final CmdfacaContext cmdfaca() throws RecognitionException {
		CmdfacaContext _localctx = new CmdfacaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdfaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__13);
			setState(156);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				cmd();
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0) );
			setState(163);
			match(FCH);
			setState(164);
			match(T__14);
			setState(165);
			match(AP);
			setState(166);
			match(ID);
			 _exprDecision = _input.LT(-1).getText(); 
			setState(168);
			match(OPREL);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(170);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprDecision += _input.LT(-1).getText(); 
			setState(172);
			match(FP);
			setState(173);
			match(SC);

			                       lista = stack.pop();
								   CommandFaca cmd = new CommandFaca(_exprDecision, lista);
			                   	   stack.peek().add(cmd);
			                    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdenquantoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(compiladorParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(compiladorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(compiladorParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(compiladorParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(compiladorParser.FP, 0); }
		public TerminalNode ACH() { return getToken(compiladorParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(compiladorParser.FCH, 0); }
		public TerminalNode NUMBER() { return getToken(compiladorParser.NUMBER, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdenquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdenquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterCmdenquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitCmdenquanto(this);
		}
	}

	public final CmdenquantoContext cmdenquanto() throws RecognitionException {
		CmdenquantoContext _localctx = new CmdenquantoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdenquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__14);
			setState(177);
			match(AP);
			setState(178);
			match(ID);
			 _exprDecision = _input.LT(-1).getText(); 
			setState(180);
			match(OPREL);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprDecision += _input.LT(-1).getText(); 
			setState(184);
			match(FP);
			setState(185);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				cmd();
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0) );
			setState(192);
			match(FCH);

			                       lista = stack.pop();
								   CommandEnquanto cmd = new CommandEnquanto(_exprDecision, lista);
			                   	   stack.peek().add(cmd);
			                    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(compiladorParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(compiladorParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			termo();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(196);
				match(OP);
				 _exprContent += _input.LT(-1).getText();
				                        _exprTam = -1;
					             
				setState(198);
				termo();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(compiladorParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(compiladorParser.TEXT, 0); }
		public TerminalNode VECTOR() { return getToken(compiladorParser.VECTOR, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termo);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(ID);
				 verificaID(_input.LT(-1).getText());
					               _exprContent += _input.LT(-1).getText();
				                    _exprTam = -1;

				                 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(NUMBER);

				              	_exprContent += _input.LT(-1).getText();
				                _exprTam = -1;
				              
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(TEXT);

				              	_exprContent += _input.LT(-1).getText();
				                _exprTam = -1;
				              
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(VECTOR);

				                _exprContent += _input.LT(-1).getText();
				                _exprTam = 1;
				            
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00d9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\6\3(\n\3\r\3\16\3)\3\4\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16"+
		"\4\65\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"E\n\5\3\6\3\6\6\6I\n\6\r\6\16\6J\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nu\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\6\f\u008b\n\f\r\f\16\f\u008c\3\f\3\f\3\f\3\f\3\f\3\f\6\f"+
		"\u0095\n\f\r\f\16\f\u0096\3\f\3\f\3\f\5\f\u009c\n\f\3\r\3\r\3\r\3\r\6"+
		"\r\u00a2\n\r\r\r\16\r\u00a3\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\6\16\u00bf\n\16\r\16\16\16\u00c0\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7"+
		"\17\u00ca\n\17\f\17\16\17\u00cd\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00d7\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36\2\3\3\2\33\34\2\u00e1\2 \3\2\2\2\4\'\3\2\2\2\6+\3\2\2\2\bD\3\2"+
		"\2\2\nF\3\2\2\2\fS\3\2\2\2\16U\3\2\2\2\20\\\3\2\2\2\22t\3\2\2\2\24v\3"+
		"\2\2\2\26~\3\2\2\2\30\u009d\3\2\2\2\32\u00b2\3\2\2\2\34\u00c5\3\2\2\2"+
		"\36\u00d6\3\2\2\2 !\7\3\2\2!\"\5\4\3\2\"#\5\n\6\2#$\7\4\2\2$%\b\2\1\2"+
		"%\3\3\2\2\2&(\5\6\4\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3\2"+
		"\2\2+,\5\b\5\2,-\7\33\2\2-\63\b\4\1\2./\7\27\2\2/\60\7\33\2\2\60\62\b"+
		"\4\1\2\61.\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2"+
		"\2\2\65\63\3\2\2\2\66\67\7\24\2\2\67\7\3\2\2\289\7\5\2\29E\b\5\1\2:;\7"+
		"\6\2\2;E\b\5\1\2<=\7\7\2\2=E\b\5\1\2>?\7\b\2\2?E\b\5\1\2@A\7\t\2\2AE\b"+
		"\5\1\2BC\7\n\2\2CE\b\5\1\2D8\3\2\2\2D:\3\2\2\2D<\3\2\2\2D>\3\2\2\2D@\3"+
		"\2\2\2DB\3\2\2\2E\t\3\2\2\2FH\b\6\1\2GI\5\f\7\2HG\3\2\2\2IJ\3\2\2\2JH"+
		"\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LT\5\20\t\2MT\5\22\n\2NT\5\24\13\2OT\5\26"+
		"\f\2PT\5\30\r\2QT\5\32\16\2RT\5\16\b\2SL\3\2\2\2SM\3\2\2\2SN\3\2\2\2S"+
		"O\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\r\3\2\2\2UV\7\13\2\2VW\7\22\2"+
		"\2WX\7\33\2\2XY\b\b\1\2YZ\7\23\2\2Z[\b\b\1\2[\17\3\2\2\2\\]\7\f\2\2]^"+
		"\7\22\2\2^_\7\33\2\2_`\b\t\1\2`a\7\23\2\2ab\7\24\2\2bc\b\t\1\2c\21\3\2"+
		"\2\2de\7\r\2\2ef\7\22\2\2fg\7\33\2\2gh\b\n\1\2hi\7\23\2\2ij\7\24\2\2j"+
		"u\b\n\1\2kl\7\r\2\2lm\7\22\2\2mn\b\n\1\2no\5\16\b\2op\b\n\1\2pq\7\23\2"+
		"\2qr\7\24\2\2rs\b\n\1\2su\3\2\2\2td\3\2\2\2tk\3\2\2\2u\23\3\2\2\2vw\7"+
		"\33\2\2wx\b\13\1\2xy\7\26\2\2yz\b\13\1\2z{\5\34\17\2{|\7\24\2\2|}\b\13"+
		"\1\2}\25\3\2\2\2~\177\7\16\2\2\177\u0080\7\22\2\2\u0080\u0081\7\33\2\2"+
		"\u0081\u0082\b\f\1\2\u0082\u0083\7\32\2\2\u0083\u0084\b\f\1\2\u0084\u0085"+
		"\t\2\2\2\u0085\u0086\b\f\1\2\u0086\u0087\7\23\2\2\u0087\u0088\7\30\2\2"+
		"\u0088\u008a\b\f\1\2\u0089\u008b\5\f\7\2\u008a\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\7\31\2\2\u008f\u009b\b\f\1\2\u0090\u0091\7\17\2\2\u0091\u0092\7"+
		"\30\2\2\u0092\u0094\b\f\1\2\u0093\u0095\5\f\7\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\7\31\2\2\u0099\u009a\b\f\1\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0090\3\2\2\2\u009b\u009c\3\2\2\2\u009c\27\3\2\2\2\u009d\u009e\7\20\2"+
		"\2\u009e\u009f\7\30\2\2\u009f\u00a1\b\r\1\2\u00a0\u00a2\5\f\7\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\31\2\2\u00a6\u00a7\7\21\2\2\u00a7"+
		"\u00a8\7\22\2\2\u00a8\u00a9\7\33\2\2\u00a9\u00aa\b\r\1\2\u00aa\u00ab\7"+
		"\32\2\2\u00ab\u00ac\b\r\1\2\u00ac\u00ad\t\2\2\2\u00ad\u00ae\b\r\1\2\u00ae"+
		"\u00af\7\23\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b1\b\r\1\2\u00b1\31\3\2"+
		"\2\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\7\22\2\2\u00b4\u00b5\7\33\2\2\u00b5"+
		"\u00b6\b\16\1\2\u00b6\u00b7\7\32\2\2\u00b7\u00b8\b\16\1\2\u00b8\u00b9"+
		"\t\2\2\2\u00b9\u00ba\b\16\1\2\u00ba\u00bb\7\23\2\2\u00bb\u00bc\7\30\2"+
		"\2\u00bc\u00be\b\16\1\2\u00bd\u00bf\5\f\7\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\7\31\2\2\u00c3\u00c4\b\16\1\2\u00c4\33\3\2\2\2\u00c5"+
		"\u00cb\5\36\20\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8\b\17\1\2\u00c8\u00ca"+
		"\5\36\20\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\35\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf"+
		"\7\33\2\2\u00cf\u00d7\b\20\1\2\u00d0\u00d1\7\34\2\2\u00d1\u00d7\b\20\1"+
		"\2\u00d2\u00d3\7\35\2\2\u00d3\u00d7\b\20\1\2\u00d4\u00d5\7\36\2\2\u00d5"+
		"\u00d7\b\20\1\2\u00d6\u00ce\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d2\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\37\3\2\2\2\17)\63DJSt\u008c\u0096\u009b"+
		"\u00a3\u00c0\u00cb\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}