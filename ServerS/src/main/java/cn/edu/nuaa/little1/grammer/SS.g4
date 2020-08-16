grammar SS;
import Common;
//语法规则

ss : (query_list SEMICOLON)*;

query_list : simple_query (operator query_list)*
            | LEFT_BRACKETS simple_query (operator query_list)* RIGHT_BRACKETS
            ;

simple_query :(COLUMN_ID | ALL_COLUMNS)
     ( equal_query
     | not_equal_query
     | case_insensitive_equal_query
     | contain_query );

operator : AND | OR;

equal_query :  EQUAL STRING  ;

not_equal_query : NOT_EQUAL STRING;

case_insensitive_equal_query : CASE_EQUAL STRING;

contain_query : CONTAIN STRING;

