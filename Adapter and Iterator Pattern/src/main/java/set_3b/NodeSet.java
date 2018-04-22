package set_3b;
//import visitor_4a.*;
import bit_vector_1b.*;
/**
 * NodeSet is a class that implements Set<Node> which represents an array of nodes.
 * @author JayanthGangadhar
 *
 */
public class NodeSet implements Set<Node> {
	/**
	 * adaptee represents a BitVector object
	 */
	Node[] n1 = new Node[0];
	private IBitVector adaptee = new BitVector();
	/**
	 * Add an element
	 */
	public void add(Node n) {
		adaptee.set(n.getId());
		int len = n1.length;
		Node[] t = new Node[len + 1];
		for(int i =0;i<len;i++) {
			t[i] = n1[i];
		}
		t[len] = n;
		n1 = t;
	}
	/**
	 * Add all elements in the argument set
	 */
	public void addAll(Set<Node> s) {
		Iterator<Node> nodeIter = s.iterator();
		while(nodeIter.hasAnotherElement()) {
			adaptee.set(nodeIter.nextElement().getId());
		}
	}
	/**
	 * Check if an element occurs in the set
	 */
	public boolean contains(Node n) {
		return adaptee.get(n.getId());
	}
	/**
	 * Remove an element
	 */
	public void remove(Node n) {
		adaptee.clear(n.getId());

	}
	/**
	 * Return the number of arguments in the set
	 */
	public int size() {
		return adaptee.size();
	}
	/**
	 * Return an iterator over the set
	 */
	public Iterator<Node> iterator() {
		return new NodeIterator();
	}
	/**
	 * NodeIterator is an iterator over Nodes
	 * @author JayanthGangadhar
	 */
	private class NodeIterator implements Iterator<Node>{
		Iterator<Integer> iter = adaptee.iterator();
		/**
		 * Check if there are more elements
		 */
		public boolean hasAnotherElement() {
			return iter.hasAnotherElement();
		}
		/**
		* Return the next element
		*/
		public Node nextElement() {
			int temp = iter.nextElement();
			return Node.getNode(temp);
		}
	}
	public String toString(){
		String output = "";
		for (Node node : this.n1) {
			output+=node.textRepresentation();
		}
		return output;
	}
}
