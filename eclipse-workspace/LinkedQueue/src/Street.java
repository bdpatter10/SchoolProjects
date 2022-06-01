
import java.util.Random;

import jsjf.*;
/**
 * Street class contains many functions needed to operate street lights 
 * in general and specific fuctions for this program
 * @author blakepatterson
 *
 */
public class Street extends LinkedQueue<Integer>
{
	//enum Direction {NORTH, SOUTH, EAST, WEST}
	private boolean lightOn;
	private int cars;
	Random generator;
	/**
	 * Initiates cars to zero and lightOn to false
	 */
	public Street()
	{
		
		lightOn = false;
		cars = 0;
	}
	/**
	 * sets the cars back to zero and all lights to red
	 */
	public void setZero()
	{
		cars = 0;
		lightOn = false;
	}
	
	/**
	 * flips the light to green
	 */
	public void toggleLights()
	{
		
		this.lightOn = (!lightOn);
		
	}
	/**
	 * returns the value of lightOn
	 * @lightOn
	 */
	public boolean getLights()
	{
		
		return lightOn;
	}
	
	/**
	 * return total number of cars dequeue(passed through light)
	 * @cars
	 */
	public int carCounter()
	{
		cars++;
		
		return cars;
	}


}
