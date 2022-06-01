package modifiedtax.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class modifiedtaxTest {

	@Test
	 public void WR0() {
		assertEquals("invalid input for income", modifiedtax.taxCalculation.calculateTax(-1, 5));
	}
	@Test
	 public void WR1() {
		assertEquals("no tax deducted.", modifiedtax.taxCalculation.calculateTax(0, 5));
	}
	@Test
	 public void WR2() {
		assertEquals("no tax deducted.", modifiedtax.taxCalculation.calculateTax(1, 5));
	}
	@Test
	 public void WR3() {
		assertEquals("invalid number of dependents", modifiedtax.taxCalculation.calculateTax(100000, -1));
	}
	@Test
	 public void WR4() {
		assertEquals("22000.0", modifiedtax.taxCalculation.calculateTax(100000, 0));
	}
	@Test
	 public void WR5() {
		assertEquals("22000.0", modifiedtax.taxCalculation.calculateTax(100000, 1));
	}
	@Test
	 public void WR6() {
		assertEquals("20000.0", modifiedtax.taxCalculation.calculateTax(100000, 5));
	}
	@Test
	 public void WR7() {
		assertEquals("249999.75", 
				modifiedtax.taxCalculation.calculateTax(999999, 5));
	}
	@Test
	 public void WR8() {
		assertEquals("This program does not calculate for AGI over 1 milliion", 
				modifiedtax.taxCalculation.calculateTax(1000001, 5));
	}
	@Test
	 public void WR9() {
		assertEquals("max number of dependents is 10.", 
				modifiedtax.taxCalculation.calculateTax(100000, 11));
	}
	 
	
}
