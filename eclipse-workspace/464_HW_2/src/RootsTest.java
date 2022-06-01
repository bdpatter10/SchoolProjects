import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RootsTest {

	@Test
	void SR1() {
		Roots.calculate_roots(2, 8, 2);
		assertEquals(2,Roots.num_roots);
	}
	@Test
	void SR2() {
		Roots.calculate_roots(2, 4, 2);
		assertEquals(1,Roots.num_roots);
	}
	@Test
	void SR3() {
		Roots.calculate_roots(2, 2, 2);
		assertEquals(0,Roots.num_roots);
	}

}
