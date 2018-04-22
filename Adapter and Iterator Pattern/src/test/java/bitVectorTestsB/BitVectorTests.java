package bitVectorTestsB;

import static org.junit.Assert.*;

import org.junit.Test;

import bit_vector_1b.*;
/**
 * BitVectorTests1a is used to test functionality of bitVectors
 */
public class BitVectorTests {
	/**
	 *to test iterator() functionality 
	 */
	@Test
	public void testIterator1() {
		BitVector a = new BitVector();
		Iterator<Integer> iter = a.iterator();
		assertEquals(false, iter.hasAnotherElement());
		a.set(1);
		assertEquals(true, iter.hasAnotherElement());
		assertEquals((Integer)1, iter.nextElement());
		a.set(2);
		a.set(3);
		assertEquals((Integer)2, iter.nextElement());
		assertEquals((Integer)3, iter.nextElement());
	}
	/**
	 * test iterator() after clear()
	 */
	@Test
	public void testIterator2() {
		BitVector a = new BitVector();
		Iterator<Integer> iter = a.iterator();
		a.set(1);
		assertEquals(true, iter.hasAnotherElement());
		assertEquals((Integer)1, iter.nextElement());
		a.clear(1);
		assertEquals(false, iter.hasAnotherElement());
		assertEquals(null, iter.nextElement());
	}
}
