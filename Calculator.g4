grammar Calculator;

startRule: operation+;

operation: operation addOrMinus operation
          | operation multDivOrMod operation
          | LBRACKET operation RBRACKET
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
