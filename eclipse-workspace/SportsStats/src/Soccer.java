/*Name: Blake Patterson
 *Date: June 11 2018
 *Description: Soccer Class
 */
public class Soccer extends AllSports
{
	
	protected int goalsScored;
	protected int shotsOnGoal;
	protected int wins;
	
	
	public int getGoalsScored()
	{	
		return goalsScored;
	}
	
	public int setGoalsScored(int newGoals)
	{
		goalsScored += newGoals;
		
		return goalsScored;
	}
	
	public int getShotsOnGoal()
	{
		return shotsOnGoal;
	}
	
	public int setShotsOnGoal(int newShotsOG)
	{
		shotsOnGoal += newShotsOG;
		
		return shotsOnGoal;
	}
	
	public String toString()
	{
		String info = "Number of Goals Scored: " + getGoalsScored() 
		+ "\n Number of Shots on Goal: " + getShotsOnGoal();
		
		return info;
	}
}
