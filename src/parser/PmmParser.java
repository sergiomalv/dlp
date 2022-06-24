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
		RULE_createFunction = 4, RULE_functionMain = 5, RULE_createVar = 6, RULE_parametres = 7, 
		RULE_sentences = 8, RULE_functionInvocation = 9, RULE_args = 10, RULE_sentence = 11, 
		RULE_conditionBody = 12, RULE_expression = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "types", "simpleTypes", "fields", "createFunction", "functionMain", 
			"createVar", "parametres", "sentences", "functionInvocation", "args", 
			"sentence", "conditionBody", "expression"
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
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==ID) {
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(28);
					((ProgramContext)_localctx).cv = createVar();
					_localctx.aux.addAll(((ProgramContext)_localctx).cv.ast);
					}
					break;
				case T__11:
					{
					setState(31);
					((ProgramContext)_localctx).cf = createFunction();
					_localctx.aux.add(((ProgramContext)_localctx).cf.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			((ProgramContext)_localctx).fm = functionMain();
			_localctx.aux.add(((ProgramContext)_localctx).fm.ast);
			setState(41);
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
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				((TypesContext)_localctx).s = simpleTypes();
				((TypesContext)_localctx).ast =  ((TypesContext)_localctx).s.ast;
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(T__0);
				setState(48);
				match(T__1);
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(49);
					((TypesContext)_localctx).f = fields();
					 for (FieldType actual : ((TypesContext)_localctx).f.ast){
					                if (_localctx.aux.contains(actual)){
					                    ErrorHandler.getErrorHandler().addError(new ErrorType(actual.getLine(),
					                        actual.getColumn(), actual.getName()));
					                } else {
					                    _localctx.aux.add(actual);
					                }
					            }
					            
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(56);
				match(T__2);
				((TypesContext)_localctx).ast =  new StructType((((TypesContext)_localctx).f!=null?(((TypesContext)_localctx).f.start):null).getLine(),
				            (((TypesContext)_localctx).f!=null?(((TypesContext)_localctx).f.start):null).getCharPositionInLine()+1, _localctx.aux);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(T__3);
				setState(60);
				((TypesContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(61);
				match(T__4);
				setState(62);
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__5);
				((SimpleTypesContext)_localctx).ast =  IntType.getIntType();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__6);
				((SimpleTypesContext)_localctx).ast =  DoubleType.getDoubleType();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
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
			setState(75);
			((FieldsContext)_localctx).id1 = match(ID);
			_localctx.aux.add((((FieldsContext)_localctx).id1!=null?((FieldsContext)_localctx).id1.getText():null));
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(77);
				match(T__8);
				setState(78);
				((FieldsContext)_localctx).id2 = match(ID);
				if (_localctx.aux.contains((((FieldsContext)_localctx).id2!=null?((FieldsContext)_localctx).id2.getText():null))) {
				                    ErrorHandler.getErrorHandler().addError(new ErrorType(((FieldsContext)_localctx).id2.getLine(),
				                    ((FieldsContext)_localctx).id2.getCharPositionInLine()+1, (((FieldsContext)_localctx).id2!=null?((FieldsContext)_localctx).id2.getText():null)));
				                    } else {
				                        _localctx.aux.add((((FieldsContext)_localctx).id2!=null?((FieldsContext)_localctx).id2.getText():null));
				                    }
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__9);
			setState(86);
			((FieldsContext)_localctx).t = types();
			setState(87);
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
		enterRule(_localctx, 8, RULE_createFunction);
		int _la;
		try {
			int _alt;
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(T__11);
				setState(91);
				((CreateFunctionContext)_localctx).ID = match(ID);
				setState(92);
				match(T__12);
				setState(93);
				((CreateFunctionContext)_localctx).p = parametres();
				setState(94);
				match(T__13);
				setState(95);
				match(T__9);
				setState(96);
				((CreateFunctionContext)_localctx).t = simpleTypes();
				setState(97);
				match(T__1);
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						((CreateFunctionContext)_localctx).c = createVar();
						_localctx.aux.addAll(((CreateFunctionContext)_localctx).c.ast);
						}
						} 
					}
					setState(105);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(106);
					((CreateFunctionContext)_localctx).s = sentences();
					_localctx.aux2.add(((CreateFunctionContext)_localctx).s.ast);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(T__2);
				((CreateFunctionContext)_localctx).ast =  new FuncDefinition(((CreateFunctionContext)_localctx).ID.getLine(), ((CreateFunctionContext)_localctx).ID.getCharPositionInLine()+1, (((CreateFunctionContext)_localctx).ID!=null?((CreateFunctionContext)_localctx).ID.getText():null), new FunctionType(
				        ((CreateFunctionContext)_localctx).ID.getLine(), ((CreateFunctionContext)_localctx).ID.getCharPositionInLine()+1, ((CreateFunctionContext)_localctx).t.ast, ((CreateFunctionContext)_localctx).p.ast), _localctx.aux, _localctx.aux2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__11);
				setState(118);
				((CreateFunctionContext)_localctx).ID = match(ID);
				setState(119);
				match(T__12);
				setState(120);
				((CreateFunctionContext)_localctx).p = parametres();
				setState(121);
				match(T__13);
				setState(122);
				match(T__9);
				setState(123);
				match(T__1);
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124);
						((CreateFunctionContext)_localctx).c = createVar();
						_localctx.aux.addAll(((CreateFunctionContext)_localctx).c.ast);
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(132);
					((CreateFunctionContext)_localctx).s = sentences();
					_localctx.aux2.add(((CreateFunctionContext)_localctx).s.ast);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
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
		enterRule(_localctx, 10, RULE_functionMain);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((FunctionMainContext)_localctx).DEF = match(T__14);
			setState(146);
			match(T__1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					((FunctionMainContext)_localctx).c = createVar();
					_localctx.aux.addAll(((FunctionMainContext)_localctx).c.ast);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(155);
				((FunctionMainContext)_localctx).s = sentences();
				_localctx.aux2.add(((FunctionMainContext)_localctx).s.ast);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
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
		enterRule(_localctx, 12, RULE_createVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((CreateVarContext)_localctx).id1 = match(ID);
			_localctx.aux.add((((CreateVarContext)_localctx).id1!=null?((CreateVarContext)_localctx).id1.getText():null));
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(168);
				match(T__8);
				setState(169);
				((CreateVarContext)_localctx).id2 = match(ID);
				if (_localctx.aux.contains((((CreateVarContext)_localctx).id2!=null?((CreateVarContext)_localctx).id2.getText():null))) {
				            ErrorHandler.getErrorHandler().addError(new ErrorType(((CreateVarContext)_localctx).id2.getLine(),
				            ((CreateVarContext)_localctx).id2.getCharPositionInLine()+1, (((CreateVarContext)_localctx).id2!=null?((CreateVarContext)_localctx).id2.getText():null)));
				            } else {
				                _localctx.aux.add((((CreateVarContext)_localctx).id2!=null?((CreateVarContext)_localctx).id2.getText():null));
				            }
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__9);
			setState(177);
			((CreateVarContext)_localctx).t = types();
			setState(178);
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
		enterRule(_localctx, 14, RULE_parametres);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(181);
				((ParametresContext)_localctx).ID = match(ID);
				setState(182);
				match(T__9);
				setState(183);
				((ParametresContext)_localctx).t = simpleTypes();
				}
				_localctx.ast.add(new VarDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ParametresContext)_localctx).t.ast, ((ParametresContext)_localctx).ID.getText()));
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(186);
					match(T__8);
					setState(187);
					((ParametresContext)_localctx).ID = match(ID);
					setState(188);
					match(T__9);
					setState(189);
					((ParametresContext)_localctx).t = simpleTypes();
					_localctx.ast.add(new VarDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ParametresContext)_localctx).t.ast, ((ParametresContext)_localctx).ID.getText()));
					}
					}
					setState(196);
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
		public Token RET;
		public Token ID;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext first;
		public ExpressionContext right;
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
		enterRule(_localctx, 16, RULE_sentences);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((SentencesContext)_localctx).expr1 = expression(0);
				setState(200);
				match(T__15);
				setState(201);
				((SentencesContext)_localctx).expr2 = expression(0);
				setState(202);
				match(T__10);
				((SentencesContext)_localctx).ast =  new Assignment(((SentencesContext)_localctx).expr1.ast.getLine(),
				        ((SentencesContext)_localctx).expr1.ast.getColumn(), ((SentencesContext)_localctx).expr1.ast, ((SentencesContext)_localctx).expr2.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__16);
				setState(206);
				((SentencesContext)_localctx).exp = expression(0);
				_localctx.aux.add(((SentencesContext)_localctx).exp.ast);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(208);
					match(T__8);
					setState(209);
					((SentencesContext)_localctx).opt = expression(0);
					_localctx.aux.add(((SentencesContext)_localctx).opt.ast);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((SentencesContext)_localctx).ast =  new Print(((SentencesContext)_localctx).exp.ast.getLine(), ((SentencesContext)_localctx).exp.ast.getColumn(), _localctx.aux);
				setState(218);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(T__17);
				setState(221);
				((SentencesContext)_localctx).s = sentence();
				setState(222);
				match(T__10);
				((SentencesContext)_localctx).ast =  new Input(((SentencesContext)_localctx).s.ast.get(0).getLine(), ((SentencesContext)_localctx).s.ast.get(0).getColumn(),
				            ((SentencesContext)_localctx).s.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(T__18);
				setState(226);
				((SentencesContext)_localctx).expr = expression(0);
				setState(227);
				match(T__9);
				setState(228);
				((SentencesContext)_localctx).c1 = conditionBody();
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(229);
					match(T__19);
					setState(230);
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
				setState(235);
				match(T__20);
				setState(236);
				((SentencesContext)_localctx).expr = expression(0);
				setState(237);
				match(T__9);
				setState(238);
				((SentencesContext)_localctx).c = conditionBody();
				((SentencesContext)_localctx).ast =  new While(((SentencesContext)_localctx).expr.ast.getLine(),
				            ((SentencesContext)_localctx).expr.ast.getColumn(), ((SentencesContext)_localctx).expr.ast, ((SentencesContext)_localctx).c.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				((SentencesContext)_localctx).RET = match(T__21);
				setState(242);
				((SentencesContext)_localctx).expr = expression(0);
				setState(243);
				match(T__10);
				((SentencesContext)_localctx).ast =  new Return(((SentencesContext)_localctx).RET.getLine(), ((SentencesContext)_localctx).RET.getCharPositionInLine()+1,
				            ((SentencesContext)_localctx).expr.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				((SentencesContext)_localctx).ID = match(ID);
				setState(247);
				match(T__12);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(249);
					((SentencesContext)_localctx).e1 = expression(0);
					parameters.add(((SentencesContext)_localctx).e1.ast);
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(251);
						match(T__8);
						setState(252);
						((SentencesContext)_localctx).e2 = expression(0);
						parameters.add(((SentencesContext)_localctx).e2.ast);
						}
						}
						setState(259);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(262);
				match(T__13);
				setState(263);
				match(T__10);
				 ((SentencesContext)_localctx).ast =  new FunctionInvocation(((SentencesContext)_localctx).ID.getLine(), ((SentencesContext)_localctx).ID.getCharPositionInLine() + 1,
				        new Variable(((SentencesContext)_localctx).ID.getLine(), ((SentencesContext)_localctx).ID.getCharPositionInLine() + 1, (((SentencesContext)_localctx).ID!=null?((SentencesContext)_localctx).ID.getText():null)), parameters);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				match(T__3);
				setState(266);
				((SentencesContext)_localctx).first = expression(0);
				_localctx.aux.add(((SentencesContext)_localctx).first.ast);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(268);
					match(T__8);
					setState(269);
					((SentencesContext)_localctx).opt = expression(0);
					_localctx.aux.add(((SentencesContext)_localctx).opt.ast);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				match(T__4);
				setState(278);
				match(T__15);
				setState(279);
				((SentencesContext)_localctx).right = expression(0);
				setState(280);
				match(T__10);
				((SentencesContext)_localctx).ast =  new Destructuring(((SentencesContext)_localctx).first.ast.getLine(), ((SentencesContext)_localctx).first.ast.getColumn(), _localctx.aux, ((SentencesContext)_localctx).right.ast);
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
		enterRule(_localctx, 18, RULE_functionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285);
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
		enterRule(_localctx, 20, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(288);
				((ArgsContext)_localctx).e = expression(0);
				_localctx.ast.add(((ArgsContext)_localctx).e.ast);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(290);
					match(T__8);
					setState(291);
					((ArgsContext)_localctx).e1 = expression(0);
					_localctx.ast.add(((ArgsContext)_localctx).e1.ast);
					}
					}
					setState(298);
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
		enterRule(_localctx, 22, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((SentenceContext)_localctx).e = expression(0);
			_localctx.ast.add(((SentenceContext)_localctx).e.ast);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(303);
				match(T__8);
				setState(304);
				((SentenceContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((SentenceContext)_localctx).e1.ast);
				}
				}
				setState(311);
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
		enterRule(_localctx, 24, RULE_conditionBody);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
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
				setState(312);
				((ConditionBodyContext)_localctx).s = sentences();
				_localctx.ast.add(((ConditionBodyContext)_localctx).s.ast);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(T__1);
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(316);
					((ConditionBodyContext)_localctx).s = sentences();
					_localctx.ast.add(((ConditionBodyContext)_localctx).s.ast);
					}
					}
					setState(321); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(323);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(328);
				match(T__12);
				setState(329);
				((ExpressionContext)_localctx).op1 = expression(0);
				setState(330);
				match(T__13);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).op1.ast;
				}
				break;
			case 2:
				{
				setState(333);
				match(T__12);
				setState(334);
				((ExpressionContext)_localctx).t = simpleTypes();
				setState(335);
				match(T__13);
				setState(336);
				((ExpressionContext)_localctx).expr = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t.ast.getLine(), ((ExpressionContext)_localctx).t.ast.getColumn(), ((ExpressionContext)_localctx).t.ast,
				            ((ExpressionContext)_localctx).expr.ast);
				}
				break;
			case 3:
				{
				setState(339);
				match(T__23);
				setState(340);
				((ExpressionContext)_localctx).op1 = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast);
				}
				break;
			case 4:
				{
				setState(343);
				match(T__24);
				setState(344);
				((ExpressionContext)_localctx).op1 = expression(10);
				((ExpressionContext)_localctx).ast =  new Not(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast);
				}
				break;
			case 5:
				{
				setState(347);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(348);
				match(T__12);
				setState(349);
				((ExpressionContext)_localctx).fi = functionInvocation();
				setState(350);
				match(T__13);
				((ExpressionContext)_localctx).ast =  new FunctionInvocation((((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getLine(),
				                  (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getCharPositionInLine()+1, new Variable(
				                  (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getLine(), (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)), ((ExpressionContext)_localctx).fi.ast);
				}
				break;
			case 6:
				{
				setState(353);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                        ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 7:
				{
				setState(355);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                        ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(357);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                        ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(359);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(393);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(364);
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
						setState(365);
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
						setState(368);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(369);
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
						setState(370);
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
						setState(373);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(374);
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
						setState(375);
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
						setState(378);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(379);
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
						setState(380);
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
						setState(383);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(384);
						match(T__3);
						setState(385);
						((ExpressionContext)_localctx).op2 = expression(0);
						setState(386);
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
						setState(389);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(390);
						match(T__22);
						setState(391);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).op1.ast.getLine(),
						                      ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0191\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\7\2%\n"+
		"\2\f\2\16\2(\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\6\3\67\n\3\r\3\16\38\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3D\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\3\5\7\5S\n\5\f\5\16\5V\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"h\n\6\f\6\16\6k\13\6\3\6\3\6\3\6\7\6p\n\6\f\6\16\6s\13\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0082\n\6\f\6\16\6\u0085\13"+
		"\6\3\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\6\3\6\3\6\5\6\u0092"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u0099\n\7\f\7\16\7\u009c\13\7\3\7\3\7\3\7"+
		"\7\7\u00a1\n\7\f\7\16\7\u00a4\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00ae\n\b\f\b\16\b\u00b1\13\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c3\n\t\f\t\16\t\u00c6\13\t\5\t\u00c8\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d7\n\n\f"+
		"\n\16\n\u00da\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00ea\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0102\n\n\f\n\16\n\u0105\13\n"+
		"\5\n\u0107\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0113\n\n\f"+
		"\n\16\n\u0116\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u011e\n\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0129\n\f\f\f\16\f\u012c\13\f\5\f\u012e\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0136\n\r\f\r\16\r\u0139\13\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\6\16\u0142\n\16\r\16\16\16\u0143\3\16\3\16\5"+
		"\16\u0148\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u016c\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u018c\n\17\f\17\16\17\u018f\13\17\3\17\2\3\34\20\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\2\6\3\2\34\36\4\2\32\32\37\37\3\2 %\3\2&\'\2\u01b3"+
		"\2&\3\2\2\2\4C\3\2\2\2\6K\3\2\2\2\bM\3\2\2\2\n\u0091\3\2\2\2\f\u0093\3"+
		"\2\2\2\16\u00a8\3\2\2\2\20\u00c7\3\2\2\2\22\u011d\3\2\2\2\24\u011f\3\2"+
		"\2\2\26\u012d\3\2\2\2\30\u012f\3\2\2\2\32\u0147\3\2\2\2\34\u016b\3\2\2"+
		"\2\36\37\5\16\b\2\37 \b\2\1\2 %\3\2\2\2!\"\5\n\6\2\"#\b\2\1\2#%\3\2\2"+
		"\2$\36\3\2\2\2$!\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3"+
		"\2\2\2)*\5\f\7\2*+\b\2\1\2+,\7\2\2\3,-\b\2\1\2-\3\3\2\2\2./\5\6\4\2/\60"+
		"\b\3\1\2\60D\3\2\2\2\61\62\7\3\2\2\62\66\7\4\2\2\63\64\5\b\5\2\64\65\b"+
		"\3\1\2\65\67\3\2\2\2\66\63\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29"+
		":\3\2\2\2:;\7\5\2\2;<\b\3\1\2<D\3\2\2\2=>\7\6\2\2>?\7(\2\2?@\7\7\2\2@"+
		"A\5\4\3\2AB\b\3\1\2BD\3\2\2\2C.\3\2\2\2C\61\3\2\2\2C=\3\2\2\2D\5\3\2\2"+
		"\2EF\7\b\2\2FL\b\4\1\2GH\7\t\2\2HL\b\4\1\2IJ\7\n\2\2JL\b\4\1\2KE\3\2\2"+
		"\2KG\3\2\2\2KI\3\2\2\2L\7\3\2\2\2MN\7)\2\2NT\b\5\1\2OP\7\13\2\2PQ\7)\2"+
		"\2QS\b\5\1\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2"+
		"\2WX\7\f\2\2XY\5\4\3\2YZ\7\r\2\2Z[\b\5\1\2[\t\3\2\2\2\\]\7\16\2\2]^\7"+
		")\2\2^_\7\17\2\2_`\5\20\t\2`a\7\20\2\2ab\7\f\2\2bc\5\6\4\2ci\7\4\2\2d"+
		"e\5\16\b\2ef\b\6\1\2fh\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"jq\3\2\2\2ki\3\2\2\2lm\5\22\n\2mn\b\6\1\2np\3\2\2\2ol\3\2\2\2ps\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\5\2\2uv\b\6\1\2v\u0092"+
		"\3\2\2\2wx\7\16\2\2xy\7)\2\2yz\7\17\2\2z{\5\20\t\2{|\7\20\2\2|}\7\f\2"+
		"\2}\u0083\7\4\2\2~\177\5\16\b\2\177\u0080\b\6\1\2\u0080\u0082\3\2\2\2"+
		"\u0081~\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u008b\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\22\n\2\u0087"+
		"\u0088\b\6\1\2\u0088\u008a\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\7\5\2\2\u008f\u0090\b\6\1\2\u0090\u0092\3\2"+
		"\2\2\u0091\\\3\2\2\2\u0091w\3\2\2\2\u0092\13\3\2\2\2\u0093\u0094\7\21"+
		"\2\2\u0094\u009a\7\4\2\2\u0095\u0096\5\16\b\2\u0096\u0097\b\7\1\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u00a2\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\5\22\n\2\u009e\u009f\b\7\1\2\u009f\u00a1\3\2\2\2\u00a0\u009d\3"+
		"\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\b\7"+
		"\1\2\u00a7\r\3\2\2\2\u00a8\u00a9\7)\2\2\u00a9\u00af\b\b\1\2\u00aa\u00ab"+
		"\7\13\2\2\u00ab\u00ac\7)\2\2\u00ac\u00ae\b\b\1\2\u00ad\u00aa\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\f\2\2\u00b3\u00b4\5\4\3\2\u00b4"+
		"\u00b5\7\r\2\2\u00b5\u00b6\b\b\1\2\u00b6\17\3\2\2\2\u00b7\u00b8\7)\2\2"+
		"\u00b8\u00b9\7\f\2\2\u00b9\u00ba\5\6\4\2\u00ba\u00bb\3\2\2\2\u00bb\u00c4"+
		"\b\t\1\2\u00bc\u00bd\7\13\2\2\u00bd\u00be\7)\2\2\u00be\u00bf\7\f\2\2\u00bf"+
		"\u00c0\5\6\4\2\u00c0\u00c1\b\t\1\2\u00c1\u00c3\3\2\2\2\u00c2\u00bc\3\2"+
		"\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00b7\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\21\3\2\2\2\u00c9\u00ca\5\34\17\2\u00ca\u00cb\7\22\2\2\u00cb"+
		"\u00cc\5\34\17\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\b\n\1\2\u00ce\u011e\3"+
		"\2\2\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d8\b\n\1\2"+
		"\u00d2\u00d3\7\13\2\2\u00d3\u00d4\5\34\17\2\u00d4\u00d5\b\n\1\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\b\n\1\2\u00dc\u00dd\7\r\2\2\u00dd\u011e\3\2\2\2\u00de\u00df\7\24"+
		"\2\2\u00df\u00e0\5\30\r\2\u00e0\u00e1\7\r\2\2\u00e1\u00e2\b\n\1\2\u00e2"+
		"\u011e\3\2\2\2\u00e3\u00e4\7\25\2\2\u00e4\u00e5\5\34\17\2\u00e5\u00e6"+
		"\7\f\2\2\u00e6\u00e9\5\32\16\2\u00e7\u00e8\7\26\2\2\u00e8\u00ea\5\32\16"+
		"\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec"+
		"\b\n\1\2\u00ec\u011e\3\2\2\2\u00ed\u00ee\7\27\2\2\u00ee\u00ef\5\34\17"+
		"\2\u00ef\u00f0\7\f\2\2\u00f0\u00f1\5\32\16\2\u00f1\u00f2\b\n\1\2\u00f2"+
		"\u011e\3\2\2\2\u00f3\u00f4\7\30\2\2\u00f4\u00f5\5\34\17\2\u00f5\u00f6"+
		"\7\r\2\2\u00f6\u00f7\b\n\1\2\u00f7\u011e\3\2\2\2\u00f8\u00f9\7)\2\2\u00f9"+
		"\u00fa\7\17\2\2\u00fa\u0106\b\n\1\2\u00fb\u00fc\5\34\17\2\u00fc\u0103"+
		"\b\n\1\2\u00fd\u00fe\7\13\2\2\u00fe\u00ff\5\34\17\2\u00ff\u0100\b\n\1"+
		"\2\u0100\u0102\3\2\2\2\u0101\u00fd\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u00fb\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7\20"+
		"\2\2\u0109\u010a\7\r\2\2\u010a\u011e\b\n\1\2\u010b\u010c\7\6\2\2\u010c"+
		"\u010d\5\34\17\2\u010d\u0114\b\n\1\2\u010e\u010f\7\13\2\2\u010f\u0110"+
		"\5\34\17\2\u0110\u0111\b\n\1\2\u0111\u0113\3\2\2\2\u0112\u010e\3\2\2\2"+
		"\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\7\2\2\u0118\u0119\7\22\2\2"+
		"\u0119\u011a\5\34\17\2\u011a\u011b\7\r\2\2\u011b\u011c\b\n\1\2\u011c\u011e"+
		"\3\2\2\2\u011d\u00c9\3\2\2\2\u011d\u00cf\3\2\2\2\u011d\u00de\3\2\2\2\u011d"+
		"\u00e3\3\2\2\2\u011d\u00ed\3\2\2\2\u011d\u00f3\3\2\2\2\u011d\u00f8\3\2"+
		"\2\2\u011d\u010b\3\2\2\2\u011e\23\3\2\2\2\u011f\u0120\5\26\f\2\u0120\u0121"+
		"\b\13\1\2\u0121\25\3\2\2\2\u0122\u0123\5\34\17\2\u0123\u012a\b\f\1\2\u0124"+
		"\u0125\7\13\2\2\u0125\u0126\5\34\17\2\u0126\u0127\b\f\1\2\u0127\u0129"+
		"\3\2\2\2\u0128\u0124\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0122\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\27\3\2\2\2\u012f\u0130\5\34\17\2\u0130"+
		"\u0137\b\r\1\2\u0131\u0132\7\13\2\2\u0132\u0133\5\34\17\2\u0133\u0134"+
		"\b\r\1\2\u0134\u0136\3\2\2\2\u0135\u0131\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\31\3\2\2\2\u0139\u0137\3\2\2"+
		"\2\u013a\u013b\5\22\n\2\u013b\u013c\b\16\1\2\u013c\u0148\3\2\2\2\u013d"+
		"\u0141\7\4\2\2\u013e\u013f\5\22\n\2\u013f\u0140\b\16\1\2\u0140\u0142\3"+
		"\2\2\2\u0141\u013e\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\7\5\2\2\u0146\u0148\3\2"+
		"\2\2\u0147\u013a\3\2\2\2\u0147\u013d\3\2\2\2\u0148\33\3\2\2\2\u0149\u014a"+
		"\b\17\1\2\u014a\u014b\7\17\2\2\u014b\u014c\5\34\17\2\u014c\u014d\7\20"+
		"\2\2\u014d\u014e\b\17\1\2\u014e\u016c\3\2\2\2\u014f\u0150\7\17\2\2\u0150"+
		"\u0151\5\6\4\2\u0151\u0152\7\20\2\2\u0152\u0153\5\34\17\16\u0153\u0154"+
		"\b\17\1\2\u0154\u016c\3\2\2\2\u0155\u0156\7\32\2\2\u0156\u0157\5\34\17"+
		"\r\u0157\u0158\b\17\1\2\u0158\u016c\3\2\2\2\u0159\u015a\7\33\2\2\u015a"+
		"\u015b\5\34\17\f\u015b\u015c\b\17\1\2\u015c\u016c\3\2\2\2\u015d\u015e"+
		"\7)\2\2\u015e\u015f\7\17\2\2\u015f\u0160\5\24\13\2\u0160\u0161\7\20\2"+
		"\2\u0161\u0162\b\17\1\2\u0162\u016c\3\2\2\2\u0163\u0164\7(\2\2\u0164\u016c"+
		"\b\17\1\2\u0165\u0166\7*\2\2\u0166\u016c\b\17\1\2\u0167\u0168\7-\2\2\u0168"+
		"\u016c\b\17\1\2\u0169\u016a\7)\2\2\u016a\u016c\b\17\1\2\u016b\u0149\3"+
		"\2\2\2\u016b\u014f\3\2\2\2\u016b\u0155\3\2\2\2\u016b\u0159\3\2\2\2\u016b"+
		"\u015d\3\2\2\2\u016b\u0163\3\2\2\2\u016b\u0165\3\2\2\2\u016b\u0167\3\2"+
		"\2\2\u016b\u0169\3\2\2\2\u016c\u018d\3\2\2\2\u016d\u016e\f\13\2\2\u016e"+
		"\u016f\t\2\2\2\u016f\u0170\5\34\17\f\u0170\u0171\b\17\1\2\u0171\u018c"+
		"\3\2\2\2\u0172\u0173\f\n\2\2\u0173\u0174\t\3\2\2\u0174\u0175\5\34\17\13"+
		"\u0175\u0176\b\17\1\2\u0176\u018c\3\2\2\2\u0177\u0178\f\t\2\2\u0178\u0179"+
		"\t\4\2\2\u0179\u017a\5\34\17\n\u017a\u017b\b\17\1\2\u017b\u018c\3\2\2"+
		"\2\u017c\u017d\f\b\2\2\u017d\u017e\t\5\2\2\u017e\u017f\5\34\17\t\u017f"+
		"\u0180\b\17\1\2\u0180\u018c\3\2\2\2\u0181\u0182\f\20\2\2\u0182\u0183\7"+
		"\6\2\2\u0183\u0184\5\34\17\2\u0184\u0185\7\7\2\2\u0185\u0186\b\17\1\2"+
		"\u0186\u018c\3\2\2\2\u0187\u0188\f\17\2\2\u0188\u0189\7\31\2\2\u0189\u018a"+
		"\7)\2\2\u018a\u018c\b\17\1\2\u018b\u016d\3\2\2\2\u018b\u0172\3\2\2\2\u018b"+
		"\u0177\3\2\2\2\u018b\u017c\3\2\2\2\u018b\u0181\3\2\2\2\u018b\u0187\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\35\3\2\2\2\u018f\u018d\3\2\2\2 $&8CKTiq\u0083\u008b\u0091\u009a\u00a2"+
		"\u00af\u00c4\u00c7\u00d8\u00e9\u0103\u0106\u0114\u011d\u012a\u012d\u0137"+
		"\u0143\u0147\u016b\u018b\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}