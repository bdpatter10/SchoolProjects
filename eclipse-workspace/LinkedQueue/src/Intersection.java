
import java.util.*;

/**
 * Intersection contains the main algorithm that tracks the 
 *  of the program 
 * @author blakepatterson
 *
 */
public class Intersection
{
	private boolean lightOn;
	private int cars;
	
	Random generator;
	/*Street nStreet;
	Street sStreet;
	Street eStreet;
	Street wStreet;
	private Street[] array;*/
	
	public Intersection()
	{
		//lightOn = true;
		//cars = 0;
		generator = new Random();
	/*	nStreet = new Street();
		sStreet = new Street();
		eStreet = new Street();
		wStreet = new Street();*/
		//array = new Street[4];
	}
	
	
	/**
	 * calls the toggleLights method on north and south or east and west
	 * @param arr
	 */
	public void setLights(Street[] arr)
	{
		
		if(generator.nextDouble() >= .5)
		{
			arr[0].toggleLights();
			arr[1].toggleLights();
		}
		else
		{
			arr[2].toggleLights();
			arr[3].toggleLights();
		}
	}
	
	/**
	 * allows for user input then runs the algorithm to find the requirements
	 * @param array
	 * @param carSpawn
	 * @param lightDuracion
	 */
	public void trafic(Street[] array, double carSpawn, int lightDuracion)
	{
		setLights(array);
		//clock
		/* for the entire thousand seconds cars are generated in all directions.
		 Four queues that are gaining links the entire time and only lose links
		 when light is green!
		 */
		for(int i = 0; i < 1000; i += lightDuracion)
		{
			
			// cycling streets
			for(int s = 0; s < 4; s++)
			{
				
				// probability
				for(int p = 0; p < lightDuracion; p++)
				{
					
					// get user input for variable!!!!
					if(generator.nextDouble() < carSpawn)
					{
						
						array[s].enqueue(1);	
					}
					
					if(array[s].size() > 0 && array[s].getLights())
					{
						
						array[s].dequeue();
						array[s].carCounter();
					}
					
				}
			}
			array[0].toggleLights();
			array[1].toggleLights();
			array[2].toggleLights();
			array[3].toggleLights();
		}
		
	}
	/**
	 * runs the algorithm to find the requirements
	 * @param array
	 * @param carSpawn
	 * @param lightDuracion
	 */
	public void trafic(Street[] array)
	{
		setLights(array);
		//clock
		/* for the entire thousand seconds cars are generated in all directions.
		 Four queues that are gaining links the entire time and only lose links
		 when light is green!
		 */
		for(int i = 0; i < 1000; i += 10)
		{
			
			// cycling streets
			for(int s = 0; s < 4; s++)
			{
				
				// probability
				for(int p = 0; p < 10; p++)
				{
					
					// get user input for variable!!!!
					if(generator.nextDouble() < .25)
					{
						array[s].enqueue(1);	
					}
					
					if(array[s].size() > 0 && array[s].getLights())
					{
						
						array[s].dequeue();
						array[s].carCounter();
					}
					
				}
			}
			array[0].toggleLights();
			array[1].toggleLights();
			array[2].toggleLights();
			array[3].toggleLights();
		}
		
	}
	
	/**
	 * resets the queue using dequeue in a for loop
	 * @param array
	 */
	public void reset(Street[] array)
	{
		
		int l = array.length;
		for(int j = 0; j < l; j++)
		{
			array[j].setZero();
			
			for(int k = 0; k < array[j].size(); k++)
			{
				array[j].dequeue();
			}
		}
	}
	
	/**
	 * makes a string of the info of the 
	 * street that is passed as a parameter
	 * @param Street
	 * 
	 */
	public String toString( Street street)
	{
		
		//String nInfo = "How many cars have passed? " + nStreet.carCounter() 
		//+"\nhow many cars are stranded? " + nStreet.size() +;
		
		String info = "How many cars have passed? " + street.carCounter() 
		+"\nhow many cars are stranded? " + street.size() 
		+ "\nAre the lights on? " + street.getLights();
		
		return info;
	}
	

}
