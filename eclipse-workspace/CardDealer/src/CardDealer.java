/*Name: Blake Patterson     
 * Date: June 8 2018
 * Program Description:calls the deal method to deal cards
 */

import java.util.Scanner;
public class CardDealer 
{
	public static void main (String[] args)
	{
		char command;
		int num;
		Card deck = new Card();
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("Hello welcome to the card deck");
			System.out.println("What do you want to do?" 
				+ "\nPress (a) to deal five random cards "
				+ "\nPress (b) to shuffle the deck"
				+ "\nPress (c) to print out all cards" 
				+ "\nPress (d) if you want to decide how many cards to deal"
				+ "\nPress (q) to quit the loop");
			String choice = scan.next().toLowerCase();
			command = choice.charAt(0);
			
			switch (command)
			{
				case 'a':
					deck.setDeck();
					deck.setRandom();
					deck.checkDubs(5);
					deck.deal(5);
					break;
				case 'b':
					deck.setRandom();
					break;
				case 'c':
					System.out.println(deck.toString());
					break;
				case 'd':
					deck.setDeck();
					deck.setRandom();
					System.out.println("How many cards do you want to be "
							+ "dealt?");
					num = scan.nextInt();
					deck.checkDubs(num);
					deck.deal(num);
					System.out.println("\n");
					break;
				case 'e':
					for (int i = 0; i < 20; i++)
					{
						deck.setDeck();
						deck.setRandom();
						deck.checkDubs(5);
						deck.deal(5);
						System.out.println("\n");
					}
					break;
				case'q':
					break;
			}
		}while(command != 'q');
	}
	

}
