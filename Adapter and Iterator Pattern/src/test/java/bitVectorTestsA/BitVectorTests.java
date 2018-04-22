package bitVectorTestsA;

import static org.junit.Assert.*;

import org.junit.Test;

import bit_vector_1a.BitVector;
/**
 * BitVectorTests1a is used to test functionality of bitVectors
 */
public class BitVectorTests {
	/**
	 *to test set() functionality 
	 */
	@Test
	public void testSet() {
		BitVector a = new BitVector();
		a.set(0);
		a.set(1);
		a.set(100);
		a.set(31);
		a.set(32);
		a.set(62);
		assertEquals(true,a.get(0));
		assertEquals(true,a.get(1));
		assertEquals(false,a.get(2));
		assertEquals(true,a.get(32));
		assertEquals(true,a.get(62));
		assertEquals(true,a.get(100));
	}
	/**
	 * to test clear() functionality
	 */
	@Test
	public void testCLear() {
		BitVector a = new BitVector();
		a.set(1);
		a.set(100);
		a.clear(1);
		a.clear(2);
		a.set(2);
		assertEquals(true, a.get(100));
		assertEquals(false, a.get(1));
		assertEquals(true, a.get(2));
	}
	/**
	 * to test copy() functionality
	 */
	@Test
	public void testCopy() {
		BitVector a = new BitVector();
		BitVector b = new BitVector();
		a.set(1);
		a.set(2);
		b.set(4);
		b.set(3);
		a.copy(b);
		a.set(1);
		b.set(5);
		assertEquals(true, a.get(2));
		assertEquals(true, a.get(3));
		assertEquals(true, a.get(4));
		assertEquals(false, a.get(5));
	}
	/**
	 * to test size() functionality
	 */
	@Test
	public void testSize() {
		BitVector a = new BitVector();
		BitVector b = new BitVector();
		assertEquals(0,a.size());
		a.set(1);
		a.set(34);
		assertEquals(2, a.size());
		a.clear(34);
		assertEquals(1, a.size());
		a.clear(23);
		assertEquals(1, a.size());
		b.set(1);
		a.copy(b);
		assertEquals(1, a.size());
		b.set(2);
		a.copy(b);
		a.set(2);
		assertEquals(2, a.size());
	}
}
