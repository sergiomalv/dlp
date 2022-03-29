grammar Pmm;

@header{
import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import errorhandler.*;
}

program returns [Program ast] locals [List<Definition> aux = new ArrayList<Definition>();]:
        (cv=createVar {$aux.addAll($cv.ast);} | cf=createFunction {$aux.add($cf.ast);})*
        fm=functionMain {$aux.add($fm.ast);} EOF
        {$ast = new Program($aux.get(0).getLine(), $aux.get(0).getColumn(), $aux);}
        ;

types returns [Type ast] locals [List<FieldType> aux = new ArrayList<FieldType>();]
       : s=simpleTypes {$ast= $s.ast;}
        |'struct' '{'(f=fields {$aux.addAll($f.ast);})+'}' {$ast = new StructType($f.start.getLine(),
        $f.start.getCharPositionInLine()+1, $aux);}
        | '[' INT_CONSTANT ']' t=types {$ast = new ArrayType($INT_CONSTANT.getLine(),
        $INT_CONSTANT.getCharPositionInLine()+1,
            LexerHelper.lexemeToInt($INT_CONSTANT.text), $t.ast);}
        ;

simpleTypes returns [Type ast]
        : 'int' {$ast = IntType.getIntType();}
        | 'double' {$ast = DoubleType.getDoubleType();}
        | 'char' {$ast = CharType.getCharType();}
        ;

fields returns [List<FieldType> ast = new ArrayList<FieldType>();]:
        (f=field {if ($ast.contains($f.ast)){
            ErrorHandler.getErrorHandler().addError(new ErrorType($f.ast.getLine(),
            $f.ast.getColumn()+1, $f.ast.name));
        } else {
            $ast.add($f.ast);
        }})+
        ;
field returns [FieldType ast]: ID ':' t=types ';' {$ast = new FieldType($ID.getLine(),
            $ID.getCharPositionInLine()+1, $ID.text, $t.ast);}
        ;

createFunction returns [FuncDefinition ast] locals [List<VarDefinition> aux = new ArrayList<VarDefinition>(),
        List<Statement> aux2 = new ArrayList<Statement>();]:
        'def' ID '(' p=parametres ')'':' t=simpleTypes '{' (c=createVar {$aux.addAll($c.ast);})*
        (s=sentences {$aux2.add($s.ast);})* '}'
        {$ast = new FuncDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, new FunctionType(
        $ID.getLine(), $ID.getCharPositionInLine()+1, $t.ast, $p.ast), $aux, $aux2);}
        | 'def' ID '(' p=parametres ')'':''{' (c=createVar {$aux.addAll($c.ast);})*
        (s=sentences {$aux2.add($s.ast);})* '}'
        {$ast = new FuncDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, new FunctionType(
        $ID.getLine(), $ID.getCharPositionInLine()+1, VoidType.getVoidType(),
        $p.ast), $aux, $aux2);}
        ;

functionMain returns [FuncDefinition ast] locals [List<VarDefinition> aux = new ArrayList<VarDefinition>(),
        List<Statement> aux2 = new ArrayList<Statement>();]:
        DEF='def main():' '{' (c=createVar {$aux.addAll($c.ast);})*
        (s=sentences {$aux2.add($s.ast);})* '}'
        {$ast = new FuncDefinition($DEF.getLine(), $DEF.getCharPositionInLine()+1, "main", new FunctionType(
        $DEF.getLine(), $DEF.getCharPositionInLine()+1, VoidType.getVoidType(), new ArrayList<VarDefinition>()),
        $aux, $aux2);}
        ;

createVar returns [List<VarDefinition> ast = new ArrayList<VarDefinition>();]
        locals [List<String> aux = new ArrayList<String>();]:
        id1=ID {$aux.add($id1.text);}   (',' id2=ID {if ($aux.contains($id2.text)) {
            ErrorHandler.getErrorHandler().addError(new ErrorType($id2.getLine(),
            $id2.getCharPositionInLine()+1, $id2.text));
            } else {
                $aux.add($id2.text);
            }})*':' t=types ';'
        { for (String v : $aux) {
                $ast.add(new VarDefinition($id1.getLine(), $id1.getCharPositionInLine()+1, $t.ast, v));
            }
        }
        ;

vars returns [List<String> ast = new ArrayList<String>();]:
        id=ID {$ast.add($id.text);}  (',' optional=ID {$ast.add($optional.text);})*
        ;

parametres returns [List<VarDefinition> ast = new ArrayList<VarDefinition>();]:
        ((ID ':' t=simpleTypes)
        {$ast.add(new VarDefinition($start.getLine(), $start.getCharPositionInLine()+1, $t.ast, $ID.getText()));}
        (',' ID ':' t=simpleTypes
        {$ast.add(new VarDefinition($start.getLine(), $start.getCharPositionInLine()+1, $t.ast, $ID.getText()));}
        )*)?
        ;

sentences returns [Statement ast] locals [List<Expression> aux = new ArrayList<Expression>();]:
        expr1=expression '=' expr2=expression ';' {$ast = new Assignment($expr1.ast.getLine(),
        $expr1.ast.getColumn(), $expr1.ast, $expr2.ast);}
        | 'print' exp=expression {$aux.add($exp.ast);} (',' opt=expression {$aux.add($opt.ast);})*
        {$ast = new Print($exp.ast.getLine(), $exp.ast.getColumn(), $aux);} ';'
        | 'input' s=sentence ';' {$ast = new Input($s.ast.get(0).getLine(), $s.ast.get(0).getColumn(),
            $s.ast);}
        | 'if' expr=expression ':' c1=conditionBody ('else' c2=conditionBody)? {$ast = new IfElse(
            $expr.ast.getLine(), $expr.ast.getColumn(), $expr.ast, $c1.ast, $c2.ctx == null ? null : $c2.ast);}
        | 'while' expr=expression ':' c=conditionBody {$ast= new While($expr.ast.getLine(),
            $expr.ast.getColumn(), $expr.ast, $c.ast);}
        | 'return' expr=expression ';' {$ast = new Return($expr.ast.getLine(), $expr.ast.getColumn(),
            $expr.ast);}
        |ID '(' {List<Expression> parameters = new ArrayList<Expression>();}
        (e1=expression {parameters.add($e1.ast);} (',' e2=expression {parameters.add($e2.ast);} )*)? ')'';'
        { $ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine() + 1,
        new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text), parameters);}
        ;

