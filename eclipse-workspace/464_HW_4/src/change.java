
import java.util.Scanner;
public class change
{


  public static void main(String[] args)
  {
   Scanner scan = new Scanner(System.in);
   double cost, paidAmount;
   int[] changes = new int[5];
   System.out.println("Please enter the cost:");
   cost = scan.nextDouble();

   System.out.println("Please enter the paid amount:");
   paidAmount = scan.nextDouble();

   changes=changeCalc(paidAmount, cost);

   for(int i=0; i<5 ; i++)
   {
	   System.out.println(changes[i]);
   }


  }

  public static int[] changeCalc(double paid, double cost)
  {
	  // cast to int was working wrong before
  	 int change = (int)Math.round((paid - cost)*100.0);
  	 int dollars=0, quarters=0, dimes=0, nickles=0, pennies=0;
  	   int[] changes = new int[5];


  	   if(change > 0)
  	   {
  		   dollars=change/100;
  		   changes[0]=dollars;

  		   change = change%100;
  		   if(change > 0) {
	  		   quarters = change/25;
	  		   changes[1]=quarters;
	  		 
	  		   change = change%25;
	  		 System.out.println("change after q" + change);
	  		   if(change > 0) {
	  			   dimes = change/10;
		  	       changes[2]=dimes;
		
		  		   change = change%10;
		  		  if(change > 0) {
		  		   nickles = change/5;
		
		  		   changes[3]=nickles;
		
		  		   pennies = change%5;
		  	       changes[4]=pennies;
		  		  }
	  		 }
  		   }

      }

     return changes;

}
}