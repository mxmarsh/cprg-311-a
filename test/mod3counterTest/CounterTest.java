package mod3counterTest;

import static org.junit.Assert.*;

import org.junit.*;

import mod3counterADT.Counter;
import mod3counterADT.InvalidCounterException;

/**
 * Class description:
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class CounterTest {

	private Counter counterA;
	private Counter counterB;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		counterA = new Counter();
		counterB = new Counter(2);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		counterA = null;
		counterB = null;
	}

	@Test
	public void testSetCounterHappyCase() {
		// try to set the counter to 5
		try {
			counterA.setCounter(5);
		} catch (InvalidCounterException e) {
			fail("Unexpected exception was thrown");
		}
		// we expect that the counter is now 5
		int expected = 5;
		int actual = counterA.getCounter();
		// check that as an assertion
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCounterZero() {
		// try to set the counter to 0
		try {
			counterB.setCounter(0);
		} catch (InvalidCounterException e) {
			fail("Unexpected exception was thrown");
		}
		// we expect that the counter is now 5
		int expected = 0;
		int actual = counterB.getCounter();
		// check that as an assertion
		assertEquals(expected, actual);

	}

	@Test
	public void testSetCounterNegativeValue() {
		// try to set it to a negative value
		try {
			counterA.setCounter(-5);
			// if it doesn't throw an exception, test fails
			fail("The expected exception was not thrown.");
		} catch (InvalidCounterException e) {
			// I expect this to throw an exception
			assertTrue(true);
		}
	}

	@Test
	public void testIncCounter() {
		counterA.incCounter();
		int expected = 1;
		int actual = counterA.getCounter();
		assertEquals(expected, actual);
	}

	@Test
	public void testDecCounterHappy() {
		try {
			counterB.decCounter();
		} catch (InvalidCounterException e) {
			fail("Unexpected exception.");
		}
		int expected = 1;
		int actual = counterB.getCounter();
		assertEquals(expected, actual);
	}

	@Test
	public void testDecCounterZero() {
		try {
			counterA.decCounter();
			fail("Expected exception not thrown");
		} catch (InvalidCounterException e) {
			assertTrue(true);
		}
	}

	@Test
	public void testIsZero() {
		boolean expected = true;
		boolean actual = counterA.isZero();
		assertEquals(expected, actual);
	}

	@Test
	public void testIsNotZero() {
		boolean expected = false;
		boolean actual = counterB.isZero();
		assertEquals(expected, actual);
	}

	@Test
	public void testToString() {
		String expected = "Counter value is 2";
		String actual = counterB.toString();
		assertEquals(expected, actual);
	}

}
