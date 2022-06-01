/*Name: Blake Patterson
 * Date: June 18th 2018
 * Description: main method written to catch created exception
 */
import java.util.*;
public class StringTooLong 
{
	static void validate(String s)throws StringTooLongException
	{
		if(s.length() > 19)
		{
			throw new StringTooLongException("String too long");
		}
	}
	public static void main(String[] args) 
	{
		String terminate = "DONE";
		String command = "";
		Scanner keyboard = new Scanner(System.in);
	
		while(!command.equals(terminate))
		{
			try 
			{
			System.out.println("Enter your String \nenter DONE to finish");
			command = keyboard.nextLine();
			validate(command);
			}
			catch(StringTooLongException s)
			{
				System.out.println("Exception" + s);
				
			}
		}
	}
	
}
