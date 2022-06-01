/*Name: Blake Patterson     
 * Date: June 11 2018
 * Program Description:Driver class to show inheritance by calling meathods
 * of other classes 
 */
import java.util.*;

public class HospitalDriver 
{
	public static void main (String[] args)
	{
		char command;
		Janitor jan = new Janitor();
		Surgeon sur = new Surgeon();
		Nurse nur = new Nurse();
		System.out.println("Who do you need assitance from?");
		System.out.println("I need : "
				+ "\na) a janitor"
				+ "\nb) a doctor"
				+ "\nc) a surgeon"
				+ "\nd) a nurse");
		Scanner scan = new Scanner(System.in);
		String choice = scan.next().toLowerCase();
		command = choice.charAt(0);
		
		switch(command)
		{
		case 'a':
			jan.getJanitor();
			break;
		case 'b':
			sur.getDoctor();
			break;
		case 'c':
			sur.getSurgeon();
			break;
		case 'd':
			nur.getNurse();
			break;
			
		}
	}

}
