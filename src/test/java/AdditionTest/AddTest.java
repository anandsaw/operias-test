package AdditionTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Addition.Adder;

public class AddTest {
	@Test
	public void testAddWithZero() {
		Adder adder = new Adder();
		assertEquals(adder.add(0, 1), 1);
	}
	
	@Test
	public void testAddWithOne() {
		Adder adder = new Adder();
		assertEquals(adder.add(1, 1), 2);
	}

}
