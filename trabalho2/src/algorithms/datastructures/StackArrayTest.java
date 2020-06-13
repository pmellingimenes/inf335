/**
* Testes unitários para fins didáticos para a aula do Prof. Leonardo Montecchi
* INF 335
*
* @author Caroline Augusti R.G. 50466131-0
* @author Paulo Mellin Gimenes R.G. 30280035-9
* @version 1.0
* @since   2020-06-13 
*/
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
		assertEquals(stackArray.getMaxSize() - 1, stackArray.peek());
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
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		assertEquals(true, stackArray.isFull());
	}

	@Test
	void IsFull_pushAllPositionsAndPop() {
		for (int i = 0; i < stackArray.getMaxSize(); i++) {
			stackArray.push(i);
		}
		stackArray.pop();
		assertEquals(false, stackArray.isFull());
	}

	@Test
	void testSize_withNoInteration() {
		assertEquals(0, stackArray.size());
	}

	@Test
	void testSize_afterPusshAllPositions() {
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
