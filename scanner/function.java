package scanner;

public class function extends tokens {
    tokens tok=new tokens();
	
    tokens fn(String str) {
    	
    	
    	
        if (str.equals("int") ||  str.equals("if") || str.equals("return")|| str.equals("else")|| str.equals("main")|| str.equals("begin")
                || str.equals("end") || str.equals("read") ||str.equals("Read") || str.equals("write")    || str.equals("real") || str.equals("string") ||str.equals("repeat")||str.equals("then")||str.equals("until") )
  {
            tok.value=str;
           tok.type= tok.type.valueOf("RESERVERWORD");
           
      }
        else if(str.matches("[0-9]+")){
            tok.value=str;
            tok.type=tok.type.valueOf("NUMBER");
            
        }
        else if(str.matches("([a-z][A-Z]*[a-z]*[0-9]*[A-Z]*[a-z]*)||([A-Z][A-Z]*[a-z]*[0-9]*[A-Z]*[a-z]*)")){
          tok.value=str;
          tok.type=tok.type.valueOf("IDENTIFIER");
      
        }
        else if ( str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")||str.equals("=")||str.equals("!=")||str.equals("(")||str.equals(")")||str.equals(":=")||str.equals(",")||str.equals(";")||str.equals("<")||str.equals(">")){
            tok.value = str;
            switch (str){
                 case "+":
                 tok.type=tok.type.valueOf("PLUS");
                 break;
                 case"-":tok.type=tok.type.valueOf("MINUS");
                 break;
                 case"*":tok.type=tok.type.valueOf("MULT");
                 break;
                 case"/":tok.type=tok.type.valueOf("DIV");
                 break;
                 case " (" :  tok.type=tok.type.valueOf("LPAREN");break;
                 case " )"  : tok.type=tok.type.valueOf("RPAREN");break;
                 case  "=":
                     tok.type=tok.type.valueOf("TESTEQ");
                     break;
                 case "!=":
                     tok.type=tok.type.valueOf("NOTEQ");
                     break;
                 case ":=" :
                     tok.type=tok.type.valueOf("EQ");
                     break;
                 case ";" : tok.type=tok.type.valueOf("SEMI");
                     break;
                 case "," : tok.type=tok.type.valueOf("COMMA");
                     break;
                 case ">" :tok.type= tok.type.valueOf("BIGGER");
                     break;
                 case "<" : tok.type=tok.type.valueOf("SMALLER");
                 break;
             }
          
        }
        return (tok);
       }   
        }

    
