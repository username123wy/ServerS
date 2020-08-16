grammar Common;
//词法规则

AND : 'and';
OR : 'or';

LEFT_BRACKETS : '(';
RIGHT_BRACKETS : ')';

EQUAL : '==';
NOT_EQUAL : '!=';
CASE_EQUAL : '$=';
CONTAIN : '&=';
SEMICOLON : ';';
QUOTATION : '"';

//空格，换行和tab以及注释都被忽略掉了
WS : [ \t\n\r] -> skip;
COMMENT : '#' .*? '\n' -> skip;

STRING :QUOTATION (ESC|.)*? QUOTATION;
//匹配两个引号间的任意文本,并且定义转移字符\"和\\
fragment ESC : '\\' [btnr"\\];

//这个ID一定得放在关键字后面
COLUMN_ID : [a-zA-Z0-9]+;
ALL_COLUMNS : '*';