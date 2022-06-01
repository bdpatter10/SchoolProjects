/*Name: Blake Patterson 
 * Date: June 4 2018
 * Program Description: contains a method that concatenates multiple strings
 */
import java.util.Random;

public class NameReturn 
{
	public NameReturn()
	{
		
	}
	
	public String NewName(String name1, String name2)
	{
		String newName = "";
		int age = 0;
		Random generator = new Random();
		name1 = name1.substring(0, 1);
		name2 = name2.substring(0, 5);
		age = generator.nextInt(90) + 10;
		newName = name1 + "," + name2 + "," + age;
				
		return newName;
	}

}
