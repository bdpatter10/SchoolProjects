/*-------------------------------------------------------------------------
// NAME: Blake Patterson
// FILENAME: Assignment5.java
// SPECIFICATION: test driver created by F. Navabi for Geek.java
// LAB: F Cheng Monday 4:10 to 5:00
// FOR: CSE 110- homework #5
 * //----------------------------------------------------------------------*/
/*-------------------------------------------------------------------------
// AUTHOR: F. Navabi
// FILENAME: Assignment5.java
// SPECIFICATION: this program checks the methods in class Geek, it is a test driver for class Geek
// FOR: CSE 110- homework #- days and time of your class
// TIME SPENT:how long it took you to complete the assignment
//----------------------------------------------------------------------*/

//import Scanner class
import java.util.*;

public class Assignment5 {

   public static void main (String[] args) {

      	 Scanner console = new Scanner (System.in);

      	 String choice;
	  	 char command;
       	// call the method to print the menu
		printMenu();//print the menu, a static method
		//instantiate an object of type Geek
		Geek myGeek = new Geek("Eisenstein");

		do
		{
		           // ask a user to choose a command
		           System.out.println("\nPlease enter a command or type ?");
		           choice = console.nextLine().toLowerCase();
	               command = choice.charAt(0);

		           switch (command)
		            {
		                 case 'a'://print the name
		                      System.out.println(myGeek.getName());

		                      break;
		                 case 'b': //print number of questions asked so far
		                      System.out.println(myGeek.getNumberOfQuestions());

		                      break;
		                 case 'c': //find out if the number is even or odd
							  System.out.print("Enter a number: ");
							  int num1 = Integer.parseInt(console.nextLine());
							  if (myGeek.isOdd(num1))
							  		System.out.println(num1 + " is odd");
							  else
							        System.out.println(num1 + " is not odd");
		                      break;
		                 case 'd': //reverse the input string
							  System.out.print("Enter a string: ");
							  String input = console.nextLine();
							  System.out.println("Reverse of " + input + " is " + myGeek.reverse(input));
		                      break;
		                 case 'e': //sum the numbers between two numbers entered by user
                              System.out.print("Enter the first number: ");
							  num1 = Integer.parseInt(console.nextLine());
							  System.out.print("Enter the second number: ");
							  int num2 = Integer.parseInt(console.nextLine());
							  int total = myGeek.sum(num1, num2);
							  System.out.println("The sum between "+ num1 + " and " +num2 + " is " + total);
		                      break;
		                 case 'f': //find if the numbers are sorted
                              System.out.println("Enter three integers: ");
                              int n1  = Integer.parseInt(console.nextLine());
                              int n2 = Integer.parseInt(console.nextLine());
                              int n3 = Integer.parseInt(console.nextLine());
                              if (myGeek.sorted(n1, n2, n3))
                              		System.out.println("It is sorted!");
                              else
                              		System.out.println("Not sorted!");
		                      break;
		                 case 'g'://find out the number of spaces in the input string
		                 	  System.out.print("Enter a string: ");
		                 	  input = console.nextLine();
		                 	  System.out.println("The string \"" + input + "\" has " + myGeek.countSpace(input) +"space(s)");
                              break;

		              	 case 'h'://count the digits
		              	 		System.out.print("Enter an integer: ");
		              	 		num1 = Integer.parseInt(console.nextLine());
		              	 		System.out.print("Number of digits in" + num1 + " is " + myGeek.countDigits(num1));
		              	 		break;
		              	 case '?'://print the menu
		                      printMenu();
		                      break;			
		                 case 'q'://quit
		                      break;

		                 default://invalid choice
		                       System.out.println("Invalid input");

		            }

		        } while (command != 'q');

		    }  //end of the main method


		  public static void printMenu()
		   {
		    System.out.print("\nCommand Options\n"
		                   + "-----------------------------------\n"
		                   + "a: Get name\n"
		                   + "b: Num of questions asked\n"
		                   + "c: Is it Odd\n"
		                   + "d: Reverse the string\n"
		                   + "e: Sum between two integers\n"
		                   + "f: Is sorted\n"
		                   + "g: Count spaces\n"
		                   + "h: Count digits\n"
		                   + "?: Display\n"
		                   + "q: Quit\n\n");

		    } // end of the printMenu method


}

