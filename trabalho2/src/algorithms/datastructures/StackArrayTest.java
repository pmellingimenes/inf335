package algorithms.datastructures;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StackArrayTest {
	private final StackArray stackArray = new StackArray();

	@Test
	void Push_singleValue() {
		int value = 1;
		stackArray.push(value);
		assertEquals(value, stackArray.peek());
	}

	@Test
	void Push_multipleValues() {
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		assertEquals(stackArray.getMaxSize() -1, stackArray.peek());
	}

	@Test
	void Push_outOffLimitValue() {
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		int outOffLimitValue = 65;
		stackArray.push(outOffLimitValue);
		assertEquals(outOffLimitValue, stackArray.peek());
	}

	@Test
	void Pop_removedItemValue() {
		int firstValue = 1;
		int secondValue = 2;
		stackArray.push(firstValue);
		stackArray.push(secondValue);
		assertEquals(secondValue, stackArray.pop());
		assertEquals(firstValue, stackArray.pop());
	}

	@Test
	void Peek_emptyStack() {
		assertEquals(-1, stackArray.peek());
	}

	@Test
	void Peek_lastValue() {
		int firstValue = 1;
		int secondValue = 2;
		int thirdValue = 243;
		stackArray.push(firstValue);
		stackArray.push(secondValue);
		stackArray.push(thirdValue);
		assertEquals(thirdValue, stackArray.peek());
	}

	@Test
	void Peek_lastWithPreviousPopValue() {
		int firstValue = 1;
		int secondValue = 2;
		int thirdValue = 243;
		stackArray.push(firstValue);
		stackArray.push(secondValue);
		stackArray.push(thirdValue);
		stackArray.pop();
		assertEquals(secondValue, stackArray.peek());
	}

	@Test
	void IsEmpry_withNoAddition() {
		assertEquals(true, stackArray.isEmpty());
	}

	@Test
	void IsEmpty_withPush() {
		stackArray.push(654);
		assertEquals(false, stackArray.isEmpty());
	}

	@Test
	void IsEmpty_withPushAndPop() {
		stackArray.push(654);
		stackArray.pop();
		assertEquals(true, stackArray.isEmpty());
	}

	@Test
	void IsFull_noInteractions() {
		assertEquals(false, stackArray.isFull());
	}
	
	@Test
	void IsFull_pushAllPositions() {
		assertEquals(false, stackArray.isFull());
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		assertEquals(true, stackArray.isFull());
	}
	
	@Test
	void IsFull_pushAllPositionsAndPop() {
		assertEquals(false, stackArray.isFull());
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		stackArray.pop();
		assertEquals(false, stackArray.isFull());
	}

	@Test
	void testSize_afterPusshAllPositions() {
		assertEquals(0, stackArray.size());
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		assertEquals(stackArray.getMaxSize(), stackArray.size());
	}

	@Test
	void MakeEmpty_afterPushAllPositions() {
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		stackArray.makeEmpty();
		assertEquals(true, stackArray.isEmpty());
	}
}
