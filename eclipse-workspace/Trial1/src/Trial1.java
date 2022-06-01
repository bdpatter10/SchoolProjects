import java.util.Scanner; 
import java.util.Random;

public class Trial1 
{
	public static void main(String [] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer: ");
	
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 1;i<=n; i++)
			for(int j = 1; j<= i; j++)
				sum++;
		System.out.print(sum);
		
		
	}

}
