// Generated from C:/Universidad/2do trimestre/Desarrollo de Lenguajes de Programación/Laboratorio/workspace/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import errorhandler.*;

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
			"':'", "';'", "'def'", "'('", "')'", "'def main():'", "','", "'='", "'print'", 
			"'input'", "'if'", "'else'", "'while'", "'return'", "'.'", "'-'", "'!'", 
			"'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", 
			"'&&'", "'||'"
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
			((ProgramContext)_localctx).ast =  new Program(_localctx.aux.get(0).getLine(), _localctx.aux.get(0).getColumn(), _localctx.aux);
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
					if (_localctx.ast.contains(((FieldsContext)_localctx).f.ast)){
					            ErrorHandler.getErrorHandler().addError(new ErrorType(((FieldsContext)_localctx).f.ast.getLine(),
					            ((FieldsContext)_localctx).f.ast.getColumn()+1, ((FieldsContext)_localctx).f.ast.name));
					        } else {
					            _localctx.ast.add(((FieldsContext)_localctx).f.ast);
					        }
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
		public Token ID;
		public TypesContext t;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
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
			((FieldContext)_localctx).ID = match(ID);
			setState(87);
			match(T__8);
			setState(88);
			((FieldContext)_localctx).t = types();
			setState(89);
			match(T__9);
			((FieldContext)_localctx).ast =  new FieldType(((FieldContext)_localctx).ID.getLine(),
			            ((FieldContext)_localctx).ID.getCharPositionInLine()+1, (((FieldContext)_localctx).ID!=null?((FieldContext)_localctx).ID.getText():null), ((FieldContext)_localctx).t.ast);
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
		public Token DEF;
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
			((FunctionMainContext)_localctx).DEF = match(T__13);
			setState(148);
			match(T__1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					((FunctionMainContext)_localctx).c = createVar();
					_localctx.aux.addAll(((FunctionMainContext)_localctx).c.ast);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(157);
				((FunctionMainContext)_localctx).s = sentences();
				_localctx.aux2.add(((FunctionMainContext)_localctx).s.ast);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(T__2);
			((FunctionMainContext)_localctx).ast =  new FuncDefinition(((FunctionMainContext)_localctx).DEF.getLine(), ((FunctionMainContext)_localctx).DEF.getCharPositionInLine()+1, "main", new FunctionType(
			        ((FunctionMainContext)_localctx).DEF.getLine(), ((FunctionMainContext)_localctx).DEF.getCharPositionInLine()+1, VoidType.getVoidType(), new ArrayList<VarDefinition>()),
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
			setState(168);
			((CreateVarContext)_localctx).id1 = match(ID);
			_localctx.aux.add((((CreateVarContext)_localctx).id1!=null?((CreateVarContext)_localctx).id1.getText():null));
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(170);
				match(T__14);
				setState(171);
				((CreateVarContext)_localctx).id2 = match(ID);
				if (_localctx.aux.contains((((CreateVarContext)_localctx).id2!=null?((CreateVarContext)_localctx).id2.getText():null))) {
				            ErrorHandler.getErrorHandler().addError(new ErrorType(((CreateVarContext)_localctx).id2.getLine(),
				            ((CreateVarContext)_localctx).id2.getCharPositionInLine()+1, (((CreateVarContext)_localctx).id2!=null?((CreateVarContext)_localctx).id2.getText():null)));
				            } else {
				                _localctx.aux.add((((CreateVarContext)_localctx).id2!=null?((CreateVarContext)_localctx).id2.getText():null));
				            }
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(T__8);
			setState(179);
			((CreateVarContext)_localctx).t = types();
			setState(180);
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
			setState(183);
			((VarsContext)_localctx).id = match(ID);
			_localctx.ast.add((((VarsContext)_localctx).id!=null?((VarsContext)_localctx).id.getText():null));
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(185);
				match(T__14);
				setState(186);
				((VarsContext)_localctx).optional = match(ID);
				_localctx.ast.add((((VarsContext)_localctx).optional!=null?((VarsContext)_localctx).optional.getText():null));
				}
				}
				setState(192);
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
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(193);
				((ParametresContext)_localctx).ID = match(ID);
				setState(194);
				match(T__8);
				setState(195);
				((ParametresContext)_localctx).t = simpleTypes();
				}
				_localctx.ast.add(new VarDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ParametresContext)_localctx).t.ast, ((ParametresContext)_localctx).ID.getText()));
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(198);
					match(T__14);
					setState(199);
					((ParametresContext)_localctx).ID = match(ID);
					setState(200);
					match(T__8);
					setState(201);
					((ParametresContext)_localctx).t = simpleTypes();
					_localctx.ast.add(new VarDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ParametresContext)_localctx).t.ast, ((ParametresContext)_localctx).ID.getText()));
					}
					}
					setState(208);
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
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((SentencesContext)_localctx).expr1 = expression(0);
				setState(212);
				match(T__15);
				setState(213);
				((SentencesContext)_localctx).expr2 = expression(0);
				setState(214);
				match(T__9);
				((SentencesContext)_localctx).ast =  new Assignment(((SentencesContext)_localctx).expr1.ast.getLine(),
				        ((SentencesContext)_localctx).expr1.ast.getColumn(), ((SentencesContext)_localctx).expr1.ast, ((SentencesContext)_localctx).expr2.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__16);
				setState(218);
				((SentencesContext)_localctx).exp = expression(0);
				_localctx.aux.add(((SentencesContext)_localctx).exp.ast);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(220);
					match(T__14);
					setState(221);
					((SentencesContext)_localctx).opt = expression(0);
					_localctx.aux.add(((SentencesContext)_localctx).opt.ast);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((SentencesContext)_localctx).ast =  new Print(((SentencesContext)_localctx).exp.ast.getLine(), ((SentencesContext)_localctx).exp.ast.getColumn(), _localctx.aux);
				setState(230);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(T__17);
				setState(233);
				((SentencesContext)_localctx).s = sentence();
				setState(234);
				match(T__9);
				((SentencesContext)_localctx).ast =  new Input(((SentencesContext)_localctx).s.ast.get(0).getLine(), ((SentencesContext)_localctx).s.ast.get(0).getColumn(),
				            ((SentencesContext)_localctx).s.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(T__18);
				setState(238);
				((SentencesContext)_localctx).expr = expression(0);
				setState(239);
				match(T__8);
				setState(240);
				((SentencesContext)_localctx).c1 = conditionBody();
				setState(243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(241);
					match(T__19);
					setState(242);
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
				setState(247);
				match(T__20);
				setState(248);
				((SentencesContext)_localctx).expr = expression(0);
				setState(249);
				match(T__8);
				setState(250);
				((SentencesContext)_localctx).c = conditionBody();
				((SentencesContext)_localctx).ast =  new While(((SentencesContext)_localctx).expr.ast.getLine(),
				            ((SentencesContext)_localctx).expr.ast.getColumn(), ((SentencesContext)_localctx).expr.ast, ((SentencesContext)_localctx).c.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				match(T__21);
				setState(254);
				((SentencesContext)_localctx).expr = expression(0);
				setState(255);
				match(T__9);
				((SentencesContext)_localctx).ast =  new Return(((SentencesContext)_localctx).expr.ast.getLine(), ((SentencesContext)_localctx).expr.ast.getColumn(),
				            ((SentencesContext)_localctx).expr.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				((SentencesContext)_localctx).ID = match(ID);
				setState(259);
				match(T__11);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(261);
					((SentencesContext)_localctx).e1 = expression(0);
					parameters.add(((SentencesContext)_localctx).e1.ast);
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(263);
						match(T__14);
						setState(264);
						((SentencesContext)_localctx).e2 = expression(0);
						parameters.add(((SentencesContext)_localctx).e2.ast);
						}
						}
						setState(271);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(274);
				match(T__12);
				setState(275);
				match(T__9);
				 ((SentencesContext)_localctx).ast =  new FunctionInvocation(((SentencesContext)_localctx).ID.getLine(), ((SentencesContext)_localctx).ID.getCharPositionInLine() + 1,
				        new Variable(((SentencesContext)_localctx).ID.getLine(), ((SentencesContext)_localctx).ID.getCharPositionInLine() + 1, (((SentencesContext)_localctx).ID!=null?((SentencesContext)_localctx).ID.getText():null)), parameters);
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
			setState(279);
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
			setState(282);
			((ArgsContext)_localctx).e = expression(0);
			_localctx.ast.add(((ArgsContext)_localctx).e.ast);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(284);
				match(T__14);
				setState(285);
				((ArgsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ArgsContext)_localctx).e1.ast);
				}
				}
				setState(292);
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
			setState(293);
			((SentenceContext)_localctx).e = expression(0);
			_localctx.ast.add(((SentenceContext)_localctx).e.ast);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(295);
				match(T__14);
				setState(296);
				((SentenceContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((SentenceContext)_localctx).e1.ast);
				}
				}
				setState(303);
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
			setState(317);
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
				setState(304);
				((ConditionBodyContext)_localctx).s = sentences();
				_localctx.ast.add(((ConditionBodyContext)_localctx).s.ast);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(T__1);
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(308);
					((ConditionBodyContext)_localctx).s = sentences();
					_localctx.ast.add(((ConditionBodyContext)_localctx).s.ast);
					}
					}
					setState(313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(315);
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
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(320);
				match(T__11);
				setState(321);
				((ExpressionContext)_localctx).op1 = expression(0);
				setState(322);
				match(T__12);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).op1.ast;
				}
				break;
			case 2:
				{
				setState(325);
				match(T__11);
				setState(326);
				((ExpressionContext)_localctx).t = simpleTypes();
				setState(327);
				match(T__12);
				setState(328);
				((ExpressionContext)_localctx).expr = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t.ast.getLine(), ((ExpressionContext)_localctx).t.ast.getColumn(), ((ExpressionContext)_localctx).t.ast,
				            ((ExpressionContext)_localctx).expr.ast);
				}
				break;
			case 3:
				{
				setState(331);
				match(T__23);
				setState(332);
				((ExpressionContext)_localctx).op1 = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast);
				}
				break;
			case 4:
				{
				setState(335);
				match(T__24);
				setState(336);
				((ExpressionContext)_localctx).op1 = expression(10);
				((ExpressionContext)_localctx).ast =  new Not(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast);
				}
				break;
			case 5:
				{
				setState(339);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(340);
				match(T__11);
				setState(341);
				((ExpressionContext)_localctx).fi = functionInvocation();
				setState(342);
				match(T__12);
				((ExpressionContext)_localctx).ast =  new FunctionInvocation((((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getLine(),
				                  (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getCharPositionInLine()+1, new Variable(
				                  (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getLine(), (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)), ((ExpressionContext)_localctx).fi.ast);
				}
				break;
			case 6:
				{
				setState(345);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 7:
				{
				setState(347);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(349);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(351);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(385);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(355);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(356);
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
						setState(357);
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
						setState(360);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(361);
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
						setState(362);
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
						setState(365);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(366);
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
						setState(367);
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
						setState(370);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(371);
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
						setState(372);
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
						setState(375);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(376);
						match(T__3);
						setState(377);
						((ExpressionContext)_localctx).op2 = expression(0);
						setState(378);
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
						setState(381);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(382);
						match(T__22);
						setState(383);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).op1.ast.getLine(),
						                      ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(389);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0189\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\6\3;\n\3\r\3\16\3<\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3H\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\6\5U\n\5"+
		"\r\5\16\5V\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\7\3\7\3\7\7\7r\n\7\f\7\16\7u\13\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0084\n\7\f\7\16"+
		"\7\u0087\13\7\3\7\3\7\3\7\7\7\u008c\n\7\f\7\16\7\u008f\13\7\3\7\3\7\3"+
		"\7\5\7\u0094\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13\b"+
		"\3\b\3\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u00b0\n\t\f\t\16\t\u00b3\13\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00bf\n\n\f\n\16\n\u00c2\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00cf\n\13\f\13\16\13\u00d2\13\13"+
		"\5\13\u00d4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00e3\n\f\f\f\16\f\u00e6\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00f6\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010e\n\f\f\f\16"+
		"\f\u0111\13\f\5\f\u0113\n\f\3\f\3\f\3\f\5\f\u0118\n\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0123\n\16\f\16\16\16\u0126\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u012e\n\17\f\17\16\17\u0131\13\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u013a\n\20\r\20\16\20\u013b\3\20\3"+
		"\20\5\20\u0140\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0164\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u0184\n\21\f\21\16\21\u0187\13\21\3\21\2\3 \22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\6\3\2\34\36\4\2\32\32\37\37\3\2 %\3\2&"+
		"\'\2\u01a7\2*\3\2\2\2\4G\3\2\2\2\6O\3\2\2\2\bT\3\2\2\2\nX\3\2\2\2\f\u0093"+
		"\3\2\2\2\16\u0095\3\2\2\2\20\u00aa\3\2\2\2\22\u00b9\3\2\2\2\24\u00d3\3"+
		"\2\2\2\26\u0117\3\2\2\2\30\u0119\3\2\2\2\32\u011c\3\2\2\2\34\u0127\3\2"+
		"\2\2\36\u013f\3\2\2\2 \u0163\3\2\2\2\"#\5\20\t\2#$\b\2\1\2$)\3\2\2\2%"+
		"&\5\f\7\2&\'\b\2\1\2\')\3\2\2\2(\"\3\2\2\2(%\3\2\2\2),\3\2\2\2*(\3\2\2"+
		"\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\5\16\b\2./\b\2\1\2/\60\7\2\2\3\60\61"+
		"\b\2\1\2\61\3\3\2\2\2\62\63\5\6\4\2\63\64\b\3\1\2\64H\3\2\2\2\65\66\7"+
		"\3\2\2\66:\7\4\2\2\678\5\b\5\289\b\3\1\29;\3\2\2\2:\67\3\2\2\2;<\3\2\2"+
		"\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\5\2\2?@\b\3\1\2@H\3\2\2\2AB\7\6\2"+
		"\2BC\7(\2\2CD\7\7\2\2DE\5\4\3\2EF\b\3\1\2FH\3\2\2\2G\62\3\2\2\2G\65\3"+
		"\2\2\2GA\3\2\2\2H\5\3\2\2\2IJ\7\b\2\2JP\b\4\1\2KL\7\t\2\2LP\b\4\1\2MN"+
		"\7\n\2\2NP\b\4\1\2OI\3\2\2\2OK\3\2\2\2OM\3\2\2\2P\7\3\2\2\2QR\5\n\6\2"+
		"RS\b\5\1\2SU\3\2\2\2TQ\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\t\3\2\2"+
		"\2XY\7)\2\2YZ\7\13\2\2Z[\5\4\3\2[\\\7\f\2\2\\]\b\6\1\2]\13\3\2\2\2^_\7"+
		"\r\2\2_`\7)\2\2`a\7\16\2\2ab\5\24\13\2bc\7\17\2\2cd\7\13\2\2de\5\6\4\2"+
		"ek\7\4\2\2fg\5\20\t\2gh\b\7\1\2hj\3\2\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2ls\3\2\2\2mk\3\2\2\2no\5\26\f\2op\b\7\1\2pr\3\2\2\2qn\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\5\2\2wx\b\7"+
		"\1\2x\u0094\3\2\2\2yz\7\r\2\2z{\7)\2\2{|\7\16\2\2|}\5\24\13\2}~\7\17\2"+
		"\2~\177\7\13\2\2\177\u0085\7\4\2\2\u0080\u0081\5\20\t\2\u0081\u0082\b"+
		"\7\1\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008d\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\5\26\f\2\u0089\u008a\b\7\1\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\5\2\2\u0091"+
		"\u0092\b\7\1\2\u0092\u0094\3\2\2\2\u0093^\3\2\2\2\u0093y\3\2\2\2\u0094"+
		"\r\3\2\2\2\u0095\u0096\7\20\2\2\u0096\u009c\7\4\2\2\u0097\u0098\5\20\t"+
		"\2\u0098\u0099\b\b\1\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a4\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\b\b\1\2\u00a1\u00a3\3"+
		"\2\2\2\u00a2\u009f\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\5"+
		"\2\2\u00a8\u00a9\b\b\1\2\u00a9\17\3\2\2\2\u00aa\u00ab\7)\2\2\u00ab\u00b1"+
		"\b\t\1\2\u00ac\u00ad\7\21\2\2\u00ad\u00ae\7)\2\2\u00ae\u00b0\b\t\1\2\u00af"+
		"\u00ac\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\13\2\2\u00b5"+
		"\u00b6\5\4\3\2\u00b6\u00b7\7\f\2\2\u00b7\u00b8\b\t\1\2\u00b8\21\3\2\2"+
		"\2\u00b9\u00ba\7)\2\2\u00ba\u00c0\b\n\1\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd"+
		"\7)\2\2\u00bd\u00bf\b\n\1\2\u00be\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\23\3\2\2\2\u00c2\u00c0\3\2\2"+
		"\2\u00c3\u00c4\7)\2\2\u00c4\u00c5\7\13\2\2\u00c5\u00c6\5\6\4\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00d0\b\13\1\2\u00c8\u00c9\7\21\2\2\u00c9\u00ca\7)\2\2"+
		"\u00ca\u00cb\7\13\2\2\u00cb\u00cc\5\6\4\2\u00cc\u00cd\b\13\1\2\u00cd\u00cf"+
		"\3\2\2\2\u00ce\u00c8\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00c3\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\25\3\2\2\2\u00d5\u00d6\5 \21\2\u00d6\u00d7"+
		"\7\22\2\2\u00d7\u00d8\5 \21\2\u00d8\u00d9\7\f\2\2\u00d9\u00da\b\f\1\2"+
		"\u00da\u0118\3\2\2\2\u00db\u00dc\7\23\2\2\u00dc\u00dd\5 \21\2\u00dd\u00e4"+
		"\b\f\1\2\u00de\u00df\7\21\2\2\u00df\u00e0\5 \21\2\u00e0\u00e1\b\f\1\2"+
		"\u00e1\u00e3\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e8\b\f\1\2\u00e8\u00e9\7\f\2\2\u00e9\u0118\3\2\2\2\u00ea\u00eb\7\24"+
		"\2\2\u00eb\u00ec\5\34\17\2\u00ec\u00ed\7\f\2\2\u00ed\u00ee\b\f\1\2\u00ee"+
		"\u0118\3\2\2\2\u00ef\u00f0\7\25\2\2\u00f0\u00f1\5 \21\2\u00f1\u00f2\7"+
		"\13\2\2\u00f2\u00f5\5\36\20\2\u00f3\u00f4\7\26\2\2\u00f4\u00f6\5\36\20"+
		"\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\b\f\1\2\u00f8\u0118\3\2\2\2\u00f9\u00fa\7\27\2\2\u00fa\u00fb\5 \21\2"+
		"\u00fb\u00fc\7\13\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\b\f\1\2\u00fe"+
		"\u0118\3\2\2\2\u00ff\u0100\7\30\2\2\u0100\u0101\5 \21\2\u0101\u0102\7"+
		"\f\2\2\u0102\u0103\b\f\1\2\u0103\u0118\3\2\2\2\u0104\u0105\7)\2\2\u0105"+
		"\u0106\7\16\2\2\u0106\u0112\b\f\1\2\u0107\u0108\5 \21\2\u0108\u010f\b"+
		"\f\1\2\u0109\u010a\7\21\2\2\u010a\u010b\5 \21\2\u010b\u010c\b\f\1\2\u010c"+
		"\u010e\3\2\2\2\u010d\u0109\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0107\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\17"+
		"\2\2\u0115\u0116\7\f\2\2\u0116\u0118\b\f\1\2\u0117\u00d5\3\2\2\2\u0117"+
		"\u00db\3\2\2\2\u0117\u00ea\3\2\2\2\u0117\u00ef\3\2\2\2\u0117\u00f9\3\2"+
		"\2\2\u0117\u00ff\3\2\2\2\u0117\u0104\3\2\2\2\u0118\27\3\2\2\2\u0119\u011a"+
		"\5\32\16\2\u011a\u011b\b\r\1\2\u011b\31\3\2\2\2\u011c\u011d\5 \21\2\u011d"+
		"\u0124\b\16\1\2\u011e\u011f\7\21\2\2\u011f\u0120\5 \21\2\u0120\u0121\b"+
		"\16\1\2\u0121\u0123\3\2\2\2\u0122\u011e\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\33\3\2\2\2\u0126\u0124\3\2\2"+
		"\2\u0127\u0128\5 \21\2\u0128\u012f\b\17\1\2\u0129\u012a\7\21\2\2\u012a"+
		"\u012b\5 \21\2\u012b\u012c\b\17\1\2\u012c\u012e\3\2\2\2\u012d\u0129\3"+
		"\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\35\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\5\26\f\2\u0133\u0134\b\20"+
		"\1\2\u0134\u0140\3\2\2\2\u0135\u0139\7\4\2\2\u0136\u0137\5\26\f\2\u0137"+
		"\u0138\b\20\1\2\u0138\u013a\3\2\2\2\u0139\u0136\3\2\2\2\u013a\u013b\3"+
		"\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\7\5\2\2\u013e\u0140\3\2\2\2\u013f\u0132\3\2\2\2\u013f\u0135\3\2"+
		"\2\2\u0140\37\3\2\2\2\u0141\u0142\b\21\1\2\u0142\u0143\7\16\2\2\u0143"+
		"\u0144\5 \21\2\u0144\u0145\7\17\2\2\u0145\u0146\b\21\1\2\u0146\u0164\3"+
		"\2\2\2\u0147\u0148\7\16\2\2\u0148\u0149\5\6\4\2\u0149\u014a\7\17\2\2\u014a"+
		"\u014b\5 \21\16\u014b\u014c\b\21\1\2\u014c\u0164\3\2\2\2\u014d\u014e\7"+
		"\32\2\2\u014e\u014f\5 \21\r\u014f\u0150\b\21\1\2\u0150\u0164\3\2\2\2\u0151"+
		"\u0152\7\33\2\2\u0152\u0153\5 \21\f\u0153\u0154\b\21\1\2\u0154\u0164\3"+
		"\2\2\2\u0155\u0156\7)\2\2\u0156\u0157\7\16\2\2\u0157\u0158\5\30\r\2\u0158"+
		"\u0159\7\17\2\2\u0159\u015a\b\21\1\2\u015a\u0164\3\2\2\2\u015b\u015c\7"+
		"(\2\2\u015c\u0164\b\21\1\2\u015d\u015e\7*\2\2\u015e\u0164\b\21\1\2\u015f"+
		"\u0160\7-\2\2\u0160\u0164\b\21\1\2\u0161\u0162\7)\2\2\u0162\u0164\b\21"+
		"\1\2\u0163\u0141\3\2\2\2\u0163\u0147\3\2\2\2\u0163\u014d\3\2\2\2\u0163"+
		"\u0151\3\2\2\2\u0163\u0155\3\2\2\2\u0163\u015b\3\2\2\2\u0163\u015d\3\2"+
		"\2\2\u0163\u015f\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0185\3\2\2\2\u0165"+
		"\u0166\f\13\2\2\u0166\u0167\t\2\2\2\u0167\u0168\5 \21\f\u0168\u0169\b"+
		"\21\1\2\u0169\u0184\3\2\2\2\u016a\u016b\f\n\2\2\u016b\u016c\t\3\2\2\u016c"+
		"\u016d\5 \21\13\u016d\u016e\b\21\1\2\u016e\u0184\3\2\2\2\u016f\u0170\f"+
		"\t\2\2\u0170\u0171\t\4\2\2\u0171\u0172\5 \21\n\u0172\u0173\b\21\1\2\u0173"+
		"\u0184\3\2\2\2\u0174\u0175\f\b\2\2\u0175\u0176\t\5\2\2\u0176\u0177\5 "+
		"\21\t\u0177\u0178\b\21\1\2\u0178\u0184\3\2\2\2\u0179\u017a\f\20\2\2\u017a"+
		"\u017b\7\6\2\2\u017b\u017c\5 \21\2\u017c\u017d\7\7\2\2\u017d\u017e\b\21"+
		"\1\2\u017e\u0184\3\2\2\2\u017f\u0180\f\17\2\2\u0180\u0181\7\31\2\2\u0181"+
		"\u0182\7)\2\2\u0182\u0184\b\21\1\2\u0183\u0165\3\2\2\2\u0183\u016a\3\2"+
		"\2\2\u0183\u016f\3\2\2\2\u0183\u0174\3\2\2\2\u0183\u0179\3\2\2\2\u0183"+
		"\u017f\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186!\3\2\2\2\u0187\u0185\3\2\2\2\37(*<GOVks\u0085\u008d\u0093\u009c"+
		"\u00a4\u00b1\u00c0\u00d0\u00d3\u00e4\u00f5\u010f\u0112\u0117\u0124\u012f"+
		"\u013b\u013f\u0163\u0183\u0185";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}