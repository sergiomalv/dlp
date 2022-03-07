// Generated from C:/Universidad/2do trimestre/Desarrollo de Lenguajes de Programación/Laboratorio/workspace/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT_CONSTANT=38, 
		ID=39, REAL_CONSTANT=40, COMMENT_MULTI_LINE=41, COMMENT_ONE_LINE=42, CHAR_CONSTANT=43, 
		TRASH=44;
	public static final int
		RULE_program = 0, RULE_types = 1, RULE_createFunction = 2, RULE_createVar = 3, 
		RULE_vars = 4, RULE_parametres = 5, RULE_bodyFunction = 6, RULE_sentences = 7, 
		RULE_args = 8, RULE_sentence = 9, RULE_conditionBody = 10, RULE_functionMain = 11, 
		RULE_expression = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "types", "createFunction", "createVar", "vars", "parametres", 
			"bodyFunction", "sentences", "args", "sentence", "conditionBody", "functionMain", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'double'", "'char'", "'struct'", "'{'", "':'", "';'", 
			"'}'", "'['", "']'", "'def'", "'('", "')'", "','", "'print'", "'input'", 
			"'='", "'if'", "'else'", "'while'", "'return'", "'def main()'", "'.'", 
			"'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", 
			"'!='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT_CONSTANT", "ID", "REAL_CONSTANT", "COMMENT_MULTI_LINE", 
			"COMMENT_ONE_LINE", "CHAR_CONSTANT", "TRASH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((ProgramContext)_localctx).expression = expression(0);
			 ((ProgramContext)_localctx).ast =  ((ProgramContext)_localctx).expression.ast; 
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

	public static class TypesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(PmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(PmmParser.INT_CONSTANT, i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_types);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				match(T__3);
				setState(33);
				match(T__4);
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					match(ID);
					setState(35);
					match(T__5);
					setState(36);
					types();
					setState(37);
					match(T__6);
					}
					}
					setState(41); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(43);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					match(T__8);
					setState(46);
					match(INT_CONSTANT);
					setState(47);
					match(T__9);
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				setState(52);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class CreateFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
		}
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public CreateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFunctionContext createFunction() throws RecognitionException {
		CreateFunctionContext _localctx = new CreateFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__10);
			setState(56);
			match(ID);
			setState(57);
			match(T__11);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(58);
				parametres();
				}
			}

			setState(61);
			match(T__12);
			setState(62);
			match(T__5);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8))) != 0)) {
				{
				setState(63);
				types();
				}
			}

			setState(66);
			match(T__4);
			setState(67);
			bodyFunction();
			setState(68);
			match(T__7);
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

	public static class CreateVarContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public CreateVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitCreateVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateVarContext createVar() throws RecognitionException {
		CreateVarContext _localctx = new CreateVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			vars();
			setState(71);
			match(T__5);
			setState(72);
			types();
			setState(73);
			match(T__6);
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

	public static class VarsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vars);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(ID);
				setState(77);
				match(T__13);
				setState(78);
				vars();
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

	public static class ParametresContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public ParametresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametres; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParametres(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametresContext parametres() throws RecognitionException {
		ParametresContext _localctx = new ParametresContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametres);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(ID);
				setState(82);
				match(T__5);
				setState(83);
				types();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(ID);
				setState(85);
				match(T__5);
				setState(86);
				types();
				setState(87);
				match(T__13);
				setState(88);
				parametres();
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

	public static class BodyFunctionContext extends ParserRuleContext {
		public List<CreateVarContext> createVar() {
			return getRuleContexts(CreateVarContext.class);
		}
		public CreateVarContext createVar(int i) {
			return getRuleContext(CreateVarContext.class,i);
		}
		public List<SentencesContext> sentences() {
			return getRuleContexts(SentencesContext.class);
		}
		public SentencesContext sentences(int i) {
			return getRuleContext(SentencesContext.class,i);
		}
		public BodyFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBodyFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyFunctionContext bodyFunction() throws RecognitionException {
		BodyFunctionContext _localctx = new BodyFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bodyFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					createVar();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(98);
				sentences();
				}
				}
				setState(103);
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

	public static class SentencesContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ConditionBodyContext> conditionBody() {
			return getRuleContexts(ConditionBodyContext.class);
		}
		public ConditionBodyContext conditionBody(int i) {
			return getRuleContext(ConditionBodyContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSentences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentences);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__14);
				setState(105);
				sentence();
				setState(106);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__15);
				setState(109);
				sentence();
				setState(110);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				expression(0);
				setState(113);
				match(T__16);
				setState(114);
				expression(0);
				setState(115);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(T__17);
				setState(118);
				expression(0);
				setState(119);
				match(T__5);
				setState(120);
				conditionBody();
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(121);
					match(T__18);
					setState(122);
					conditionBody();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(T__19);
				setState(126);
				expression(0);
				setState(127);
				match(T__5);
				setState(128);
				conditionBody();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				match(T__20);
				setState(131);
				expression(0);
				setState(132);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(134);
					match(T__14);
					}
				}

				setState(137);
				match(ID);
				setState(138);
				match(T__11);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(139);
					args();
					}
				}

				setState(142);
				match(T__12);
				setState(143);
				match(T__6);
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

	public static class ArgsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_args);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				expression(0);
				setState(148);
				match(T__13);
				setState(149);
				args();
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

	public static class SentenceContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentence);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				expression(0);
				setState(155);
				match(T__13);
				setState(156);
				sentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ConditionBodyContext extends ParserRuleContext {
		public List<SentencesContext> sentences() {
			return getRuleContexts(SentencesContext.class);
		}
		public SentencesContext sentences(int i) {
			return getRuleContext(SentencesContext.class,i);
		}
		public ConditionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitConditionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBodyContext conditionBody() throws RecognitionException {
		ConditionBodyContext _localctx = new ConditionBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionBody);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__14:
			case T__15:
			case T__17:
			case T__19:
			case T__20:
			case T__23:
			case T__24:
			case INT_CONSTANT:
			case ID:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				sentences();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__4);
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(163);
					sentences();
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(168);
				match(T__7);
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

	public static class FunctionMainContext extends ParserRuleContext {
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
		}
		public FunctionMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionMain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunctionMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionMainContext functionMain() throws RecognitionException {
		FunctionMainContext _localctx = new FunctionMainContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__21);
			setState(173);
			match(T__5);
			setState(174);
			match(T__4);
			setState(175);
			bodyFunction();
			setState(176);
			match(T__7);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext op1;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token ID;
		public Token OP;
		public ExpressionContext op2;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(179);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				            ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 2:
				{
				setState(181);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				            ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(183);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(184);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 5:
				{
				setState(186);
				match(T__11);
				setState(187);
				expression(0);
				setState(188);
				match(T__12);
				}
				break;
			case 6:
				{
				setState(190);
				match(T__11);
				setState(191);
				types();
				setState(192);
				match(T__12);
				setState(193);
				expression(7);
				}
				break;
			case 7:
				{
				setState(195);
				match(T__23);
				setState(196);
				expression(6);
				}
				break;
			case 8:
				{
				setState(197);
				match(T__24);
				setState(198);
				expression(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(202);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						((ExpressionContext)_localctx).op2 = expression(5);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).op1.ast.getLine(),
						                      ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(207);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(208);
						((ExpressionContext)_localctx).op2 = expression(4);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).op1.ast.getLine(),
						                      ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(215);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						expression(2);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(218);
						match(T__8);
						setState(219);
						expression(0);
						setState(220);
						match(T__9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(223);
						match(T__22);
						setState(224);
						((ExpressionContext)_localctx).ID = match(ID);
						}
						break;
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\3\3\3\3\3\3\6\3\63\n\3\r\3\16"+
		"\3\64\3\3\5\38\n\3\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\5\4C\n\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\7\b`\n\b\f\b\16\bc\13\b\3\b\7\bf\n"+
		"\b\f\b\16\bi\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u008a\n\t\3\t\3\t\3\t\5\t\u008f\n\t\3\t\3\t\5\t\u0093\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u009a\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a2"+
		"\n\13\3\f\3\f\3\f\6\f\u00a7\n\f\r\f\16\f\u00a8\3\f\3\f\5\f\u00ad\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ca"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00e4\n\16"+
		"\f\16\16\16\u00e7\13\16\3\16\2\3\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\2\7\3\2\3\5\3\2\34\36\4\2\32\32\37\37\3\2 %\3\2&\'\2\u0102\2\34\3\2\2"+
		"\2\4\67\3\2\2\2\69\3\2\2\2\bH\3\2\2\2\nQ\3\2\2\2\f\\\3\2\2\2\16a\3\2\2"+
		"\2\20\u0092\3\2\2\2\22\u0099\3\2\2\2\24\u00a1\3\2\2\2\26\u00ac\3\2\2\2"+
		"\30\u00ae\3\2\2\2\32\u00c9\3\2\2\2\34\35\5\32\16\2\35\36\b\2\1\2\36\3"+
		"\3\2\2\2\378\7\3\2\2 8\7\4\2\2!8\7\5\2\2\"#\7\6\2\2#)\7\7\2\2$%\7)\2\2"+
		"%&\7\b\2\2&\'\5\4\3\2\'(\7\t\2\2(*\3\2\2\2)$\3\2\2\2*+\3\2\2\2+)\3\2\2"+
		"\2+,\3\2\2\2,-\3\2\2\2-.\7\n\2\2.8\3\2\2\2/\60\7\13\2\2\60\61\7(\2\2\61"+
		"\63\7\f\2\2\62/\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66"+
		"\3\2\2\2\668\t\2\2\2\67\37\3\2\2\2\67 \3\2\2\2\67!\3\2\2\2\67\"\3\2\2"+
		"\2\67\62\3\2\2\28\5\3\2\2\29:\7\r\2\2:;\7)\2\2;=\7\16\2\2<>\5\f\7\2=<"+
		"\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\17\2\2@B\7\b\2\2AC\5\4\3\2BA\3\2\2\2"+
		"BC\3\2\2\2CD\3\2\2\2DE\7\7\2\2EF\5\16\b\2FG\7\n\2\2G\7\3\2\2\2HI\5\n\6"+
		"\2IJ\7\b\2\2JK\5\4\3\2KL\7\t\2\2L\t\3\2\2\2MR\7)\2\2NO\7)\2\2OP\7\20\2"+
		"\2PR\5\n\6\2QM\3\2\2\2QN\3\2\2\2R\13\3\2\2\2ST\7)\2\2TU\7\b\2\2U]\5\4"+
		"\3\2VW\7)\2\2WX\7\b\2\2XY\5\4\3\2YZ\7\20\2\2Z[\5\f\7\2[]\3\2\2\2\\S\3"+
		"\2\2\2\\V\3\2\2\2]\r\3\2\2\2^`\5\b\5\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2a"+
		"b\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\5\20\t\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2h\17\3\2\2\2ig\3\2\2\2jk\7\21\2\2kl\5\24\13\2lm\7\t\2\2m\u0093"+
		"\3\2\2\2no\7\22\2\2op\5\24\13\2pq\7\t\2\2q\u0093\3\2\2\2rs\5\32\16\2s"+
		"t\7\23\2\2tu\5\32\16\2uv\7\t\2\2v\u0093\3\2\2\2wx\7\24\2\2xy\5\32\16\2"+
		"yz\7\b\2\2z}\5\26\f\2{|\7\25\2\2|~\5\26\f\2}{\3\2\2\2}~\3\2\2\2~\u0093"+
		"\3\2\2\2\177\u0080\7\26\2\2\u0080\u0081\5\32\16\2\u0081\u0082\7\b\2\2"+
		"\u0082\u0083\5\26\f\2\u0083\u0093\3\2\2\2\u0084\u0085\7\27\2\2\u0085\u0086"+
		"\5\32\16\2\u0086\u0087\7\t\2\2\u0087\u0093\3\2\2\2\u0088\u008a\7\21\2"+
		"\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\7)\2\2\u008c\u008e\7\16\2\2\u008d\u008f\5\22\n\2\u008e\u008d\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\17\2\2\u0091\u0093"+
		"\7\t\2\2\u0092j\3\2\2\2\u0092n\3\2\2\2\u0092r\3\2\2\2\u0092w\3\2\2\2\u0092"+
		"\177\3\2\2\2\u0092\u0084\3\2\2\2\u0092\u0089\3\2\2\2\u0093\21\3\2\2\2"+
		"\u0094\u009a\5\32\16\2\u0095\u0096\5\32\16\2\u0096\u0097\7\20\2\2\u0097"+
		"\u0098\5\22\n\2\u0098\u009a\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3"+
		"\2\2\2\u009a\23\3\2\2\2\u009b\u00a2\5\32\16\2\u009c\u009d\5\32\16\2\u009d"+
		"\u009e\7\20\2\2\u009e\u009f\5\24\13\2\u009f\u00a2\3\2\2\2\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\25\3\2\2\2\u00a3\u00ad\5\20\t\2\u00a4\u00a6\7\7\2\2\u00a5\u00a7\5\20"+
		"\t\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\n\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ad\27\3\2\2\2\u00ae\u00af"+
		"\7\30\2\2\u00af\u00b0\7\b\2\2\u00b0\u00b1\7\7\2\2\u00b1\u00b2\5\16\b\2"+
		"\u00b2\u00b3\7\n\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\b\16\1\2\u00b5\u00b6"+
		"\7(\2\2\u00b6\u00ca\b\16\1\2\u00b7\u00b8\7*\2\2\u00b8\u00ca\b\16\1\2\u00b9"+
		"\u00ca\7-\2\2\u00ba\u00bb\7)\2\2\u00bb\u00ca\b\16\1\2\u00bc\u00bd\7\16"+
		"\2\2\u00bd\u00be\5\32\16\2\u00be\u00bf\7\17\2\2\u00bf\u00ca\3\2\2\2\u00c0"+
		"\u00c1\7\16\2\2\u00c1\u00c2\5\4\3\2\u00c2\u00c3\7\17\2\2\u00c3\u00c4\5"+
		"\32\16\t\u00c4\u00ca\3\2\2\2\u00c5\u00c6\7\32\2\2\u00c6\u00ca\5\32\16"+
		"\b\u00c7\u00c8\7\33\2\2\u00c8\u00ca\5\32\16\7\u00c9\u00b4\3\2\2\2\u00c9"+
		"\u00b7\3\2\2\2\u00c9\u00b9\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9\u00bc\3\2"+
		"\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00e5\3\2\2\2\u00cb\u00cc\f\6\2\2\u00cc\u00cd\t\3\2\2\u00cd\u00ce\5\32"+
		"\16\7\u00ce\u00cf\b\16\1\2\u00cf\u00e4\3\2\2\2\u00d0\u00d1\f\5\2\2\u00d1"+
		"\u00d2\t\4\2\2\u00d2\u00d3\5\32\16\6\u00d3\u00d4\b\16\1\2\u00d4\u00e4"+
		"\3\2\2\2\u00d5\u00d6\f\4\2\2\u00d6\u00d7\t\5\2\2\u00d7\u00e4\5\32\16\5"+
		"\u00d8\u00d9\f\3\2\2\u00d9\u00da\t\6\2\2\u00da\u00e4\5\32\16\4\u00db\u00dc"+
		"\f\13\2\2\u00dc\u00dd\7\13\2\2\u00dd\u00de\5\32\16\2\u00de\u00df\7\f\2"+
		"\2\u00df\u00e4\3\2\2\2\u00e0\u00e1\f\n\2\2\u00e1\u00e2\7\31\2\2\u00e2"+
		"\u00e4\7)\2\2\u00e3\u00cb\3\2\2\2\u00e3\u00d0\3\2\2\2\u00e3\u00d5\3\2"+
		"\2\2\u00e3\u00d8\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\33\3\2\2"+
		"\2\u00e7\u00e5\3\2\2\2\26+\64\67=BQ\\ag}\u0089\u008e\u0092\u0099\u00a1"+
		"\u00a8\u00ac\u00c9\u00e3\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}