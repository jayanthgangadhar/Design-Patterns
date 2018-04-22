package ast3;
/**
 * Interface Node models root of the Abstract Syntax Tree for a small
 * programming language 
 * @author JayanthGangadhar
 *
 */
public interface Node {
	/**
	 * textRepresentation computes a string that reflects the entire
	 * subtree rooted at that node
	 * @return a string representation of the subtree rooted at a particular 
	 * node
	 */
	abstract String textRepresentation();
}
