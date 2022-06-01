/*Name: Blake Patterson
 *Date: June 11 2018
 *Description: Driver class to implement different methods
 */
import java.util.*;
public class SportsMain
{
	public static void main(String [] args)
	{
		char command;
		Scanner scan = new Scanner(System.in);
		Soccer soc = new Soccer();
		Football foot = new Football();
		Baseball base = new Baseball();
		System.out.println("What sport's stats do you want to edit?");
		System.out.println("a) Football"
				+ "\nb) Baseball"
				+ "\nc) Soccer");
		
		String choice = scan.next().toLowerCase();
		command = choice.charAt(0);
		
		switch (command)
		{
			case 'a':
				foot.setInterceptions(10);
				System.out.println(foot.getInterceptions());
				foot.setYards(200);
				System.out.println(foot.getYards());
				foot.setWins(1);
				System.out.println(foot.getWins());
				break;
			case 'b':
				base.setHits(10);
				base.setRuns(10);
				base.setWins(10);
				System.out.println(base.getWins());
				break;
			case 'c':
				soc.setGoalsScored(20);
				soc.setWins(15);
				soc.setShotsOnGoal(5);
				System.out.println(soc.getGoalsScored());
				System.out.println(soc.getShotsOnGoal());
				System.out.println(soc.getWins());
				break;
		}
		
	}

}
