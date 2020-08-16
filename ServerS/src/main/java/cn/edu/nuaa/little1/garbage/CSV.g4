grammar CSV;
//import Common;

file : hdr row+ ;
hdr : row;
row : field (',' field)* '\r'? '\n';
field : STRING|COLUMN_ID;

//匹配两个引号间的任意文本,并且定义转移字符\"和\\
STRING : .*? ;

//这个ID一定得放在关键字后面
COLUMN_ID : [a-zA-Z0-9]+;