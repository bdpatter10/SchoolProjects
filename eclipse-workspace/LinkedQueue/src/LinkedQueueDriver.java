import jsjf.*;

public class LinkedQueueDriver 
{
	public static void main(String[] args)
	{
		LinkedQueue<Integer> go = new LinkedQueue<Integer>();
		
		for(int i = 0; i< 10; i++)
		{
			go.enqueue(i);
		}
		System.out.println("what is the first elemet" + go.first());
		System.out.println("how many elements are in the queue? " + go.size());
		System.out.println("is the queue empty? " + go.isEmpty());
		
		
		System.out.println("the elements in the Queue are: " + go);

	}

}
