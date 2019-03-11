grammar Calculator;

startRule: operation1+;

operation1: operation2 addOrMinus operation1 | operation2;

operation2: expression multDivOrMod operation2
          | LBRACKET operation1 RBRACKET multDivOrMod operation2
          | expression;


addOrMinus: PLUS | MINUS;
multDivOrMod: MULT | DIV | MOD;

expression: INT | MINUS INT;

INT: DIGIT_NOZERO DIGIT_ZERO*;
fragment DIGIT_ZERO: [0-9];
fragment DIGIT_NOZERO: [1-9];

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';

LBRACKET: '(';
RBRACKET: ')';

WHITESPACE: ' '+ -> skip;
