import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class assignment3Test {

	@Test
	public final void testCountUnique() {
		assignment3 tester = new assignment3();
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(12);
		numbers.add(3);
		numbers.add(1);
		numbers.add(22);
		numbers.add(1);
		assertEquals(4, tester.countUnique(numbers));
		//should fail
		assertFalse(2==tester.countUnique(numbers));
		//true
		assertTrue(4==tester.countUnique(numbers));
		//making sure it is coming back with an answer
		assertNotNull(tester.countUnique(numbers));
	}

}
