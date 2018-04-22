package queue;

import java.util.ArrayList;
/**
 * ArrayListQueue represents a Queue which is a FIFO(First-In-First-Out) 
 * data structure
 * @author JayanthGangadhar
 *
 * @param <T> represents an object
 */
public class ArrayListQueue<T> implements Queue<T> {
	/**
	 * queue is an ArrayList to store the objects
	 */
	ArrayList<T> queue;
	/**
	 * Constructor
	 */
	public ArrayListQueue() {
		queue = new ArrayList<T>();
	}
	/**
	* add an element to the head of the queue and return true
	*/
	public boolean add(T t) {
		queue.add(0,t);
		return true;
	}
	/**
	* remove an element from the end of the queue. Returns null if queue is empty
	*/
	public T remove() {
		int length = queue.size();
		if(length>0) return queue.remove(length-1);
		else return null;
	}
	/**
	 * returns the head of the queue. Returns null if queue is empty
	 */
	public T peek() {
		int length = queue.size();
		if(length>0) return queue.get(0);
		else return null;
	}

	

}
