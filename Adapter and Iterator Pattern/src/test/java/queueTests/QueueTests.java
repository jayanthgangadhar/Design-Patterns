package queueTests;

import static org.junit.Assert.*;

import org.junit.Test;

import queue.ArrayListQueue;
import queue.Queue;
/**
 * QueueTests represents a class to test functionality of Queue implementation.
 * @author jayanthGangadhar
 *
 */
public class QueueTests {
	/**
	 * To test functionality of add(),remove()
	 */
	@Test
	public void test1() {
		Queue<Integer> queue = new ArrayListQueue<Integer>();
		assertTrue(queue.add(5));
		assertTrue(queue.add(6));
		assertEquals((Integer)5,queue.remove());
		assertEquals((Integer)6,queue.remove());
		assertEquals(null, queue.remove());
		}
	@Test
	/**
	 * To test add() and peek()
	 */
	public void test2() {
		Queue<Integer> queue = new ArrayListQueue<Integer>();
		assertTrue(queue.add(7));
		assertTrue(queue.add(8));
		assertEquals((Integer)8,queue.peek());
		assertEquals((Integer)7,queue.remove());
		assertTrue(queue.add(9));
		assertTrue(queue.add(10));
		assertEquals((Integer)10,queue.peek());
	}
	/**
	 * test peek and remove on empty queue
	 */
	@Test
	public void test3() {
		Queue<Integer> queue = new ArrayListQueue<Integer>();
		queue.add(8);
		queue.add(9);
		queue.add(10);
		assertEquals((Integer)8,queue.remove());
		assertEquals((Integer)9,queue.remove());
		assertEquals((Integer)10,queue.remove());
		assertEquals(null,queue.peek());
		assertEquals(null,queue.remove());
		
	}
	
}
