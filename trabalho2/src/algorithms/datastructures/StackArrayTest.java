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
		stackArray.makeEmpty();
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		int outOffLimitValue = 65;
		stackArray.push(outOffLimitValue);
		assertEquals(outOffLimitValue, stackArray.peek());
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
		assertEquals(-1, stackArray.peek());
		int firstValue = 1;
		int secondValue = 2;
		int thirdValue = 243;
		stackArray.push(firstValue);
		assertEquals(firstValue, stackArray.peek());
		stackArray.push(secondValue);
		assertEquals(secondValue, stackArray.peek());
		stackArray.push(thirdValue);
		assertEquals(thirdValue, stackArray.peek());
		stackArray.pop();
		assertEquals(secondValue, stackArray.peek());
	}

	@Test
	void testIsEmpty() {
		assertEquals(true, stackArray.isEmpty());
		stackArray.push(654);
		assertEquals(false, stackArray.isEmpty());
		stackArray.pop();
		assertEquals(true, stackArray.isEmpty());
	}

	@Test
	void testIsFull() {
		assertEquals(false, stackArray.isFull());
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		assertEquals(true, stackArray.isFull());
		stackArray.pop();
		assertEquals(false, stackArray.isFull());
	}

	@Test
	void testSize() {
		assertEquals(0, stackArray.size());
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		assertEquals(stackArray.getMaxSize(), stackArray.size());
		stackArray.pop();
		assertEquals(stackArray.getMaxSize() - 1, stackArray.size());
	}

	@Test
	void testMakeEmpty() {
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		stackArray.makeEmpty();
		assertEquals(true, stackArray.isEmpty());
	}
}
