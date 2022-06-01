

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vend.VendingMachine;

class VendingTest {

	VendingMachine vm;
	
	@BeforeEach
	void setUp() {
		vm = new VendingMachine();
	}
	
	@Test
	void Itemtest() {
		String item = "candy";
		int input = 20;
		assertEquals(vm.dispenseItem(input, item), "Item dispensed.");
		item = "coke";
		input = 25;
		assertEquals(vm.dispenseItem(input, item), "Item dispensed.");
		item = "coffee";
		input = 45;
		assertEquals(vm.dispenseItem(input, item), "Item dispensed.");
	}
	
	@Test
	void ExtraInputTest() {
		String item = "candy";
		int input = 25;
		int price = 20;
		assertEquals(vm.dispenseItem(input, item),
				"Item dispensed and change of " 
				+ Integer.toString(input - price) + " returned");
				
	}
	
	@Test
	void TooLittleCandyInputTest() {
		String item = "candy";
		int input = 15;
		int price = 20;
//		System.out.print(vm.dispenseItem(input, item));
		assertEquals(vm.dispenseItem(input, item),
				"Item not dispensed, missing " 
						+ Integer.toString(price - input) + 
				" cents. Cannot purchase item.");		
	}
	
	@Test
	void TooLittleCokeInputTest() {
		String item = "coke";
		int input = 20;
		int price = 25;
//		System.out.print(vm.dispenseItem(input, item));
		assertEquals(vm.dispenseItem(input, item),
				"Item not dispensed, missing " 
				+ Integer.toString(price - input) + 
				" cents. Can purchase candy.");		
	}
	
	@Test
	void TooLittleCoffeeInputTest() {
		String item = "coffee";
		int input = 40;
		int price = 45;
//		System.out.print(vm.dispenseItem(input, item));
		assertEquals(vm.dispenseItem(input, item),
				"Item not dispensed, missing " 
				+ Integer.toString(price - input) + 
				" cents. Can purchase candy or coke.");		
	}
	

}