functionInvocation returns [List<Expression> ast = new ArrayList<Expression>();]:
        (a=args {$ast.addAll($a.ast);})
        ;

args returns [List<Expression> ast = new ArrayList<Expression>();]:
        e=expression {$ast.add($e.ast);}(',' e1=expression {$ast.add($e1.ast);})*
        ;

sentence returns [List<Expression> ast = new ArrayList<Expression>();]:
        e=expression {$ast.add($e.ast);}(',' e1=expression {$ast.add($e1.ast);})*
        ;

conditionBody returns [List<Statement> ast = new ArrayList<Statement>()]:
        s=sentences {$ast.add($s.ast);}
        |'{' (s=sentences {$ast.add($s.ast);})+ '}'
        ;

expression returns [Expression ast]: '(' op1=expression ')' {$ast = $op1.ast;}
        | op1=expression'['op2=expression']' {$ast = new ArrayAccess($op1.ast.getLine(),
            $op1.ast.getColumn(), $op1.ast, $op2.ast); }
        | op1=expression'.'ID {$ast = new FieldAccess($op1.ast.getLine(),
            $op1.ast.getColumn(), $op1.ast, $ID.text); }
        | '('t=simpleTypes')' expr=expression {$ast = new Cast($t.ast.getLine(), $t.ast.getColumn(), $t.ast,
            $expr.ast);}
        | '-' op1=expression {$ast = new UnaryMinus($op1.ast.getLine(), $op1.ast.getColumn(), $op1.ast);}
        | '!' op1=expression {$ast = new Not($op1.ast.getLine(), $op1.ast.getColumn(), $op1.ast);}
        | op1=expression OP=('*'|'/'|'%') op2=expression {$ast = new Arithmetic($op1.ast.getLine(),
            $op1.ast.getColumn(), $op1.ast, $op2.ast, $OP.text);}
        | op1=expression OP=('+'|'-') op2=expression {$ast = new Arithmetic($op1.ast.getLine(),
            $op1.ast.getColumn(), $op1.ast, $op2.ast, $OP.text);}
        | op1=expression OP=('>'|'>='|'<'|'<='|'!='|'==') op2=expression {$ast = new Comparison($op1.ast.getLine(),
            $op1.ast.getColumn(), $op1.ast, $op2.ast, $OP.text);}
        | op1=expression OP=('&&'|'||') op2=expression {$ast = new Logic($op1.ast.getLine(),
            $op1.ast.getColumn(), $op1.ast, $op2.ast, $OP.text);}
        | ID '('fi=functionInvocation ')' {$ast = new FunctionInvocation($fi.start.getLine(),
                  $fi.start.getCharPositionInLine()+1, new Variable(
                  $fi.start.getLine(), $fi.start.getCharPositionInLine()+1, $ID.text), $fi.ast);}
        |INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(),
        $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
        | REAL_CONSTANT {$ast = new DoubleLiteral($REAL_CONSTANT.getLine(),
        $REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
        | CHAR_CONSTANT {$ast = new CharLiteral($CHAR_CONSTANT.getLine(),
        $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
        | ID {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); }
        ;

fragment
LETTER: [a-z|A-Z];

fragment
DIGIT: [0-9];

fragment
NON_ZERO: [1-9];

fragment
SOMETHING: .*?;

fragment
MARK: '\'';

fragment
SLASH: '\\';

fragment
ZERO: [0];

INT_CONSTANT: (ZERO|NON_ZERO DIGIT*);

ID: (LETTER|'_')(LETTER|'_'|DIGIT)*;

fragment
EXPONENT: ('e'|'E');
fragment
REAL_CONSTANT_BASIC: INT_CONSTANT '.' DIGIT*;
fragment
REAL_CONSTANT_MAYBE_NON_LEFT: ('0'|INT_CONSTANT)? '.' DIGIT+;
fragment
REAL_CONSTANT_LEFT_EXPONENT: INT_CONSTANT EXPONENT ('+'|'-')? INT_CONSTANT;
fragment
REAL_CONSTANT_RIGHT_EXPONENT: REAL_CONSTANT_MAYBE_NON_LEFT EXPONENT ('+'|'-')? ('0'|INT_CONSTANT);

REAL_CONSTANT: (REAL_CONSTANT_BASIC|REAL_CONSTANT_MAYBE_NON_LEFT|REAL_CONSTANT_LEFT_EXPONENT
        |REAL_CONSTANT_RIGHT_EXPONENT);

COMMENT_MULTI_LINE: '"""' SOMETHING '"""' -> skip;
COMMENT_ONE_LINE: '#' SOMETHING '\r'? ('\n'|EOF) -> skip;

fragment
CHAR_CONSTANT_NUMBER: MARK SLASH INT_CONSTANT MARK;
fragment
CHAR_CONSTANT_LETTER: MARK .*? MARK;
CHAR_CONSTANT: (CHAR_CONSTANT_LETTER|CHAR_CONSTANT_NUMBER|'\\t'|'\\n');

TRASH: [ \t\r\n]+ -> skip;