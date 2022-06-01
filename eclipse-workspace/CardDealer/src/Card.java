/*Name: Blake Patterson      
 * Date: June 8 2018
 * Program Description:card class creates a deck of cards
 *  and can deal random cards
 */
import java.util.Random;
public class Card 
{
	private String[] deck;
	
	
	public Card()
	{
		deck = new String[52];
	
	}
	
	public void setDeck()
	{
		int temp = 0;
		for(int i = 0; i < 4; i++)
		{		
				for (int j = 0; j < 13; j++)
				{
					deck[temp] = Value.values()[j] + " of " + Suit.values()[i];
					temp++;
				}
		}
	}
	
	/*public String getCard(int numSuit, int num)
	{
		String card = value[num] +" of " + suit[numSuit];
		return card;
	}*/
	
	//display all cards in the deck
	public String toString()
	{
		String allCards = "";
		for(int i = 0; i< 52; i++)
		{
			allCards += deck[i] + "\n";
		}
		return allCards;
	}
	
	public void deal(int numCards)
	{
		//Random generator = new Random();
		for(int i = 0; i < numCards; i++)
		{
			System.out.println(deck[i]);
		}
	}
	
	//shuffle deck
	public void setRandom()
	{
		Random generator = new Random();
		String temp = "";
		for(int i = 0; i < 52; i++)
		{
			int addRan = generator.nextInt(52);
			temp = deck[i];
			deck[i] = deck[ addRan ];
			deck[ addRan] = deck[i];		
		}
		
		//check for and replace duplicate cards
		
	/*	for (int i = 0; i < 5; i++)
		{
			for (int j = 1; j < 6; j++)
			{
				if(deck[i] == (deck[j]))
				{
					deck[i] = deck[i + 10];
				}
			}
		}*/
	}
	
	public void checkDubs(int num)
	{
		Random generator = new Random();
		for (int i = 0; i < num; i++)
		{
			for (int j = 0; j < num ; j++)
			{
				if(deck[i] == (deck[j]) && i != j)
				{
					deck[i] = deck[generator.nextInt(52)];
					
					for (int k = 0; k < num; k++)
					{
						for (int l = 0; l < num; l++)
						{
							if(deck[k] == (deck[l]) && k != l)
							{
								deck[k] = deck[generator.nextInt(52)];
							}
						}
					}
				}
			}	
		}					
	}
	
/*	public void Deal()
	{
		Random generator = new Random();
		
		String[] suits = new String[5];
		String[] values = new String[5];
		for(int i = 0; i < 5; i++)
		{
			int ranSuit = generator.nextInt(4);
			int ranValue = generator.nextInt(13);
			suits[i] = suit[ranSuit];
			values[i] = value[ranValue];	
		
		}	
		for (int i = 0; i<5; i++)
			{
				for(int j = 4; j > 0; j--)
				{
					if(suits[i] == suits[j] && values[i] == values[j])
					{
						values[i] = value[generator.nextInt(13)];
					}
				
				}
		
				System.out.println(values[i] + " of " + suits[i]);
				
			}
	
	}*/

}
