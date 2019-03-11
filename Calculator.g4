grammar Calculator;


startRule: addSubExpression;

addSubExpression: mdmExpression plusOrMinus addSubExpression | mdmExpression;
mdmExpression: term multDivOrMod mdmExpression | term;
term: INT | NEG | LBRACKET addSubExpression RBRACKET;

plusOrMinus: PLUS | MINUS;
multDivOrMod: MULT | DIV | MOD;

INT: DIGIT_ZERO+;
NEG: MINUS INT;
fragment DIGIT_ZERO: [0-9];
//fragment DIGIT_NOZERO: [1-9];

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';

LBRACKET: '(';
RBRACKET: ')';

WHITESPACE: ' '+ -> skip;