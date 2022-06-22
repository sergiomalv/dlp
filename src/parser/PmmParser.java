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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INT_CONSTANT=39, BOOLEAN_CONSTANT=40, ID=41, REAL_CONSTANT=42, COMMENT_MULTI_LINE=43, 
		COMMENT_ONE_LINE=44, CHAR_CONSTANT=45, TRASH=46;
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
			"'boolean'", "','", "':'", "';'", "'def'", "'('", "')'", "'def main():'", 
			"'='", "'print'", "'input'", "'if'", "'else'", "'while'", "'return'", 
			"'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", 
			"'<='", "'!='", "'=='", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT_CONSTANT", "BOOLEAN_CONSTANT", "ID", "REAL_CONSTANT", 
			"COMMENT_MULTI_LINE", "COMMENT_ONE_LINE", "CHAR_CONSTANT", "TRASH"
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
			while (_la==T__12 || _la==ID) {
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
				case T__12:
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
			case T__8:
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
			setState(75);
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
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(T__8);
				((SimpleTypesContext)_localctx).ast =  BooleanType.getBooleanType();
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
			while (_la==T__9) {
				{
				{
				setState(79);
				match(T__9);
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
			match(T__10);
			setState(88);
			((FieldsContext)_localctx).t = types();
			setState(89);
			match(T__11);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__12);
				setState(93);
				((CreateFunctionContext)_localctx).ID = match(ID);
				setState(94);
				match(T__13);
				setState(95);
				((CreateFunctionContext)_localctx).p = parametres();
				setState(96);
				match(T__14);
				setState(97);
				match(T__10);
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << INT_CONSTANT) | (1L << BOOLEAN_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
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
				match(T__12);
				setState(120);
				((CreateFunctionContext)_localctx).ID = match(ID);
				setState(121);
				match(T__13);
				setState(122);
				((CreateFunctionContext)_localctx).p = parametres();
				setState(123);
				match(T__14);
				setState(124);
				match(T__10);
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << INT_CONSTANT) | (1L << BOOLEAN_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
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
			setState(147);
			((FunctionMainContext)_localctx).DEF = match(T__15);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << INT_CONSTANT) | (1L << BOOLEAN_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
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
			setState(168);
			((CreateVarContext)_localctx).id1 = match(ID);
			_localctx.aux.add((((CreateVarContext)_localctx).id1!=null?((CreateVarContext)_localctx).id1.getText():null));
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(170);
				match(T__9);
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
			match(T__10);
			setState(179);
			((CreateVarContext)_localctx).t = types();
			setState(180);
			match(T__11);
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
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(183);
				((ParametresContext)_localctx).ID = match(ID);
				setState(184);
				match(T__10);
				setState(185);
				((ParametresContext)_localctx).t = simpleTypes();
				}
				_localctx.ast.add(new VarDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ParametresContext)_localctx).t.ast, ((ParametresContext)_localctx).ID.getText()));
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(188);
					match(T__9);
					setState(189);
					((ParametresContext)_localctx).ID = match(ID);
					setState(190);
					match(T__10);
					setState(191);
					((ParametresContext)_localctx).t = simpleTypes();
					_localctx.ast.add(new VarDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((ParametresContext)_localctx).t.ast, ((ParametresContext)_localctx).ID.getText()));
					}
					}
					setState(198);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((SentencesContext)_localctx).expr1 = expression(0);
				setState(202);
				match(T__16);
				setState(203);
				((SentencesContext)_localctx).expr2 = expression(0);
				setState(204);
				match(T__11);
				((SentencesContext)_localctx).ast =  new Assignment(((SentencesContext)_localctx).expr1.ast.getLine(),
				        ((SentencesContext)_localctx).expr1.ast.getColumn(), ((SentencesContext)_localctx).expr1.ast, ((SentencesContext)_localctx).expr2.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(T__17);
				setState(208);
				((SentencesContext)_localctx).exp = expression(0);
				_localctx.aux.add(((SentencesContext)_localctx).exp.ast);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(210);
					match(T__9);
					setState(211);
					((SentencesContext)_localctx).opt = expression(0);
					_localctx.aux.add(((SentencesContext)_localctx).opt.ast);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((SentencesContext)_localctx).ast =  new Print(((SentencesContext)_localctx).exp.ast.getLine(), ((SentencesContext)_localctx).exp.ast.getColumn(), _localctx.aux);
				setState(220);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(T__18);
				setState(223);
				((SentencesContext)_localctx).s = sentence();
				setState(224);
				match(T__11);
				((SentencesContext)_localctx).ast =  new Input(((SentencesContext)_localctx).s.ast.get(0).getLine(), ((SentencesContext)_localctx).s.ast.get(0).getColumn(),
				            ((SentencesContext)_localctx).s.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(T__19);
				setState(228);
				((SentencesContext)_localctx).expr = expression(0);
				setState(229);
				match(T__10);
				setState(230);
				((SentencesContext)_localctx).c1 = conditionBody();
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(231);
					match(T__20);
					setState(232);
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
				setState(237);
				match(T__21);
				setState(238);
				((SentencesContext)_localctx).expr = expression(0);
				setState(239);
				match(T__10);
				setState(240);
				((SentencesContext)_localctx).c = conditionBody();
				((SentencesContext)_localctx).ast =  new While(((SentencesContext)_localctx).expr.ast.getLine(),
				            ((SentencesContext)_localctx).expr.ast.getColumn(), ((SentencesContext)_localctx).expr.ast, ((SentencesContext)_localctx).c.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				((SentencesContext)_localctx).RET = match(T__22);
				setState(244);
				((SentencesContext)_localctx).expr = expression(0);
				setState(245);
				match(T__11);
				((SentencesContext)_localctx).ast =  new Return(((SentencesContext)_localctx).RET.getLine(), ((SentencesContext)_localctx).RET.getCharPositionInLine()+1,
				            ((SentencesContext)_localctx).expr.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				((SentencesContext)_localctx).ID = match(ID);
				setState(249);
				match(T__13);
				List<Expression> parameters = new ArrayList<Expression>();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__25) | (1L << INT_CONSTANT) | (1L << BOOLEAN_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(251);
					((SentencesContext)_localctx).e1 = expression(0);
					parameters.add(((SentencesContext)_localctx).e1.ast);
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(253);
						match(T__9);
						setState(254);
						((SentencesContext)_localctx).e2 = expression(0);
						parameters.add(((SentencesContext)_localctx).e2.ast);
						}
						}
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(264);
				match(T__14);
				setState(265);
				match(T__11);
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
		enterRule(_localctx, 18, RULE_functionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
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
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__25) | (1L << INT_CONSTANT) | (1L << BOOLEAN_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(272);
				((ArgsContext)_localctx).e = expression(0);
				_localctx.ast.add(((ArgsContext)_localctx).e.ast);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(274);
					match(T__9);
					setState(275);
					((ArgsContext)_localctx).e1 = expression(0);
					_localctx.ast.add(((ArgsContext)_localctx).e1.ast);
					}
					}
					setState(282);
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
			setState(285);
			((SentenceContext)_localctx).e = expression(0);
			_localctx.ast.add(((SentenceContext)_localctx).e.ast);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(287);
				match(T__9);
				setState(288);
				((SentenceContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((SentenceContext)_localctx).e1.ast);
				}
				}
				setState(295);
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
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__24:
			case T__25:
			case INT_CONSTANT:
			case BOOLEAN_CONSTANT:
			case ID:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				((ConditionBodyContext)_localctx).s = sentences();
				_localctx.ast.add(((ConditionBodyContext)_localctx).s.ast);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(T__1);
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					((ConditionBodyContext)_localctx).s = sentences();
					_localctx.ast.add(((ConditionBodyContext)_localctx).s.ast);
					}
					}
					setState(305); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << INT_CONSTANT) | (1L << BOOLEAN_CONSTANT) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(307);
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
		public Token BOOLEAN_CONSTANT;
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
		public TerminalNode BOOLEAN_CONSTANT() { return getToken(PmmParser.BOOLEAN_CONSTANT, 0); }
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
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(312);
				match(T__13);
				setState(313);
				((ExpressionContext)_localctx).op1 = expression(0);
				setState(314);
				match(T__14);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).op1.ast;
				}
				break;
			case 2:
				{
				setState(317);
				match(T__13);
				setState(318);
				((ExpressionContext)_localctx).t = simpleTypes();
				setState(319);
				match(T__14);
				setState(320);
				((ExpressionContext)_localctx).expr = expression(13);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t.ast.getLine(), ((ExpressionContext)_localctx).t.ast.getColumn(), ((ExpressionContext)_localctx).t.ast,
				            ((ExpressionContext)_localctx).expr.ast);
				}
				break;
			case 3:
				{
				setState(323);
				match(T__24);
				setState(324);
				((ExpressionContext)_localctx).op1 = expression(12);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast);
				}
				break;
			case 4:
				{
				setState(327);
				match(T__25);
				setState(328);
				((ExpressionContext)_localctx).op1 = expression(11);
				((ExpressionContext)_localctx).ast =  new Not(((ExpressionContext)_localctx).op1.ast.getLine(), ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast);
				}
				break;
			case 5:
				{
				setState(331);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(332);
				match(T__13);
				setState(333);
				((ExpressionContext)_localctx).fi = functionInvocation();
				setState(334);
				match(T__14);
				((ExpressionContext)_localctx).ast =  new FunctionInvocation((((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getLine(),
				                  (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getCharPositionInLine()+1, new Variable(
				                  (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getLine(), (((ExpressionContext)_localctx).fi!=null?(((ExpressionContext)_localctx).fi.start):null).getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)), ((ExpressionContext)_localctx).fi.ast);
				}
				break;
			case 6:
				{
				setState(337);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                        ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 7:
				{
				setState(339);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                        ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(341);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                        ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(343);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 10:
				{
				setState(345);
				((ExpressionContext)_localctx).BOOLEAN_CONSTANT = match(BOOLEAN_CONSTANT);
				((ExpressionContext)_localctx).ast =  new BooleanLiteral(((ExpressionContext)_localctx).BOOLEAN_CONSTANT.getLine(),
				            ((ExpressionContext)_localctx).BOOLEAN_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToBool((((ExpressionContext)_localctx).BOOLEAN_CONSTANT!=null?((ExpressionContext)_localctx).BOOLEAN_CONSTANT.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(379);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(350);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(351);
						((ExpressionContext)_localctx).op2 = expression(11);
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
						setState(354);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(355);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__29) ) {
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
					case 3:
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
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(361);
						((ExpressionContext)_localctx).op2 = expression(9);
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
						setState(364);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(365);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__37) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(366);
						((ExpressionContext)_localctx).op2 = expression(8);
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
						setState(369);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(370);
						match(T__3);
						setState(371);
						((ExpressionContext)_localctx).op2 = expression(0);
						setState(372);
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
						setState(375);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(376);
						match(T__23);
						setState(377);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).op1.ast.getLine(),
						                      ((ExpressionContext)_localctx).op1.ast.getColumn(), ((ExpressionContext)_localctx).op1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(383);
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
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0183\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"%\n\2\f\2\16\2(\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\6\3\67\n\3\r\3\16\38\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3D\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\5\3\5\7\5U\n\5\f"+
		"\5\16\5X\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0084\n\6\f\6\16"+
		"\6\u0087\13\6\3\6\3\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3\6\3\6\3"+
		"\6\5\6\u0094\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u009b\n\7\f\7\16\7\u009e\13\7"+
		"\3\7\3\7\3\7\7\7\u00a3\n\7\f\7\16\7\u00a6\13\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u00b0\n\b\f\b\16\b\u00b3\13\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c5\n\t\f\t\16\t\u00c8\13\t"+
		"\5\t\u00ca\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00d9\n\n\f\n\16\n\u00dc\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u00ec\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0104\n\n\f\n\16"+
		"\n\u0107\13\n\5\n\u0109\n\n\3\n\3\n\3\n\5\n\u010e\n\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u0119\n\f\f\f\16\f\u011c\13\f\5\f\u011e\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0126\n\r\f\r\16\r\u0129\13\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\6\16\u0132\n\16\r\16\16\16\u0133\3\16\3\16\5\16"+
		"\u0138\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u015e\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u017e\n\17\f\17\16\17\u0181\13\17\3\17\2\3\34\20\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\2\6\3\2\35\37\4\2\33\33  \3\2!&\3\2\'(\2\u01a5"+
		"\2&\3\2\2\2\4C\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\n\u0093\3\2\2\2\f\u0095\3"+
		"\2\2\2\16\u00aa\3\2\2\2\20\u00c9\3\2\2\2\22\u010d\3\2\2\2\24\u010f\3\2"+
		"\2\2\26\u011d\3\2\2\2\30\u011f\3\2\2\2\32\u0137\3\2\2\2\34\u015d\3\2\2"+
		"\2\36\37\5\16\b\2\37 \b\2\1\2 %\3\2\2\2!\"\5\n\6\2\"#\b\2\1\2#%\3\2\2"+
		"\2$\36\3\2\2\2$!\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3"+
		"\2\2\2)*\5\f\7\2*+\b\2\1\2+,\7\2\2\3,-\b\2\1\2-\3\3\2\2\2./\5\6\4\2/\60"+
		"\b\3\1\2\60D\3\2\2\2\61\62\7\3\2\2\62\66\7\4\2\2\63\64\5\b\5\2\64\65\b"+
		"\3\1\2\65\67\3\2\2\2\66\63\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29"+
		":\3\2\2\2:;\7\5\2\2;<\b\3\1\2<D\3\2\2\2=>\7\6\2\2>?\7)\2\2?@\7\7\2\2@"+
		"A\5\4\3\2AB\b\3\1\2BD\3\2\2\2C.\3\2\2\2C\61\3\2\2\2C=\3\2\2\2D\5\3\2\2"+
		"\2EF\7\b\2\2FN\b\4\1\2GH\7\t\2\2HN\b\4\1\2IJ\7\n\2\2JN\b\4\1\2KL\7\13"+
		"\2\2LN\b\4\1\2ME\3\2\2\2MG\3\2\2\2MI\3\2\2\2MK\3\2\2\2N\7\3\2\2\2OP\7"+
		"+\2\2PV\b\5\1\2QR\7\f\2\2RS\7+\2\2SU\b\5\1\2TQ\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\r\2\2Z[\5\4\3\2[\\\7\16\2\2\\]"+
		"\b\5\1\2]\t\3\2\2\2^_\7\17\2\2_`\7+\2\2`a\7\20\2\2ab\5\20\t\2bc\7\21\2"+
		"\2cd\7\r\2\2de\5\6\4\2ek\7\4\2\2fg\5\16\b\2gh\b\6\1\2hj\3\2\2\2if\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ls\3\2\2\2mk\3\2\2\2no\5\22\n\2op\b"+
		"\6\1\2pr\3\2\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3"+
		"\2\2\2vw\7\5\2\2wx\b\6\1\2x\u0094\3\2\2\2yz\7\17\2\2z{\7+\2\2{|\7\20\2"+
		"\2|}\5\20\t\2}~\7\21\2\2~\177\7\r\2\2\177\u0085\7\4\2\2\u0080\u0081\5"+
		"\16\b\2\u0081\u0082\b\6\1\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008d\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\5\22\n\2\u0089\u008a\b\6\1\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\5\2\2\u0091\u0092\b\6\1\2\u0092\u0094\3\2\2\2\u0093^\3\2\2\2"+
		"\u0093y\3\2\2\2\u0094\13\3\2\2\2\u0095\u0096\7\22\2\2\u0096\u009c\7\4"+
		"\2\2\u0097\u0098\5\16\b\2\u0098\u0099\b\7\1\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u00a4\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\22\n\2\u00a0"+
		"\u00a1\b\7\1\2\u00a1\u00a3\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\b\7\1\2\u00a9\r\3\2\2\2"+
		"\u00aa\u00ab\7+\2\2\u00ab\u00b1\b\b\1\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae"+
		"\7+\2\2\u00ae\u00b0\b\b\1\2\u00af\u00ac\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b5\7\r\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7\7\16\2\2\u00b7"+
		"\u00b8\b\b\1\2\u00b8\17\3\2\2\2\u00b9\u00ba\7+\2\2\u00ba\u00bb\7\r\2\2"+
		"\u00bb\u00bc\5\6\4\2\u00bc\u00bd\3\2\2\2\u00bd\u00c6\b\t\1\2\u00be\u00bf"+
		"\7\f\2\2\u00bf\u00c0\7+\2\2\u00c0\u00c1\7\r\2\2\u00c1\u00c2\5\6\4\2\u00c2"+
		"\u00c3\b\t\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00b9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\21\3\2\2"+
		"\2\u00cb\u00cc\5\34\17\2\u00cc\u00cd\7\23\2\2\u00cd\u00ce\5\34\17\2\u00ce"+
		"\u00cf\7\16\2\2\u00cf\u00d0\b\n\1\2\u00d0\u010e\3\2\2\2\u00d1\u00d2\7"+
		"\24\2\2\u00d2\u00d3\5\34\17\2\u00d3\u00da\b\n\1\2\u00d4\u00d5\7\f\2\2"+
		"\u00d5\u00d6\5\34\17\2\u00d6\u00d7\b\n\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00d4"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\b\n\1\2\u00de\u00df\7\16"+
		"\2\2\u00df\u010e\3\2\2\2\u00e0\u00e1\7\25\2\2\u00e1\u00e2\5\30\r\2\u00e2"+
		"\u00e3\7\16\2\2\u00e3\u00e4\b\n\1\2\u00e4\u010e\3\2\2\2\u00e5\u00e6\7"+
		"\26\2\2\u00e6\u00e7\5\34\17\2\u00e7\u00e8\7\r\2\2\u00e8\u00eb\5\32\16"+
		"\2\u00e9\u00ea\7\27\2\2\u00ea\u00ec\5\32\16\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\n\1\2\u00ee\u010e\3\2"+
		"\2\2\u00ef\u00f0\7\30\2\2\u00f0\u00f1\5\34\17\2\u00f1\u00f2\7\r\2\2\u00f2"+
		"\u00f3\5\32\16\2\u00f3\u00f4\b\n\1\2\u00f4\u010e\3\2\2\2\u00f5\u00f6\7"+
		"\31\2\2\u00f6\u00f7\5\34\17\2\u00f7\u00f8\7\16\2\2\u00f8\u00f9\b\n\1\2"+
		"\u00f9\u010e\3\2\2\2\u00fa\u00fb\7+\2\2\u00fb\u00fc\7\20\2\2\u00fc\u0108"+
		"\b\n\1\2\u00fd\u00fe\5\34\17\2\u00fe\u0105\b\n\1\2\u00ff\u0100\7\f\2\2"+
		"\u0100\u0101\5\34\17\2\u0101\u0102\b\n\1\2\u0102\u0104\3\2\2\2\u0103\u00ff"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u00fd\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\21\2\2\u010b\u010c\7\16\2\2\u010c"+
		"\u010e\b\n\1\2\u010d\u00cb\3\2\2\2\u010d\u00d1\3\2\2\2\u010d\u00e0\3\2"+
		"\2\2\u010d\u00e5\3\2\2\2\u010d\u00ef\3\2\2\2\u010d\u00f5\3\2\2\2\u010d"+
		"\u00fa\3\2\2\2\u010e\23\3\2\2\2\u010f\u0110\5\26\f\2\u0110\u0111\b\13"+
		"\1\2\u0111\25\3\2\2\2\u0112\u0113\5\34\17\2\u0113\u011a\b\f\1\2\u0114"+
		"\u0115\7\f\2\2\u0115\u0116\5\34\17\2\u0116\u0117\b\f\1\2\u0117\u0119\3"+
		"\2\2\2\u0118\u0114\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0112\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\27\3\2\2\2\u011f\u0120\5\34\17\2\u0120"+
		"\u0127\b\r\1\2\u0121\u0122\7\f\2\2\u0122\u0123\5\34\17\2\u0123\u0124\b"+
		"\r\1\2\u0124\u0126\3\2\2\2\u0125\u0121\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\31\3\2\2\2\u0129\u0127\3\2\2"+
		"\2\u012a\u012b\5\22\n\2\u012b\u012c\b\16\1\2\u012c\u0138\3\2\2\2\u012d"+
		"\u0131\7\4\2\2\u012e\u012f\5\22\n\2\u012f\u0130\b\16\1\2\u0130\u0132\3"+
		"\2\2\2\u0131\u012e\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7\5\2\2\u0136\u0138\3\2"+
		"\2\2\u0137\u012a\3\2\2\2\u0137\u012d\3\2\2\2\u0138\33\3\2\2\2\u0139\u013a"+
		"\b\17\1\2\u013a\u013b\7\20\2\2\u013b\u013c\5\34\17\2\u013c\u013d\7\21"+
		"\2\2\u013d\u013e\b\17\1\2\u013e\u015e\3\2\2\2\u013f\u0140\7\20\2\2\u0140"+
		"\u0141\5\6\4\2\u0141\u0142\7\21\2\2\u0142\u0143\5\34\17\17\u0143\u0144"+
		"\b\17\1\2\u0144\u015e\3\2\2\2\u0145\u0146\7\33\2\2\u0146\u0147\5\34\17"+
		"\16\u0147\u0148\b\17\1\2\u0148\u015e\3\2\2\2\u0149\u014a\7\34\2\2\u014a"+
		"\u014b\5\34\17\r\u014b\u014c\b\17\1\2\u014c\u015e\3\2\2\2\u014d\u014e"+
		"\7+\2\2\u014e\u014f\7\20\2\2\u014f\u0150\5\24\13\2\u0150\u0151\7\21\2"+
		"\2\u0151\u0152\b\17\1\2\u0152\u015e\3\2\2\2\u0153\u0154\7)\2\2\u0154\u015e"+
		"\b\17\1\2\u0155\u0156\7,\2\2\u0156\u015e\b\17\1\2\u0157\u0158\7/\2\2\u0158"+
		"\u015e\b\17\1\2\u0159\u015a\7+\2\2\u015a\u015e\b\17\1\2\u015b\u015c\7"+
		"*\2\2\u015c\u015e\b\17\1\2\u015d\u0139\3\2\2\2\u015d\u013f\3\2\2\2\u015d"+
		"\u0145\3\2\2\2\u015d\u0149\3\2\2\2\u015d\u014d\3\2\2\2\u015d\u0153\3\2"+
		"\2\2\u015d\u0155\3\2\2\2\u015d\u0157\3\2\2\2\u015d\u0159\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u017f\3\2\2\2\u015f\u0160\f\f\2\2\u0160\u0161\t\2"+
		"\2\2\u0161\u0162\5\34\17\r\u0162\u0163\b\17\1\2\u0163\u017e\3\2\2\2\u0164"+
		"\u0165\f\13\2\2\u0165\u0166\t\3\2\2\u0166\u0167\5\34\17\f\u0167\u0168"+
		"\b\17\1\2\u0168\u017e\3\2\2\2\u0169\u016a\f\n\2\2\u016a\u016b\t\4\2\2"+
		"\u016b\u016c\5\34\17\13\u016c\u016d\b\17\1\2\u016d\u017e\3\2\2\2\u016e"+
		"\u016f\f\t\2\2\u016f\u0170\t\5\2\2\u0170\u0171\5\34\17\n\u0171\u0172\b"+
		"\17\1\2\u0172\u017e\3\2\2\2\u0173\u0174\f\21\2\2\u0174\u0175\7\6\2\2\u0175"+
		"\u0176\5\34\17\2\u0176\u0177\7\7\2\2\u0177\u0178\b\17\1\2\u0178\u017e"+
		"\3\2\2\2\u0179\u017a\f\20\2\2\u017a\u017b\7\32\2\2\u017b\u017c\7+\2\2"+
		"\u017c\u017e\b\17\1\2\u017d\u015f\3\2\2\2\u017d\u0164\3\2\2\2\u017d\u0169"+
		"\3\2\2\2\u017d\u016e\3\2\2\2\u017d\u0173\3\2\2\2\u017d\u0179\3\2\2\2\u017e"+
		"\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\35\3\2\2"+
		"\2\u0181\u017f\3\2\2\2\37$&8CMVks\u0085\u008d\u0093\u009c\u00a4\u00b1"+
		"\u00c6\u00c9\u00da\u00eb\u0105\u0108\u010d\u011a\u011d\u0127\u0133\u0137"+
		"\u015d\u017d\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}