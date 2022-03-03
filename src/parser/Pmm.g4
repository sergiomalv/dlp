grammar Pmm;

program: (createFunction | createVar)* functionMain EOF
       ;

types: 'int' | 'double' | 'char'
        | 'struct' '{' (ID ':' types ';')+ '}'
        | ('['INT_CONSTANT']')+ ('int' | 'double' | 'char')
        ;

createFunction: 'def' ID '(' parametres? ')'':' types? '{' bodyFunction '}'
        ;

createVar: vars ':' types ';'
        ;
vars: ID | ID ',' vars
        ;

parametres: ID ':' types | ID ':' types ',' parametres
        ;
bodyFunction: createVar* sentences*
        ;

sentences: 'print' sentence ';'
        | 'input' sentence ';'
        | expression '=' expression ';'
        | 'if' expression ':' conditionBody ('else' conditionBody)?
        | 'while' expression ':' conditionBody
        | 'return' expression ';'
        | 'print'? ID '(' args? ')' ';'
        ;
args: expression | expression ',' args
        ;
sentence: expression | expression ',' sentence
        |
        ;
conditionBody: sentences | '{' sentences+ '}'
        ;

functionMain: 'def main()' ':' '{' bodyFunction '}'
        ;

expression: INT_CONSTANT
        | REAL_CONSTANT
        | CHAR_CONSTANT
        | ID
        | '(' expression ')'
        | ID ('[' expression ']')+
        | expression'.'expression
        | '('types')' expression
        | '-' expression
        | '!' expression
        | expression ('*'|'/'|'%') expression
        | expression ('+'|'-') expression
        | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
        | expression ('&&'|'||') expression
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
REAL_CONSTANT_LEFT_EXPONENT: INT_CONSTANT EXPONENT INT_CONSTANT;
fragment
REAL_CONSTANT_RIGHT_EXPONENT: REAL_CONSTANT_MAYBE_NON_LEFT EXPONENT '-' ('0'|INT_CONSTANT);

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