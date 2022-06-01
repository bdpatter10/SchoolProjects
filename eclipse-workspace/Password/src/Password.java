/*Name: Blake Patterson
 * Date: June 19th 2018
 * Description: Password class takes a message encrypts it and decryptes it
 */
import java.util.Random;

public class Password implements Encryption 
{
	
	   private String message;
	   private String alphabet;
	   private boolean encrypted;
	   
	   private Random generator;
	   private int length;
	  
	// Constructor
	   public Password( String msg ) 
	   {
	      message = msg;
	      encrypted = false;
	      generator = new Random();
	     
	      alphabet = "abcdeghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ !#$";
	      length = message.length();
	   } 

	//Encryption
	   public void encrypt() 
	   {
	      if( ! encrypted ) 
	      {
	    	  	 int ranNum = 0;
	    	  	 String ranChar = "";
	         String masked = "";
	         for ( int i=0; i < length; i++ ) 
	         {
	        	 	ranNum = generator.nextInt(55);
	        	 	ranChar = alphabet.substring(ranNum, ranNum +1);
	            masked = masked + (message.substring(i, i + 1) + ranChar);
	         } // for
	         message = masked;
	         encrypted = true;
	      } // if
	   } // method 
	  
	 // decrypt
	   public String decrypt() 
	   {
	      if ( encrypted ) 
	      {
	         String unmasked = "";
	         for ( int i=0; i < length * 2; i += 2) 
	         {
	            unmasked = unmasked + (char)(message.charAt(i));
	         } // for
	         message = unmasked;
	         encrypted = false;
	      } // if
	      return message;
	   } // method
	  
	// return whether or not incrypted
	   public boolean isEncrypted() 
	   {
	      return encrypted;
	   } // method
	  
	  // toString
	   public String toString() 
	   {
	      return message;
	   } // method
	  
}
