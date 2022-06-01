/*Name: Blake Patterson 
 * Date: June 4 2018
 * Program Description: prints a string of first initial last name 
 * and a number
 */
import java.util.Scanner;

public class StringReview 
{
	public static void main(String[] args)
	{
		String fName = "";
		String lName = "";
		
		Scanner scan = new Scanner(System.in);
		NameReturn nameString = new NameReturn();
		
		System.out.println("Enter your first name: ");
		fName = scan.nextLine();
		System.out.println("Enter your last name: ");
		lName = scan.nextLine();
		
		System.out.println(nameString.NewName(fName, lName));
		
	}

}
