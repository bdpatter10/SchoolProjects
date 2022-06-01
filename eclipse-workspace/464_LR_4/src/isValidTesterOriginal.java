import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isValidTesterOriginal {
	
	@Test
	void SR1() {
		String number = "";
		assertTrue(isValid.IsValidMod10Number(number));
	}

	@Test
	void SR2() {
		String number = "2";
		assertTrue(isValid.IsValidMod10Number(number));
	}
	
	@Test
	void SR3() {
		String number = "24";
		assertTrue(isValid.IsValidMod10Number(number));
	}
	
	@Test
	void SR4() {
		String number = "26";
		assertTrue(isValid.IsValidMod10Number(number));
	}
}

