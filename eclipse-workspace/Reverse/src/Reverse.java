import java.util.*;
public class Reverse 
{
	private ArrayList<String> list;
	public Reverse()
	{
		list = new ArrayList<String>();
	}
	
	public void reverse(ArrayList<String> list)
	{
		int index = list.size() - 1;
		String last = list.get(index);
		for(int i = 1; i < index ; i++)
		{
			
			list.add(0, last);
			list.remove(index);
		}
		System.out.println(list);
		
	}

}
