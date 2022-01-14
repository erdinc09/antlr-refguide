grammar CppExpr;

@parser::members {
boolean istype(Token id) { return false; } //just to compile, not in original code
boolean isfunc(Token id) { return false; } //just to compile, not in original code
}

/** Distinguish between alts 1, 2 using idealized predicates as demo */
expr:   {isfunc($ID)}? ID '(' expr ')' // func call with 1 arg // original code was isfunc(ID), mistake I think
    |   {istype($ID)}? ID '(' expr ')' // ctor-style type cast of expr // original code was istype(ID), mistake I think
    |   INT                       // integer literal
    |   ID                        // identifier
    ;

ID  :   [a-zA-Z]+ ;
INT :   [0-9]+ ;
WS  :   [ \t\n\r]+ -> skip ;