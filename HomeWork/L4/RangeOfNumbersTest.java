package l4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeOfNumbersTest {
	RangeOfNumbers rage = new RangeOfNumbers();
	
	@Test
	public void test_three_minus() {
		assertEquals(3, rage.Numbers(-5, -5, -5));
	}
	
	@Test
	public void test_three_plus() {
		assertEquals(3, rage.Numbers(5, 5, 5));
	}
	
	@Test
	public void test_two() {
		assertEquals(2, rage.Numbers(5, 5, 8));
	}
	
	@Test
	public void test_one() {
		assertEquals(1, rage.Numbers(-6, 5, 8));
	}
	
	@Test
	public void test_zero() {
		assertEquals(0, rage.Numbers(-6, 10, 8));
	}

}
