import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bubbleSortEfficientTest extends bubbleSortEfficient{

	@Test
	void PT1() {
		int[] input = {};
		int[] expected = {};
		assertArrayEquals(expected , bubbleSortEfficient(input, 1) );
	}
	@Test
	void PT2() {
		int[] input = {1};
		int[] expected = {1};
		assertArrayEquals(expected , bubbleSortEfficient(input, 1) );
	}
	@Test
	void PT3() {
		int[] input = {2,1};
		int[] expected = {1,2};
		assertArrayEquals(expected , bubbleSortEfficient(input, 2) );
	}
	@Test
	void PT4() {
		int[] input = {1,2};
		int[] expected = {1,2};
		assertArrayEquals(expected , bubbleSortEfficient(input, 2) );
	}
	@Test
	void PT5() {
		int[] input = {3,2,1};
		int[] expected = {1,2,3};
		assertArrayEquals(expected , bubbleSortEfficient(input, 3) );
	}

}
