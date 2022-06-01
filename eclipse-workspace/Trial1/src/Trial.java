/*Name: blake patterson
 * Date: June 20th 2018
 * Description: Find the largest element in an array of integers   
 * Time Complexity: O(N) because every time we add 1 element the time increases
 * by 1.
 */
public class Trial 
{
	public int Mystery(int n) {
		int sum = 0;
		for(int i = 1;i<=n; i++)
			for(int j = 1; j<= i; j++)
				sum++;
		return sum;
	}
}
