/* Analyzer.java is helper class for Front.java - a lexical analyzer system for
 simple arithmetic expressions implemented in Java */

 /* Author: Enes Kemal Ergin
  * Assignment: Assignment 3P
  * Class : Programming Languages
  * Date : 10/17/15
  */
import java.io.BufferedReader;


public class Analyzer {

	final int LETTER  = 0;
	final int DIGIT = 1;
	final int UNKNOWN = 99;
	final int INT_LIT = 10;
    final int IDENT =  11;
    final int ASSIGN_OP = 20;
    final int ADD_OP = 21;
    final int SUB_OP = 22;
    final int MULT_OP = 23;
    final int DIV_OP = 24;
    final int LEFT_PAREN = 25;
    final int RIGHT_PAREN = 26;
    final int EOF = -1;

    private int read;
    private  int charClass;
	private char[] lexeme = new char[100];
	private  char nextChar;
	private  int lexLen;
	private  int token;
	private  int nextToken;
	BufferedReader buffReader;
	public boolean hasValue = true;

	 public Analyzer(BufferedReader buffReader2) {
		// TODO Auto-generated constructor stub
		 buffReader = buffReader2;
	}

	void getChar()
	 {
		try
		{
		  read = buffReader.read();
		}catch (Exception e)
		  {
			e.printStackTrace();
	      }

		if (read != -1)
	    {
   		 nextChar = (char)read;
		 if (Character.isLetter(nextChar))
			 charClass = LETTER;
		 else if (Character.isDigit(nextChar))
			    charClass = DIGIT;
		      else charClass = UNKNOWN;
		    }
		 else
		 {
			 charClass = EOF;

		 }
	 }// end getChar()

	 int lex()
	   {
		 lexLen = 0;
		 getNonBlank();
		 switch (charClass)
		 {
		   /* Parse identifiers */
		   case LETTER:
			   addChar();
			   getChar();
			   while (charClass == LETTER || charClass == DIGIT)
			   {
				   addChar();
				   getChar();
			   }
			   nextToken = IDENT;
			   break;

		   /* Parse integer literals */
		   case DIGIT:
			   addChar();
			   getChar();
			   while (charClass == DIGIT)
			   {
				   addChar();
				   getChar();
			   }
			   nextToken = INT_LIT;
			   break;

		   /* Parentheses and operators */
		   case UNKNOWN:
			   lookup(nextChar);
			   getChar();
			   break;
		   /* EOF */
		   case EOF:
			   nextToken = EOF;
			   lexeme[0] = 'E';
			   lexeme[1] = 'O';
			   lexeme[2] = 'F';
			   lexeme[3] = 0;
			   hasValue = false;
			   break;
		 } // end switch
		printIt();
		return nextToken;
	   } // end lex()


	 void printIt()
	 {
		 String lexString = "";
		 for(char i : lexeme) {
			 if (i == 0)
				 break;
			lexString = lexString + i;
		 }
		 System.out.println("Next token is: " + nextToken + ", Next lexeme is " + lexString);


	 } // end printIt()


	void getNonBlank()
	 {
		 while (nextChar == ' ')
			 getChar();
	 }// end getNonBlank()

	   /* addChar - a function to add nextChar to lexeme */
	 void addChar()
	 {
		 if (lexLen <= 98)
		   {
			 lexeme[lexLen++] = nextChar;
			 lexeme[lexLen] = 0;
		   }
		 else
			 System.out.println("Error - lexeme is too long ");
	 } // end addChar();

	 /* lookup - a function to lookup operators and parentheses
	  * and return the token */
	 int lookup(char ch) {
	 	switch (ch)
	 	{   case '(':
	 		addChar();
	 		nextToken = LEFT_PAREN;
	 		break;

	     case ')':
	     	addChar();
	     	nextToken = RIGHT_PAREN;
	     	break;
	     case '+':
	     	addChar();
	     	nextToken = ADD_OP;
	     	break;
	     case '-':
	     	addChar();
	     	nextToken = SUB_OP;
	     	break;
	     case '*':
	     	addChar();
	     	nextToken = MULT_OP;
	     	break;
	     case '/':
	     	addChar();
	     	nextToken = DIV_OP;
	     	break;
	     default:
	     	addChar();
	     	nextToken = EOF;
	     	break;
	 	}
	 	return nextToken;
	 } // end int lookup()

}
