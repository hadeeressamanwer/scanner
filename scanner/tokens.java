package scanner;

 enum TokenType{WRITE,READ,IF,ELSE,RESERVERWORD,RETURN,MAIN,STRING,INT,BEGIN,END,REAL,SEMI,COMMA,LPAREN,RPAREN,PLUS,MINUS,MULT,DIV,EQ,TESTEQ,TESTNOTEQ,QUOTEDSTRING,IDENTIFIER,NUMBER,COMMENT,REPEAT,UNTIL,THEN,BIGGER,SMALLER
 }
public class tokens {
     TokenType type;

    String value="";

    public tokens(){
    }
     public tokens(String value,TokenType type ){
         this.value=value;//
         this.type=type;//reserved words(if,then,else if),identifiers,num
     }
     public void setType(TokenType type){
        this.type=type;
     }
    public void setValue(String Value){
        this.value=value;
    }
    public TokenType getType(){
        return type;
    }
    public  String getValue(){
        return value;
    }


}
