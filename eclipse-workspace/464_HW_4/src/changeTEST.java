import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class changeTEST extends change{


	@Test
	void PT1(){
		assertEquals(0, change.changeCalc(100, 100)[0]);
	}
	@Test
	void PT2(){
		assertEquals(10, change.changeCalc(100, 90)[0]);
	}
	@Test
	void PT3(){
		assertEquals(1, change.changeCalc(100.25, 100)[1]);
	}
	@Test
	void PT4(){
		assertEquals(1, change.changeCalc(100.35, 100)[2]);
		
	}
	@Test
	void PT5(){
		assertEquals(2, change.changeCalc(101.37, 100)[4]);
	}
}
