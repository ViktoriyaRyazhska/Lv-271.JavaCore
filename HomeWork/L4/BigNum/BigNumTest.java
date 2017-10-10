package HomeWork;

import static org.junit.Assert.*;

import org.junit.Test;

public class BigNumTest {
	BigNum num = new BigNum();

	@Test
	public void testMax() {
		assertEquals(3, num.max(1, 2, 3));
	}

	@Test
	public void testMin() {
		assertEquals(1, num.min(1, 2, 3));
	}

}
