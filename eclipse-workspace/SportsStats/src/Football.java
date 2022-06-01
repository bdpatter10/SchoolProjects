/*Name: Blake Patterson
 *Date: June 11 2018
 *Description: Football Class
 */
import java.util.Scanner;
public class Football extends AllSports
{
	
	protected int touchdowns;
	protected int yards;
	protected int interceptions;
	protected int wins;
	
	public int getTouchdowns() 
	{
		return touchdowns;
	}
	
	public void setTouchdowns(int touchdowns)
	{
		this.touchdowns += touchdowns;
	}
	
	public int getYards() {
		return yards;
	}
	
	public void setYards(int yards) 
	{
		this.yards += yards;
	}
	
	public int getInterceptions() 
	{
		return interceptions;
	}
	
	public void setInterceptions(int interceptions) 
	{
		this.interceptions += interceptions;
	}
	
	public String toString()
	{
		String info;
		String stats = "";
		char letter;
		Scanner scan = new Scanner(System.in);
		System.out.println("Select (o) for offense or (d) for defense");
		info = scan.next();
		letter = info.toLowerCase().charAt(0);
		
		if (letter == 'o')
		{
			stats = "Number of Touchdowns: " + getTouchdowns() 
			+ "Number of Yards: " + getYards();
		}
		else if (letter == 'd')
		{
			stats = "Number of Interceptions: " + getInterceptions();
		}
		else
		{
			System.out.println("Invalid Input!");
		}
		return stats;
	}

}
