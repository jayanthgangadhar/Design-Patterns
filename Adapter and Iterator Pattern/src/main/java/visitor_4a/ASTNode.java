package visitor_4a;

/**
 * ASTNode represents visitable class where accept is passed the same visitor object
 * but then the method visit() is called using the visitor object.
 * @author JayanthGangadhar
 *
 */
public interface ASTNode {
	/**
	 * accept is passed the same visitor object
	 * but then the method visit() is called using the visitor object
	 * @param visitor represents a visitor object
	 */
	public void accept(ASTVisitor visitor); 
}
