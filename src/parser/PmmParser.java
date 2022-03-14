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
		RULE_program = 0, RULE_types = 1, RULE_simpleTypes = 2, RULE_fields = 3, 
		RULE_field = 4, RULE_createFunction = 5, RULE_functionMain = 6, RULE_createVar = 7, 
		RULE_vars = 8, RULE_parametres = 9, RULE_sentences = 10, RULE_functionInvocation = 11, 
		RULE_args = 12, RULE_sentence = 13, RULE_conditionBody = 14, RULE_expression = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "types", "simpleTypes", "fields", "field", "createFunction", 
			"functionMain", "createVar", "vars", "parametres", "sentences", "functionInvocation", 
			"args", "sentence", "conditionBody", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'{'", "'}'", "'['", "']'", "'int'", "'double'", "'char'", 
			"':'", "';'", "'def'", "'('", "')'", "'def main(): {'", "','", "'='", 
			"'print'", "'input'", "'if'", "'else'", "'while'", "'return'", "'.'", 
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
		public Program ast;
		public List<Definition> aux = new ArrayList<Definition>();;
		public CreateVarContext cv;
		public CreateFunctionContext cf;
		public FunctionMainContext fm;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public FunctionMainContext functionMain() {
			return getRuleContext(FunctionMainContext.class,0);
		}
		public List<CreateVarContext> createVar() {
			return getRuleContexts(CreateVarContext.class);
		}
		public CreateVarContext createVar(int i) {
			return getRuleContext(CreateVarContext.class,i);
		}
		public List<CreateFunctionContext> createFunction() {
			return getRuleContexts(CreateFunctionContext.class);
		}
		public CreateFunctionContext createFunction(int i) {
			return getRuleContext(CreateFunctionContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==ID) {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(32);
					((ProgramContext)_localctx).cv = createVar();
					_localctx.aux.addAll(((ProgramContext)_localctx).cv.ast);
					}
					break;
				case T__10:
					{
					setState(35);
					((ProgramContext)_localctx).cf = createFunction();
					_localctx.aux.add(((ProgramContext)_localctx).cf.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			((ProgramContext)_localctx).fm = functionMain();
			_localctx.aux.add(((ProgramContext)_localctx).fm.ast);
			setState(45);
			match(EOF);
			((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).cv.ast.get(0).getLine(), ((ProgramContext)_localctx).cv.ast.get(0).getColumn(), _localctx.aux);
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
		public Type ast;
		public List<FieldType> aux = new ArrayList<FieldType>();;
		public SimpleTypesContext s;
		public FieldsContext f;
		public Token INT_CONSTANT;
		public TypesContext t;
		public SimpleTypesContext simpleTypes() {
			return getRuleContext(SimpleTypesContext.class,0);
		}
		public List<FieldsContext> fields() {
			return getRuleContexts(FieldsContext.class);
		}
		public FieldsContext fields(int i) {
			return getRuleContext(FieldsContext.class,i);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				((TypesContext)_localctx).s = simpleTypes();
				((TypesContext)_localctx).ast =  ((TypesContext)_localctx).s.ast;
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(T__0);
				setState(52);
				match(T__1);
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					((TypesContext)_localctx).f = fields();
					_localctx.aux.addAll(((TypesContext)_localctx).f.ast);
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(60);
				match(T__2);
				((TypesContext)_localctx).ast =  new StructType((((TypesContext)_localctx).f!=null?(((TypesContext)_localctx).f.start):null).getLine(),
				        (((TypesContext)_localctx).f!=null?(((TypesContext)_localctx).f.start):null).getCharPositionInLine()+1, _localctx.aux);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__3);
				setState(64);
				((TypesContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(65);
				match(T__4);
				setState(66);
				((TypesContext)_localctx).t = types();
				((TypesContext)_localctx).ast =  new ArrayType(((TypesContext)_localctx).INT_CONSTANT.getLine(),
				        ((TypesContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,
				            LexerHelper.lexemeToInt((((TypesContext)_localctx).INT_CONSTANT!=null?((TypesContext)_localctx).INT_CONSTANT.getText():null)), ((TypesContext)_localctx).t.ast);
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

	public static class SimpleTypesContext extends ParserRuleContext {
		public Type ast;
		public SimpleTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSimpleTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypesContext simpleTypes() throws RecognitionException {
		SimpleTypesContext _localctx = new SimpleTypesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleTypes);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__5);
				((SimpleTypesContext)_localctx).ast =  IntType.getIntType();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__6);
				((SimpleTypesContext)_localctx).ast =  DoubleType.getDoubleType();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(T__7);
				((SimpleTypesContext)_localctx).ast =  CharType.getCharType();
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

	public static class FieldsContext extends ParserRuleContext {
		public List<FieldType> ast = new ArrayList<FieldType>();;
		public FieldContext f;
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fields);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(79);
					((FieldsContext)_localctx).f = field();
					_localctx.ast.add(((FieldsContext)_localctx).f.ast);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FieldContext extends ParserRuleContext {
		public FieldType ast;
		public VarsContext v;
		public TypesContext t;
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((FieldContext)_localctx).v = vars();
			setState(87);
			match(T__8);
			setState(88);
			((FieldContext)_localctx).t = types();
			setState(89);
			match(T__9);
			((FieldContext)_localctx).ast =  new FieldType((((FieldContext)_localctx).v!=null?(((FieldContext)_localctx).v.start):null).getLine(),
			            (((FieldContext)_localctx).v!=null?(((FieldContext)_localctx).v.start):null).getCharPositionInLine()+1, ((FieldContext)_localctx).v.ast, ((FieldContext)_localctx).t.ast);
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
		public FuncDefinition ast;
		public List<VarDefinition> aux = new ArrayList<VarDefinition>();
		public List<Statement> aux2 = new ArrayList<Statement>();;
		public Token ID;
		public ParametresContext p;
		public SimpleTypesContext t;
		public CreateVarContext c;
		public SentencesContext s;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public SimpleTypesContext simpleTypes() {
			return getRuleContext(SimpleTypesContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_createFunction);
		int _la;
		try {
			int _alt;
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__10);
				setState(93);
				((CreateFunctionContext)_localctx).ID = match(ID);
				setState(94);
				match(T__11);
				setState(95);
				((CreateFunctionContext)_localctx).p = parametres();
				setState(96);
				match(T__12);
				setState(97);
				match(T__8);
				setState(98);
				((CreateFunctionContext)_localctx).t = simpleTypes();
				setState(99);
				match(T__1);
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(100);
						((CreateFunctionContext)_localctx).c = createVar();
						_localctx.aux.addAll(((CreateFunctionContext)_localctx).c.ast);
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(108);
					((CreateFunctionContext)_localctx).s = sentences();
					_localctx.aux2.add(((CreateFunctionContext)_localctx).s.ast);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(T__2);
				((CreateFunctionContext)_localctx).ast =  new FuncDefinition(((CreateFunctionContext)_localctx).ID.getLine(), ((CreateFunctionContext)_localctx).ID.getCharPositionInLine()+1, (((CreateFunctionContext)_localctx).ID!=null?((CreateFunctionContext)_localctx).ID.getText():null), new FunctionType(
				        ((CreateFunctionContext)_localctx).ID.getLine(), ((CreateFunctionContext)_localctx).ID.getCharPositionInLine()+1, ((CreateFunctionContext)_localctx).t.ast, ((CreateFunctionContext)_localctx).p.ast), _localctx.aux, _localctx.aux2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__10);
				setState(120);
				((CreateFunctionContext)_localctx).ID = match(ID);
				setState(121);
				match(T__11);
				setState(122);
				((CreateFunctionContext)_localctx).p = parametres();
				setState(123);
				match(T__12);
				setState(124);
				match(T__8);
				setState(125);
				match(T__1);
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(126);
						((CreateFunctionContext)_localctx).c = createVar();
						_localctx.aux.addAll(((CreateFunctionContext)_localctx).c.ast);
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(134);
					((CreateFunctionContext)_localctx).s = sentences();
					_localctx.aux2.add(((CreateFunctionContext)_localctx).s.ast);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(T__2);
				((CreateFunctionContext)_localctx).ast =  new FuncDefinition(((CreateFunctionContext)_localctx).ID.getLine(), ((CreateFunctionContext)_localctx).ID.getCharPositionInLine()+1, (((CreateFunctionContext)_localctx).ID!=null?((CreateFunctionContext)_localctx).ID.getText():null), new FunctionType(
				        ((CreateFunctionContext)_localctx).ID.getLine(), ((CreateFunctionContext)_localctx).ID.getCharPositionInLine()+1, VoidType.getVoidType(),
				        ((CreateFunctionContext)_localctx).p.ast), _localctx.aux, _localctx.aux2);
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

	public static class FunctionMainContext extends ParserRuleContext {
		public FuncDefinition ast;
		public List<VarDefinition> aux = new ArrayList<VarDefinition>();
		public List<Statement> aux2 = new ArrayList<Statement>();;
		public CreateVarContext c;
		public SentencesContext s;
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
		enterRule(_localctx, 12, RULE_functionMain);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__13);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					((FunctionMainContext)_localctx).c = createVar();
					_localctx.aux.addAll(((FunctionMainContext)_localctx).c.ast);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(156);
				((FunctionMainContext)_localctx).s = sentences();
				_localctx.aux2.add(((FunctionMainContext)_localctx).s.ast);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(T__2);
			((FunctionMainContext)_localctx).ast =  new FuncDefinition(((FunctionMainContext)_localctx).c.ast.get(0).getLine(), (((FunctionMainContext)_localctx).c!=null?(((FunctionMainContext)_localctx).c.start):null).getCharPositionInLine()+1, "main", new FunctionType(
			        ((FunctionMainContext)_localctx).c.ast.get(0).getLine(), (((FunctionMainContext)_localctx).c!=null?(((FunctionMainContext)_localctx).c.start):null).getCharPositionInLine()+1, VoidType.getVoidType(), new ArrayList<VarDefinition>()),
			        _localctx.aux, _localctx.aux2);
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
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();;
		public List<String> aux = new ArrayList<String>();;
		public Token id1;
		public Token id2;
		public TypesContext t;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
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
		enterRule(_localctx, 14, RULE_createVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((CreateVarContext)_localctx).id1 = match(ID);
			_localctx.aux.add((((CreateVarContext)_localctx).id1!=null?((CreateVarContext)_localctx).id1.getText():null));
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(169);
				match(T__14);
				setState(170);
				((CreateVarContext)_localctx).id2 = match(ID);
				_localctx.aux.add((((CreateVarContext)_localctx).id2!=null?((CreateVarContext)_localctx).id2.getText():null));
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(T__8);
			setState(178);
			((CreateVarContext)_localctx).t = types();
			setState(179);
			match(T__9);
			 for (String v : _localctx.aux) {
			                _localctx.ast.add(new VarDefinition(((CreateVarContext)_localctx).id1.getLine(), ((CreateVarContext)_localctx).id1.getCharPositionInLine()+1, ((CreateVarContext)_localctx).t.ast, v));
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

	public static class VarsContext extends ParserRuleContext {
		public List<String> ast = new ArrayList<String>();;
		public Token id;
		public Token optional;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
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
		enterRule(_localctx, 16, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			((VarsContext)_localctx).id = match(ID);
			_localctx.ast.add((((VarsContext)_localctx).id!=null?((VarsContext)_localctx).id.getText():null));
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(184);
				match(T__14);
				setState(185);
				((VarsContext)_localctx).optional = match(ID);
				_localctx.ast.add((((VarsContext)_localctx).optional!=null?((VarsContext)_localctx).optional.getText():null));
				}
				}
				setState(191);
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

	public static class ParametresContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();;
		public Token ID;
		public SimpleTypesContext t;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<SimpleTypesContext> simpleTypes() {
			return getRuleContexts(SimpleTypesContext.class);
		}
		public SimpleTypesContext simpleTypes(int i) {
			return getRuleContext(SimpleTypesContext.class,i);
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
		enterRule(_localctx, 18, RULE_parametres);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(192);
				((ParametresContext)_localctx).ID = match(ID);
				setState(193);
				match(T__8);
				setState(194);
				((ParametresContext)_localctx).t = simpleTypes();
				}
				_localctx.ast.add(new VarDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ParametresContext)_localctx).t.ast, ((ParametresContext)_localctx).ID.getText()));
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(197);
					match(T__14);
					setState(198);
					((ParametresContext)_localctx).ID = match(ID);
					setState(199);
					match(T__8);
					setState(200);
					((ParametresContext)_localctx).t = simpleTypes();
					_localctx.ast.add(new VarDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ParametresContext)_localctx).t.ast, ((ParametresContext)_localctx).ID.getText()));
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class SentencesContext extends ParserRuleContext {
		public Statement ast;
		public List<Expression> aux = new ArrayList<Expression>();;
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public ExpressionContext exp;
		public ExpressionContext opt;
		public SentenceContext s;
		public ExpressionContext expr;
		public ConditionBodyContext c1;
		public ConditionBodyContext c2;
		public ConditionBodyContext c;
		public Token ID;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public List<ConditionBodyContext> conditionBody() {
			return getRuleContexts(ConditionBodyContext.class);
		}
		public ConditionBodyContext conditionBody(int i) {
			return getRuleContext(ConditionBodyContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
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
		enterRule(_localctx, 20, RULE_sentences);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((SentencesContext)_localctx).expr1 = expression(0);
				setState(211);
				match(T__15);
				setState(212);
				((SentencesContext)_localctx).expr2 = expression(0);
				setState(213);
				match(T__9);
				((SentencesContext)_localctx).ast =  new Assignment(((SentencesContext)_localctx).expr1.ast.getLine(),
				        ((SentencesContext)_localctx).expr1.ast.getColumn(), ((SentencesContext)_localctx).expr1.ast, ((SentencesContext)_localctx).expr2.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__16);
				setState(217);
				((SentencesContext)_localctx).exp = expression(0);
				_localctx.aux.add(((SentencesContext)_localctx).exp.ast);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(219);
					match(T__14);
					setState(220);
					((SentencesContext)_localctx).opt = expression(0);
					_localctx.aux.add(((SentencesContext)_localctx).opt.ast);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((SentencesContext)_localctx).ast =  new Print(((SentencesContext)_localctx).exp.ast.getLine(), ((SentencesContext)_localctx).exp.ast.getColumn(), _localctx.aux);
				setState(229);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(T__17);
				setState(232);
				((SentencesContext)_localctx).s = sentence();
				setState(233);
				match(T__9);
				((SentencesContext)_localctx).ast =  new Input(((SentencesContext)_localctx).s.ast.get(0).getLine(), ((SentencesContext)_localctx).s.ast.get(0).getColumn(),
				            ((SentencesContext)_localctx).s.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(T__18);
				setState(237);
				((SentencesContext)_localctx).expr = expression(0);
				setState(238);
				match(T__8);
				setState(239);
				((SentencesContext)_localctx).c1 = conditionBody();
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(240);
					match(T__19);
					setState(241);
					((SentencesContext)_localctx).c2 = conditionBody();
					}
					break;
				}
				((SentencesContext)_localctx).ast =  new IfElse(
				            ((SentencesContext)_localctx).expr.ast.getLine(), ((SentencesContext)_localctx).expr.ast.getColumn(), ((SentencesContext)_localctx).expr.ast, ((SentencesContext)_localctx).c1.ast, ((SentencesContext)_localctx).c2 == null ? null : ((SentencesContext)_localctx).c2.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(T__20);
				setState(247);
				((SentencesContext)_localctx).expr = expression(0);
				setState(248);
				match(T__8);
				setState(249);
				((SentencesContext)_localctx).c = conditionBody();
				((SentencesContext)_localctx).ast =  new While(((SentencesContext)_localctx).expr.ast.getLine(),
				            ((SentencesContext)_localctx).expr.ast.getColumn(), ((SentencesContext)_localctx).expr.ast, ((SentencesContext)_localctx).c.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				match(T__21);
				setState(253);
				((SentencesContext)_localctx).expr = expression(0);
				setState(254);
				match(T__9);
				((SentencesContext)_localctx).ast =  new Return(((SentencesContext)_localctx).expr.ast.getLine(), ((SentencesContext)_localctx).expr.ast.getColumn(),
				            ((SentencesContext)_localctx).expr.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				((SentencesContext)_localctx).ID = match(ID);
				setState(258);
				match(T__11);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(260);
					((SentencesContext)_localctx).e1 = expression(0);
					parameters.add(((SentencesContext)_localctx).e1.ast);
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(262);
						match(T__14);
						setState(263);
						((SentencesContext)_localctx).e2 = expression(0);
						parameters.add(((SentencesContext)_localctx).e2.ast);
						}
						}
						setState(270);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(273);
				match(T__12);
				setState(274);
				match(T__9);
				 ((SentencesContext)_localctx).ast =  new FunctionInvocation(((SentencesContext)_localctx).ID.getLine(), ((SentencesContext)_localctx).ID.getCharPositionInLine() + 1,
				        (((SentencesContext)_localctx).ID!=null?((SentencesContext)_localctx).ID.getText():null), parameters);
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

	public static class FunctionInvocationContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();;
		public ArgsContext a;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(278);
			((FunctionInvocationContext)_localctx).a = args();
			_localctx.ast.addAll(((FunctionInvocationContext)_localctx).a.ast);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();;
		public ExpressionContext e;
		public ExpressionContext e1;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 24, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((ArgsContext)_localctx).e = expression(0);
			_localctx.ast.add(((ArgsContext)_localctx).e.ast);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(283);
				match(T__14);
				setState(284);
				((ArgsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ArgsContext)_localctx).e1.ast);
				}
				}
				setState(291);
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

	public static class SentenceContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();;
		public ExpressionContext e;
		public ExpressionContext e1;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 26, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			((SentenceContext)_localctx).e = expression(0);
			_localctx.ast.add(((SentenceContext)_localctx).e.ast);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(294);
				match(T__14);
				setState(295);
				((SentenceContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((SentenceContext)_localctx).e1.ast);
				}
				}
				setState(302);
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

	public static class ConditionBodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public SentencesContext s;
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
		enterRule(_localctx, 28, RULE_conditionBody);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__16:
			case T__17:
			case T__18:
			case T__20:
			case T__21:
			case T__23:
			case T__24:
			case INT_CONSTANT:
			case ID:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				((ConditionBodyContext)_localctx).s = sentences();
				_localctx.ast.add(((ConditionBodyContext)_localctx).s.ast);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(T__1);
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(307);
					((ConditionBodyContext)_localctx).s = sentences();
					_localctx.ast.add(((ConditionBodyContext)_localctx).s.ast);
					}
					}
					setState(312); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(314);
				match(T__2);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext op1;
		public SimpleTypesContext t;
		public ExpressionContext expr;
		public Token ID;
		public FunctionInvocationContext fi;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token OP;
		public ExpressionContext op2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SimpleTypesContext simpleTypes() {
			return getRuleContext(SimpleTypesContext.class,0);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(319);
				match(T__11);
				setState(320);
				((ExpressionContext)_localctx).op1 = expression(0);
				setState(321);
				match(T__12);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).op1.ast;
				}
				break;
			case 2:
				{
				setState(324);
				match(T__11);
				setState(325);
				((ExpressionContext)_localctx).t = simpleTypes();
				setState(326);
				match(T__12);
				setState(327);
				((ExpressionContext)_localctx).expr = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t.ast.getLine(), ((ExpressionContext)_localctx).t.ast.getColumn(), ((ExpressionContext)_localctx).t.ast,
				            ((ExpressionContext)_localctx).expr.ast);
				}
				break;
			case 3:
				{
				setState(330);
				match(T__23);
				setState(331);
				((ExpressionContext)_localctx).op1 = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast);
				}
				break;
			case 4:
				{
				setState(334);
				match(T__24);
				setState(335);
				((ExpressionContext)_localctx).op1 = expression(10);
				((ExpressionContext)_localctx).ast =  new Not(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast);
				}
				break;
			case 5:
				{
				setState(338);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(339);
				match(T__11);
				setState(340);
				((ExpressionContext)_localctx).fi = functionInvocation();
				setState(341);
				match(T__12);
				((ExpressionContext)_localctx).ast =  new FunctionInvocation((((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getLine(),
				                  (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).fi.ast);
				}
				break;
			case 6:
				{
				setState(344);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 7:
				{
				setState(346);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(348);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(350);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(384);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(354);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(355);
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
						setState(356);
						((ExpressionContext)_localctx).op2 = expression(10);
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
						setState(359);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(360);
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
						setState(361);
						((ExpressionContext)_localctx).op2 = expression(9);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).op1.ast.getLine(),
						                      ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(364);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(365);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(366);
						((ExpressionContext)_localctx).op2 = expression(8);
						((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).op1.ast.getLine(),
						                      ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(369);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(370);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(371);
						((ExpressionContext)_localctx).op2 = expression(7);
						((ExpressionContext)_localctx).ast =  new Logic(((ExpressionContext)_localctx).op1.ast.getLine(),
						                      ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(374);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(375);
						match(T__3);
						setState(376);
						((ExpressionContext)_localctx).op2 = expression(0);
						setState(377);
						match(T__4);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).op1.ast.getLine(),
						                      ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, ((ExpressionContext)_localctx).op2.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(380);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(381);
						match(T__22);
						setState(382);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).op1.ast.getLine(),
						                      ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0188\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\6\3;\n\3\r\3\16\3<\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3H\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\6\5U\n\5"+
		"\r\5\16\5V\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\7\3\7\3\7\7\7r\n\7\f\7\16\7u\13\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0084\n\7\f\7\16"+
		"\7\u0087\13\7\3\7\3\7\3\7\7\7\u008c\n\7\f\7\16\7\u008f\13\7\3\7\3\7\3"+
		"\7\5\7\u0094\n\7\3\b\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\b"+
		"\3\b\3\b\7\b\u00a2\n\b\f\b\16\b\u00a5\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u00af\n\t\f\t\16\t\u00b2\13\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00be\n\n\f\n\16\n\u00c1\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ce\n\13\f\13\16\13\u00d1\13\13\5"+
		"\13\u00d3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00e2\n\f\f\f\16\f\u00e5\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00f5\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010d\n\f\f\f\16"+
		"\f\u0110\13\f\5\f\u0112\n\f\3\f\3\f\3\f\5\f\u0117\n\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0122\n\16\f\16\16\16\u0125\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u012d\n\17\f\17\16\17\u0130\13\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u0139\n\20\r\20\16\20\u013a\3\20\3"+
		"\20\5\20\u013f\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0163\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u0183\n\21\f\21\16\21\u0186\13\21\3\21\2\3 \22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\6\3\2\34\36\4\2\32\32\37\37\3\2 %\3\2&"+
		"\'\2\u01a6\2*\3\2\2\2\4G\3\2\2\2\6O\3\2\2\2\bT\3\2\2\2\nX\3\2\2\2\f\u0093"+
		"\3\2\2\2\16\u0095\3\2\2\2\20\u00a9\3\2\2\2\22\u00b8\3\2\2\2\24\u00d2\3"+
		"\2\2\2\26\u0116\3\2\2\2\30\u0118\3\2\2\2\32\u011b\3\2\2\2\34\u0126\3\2"+
		"\2\2\36\u013e\3\2\2\2 \u0162\3\2\2\2\"#\5\20\t\2#$\b\2\1\2$)\3\2\2\2%"+
		"&\5\f\7\2&\'\b\2\1\2\')\3\2\2\2(\"\3\2\2\2(%\3\2\2\2),\3\2\2\2*(\3\2\2"+
		"\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\5\16\b\2./\b\2\1\2/\60\7\2\2\3\60\61"+
		"\b\2\1\2\61\3\3\2\2\2\62\63\5\6\4\2\63\64\b\3\1\2\64H\3\2\2\2\65\66\7"+
		"\3\2\2\66:\7\4\2\2\678\5\b\5\289\b\3\1\29;\3\2\2\2:\67\3\2\2\2;<\3\2\2"+
		"\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\5\2\2?@\b\3\1\2@H\3\2\2\2AB\7\6\2"+
		"\2BC\7(\2\2CD\7\7\2\2DE\5\4\3\2EF\b\3\1\2FH\3\2\2\2G\62\3\2\2\2G\65\3"+
		"\2\2\2GA\3\2\2\2H\5\3\2\2\2IJ\7\b\2\2JP\b\4\1\2KL\7\t\2\2LP\b\4\1\2MN"+
		"\7\n\2\2NP\b\4\1\2OI\3\2\2\2OK\3\2\2\2OM\3\2\2\2P\7\3\2\2\2QR\5\n\6\2"+
		"RS\b\5\1\2SU\3\2\2\2TQ\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\t\3\2\2"+
		"\2XY\5\22\n\2YZ\7\13\2\2Z[\5\4\3\2[\\\7\f\2\2\\]\b\6\1\2]\13\3\2\2\2^"+
		"_\7\r\2\2_`\7)\2\2`a\7\16\2\2ab\5\24\13\2bc\7\17\2\2cd\7\13\2\2de\5\6"+
		"\4\2ek\7\4\2\2fg\5\20\t\2gh\b\7\1\2hj\3\2\2\2if\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2ls\3\2\2\2mk\3\2\2\2no\5\26\f\2op\b\7\1\2pr\3\2\2\2qn"+
		"\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\5\2\2w"+
		"x\b\7\1\2x\u0094\3\2\2\2yz\7\r\2\2z{\7)\2\2{|\7\16\2\2|}\5\24\13\2}~\7"+
		"\17\2\2~\177\7\13\2\2\177\u0085\7\4\2\2\u0080\u0081\5\20\t\2\u0081\u0082"+
		"\b\7\1\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008d\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\5\26\f\2\u0089\u008a\b\7\1\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\5\2\2\u0091"+
		"\u0092\b\7\1\2\u0092\u0094\3\2\2\2\u0093^\3\2\2\2\u0093y\3\2\2\2\u0094"+
		"\r\3\2\2\2\u0095\u009b\7\20\2\2\u0096\u0097\5\20\t\2\u0097\u0098\b\b\1"+
		"\2\u0098\u009a\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a3\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\5\26\f\2\u009f\u00a0\b\b\1\2\u00a0\u00a2\3\2\2\2\u00a1\u009e\3"+
		"\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00a8\b\b"+
		"\1\2\u00a8\17\3\2\2\2\u00a9\u00aa\7)\2\2\u00aa\u00b0\b\t\1\2\u00ab\u00ac"+
		"\7\21\2\2\u00ac\u00ad\7)\2\2\u00ad\u00af\b\t\1\2\u00ae\u00ab\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5\5\4\3\2\u00b5"+
		"\u00b6\7\f\2\2\u00b6\u00b7\b\t\1\2\u00b7\21\3\2\2\2\u00b8\u00b9\7)\2\2"+
		"\u00b9\u00bf\b\n\1\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc\7)\2\2\u00bc\u00be"+
		"\b\n\1\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\23\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7)\2\2"+
		"\u00c3\u00c4\7\13\2\2\u00c4\u00c5\5\6\4\2\u00c5\u00c6\3\2\2\2\u00c6\u00cf"+
		"\b\13\1\2\u00c7\u00c8\7\21\2\2\u00c8\u00c9\7)\2\2\u00c9\u00ca\7\13\2\2"+
		"\u00ca\u00cb\5\6\4\2\u00cb\u00cc\b\13\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c7"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00c2\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\25\3\2\2\2\u00d4\u00d5\5 \21\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7"+
		"\5 \21\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\b\f\1\2\u00d9\u0117\3\2\2\2\u00da"+
		"\u00db\7\23\2\2\u00db\u00dc\5 \21\2\u00dc\u00e3\b\f\1\2\u00dd\u00de\7"+
		"\21\2\2\u00de\u00df\5 \21\2\u00df\u00e0\b\f\1\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00dd\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\b\f\1\2\u00e7"+
		"\u00e8\7\f\2\2\u00e8\u0117\3\2\2\2\u00e9\u00ea\7\24\2\2\u00ea\u00eb\5"+
		"\34\17\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed\b\f\1\2\u00ed\u0117\3\2\2\2\u00ee"+
		"\u00ef\7\25\2\2\u00ef\u00f0\5 \21\2\u00f0\u00f1\7\13\2\2\u00f1\u00f4\5"+
		"\36\20\2\u00f2\u00f3\7\26\2\2\u00f3\u00f5\5\36\20\2\u00f4\u00f2\3\2\2"+
		"\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b\f\1\2\u00f7\u0117"+
		"\3\2\2\2\u00f8\u00f9\7\27\2\2\u00f9\u00fa\5 \21\2\u00fa\u00fb\7\13\2\2"+
		"\u00fb\u00fc\5\36\20\2\u00fc\u00fd\b\f\1\2\u00fd\u0117\3\2\2\2\u00fe\u00ff"+
		"\7\30\2\2\u00ff\u0100\5 \21\2\u0100\u0101\7\f\2\2\u0101\u0102\b\f\1\2"+
		"\u0102\u0117\3\2\2\2\u0103\u0104\7)\2\2\u0104\u0105\7\16\2\2\u0105\u0111"+
		"\b\f\1\2\u0106\u0107\5 \21\2\u0107\u010e\b\f\1\2\u0108\u0109\7\21\2\2"+
		"\u0109\u010a\5 \21\2\u010a\u010b\b\f\1\2\u010b\u010d\3\2\2\2\u010c\u0108"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0106\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\17\2\2\u0114\u0115\7\f\2\2\u0115"+
		"\u0117\b\f\1\2\u0116\u00d4\3\2\2\2\u0116\u00da\3\2\2\2\u0116\u00e9\3\2"+
		"\2\2\u0116\u00ee\3\2\2\2\u0116\u00f8\3\2\2\2\u0116\u00fe\3\2\2\2\u0116"+
		"\u0103\3\2\2\2\u0117\27\3\2\2\2\u0118\u0119\5\32\16\2\u0119\u011a\b\r"+
		"\1\2\u011a\31\3\2\2\2\u011b\u011c\5 \21\2\u011c\u0123\b\16\1\2\u011d\u011e"+
		"\7\21\2\2\u011e\u011f\5 \21\2\u011f\u0120\b\16\1\2\u0120\u0122\3\2\2\2"+
		"\u0121\u011d\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\33\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\5 \21\2\u0127"+
		"\u012e\b\17\1\2\u0128\u0129\7\21\2\2\u0129\u012a\5 \21\2\u012a\u012b\b"+
		"\17\1\2\u012b\u012d\3\2\2\2\u012c\u0128\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\35\3\2\2\2\u0130\u012e\3\2\2"+
		"\2\u0131\u0132\5\26\f\2\u0132\u0133\b\20\1\2\u0133\u013f\3\2\2\2\u0134"+
		"\u0138\7\4\2\2\u0135\u0136\5\26\f\2\u0136\u0137\b\20\1\2\u0137\u0139\3"+
		"\2\2\2\u0138\u0135\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7\5\2\2\u013d\u013f\3\2"+
		"\2\2\u013e\u0131\3\2\2\2\u013e\u0134\3\2\2\2\u013f\37\3\2\2\2\u0140\u0141"+
		"\b\21\1\2\u0141\u0142\7\16\2\2\u0142\u0143\5 \21\2\u0143\u0144\7\17\2"+
		"\2\u0144\u0145\b\21\1\2\u0145\u0163\3\2\2\2\u0146\u0147\7\16\2\2\u0147"+
		"\u0148\5\6\4\2\u0148\u0149\7\17\2\2\u0149\u014a\5 \21\16\u014a\u014b\b"+
		"\21\1\2\u014b\u0163\3\2\2\2\u014c\u014d\7\32\2\2\u014d\u014e\5 \21\r\u014e"+
		"\u014f\b\21\1\2\u014f\u0163\3\2\2\2\u0150\u0151\7\33\2\2\u0151\u0152\5"+
		" \21\f\u0152\u0153\b\21\1\2\u0153\u0163\3\2\2\2\u0154\u0155\7)\2\2\u0155"+
		"\u0156\7\16\2\2\u0156\u0157\5\30\r\2\u0157\u0158\7\17\2\2\u0158\u0159"+
		"\b\21\1\2\u0159\u0163\3\2\2\2\u015a\u015b\7(\2\2\u015b\u0163\b\21\1\2"+
		"\u015c\u015d\7*\2\2\u015d\u0163\b\21\1\2\u015e\u015f\7-\2\2\u015f\u0163"+
		"\b\21\1\2\u0160\u0161\7)\2\2\u0161\u0163\b\21\1\2\u0162\u0140\3\2\2\2"+
		"\u0162\u0146\3\2\2\2\u0162\u014c\3\2\2\2\u0162\u0150\3\2\2\2\u0162\u0154"+
		"\3\2\2\2\u0162\u015a\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u015e\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0184\3\2\2\2\u0164\u0165\f\13\2\2\u0165\u0166\t"+
		"\2\2\2\u0166\u0167\5 \21\f\u0167\u0168\b\21\1\2\u0168\u0183\3\2\2\2\u0169"+
		"\u016a\f\n\2\2\u016a\u016b\t\3\2\2\u016b\u016c\5 \21\13\u016c\u016d\b"+
		"\21\1\2\u016d\u0183\3\2\2\2\u016e\u016f\f\t\2\2\u016f\u0170\t\4\2\2\u0170"+
		"\u0171\5 \21\n\u0171\u0172\b\21\1\2\u0172\u0183\3\2\2\2\u0173\u0174\f"+
		"\b\2\2\u0174\u0175\t\5\2\2\u0175\u0176\5 \21\t\u0176\u0177\b\21\1\2\u0177"+
		"\u0183\3\2\2\2\u0178\u0179\f\20\2\2\u0179\u017a\7\6\2\2\u017a\u017b\5"+
		" \21\2\u017b\u017c\7\7\2\2\u017c\u017d\b\21\1\2\u017d\u0183\3\2\2\2\u017e"+
		"\u017f\f\17\2\2\u017f\u0180\7\31\2\2\u0180\u0181\7)\2\2\u0181\u0183\b"+
		"\21\1\2\u0182\u0164\3\2\2\2\u0182\u0169\3\2\2\2\u0182\u016e\3\2\2\2\u0182"+
		"\u0173\3\2\2\2\u0182\u0178\3\2\2\2\u0182\u017e\3\2\2\2\u0183\u0186\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185!\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\37(*<GOVks\u0085\u008d\u0093\u009b\u00a3\u00b0\u00bf\u00cf\u00d2"+
		"\u00e3\u00f4\u010e\u0111\u0116\u0123\u012e\u013a\u013e\u0162\u0182\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}