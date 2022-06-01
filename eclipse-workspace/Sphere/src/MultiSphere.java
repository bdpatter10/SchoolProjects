/*Name: Blake Patterson    
 * Date: June 5 2018
 * Program Description: uses Scanner to get user input for the diameter and
 * also asks the user to press keys to continue exploring.
 */
import java.util.*;
public class MultiSphere 
{
	
	public static void main (String[] args)
	{
		int diameter;
		char command;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the diameter of the Sphere? ");
		diameter = scan.nextInt();
		boolean quit = false;
		Sphere aSphere = new Sphere(diameter);
		
		do
		{
			
			System.out.println("What do you what to know about the Sphere?");
			System.out.println("Press a) If you want to know the Surface Area" +
					"\nPress b) If you want to know the Volume " 
					+"\nPress c) If you want to change the diameter"
					+ "\nPress q) If you want to quit");
			String choice = scan.next().toLowerCase();
			command = choice.charAt(0);
		
			switch (command)
			{
				case 'a':
					System.out.println("The surface Area is " 
							+ aSphere.getSurfaceArea());
					break;
				case 'b':
					System.out.println("The volume is " + aSphere.getVolume());
					break;
				case 'c':
					System.out.println("What is the new Diameter?");
					int newDiameter = scan.nextInt();
					aSphere.setDiameter(newDiameter);
					System.out.println("The diameter is now " + newDiameter);
					break;
				case 'q':
				//	quit = true;
					break;
		
				default :
					System.out.println("invalid input!");
			}
		} while (command != 'q');
	}
	

}
