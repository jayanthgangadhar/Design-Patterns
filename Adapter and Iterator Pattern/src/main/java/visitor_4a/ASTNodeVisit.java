package visitor_4a;
/**
 * ASTNodeImpl implements the interface ASTNode 
 * @author JayanthGangadhar
 *
 */
public class ASTNodeVisit implements ASTNode {
	/**
	 * nodeArray is an array of nodes
	 */
	Node[] node;
	/**
	 * Constructor
	 */
	public ASTNodeVisit() {
		node = Node.getNodeArray();
	}
	/**
	 * accept() is passed the same visitor object but then the method visit() is called using the visitor object
	 * @param visitor represents a ASTVisitor object
	 */
	public void accept(ASTVisitor visitor) {
		for(int i=0;i<node.length;i++) {
			node[i].accept(visitor);
		}
	}
	
}
