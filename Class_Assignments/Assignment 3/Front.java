
/* Front.java - a lexical analyzer system for
 simple arithmetic expressions implemented in Java */

 /* Author: Enes Kemal Ergin
  * Assignment: Assignment 3P
  * Class : Programming Languages
  * Date : 10/17/15
  */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Front {

	public static void main(String[] args) {
		int read;
		FileReader fileReader;
		BufferedReader buffReader;
     try{
    	  File charFile = new File("front.txt");
    	  fileReader = new FileReader(charFile);
    	  buffReader = new BufferedReader(fileReader);
    	  Analyzer obj1 = new Analyzer(buffReader);
    	  obj1.getChar();

    	  while (obj1.hasValue)
    	  {
    		 obj1.lex();
    	  }
      }
      catch(Exception e)
    	{
       	 e.printStackTrace();
    	}


	}// end main
} // front
