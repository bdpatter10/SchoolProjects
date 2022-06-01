/*Name: Blake Patterson
 * Date:
 * Description:
 */

import java.util.*;

//import Street.Direction;
import jsjf.*;

public class IntersectionDriver 
{
	enum Direction {NORTH, SOUTH, EAST, WEST}
	public static void main(String[] args)
	{
		
	/*	QueueADT<Integer> NORTH = new LinkedQueue<Integer>();
		QueueADT<Integer> SOUTH = new LinkedQueue<Integer>();
		QueueADT<Integer> EAST = new LinkedQueue<Integer>();
		QueueADT<Integer> WEST = new LinkedQueue<Integer>();
		//Street[] array = new Street[4];
		QueueADT<Integer>]  watermelon[] = new LinkedQueue<Integer>();
		
		arr[0] = NORTH;
		arr[1] = SOUTH;
		arr[2] = EAST;
		arr[3] = WEST;*/
		/*	boolean lightOn;
		Integer cars = 0;
		Random generator;

			// added 
			Direction first;
			first = Direction.NORTH;
			Direction second = Direction.SOUTH;
			QueueADT<Integer> NORTH = new LinkedQueue<Integer>();
			QueueADT<Integer> SOUTH = new LinkedQueue<Integer>();
			QueueADT<Integer> EAST = new LinkedQueue<Integer>();
			QueueADT<Integer> WEST = new LinkedQueue<Integer>();
			for(Direction d: Direction.values())
			{
				System.out.println("d= "+ d );
				QueueADT<Street> d = new LinkedQueue<Street>();
			}*/
		boolean runProgram = true;
		double carSpawn;
		int lightDuracion;
		String str;
		Street nStreet = new Street();
		Street sStreet = new Street();
		Street eStreet = new Street();
		Street wStreet = new Street();
		Street[] array = new Street[4];
		array[0] = nStreet;
		array[1] = sStreet;
		array[2] = eStreet;
		array[3] = wStreet;
		Scanner scan = new Scanner(System.in);
		Intersection test = new Intersection();
		
		
		
		test.trafic(array);
		
	/*	System.out.println(nStreet.getLights());
		System.out.println(wStreet.getLights());
		System.out.println(sStreet.getLights());
		System.out.println(eStreet.getLights());*/
		System.out.println("North\n" + test.toString(nStreet));
		System.out.println("South\n" + test.toString(sStreet));
		System.out.println("East\n" + test.toString(eStreet));
		System.out.println("West\n" + test.toString(wStreet));
		
		do 
		{
			test.reset(array);
			System.out.println("At what rate do you want cars to be generated?"
					+ "(between 0.0 and 1.0) ");
			carSpawn = scan.nextDouble();
			System.out.println("How long do you want to lights to last? ");
			lightDuracion = scan.nextInt();
			
			test.trafic(array,carSpawn,lightDuracion);
			System.out.println("North\n" + test.toString(nStreet));
			System.out.println("South\n" + test.toString(sStreet));
			System.out.println("East\n" + test.toString(eStreet));
			System.out.println("West\n" + test.toString(wStreet));
			
			System.out.println("to quit press (q) "
					+ "\nto continue hit any other key");
			str = scan.next();
			if(str.charAt(0) == 'q')
			{
				runProgram = false;
			}
		}while(runProgram);
	}

}
