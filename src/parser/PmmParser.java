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
		RULE_parametres = 8, RULE_sentences = 9, RULE_functionInvocation = 10, 
		RULE_args = 11, RULE_sentence = 12, RULE_conditionBody = 13, RULE_expression = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "types", "simpleTypes", "fields", "field", "createFunction", 
			"functionMain", "createVar", "parametres", "sentences", "functionInvocation", 
			"args", "sentence", "conditionBody", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'{'", "'}'", "'['", "']'", "'int'", "'double'", "'char'", 
			"','", "':'", "';'", "'def'", "'('", "')'", "'def main():'", "'='", "'print'", 
			"'input'", "'if'", "'else'", "'while'", "'return'", "'.'", "'-'", "'!'", 
			"'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", 
			"'||'", "'&&'"
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==ID) {
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(30);
					((ProgramContext)_localctx).cv = createVar();
					_localctx.aux.addAll(((ProgramContext)_localctx).cv.ast);
					}
					break;
				case T__11:
					{
					setState(33);
					((ProgramContext)_localctx).cf = createFunction();
					_localctx.aux.add(((ProgramContext)_localctx).cf.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			((ProgramContext)_localctx).fm = functionMain();
			_localctx.aux.add(((ProgramContext)_localctx).fm.ast);
			setState(43);
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				((TypesContext)_localctx).s = simpleTypes();
				((TypesContext)_localctx).ast =  ((TypesContext)_localctx).s.ast;
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__0);
				setState(50);
				match(T__1);
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
					((TypesContext)_localctx).f = fields();
					_localctx.aux.addAll(((TypesContext)_localctx).f.ast);
					}
					}
					setState(56); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(58);
				match(T__2);
				((TypesContext)_localctx).ast =  new StructType((((TypesContext)_localctx).f!=null?(((TypesContext)_localctx).f.start):null).getLine(),
				        (((TypesContext)_localctx).f!=null?(((TypesContext)_localctx).f.start):null).getCharPositionInLine()+1, _localctx.aux);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(T__3);
				setState(62);
				((TypesContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(63);
				match(T__4);
				setState(64);
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
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__5);
				((SimpleTypesContext)_localctx).ast =  IntType.getIntType();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__6);
				((SimpleTypesContext)_localctx).ast =  DoubleType.getDoubleType();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((FieldsContext)_localctx).id1 = match(ID);
			_localctx.aux.add((((FieldsContext)_localctx).id1!=null?((FieldsContext)_localctx).id1.getText():null));
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(79);
				match(T__8);
				setState(80);
				((FieldsContext)_localctx).id2 = match(ID);
				if (_localctx.aux.contains((((FieldsContext)_localctx).id2!=null?((FieldsContext)_localctx).id2.getText():null))) {
				                    ErrorHandler.getErrorHandler().addError(new ErrorType(((FieldsContext)_localctx).id2.getLine(),
				                    ((FieldsContext)_localctx).id2.getCharPositionInLine()+1, (((FieldsContext)_localctx).id2!=null?((FieldsContext)_localctx).id2.getText():null)));
				                    } else {
				                        _localctx.aux.add((((FieldsContext)_localctx).id2!=null?((FieldsContext)_localctx).id2.getText():null));
				                    }
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(T__9);
			setState(88);
			((FieldsContext)_localctx).t = types();
			setState(89);
			match(T__10);
			 for (String v : _localctx.aux) {
			                        _localctx.ast.add(new FieldType(((FieldsContext)_localctx).id1.getLine(), ((FieldsContext)_localctx).id1.getCharPositionInLine()+1, v, ((FieldsContext)_localctx).t.ast));
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
			setState(92);
			((FieldContext)_localctx).ID = match(ID);
			setState(93);
			match(T__9);
			setState(94);
			((FieldContext)_localctx).t = types();
			setState(95);
			match(T__10);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__11);
				setState(99);
				((CreateFunctionContext)_localctx).ID = match(ID);
				setState(100);
				match(T__12);
				setState(101);
				((CreateFunctionContext)_localctx).p = parametres();
				setState(102);
				match(T__13);
				setState(103);
				match(T__9);
				setState(104);
				((CreateFunctionContext)_localctx).t = simpleTypes();
				setState(105);
				match(T__1);
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(106);
						((CreateFunctionContext)_localctx).c = createVar();
						_localctx.aux.addAll(((CreateFunctionContext)_localctx).c.ast);
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(114);
					((CreateFunctionContext)_localctx).s = sentences();
					_localctx.aux2.add(((CreateFunctionContext)_localctx).s.ast);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(T__2);
				((CreateFunctionContext)_localctx).ast =  new FuncDefinition(((CreateFunctionContext)_localctx).ID.getLine(), ((CreateFunctionContext)_localctx).ID.getCharPositionInLine()+1, (((CreateFunctionContext)_localctx).ID!=null?((CreateFunctionContext)_localctx).ID.getText():null), new FunctionType(
				        ((CreateFunctionContext)_localctx).ID.getLine(), ((CreateFunctionContext)_localctx).ID.getCharPositionInLine()+1, ((CreateFunctionContext)_localctx).t.ast, ((CreateFunctionContext)_localctx).p.ast), _localctx.aux, _localctx.aux2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__11);
				setState(126);
				((CreateFunctionContext)_localctx).ID = match(ID);
				setState(127);
				match(T__12);
				setState(128);
				((CreateFunctionContext)_localctx).p = parametres();
				setState(129);
				match(T__13);
				setState(130);
				match(T__9);
				setState(131);
				match(T__1);
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(132);
						((CreateFunctionContext)_localctx).c = createVar();
						_localctx.aux.addAll(((CreateFunctionContext)_localctx).c.ast);
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(140);
					((CreateFunctionContext)_localctx).s = sentences();
					_localctx.aux2.add(((CreateFunctionContext)_localctx).s.ast);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__2);
				((CreateFunctionContext)_localctx).ast =  new FuncDefinition(((CreateFunctionContext)_localctx).ID.getLine(), ((CreateFunctionContext)_localctx).ID.getCharPositionInLine()+1, (((CreateFunctionContext)_localctx).ID!=null?((CreateFunctionContext)_localctx).ID.getText():null), new FunctionType(
				        ((CreateFunctionContext)_localctx).ID.getLine(), ((CreateFunctionContext)_localctx).ID.getCharPositionInLine()+1, new VoidType(),
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
			setState(153);
			((FunctionMainContext)_localctx).DEF = match(T__14);
			setState(154);
			match(T__1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					((FunctionMainContext)_localctx).c = createVar();
					_localctx.aux.addAll(((FunctionMainContext)_localctx).c.ast);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(163);
				((FunctionMainContext)_localctx).s = sentences();
				_localctx.aux2.add(((FunctionMainContext)_localctx).s.ast);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__2);
			((FunctionMainContext)_localctx).ast =  new FuncDefinition(((FunctionMainContext)_localctx).DEF.getLine(), ((FunctionMainContext)_localctx).DEF.getCharPositionInLine()+1, "main", new FunctionType(
			        ((FunctionMainContext)_localctx).DEF.getLine(), ((FunctionMainContext)_localctx).DEF.getCharPositionInLine()+1, new VoidType(), new ArrayList<VarDefinition>()),
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
			setState(174);
			((CreateVarContext)_localctx).id1 = match(ID);
			_localctx.aux.add((((CreateVarContext)_localctx).id1!=null?((CreateVarContext)_localctx).id1.getText():null));
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(176);
				match(T__8);
				setState(177);
				((CreateVarContext)_localctx).id2 = match(ID);
				if (_localctx.aux.contains((((CreateVarContext)_localctx).id2!=null?((CreateVarContext)_localctx).id2.getText():null))) {
				            ErrorHandler.getErrorHandler().addError(new ErrorType(((CreateVarContext)_localctx).id2.getLine(),
				            ((CreateVarContext)_localctx).id2.getCharPositionInLine()+1, (((CreateVarContext)_localctx).id2!=null?((CreateVarContext)_localctx).id2.getText():null)));
				            } else {
				                _localctx.aux.add((((CreateVarContext)_localctx).id2!=null?((CreateVarContext)_localctx).id2.getText():null));
				            }
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(T__9);
			setState(185);
			((CreateVarContext)_localctx).t = types();
			setState(186);
			match(T__10);
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
		enterRule(_localctx, 16, RULE_parametres);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(189);
				((ParametresContext)_localctx).ID = match(ID);
				setState(190);
				match(T__9);
				setState(191);
				((ParametresContext)_localctx).t = simpleTypes();
				}
				_localctx.ast.add(new VarDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ParametresContext)_localctx).t.ast, ((ParametresContext)_localctx).ID.getText()));
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(194);
					match(T__8);
					setState(195);
					((ParametresContext)_localctx).ID = match(ID);
					setState(196);
					match(T__9);
					setState(197);
					((ParametresContext)_localctx).t = simpleTypes();
					_localctx.ast.add(new VarDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ParametresContext)_localctx).t.ast, ((ParametresContext)_localctx).ID.getText()));
					}
					}
					setState(204);
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
		enterRule(_localctx, 18, RULE_sentences);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				((SentencesContext)_localctx).expr1 = expression(0);
				setState(208);
				match(T__15);
				setState(209);
				((SentencesContext)_localctx).expr2 = expression(0);
				setState(210);
				match(T__10);
				((SentencesContext)_localctx).ast =  new Assignment(((SentencesContext)_localctx).expr1.ast.getLine(),
				        ((SentencesContext)_localctx).expr1.ast.getColumn(), ((SentencesContext)_localctx).expr1.ast, ((SentencesContext)_localctx).expr2.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__16);
				setState(214);
				((SentencesContext)_localctx).exp = expression(0);
				_localctx.aux.add(((SentencesContext)_localctx).exp.ast);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(216);
					match(T__8);
					setState(217);
					((SentencesContext)_localctx).opt = expression(0);
					_localctx.aux.add(((SentencesContext)_localctx).opt.ast);
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((SentencesContext)_localctx).ast =  new Print(((SentencesContext)_localctx).exp.ast.getLine(), ((SentencesContext)_localctx).exp.ast.getColumn(), _localctx.aux);
				setState(226);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(T__17);
				setState(229);
				((SentencesContext)_localctx).s = sentence();
				setState(230);
				match(T__10);
				((SentencesContext)_localctx).ast =  new Input(((SentencesContext)_localctx).s.ast.get(0).getLine(), ((SentencesContext)_localctx).s.ast.get(0).getColumn(),
				            ((SentencesContext)_localctx).s.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(T__18);
				setState(234);
				((SentencesContext)_localctx).expr = expression(0);
				setState(235);
				match(T__9);
				setState(236);
				((SentencesContext)_localctx).c1 = conditionBody();
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(237);
					match(T__19);
					setState(238);
					((SentencesContext)_localctx).c2 = conditionBody();
					}
					break;
				}
				((SentencesContext)_localctx).ast =  new IfElse(
				            ((SentencesContext)_localctx).expr.ast.getLine(), ((SentencesContext)_localctx).expr.ast.getColumn(), ((SentencesContext)_localctx).expr.ast, ((SentencesContext)_localctx).c1.ast, ((SentencesContext)_localctx).c2 == null ? new ArrayList<Statement>() : ((SentencesContext)_localctx).c2.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(T__20);
				setState(244);
				((SentencesContext)_localctx).expr = expression(0);
				setState(245);
				match(T__9);
				setState(246);
				((SentencesContext)_localctx).c = conditionBody();
				((SentencesContext)_localctx).ast =  new While(((SentencesContext)_localctx).expr.ast.getLine(),
				            ((SentencesContext)_localctx).expr.ast.getColumn(), ((SentencesContext)_localctx).expr.ast, ((SentencesContext)_localctx).c.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(249);
				match(T__21);
				setState(250);
				((SentencesContext)_localctx).expr = expression(0);
				setState(251);
				match(T__10);
				((SentencesContext)_localctx).ast =  new Return(((SentencesContext)_localctx).expr.ast.getLine(), ((SentencesContext)_localctx).expr.ast.getColumn(),
				            ((SentencesContext)_localctx).expr.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				((SentencesContext)_localctx).ID = match(ID);
				setState(255);
				match(T__12);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(257);
					((SentencesContext)_localctx).e1 = expression(0);
					parameters.add(((SentencesContext)_localctx).e1.ast);
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(259);
						match(T__8);
						setState(260);
						((SentencesContext)_localctx).e2 = expression(0);
						parameters.add(((SentencesContext)_localctx).e2.ast);
						}
						}
						setState(267);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(270);
				match(T__13);
				setState(271);
				match(T__10);
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
		enterRule(_localctx, 20, RULE_functionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(275);
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
		enterRule(_localctx, 22, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(278);
				((ArgsContext)_localctx).e = expression(0);
				_localctx.ast.add(((ArgsContext)_localctx).e.ast);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(280);
					match(T__8);
					setState(281);
					((ArgsContext)_localctx).e1 = expression(0);
					_localctx.ast.add(((ArgsContext)_localctx).e1.ast);
					}
					}
					setState(288);
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
		enterRule(_localctx, 24, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((SentenceContext)_localctx).e = expression(0);
			_localctx.ast.add(((SentenceContext)_localctx).e.ast);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(293);
				match(T__8);
				setState(294);
				((SentenceContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((SentenceContext)_localctx).e1.ast);
				}
				}
				setState(301);
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
		enterRule(_localctx, 26, RULE_conditionBody);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
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
				setState(302);
				((ConditionBodyContext)_localctx).s = sentences();
				_localctx.ast.add(((ConditionBodyContext)_localctx).s.ast);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(T__1);
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(306);
					((ConditionBodyContext)_localctx).s = sentences();
					_localctx.ast.add(((ConditionBodyContext)_localctx).s.ast);
					}
					}
					setState(311); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(313);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(318);
				match(T__12);
				setState(319);
				((ExpressionContext)_localctx).op1 = expression(0);
				setState(320);
				match(T__13);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).op1.ast;
				}
				break;
			case 2:
				{
				setState(323);
				match(T__12);
				setState(324);
				((ExpressionContext)_localctx).t = simpleTypes();
				setState(325);
				match(T__13);
				setState(326);
				((ExpressionContext)_localctx).expr = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t.ast.getLine(), ((ExpressionContext)_localctx).t.ast.getColumn(), ((ExpressionContext)_localctx).t.ast,
				            ((ExpressionContext)_localctx).expr.ast);
				}
				break;
			case 3:
				{
				setState(329);
				match(T__23);
				setState(330);
				((ExpressionContext)_localctx).op1 = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast);
				}
				break;
			case 4:
				{
				setState(333);
				match(T__24);
				setState(334);
				((ExpressionContext)_localctx).op1 = expression(10);
				((ExpressionContext)_localctx).ast =  new Not(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast);
				}
				break;
			case 5:
				{
				setState(337);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(338);
				match(T__12);
				setState(339);
				((ExpressionContext)_localctx).fi = functionInvocation();
				setState(340);
				match(T__13);
				((ExpressionContext)_localctx).ast =  new FunctionInvocation((((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getLine(),
				                  (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getCharPositionInLine()+1, new Variable(
				                  (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getLine(), (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)), ((ExpressionContext)_localctx).fi.ast);
				}
				break;
			case 6:
				{
				setState(343);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                        ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 7:
				{
				setState(345);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                        ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(347);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                        ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(349);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(383);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(354);
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
						setState(355);
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
						setState(358);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(359);
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
						setState(360);
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
						setState(363);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(364);
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
						setState(365);
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
						setState(368);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(369);
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
						setState(370);
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
						setState(373);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(374);
						match(T__3);
						setState(375);
						((ExpressionContext)_localctx).op2 = expression(0);
						setState(376);
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
						setState(379);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(380);
						match(T__22);
						setState(381);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).op1.ast.getLine(),
						                      ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(387);
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
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0187\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\6\39\n\3\r\3\16\3:\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3F\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\5\3\5\7\5U\n\5"+
		"\f\5\16\5X\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13\7\3\7\3\7\3\7"+
		"\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\3\7\3\7\3\7\7\7\u0092\n\7\f\7"+
		"\16\7\u0095\13\7\3\7\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u00a1"+
		"\n\b\f\b\16\b\u00a4\13\b\3\b\3\b\3\b\7\b\u00a9\n\b\f\b\16\b\u00ac\13\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u00b6\n\t\f\t\16\t\u00b9\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cb"+
		"\n\n\f\n\16\n\u00ce\13\n\5\n\u00d0\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00df\n\13\f\13\16\13\u00e2\13"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00f2\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u010a"+
		"\n\13\f\13\16\13\u010d\13\13\5\13\u010f\n\13\3\13\3\13\3\13\5\13\u0114"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u011f\n\r\f\r\16\r\u0122"+
		"\13\r\5\r\u0124\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u012c\n\16\f\16"+
		"\16\16\u012f\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u0138\n\17"+
		"\r\17\16\17\u0139\3\17\3\17\5\17\u013e\n\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0162\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0182\n\20\f\20\16\20\u0185\13\20"+
		"\3\20\2\3\36\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\6\3\2\34\36\4"+
		"\2\32\32\37\37\3\2 %\3\2&\'\2\u01a6\2(\3\2\2\2\4E\3\2\2\2\6M\3\2\2\2\b"+
		"O\3\2\2\2\n^\3\2\2\2\f\u0099\3\2\2\2\16\u009b\3\2\2\2\20\u00b0\3\2\2\2"+
		"\22\u00cf\3\2\2\2\24\u0113\3\2\2\2\26\u0115\3\2\2\2\30\u0123\3\2\2\2\32"+
		"\u0125\3\2\2\2\34\u013d\3\2\2\2\36\u0161\3\2\2\2 !\5\20\t\2!\"\b\2\1\2"+
		"\"\'\3\2\2\2#$\5\f\7\2$%\b\2\1\2%\'\3\2\2\2& \3\2\2\2&#\3\2\2\2\'*\3\2"+
		"\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\5\16\b\2,-\b\2\1\2-.\7"+
		"\2\2\3./\b\2\1\2/\3\3\2\2\2\60\61\5\6\4\2\61\62\b\3\1\2\62F\3\2\2\2\63"+
		"\64\7\3\2\2\648\7\4\2\2\65\66\5\b\5\2\66\67\b\3\1\2\679\3\2\2\28\65\3"+
		"\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\5\2\2=>\b\3\1\2>F\3"+
		"\2\2\2?@\7\6\2\2@A\7(\2\2AB\7\7\2\2BC\5\4\3\2CD\b\3\1\2DF\3\2\2\2E\60"+
		"\3\2\2\2E\63\3\2\2\2E?\3\2\2\2F\5\3\2\2\2GH\7\b\2\2HN\b\4\1\2IJ\7\t\2"+
		"\2JN\b\4\1\2KL\7\n\2\2LN\b\4\1\2MG\3\2\2\2MI\3\2\2\2MK\3\2\2\2N\7\3\2"+
		"\2\2OP\7)\2\2PV\b\5\1\2QR\7\13\2\2RS\7)\2\2SU\b\5\1\2TQ\3\2\2\2UX\3\2"+
		"\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\f\2\2Z[\5\4\3\2[\\\7"+
		"\r\2\2\\]\b\5\1\2]\t\3\2\2\2^_\7)\2\2_`\7\f\2\2`a\5\4\3\2ab\7\r\2\2bc"+
		"\b\6\1\2c\13\3\2\2\2de\7\16\2\2ef\7)\2\2fg\7\17\2\2gh\5\22\n\2hi\7\20"+
		"\2\2ij\7\f\2\2jk\5\6\4\2kq\7\4\2\2lm\5\20\t\2mn\b\7\1\2np\3\2\2\2ol\3"+
		"\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ry\3\2\2\2sq\3\2\2\2tu\5\24\13\2u"+
		"v\b\7\1\2vx\3\2\2\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2"+
		"{y\3\2\2\2|}\7\5\2\2}~\b\7\1\2~\u009a\3\2\2\2\177\u0080\7\16\2\2\u0080"+
		"\u0081\7)\2\2\u0081\u0082\7\17\2\2\u0082\u0083\5\22\n\2\u0083\u0084\7"+
		"\20\2\2\u0084\u0085\7\f\2\2\u0085\u008b\7\4\2\2\u0086\u0087\5\20\t\2\u0087"+
		"\u0088\b\7\1\2\u0088\u008a\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0093\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\5\24\13\2\u008f\u0090\b\7\1\2\u0090\u0092\3"+
		"\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\5"+
		"\2\2\u0097\u0098\b\7\1\2\u0098\u009a\3\2\2\2\u0099d\3\2\2\2\u0099\177"+
		"\3\2\2\2\u009a\r\3\2\2\2\u009b\u009c\7\21\2\2\u009c\u00a2\7\4\2\2\u009d"+
		"\u009e\5\20\t\2\u009e\u009f\b\b\1\2\u009f\u00a1\3\2\2\2\u00a0\u009d\3"+
		"\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00aa\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7\b"+
		"\b\1\2\u00a7\u00a9\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7\5\2\2\u00ae\u00af\b\b\1\2\u00af\17\3\2\2\2\u00b0\u00b1"+
		"\7)\2\2\u00b1\u00b7\b\t\1\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\7)\2\2\u00b4"+
		"\u00b6\b\t\1\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7\f\2\2\u00bb\u00bc\5\4\3\2\u00bc\u00bd\7\r\2\2\u00bd\u00be\b\t"+
		"\1\2\u00be\21\3\2\2\2\u00bf\u00c0\7)\2\2\u00c0\u00c1\7\f\2\2\u00c1\u00c2"+
		"\5\6\4\2\u00c2\u00c3\3\2\2\2\u00c3\u00cc\b\n\1\2\u00c4\u00c5\7\13\2\2"+
		"\u00c5\u00c6\7)\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\5\6\4\2\u00c8\u00c9"+
		"\b\n\1\2\u00c9\u00cb\3\2\2\2\u00ca\u00c4\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00bf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\23\3\2\2\2\u00d1\u00d2"+
		"\5\36\20\2\u00d2\u00d3\7\22\2\2\u00d3\u00d4\5\36\20\2\u00d4\u00d5\7\r"+
		"\2\2\u00d5\u00d6\b\13\1\2\u00d6\u0114\3\2\2\2\u00d7\u00d8\7\23\2\2\u00d8"+
		"\u00d9\5\36\20\2\u00d9\u00e0\b\13\1\2\u00da\u00db\7\13\2\2\u00db\u00dc"+
		"\5\36\20\2\u00dc\u00dd\b\13\1\2\u00dd\u00df\3\2\2\2\u00de\u00da\3\2\2"+
		"\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\b\13\1\2\u00e4\u00e5\7\r\2\2"+
		"\u00e5\u0114\3\2\2\2\u00e6\u00e7\7\24\2\2\u00e7\u00e8\5\32\16\2\u00e8"+
		"\u00e9\7\r\2\2\u00e9\u00ea\b\13\1\2\u00ea\u0114\3\2\2\2\u00eb\u00ec\7"+
		"\25\2\2\u00ec\u00ed\5\36\20\2\u00ed\u00ee\7\f\2\2\u00ee\u00f1\5\34\17"+
		"\2\u00ef\u00f0\7\26\2\2\u00f0\u00f2\5\34\17\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\13\1\2\u00f4\u0114\3"+
		"\2\2\2\u00f5\u00f6\7\27\2\2\u00f6\u00f7\5\36\20\2\u00f7\u00f8\7\f\2\2"+
		"\u00f8\u00f9\5\34\17\2\u00f9\u00fa\b\13\1\2\u00fa\u0114\3\2\2\2\u00fb"+
		"\u00fc\7\30\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\7\r\2\2\u00fe\u00ff"+
		"\b\13\1\2\u00ff\u0114\3\2\2\2\u0100\u0101\7)\2\2\u0101\u0102\7\17\2\2"+
		"\u0102\u010e\b\13\1\2\u0103\u0104\5\36\20\2\u0104\u010b\b\13\1\2\u0105"+
		"\u0106\7\13\2\2\u0106\u0107\5\36\20\2\u0107\u0108\b\13\1\2\u0108\u010a"+
		"\3\2\2\2\u0109\u0105\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0103\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\20\2\2\u0111"+
		"\u0112\7\r\2\2\u0112\u0114\b\13\1\2\u0113\u00d1\3\2\2\2\u0113\u00d7\3"+
		"\2\2\2\u0113\u00e6\3\2\2\2\u0113\u00eb\3\2\2\2\u0113\u00f5\3\2\2\2\u0113"+
		"\u00fb\3\2\2\2\u0113\u0100\3\2\2\2\u0114\25\3\2\2\2\u0115\u0116\5\30\r"+
		"\2\u0116\u0117\b\f\1\2\u0117\27\3\2\2\2\u0118\u0119\5\36\20\2\u0119\u0120"+
		"\b\r\1\2\u011a\u011b\7\13\2\2\u011b\u011c\5\36\20\2\u011c\u011d\b\r\1"+
		"\2\u011d\u011f\3\2\2\2\u011e\u011a\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0118\3\2\2\2\u0123\u0124\3\2\2\2\u0124\31\3\2\2\2\u0125\u0126\5\36\20"+
		"\2\u0126\u012d\b\16\1\2\u0127\u0128\7\13\2\2\u0128\u0129\5\36\20\2\u0129"+
		"\u012a\b\16\1\2\u012a\u012c\3\2\2\2\u012b\u0127\3\2\2\2\u012c\u012f\3"+
		"\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\33\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0131\5\24\13\2\u0131\u0132\b\17\1\2\u0132\u013e"+
		"\3\2\2\2\u0133\u0137\7\4\2\2\u0134\u0135\5\24\13\2\u0135\u0136\b\17\1"+
		"\2\u0136\u0138\3\2\2\2\u0137\u0134\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\5\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0130\3\2\2\2\u013d\u0133\3\2\2\2\u013e\35\3\2\2"+
		"\2\u013f\u0140\b\20\1\2\u0140\u0141\7\17\2\2\u0141\u0142\5\36\20\2\u0142"+
		"\u0143\7\20\2\2\u0143\u0144\b\20\1\2\u0144\u0162\3\2\2\2\u0145\u0146\7"+
		"\17\2\2\u0146\u0147\5\6\4\2\u0147\u0148\7\20\2\2\u0148\u0149\5\36\20\16"+
		"\u0149\u014a\b\20\1\2\u014a\u0162\3\2\2\2\u014b\u014c\7\32\2\2\u014c\u014d"+
		"\5\36\20\r\u014d\u014e\b\20\1\2\u014e\u0162\3\2\2\2\u014f\u0150\7\33\2"+
		"\2\u0150\u0151\5\36\20\f\u0151\u0152\b\20\1\2\u0152\u0162\3\2\2\2\u0153"+
		"\u0154\7)\2\2\u0154\u0155\7\17\2\2\u0155\u0156\5\26\f\2\u0156\u0157\7"+
		"\20\2\2\u0157\u0158\b\20\1\2\u0158\u0162\3\2\2\2\u0159\u015a\7(\2\2\u015a"+
		"\u0162\b\20\1\2\u015b\u015c\7*\2\2\u015c\u0162\b\20\1\2\u015d\u015e\7"+
		"-\2\2\u015e\u0162\b\20\1\2\u015f\u0160\7)\2\2\u0160\u0162\b\20\1\2\u0161"+
		"\u013f\3\2\2\2\u0161\u0145\3\2\2\2\u0161\u014b\3\2\2\2\u0161\u014f\3\2"+
		"\2\2\u0161\u0153\3\2\2\2\u0161\u0159\3\2\2\2\u0161\u015b\3\2\2\2\u0161"+
		"\u015d\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0183\3\2\2\2\u0163\u0164\f\13"+
		"\2\2\u0164\u0165\t\2\2\2\u0165\u0166\5\36\20\f\u0166\u0167\b\20\1\2\u0167"+
		"\u0182\3\2\2\2\u0168\u0169\f\n\2\2\u0169\u016a\t\3\2\2\u016a\u016b\5\36"+
		"\20\13\u016b\u016c\b\20\1\2\u016c\u0182\3\2\2\2\u016d\u016e\f\t\2\2\u016e"+
		"\u016f\t\4\2\2\u016f\u0170\5\36\20\n\u0170\u0171\b\20\1\2\u0171\u0182"+
		"\3\2\2\2\u0172\u0173\f\b\2\2\u0173\u0174\t\5\2\2\u0174\u0175\5\36\20\t"+
		"\u0175\u0176\b\20\1\2\u0176\u0182\3\2\2\2\u0177\u0178\f\20\2\2\u0178\u0179"+
		"\7\6\2\2\u0179\u017a\5\36\20\2\u017a\u017b\7\7\2\2\u017b\u017c\b\20\1"+
		"\2\u017c\u0182\3\2\2\2\u017d\u017e\f\17\2\2\u017e\u017f\7\31\2\2\u017f"+
		"\u0180\7)\2\2\u0180\u0182\b\20\1\2\u0181\u0163\3\2\2\2\u0181\u0168\3\2"+
		"\2\2\u0181\u016d\3\2\2\2\u0181\u0172\3\2\2\2\u0181\u0177\3\2\2\2\u0181"+
		"\u017d\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\37\3\2\2\2\u0185\u0183\3\2\2\2\37&(:EMVqy\u008b\u0093\u0099"+
		"\u00a2\u00aa\u00b7\u00cc\u00cf\u00e0\u00f1\u010b\u010e\u0113\u0120\u0123"+
		"\u012d\u0139\u013d\u0161\u0181\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}