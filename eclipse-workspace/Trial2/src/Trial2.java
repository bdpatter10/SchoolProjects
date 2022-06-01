import java.util.*;
public class Trial2
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		 char list[] = new char[50];
		for (int i = 0; i <= list.length - 1; i++)
		{
			list[i] = (char) (generator.nextInt(26) + 97);
			System.out.println(list[i]);
	    }
	}
}
