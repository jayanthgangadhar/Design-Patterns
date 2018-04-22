package visitor_4a;

import java.util.NoSuchElementException;

/**
 * Interface Node models root of the Abstract Syntax Tree for a small
 * programming language 
 * @author JayanthGangadhar
 *
 */
public abstract class Node {
	/**
	 * count represents the number of nodes
	 * nodeArray is an array of nodes
	 */
	static int count=0; 
	static Node[] nodeArray = new Node[0];
	public static Node[] getNodeArray() {
		return nodeArray;
	}
	/**
	 * textRepresentation computes a string that reflects the entire
	 * subtree rooted at that node
	 * @return a string representation of the subtree rooted at a particular 
	 * node
	 */
	abstract String textRepresentation();
	/**
	 * Returns unique identifier for each node.
	 */
	public abstract int getId();

	/**
	 * Reverse mapping from Nodes to their unique identifiers
	 */
	public static Node getNode(int id) {
		if(id>count) throw new NoSuchElementException();
		else return nodeArray[id];
	}
	/**
	 * accept() is passed the same visitor object but then the method visit() is called using the visitor object
	 * @param visitor represents a ASTVisitor object
	 */
	public abstract void accept(ASTVisitor visitor);
}
