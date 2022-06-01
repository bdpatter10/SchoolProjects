/*-------------------------------------------------------------
// AUTHOR: Blake Patterson
// FILENAME: Builder.java
// SPECIFICATION:
// FOR: CSE 110- Lab #7
// TIME SPENT: 2 hour
//----------------------------------------------------------- */

public class Builder {
	private String name;
	
	public Builder (String name1)
	{
		name = name1;
	}// end Constructor 
	
	public String getName()
	{
		return name;
	}// end getName method
	
	public String makeRow(int n, String s)
	{
		String str1 = "";
		for(int i = 1; i <= n; i++)
		{
			str1 += s;
		}
		return str1;
	}// end makeRow method
	
	public void makePyramid(int n, String s)
	{
		for(int j = 1; j <= n /2 + 1; j++)
		{
			System.out.print("\n");
		/*	for(int l = 0; l < n / 2 - l; l++)
			{
				System.out.print("=");*/
				for(int k = 1; k <= j; k++)
				{
				
					System.out.print("*");
					if(k > 1)
					{
						System.out.print("*");
					}
					
				}
		//	}	
		}
	}// end makePyramid method

}// end class Builder
