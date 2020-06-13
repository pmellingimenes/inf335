package algorithms.datastructures;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StackArrayTest {
	private final StackArray stackArray = new StackArray();

	@Test
	void testPush() {
		int firstValue = 1;
		int secondValue = 2;
		stackArray.push(firstValue);
		assertEquals(1, stackArray.size());
		assertEquals(firstValue, stackArray.peek());
		stackArray.push(secondValue);
		assertEquals(secondValue, stackArray.peek());
		assertEquals(2, stackArray.size());
	}

	@Test
	void testPop() {
		int firstValue = 1;
		int secondValue = 2;
		stackArray.push(firstValue);
		stackArray.push(secondValue);
		assertEquals(secondValue, stackArray.pop());
		assertEquals(firstValue, stackArray.pop());
	}

	@Test
	void testPeek() {
		int firstValue = 1;
		int secondValue = 2;
		int thirdValue = 243;
		stackArray.push(firstValue);
		assertEquals(firstValue, stackArray.peek());
		stackArray.push(secondValue);
		assertEquals(secondValue, stackArray.peek());
		stackArray.push(thirdValue);
		assertEquals(thirdValue, stackArray.peek());
	}

	@Test
	void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	void testIsFull() {
		fail("Not yet implemented");
	}

	@Test
	void testSize() {
		fail("Not yet implemented");
	}

	@Test
	void testMakeEmpty() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
