package visitor_4a;
/**
 * String Expression represents a string expression for the modeled programming
 * language
 * @author JayanthGangadhar
 *
 */
public class StringExpression extends Expression implements ASTNode{
	/**
	 * str represents the string
	 */
	private int id;
	private String str;
	/**
	 * constructor
	 * @param str is the string parameter to the expression
	 */
	public StringExpression(String str) {
		this.str=str;
		id= count;
		if(count==0) {
			nodeArray = new Node[count+1];
		}
		else {
			Node[] temp = nodeArray;
			nodeArray = new Node[count+1];
			for(int i=0;i<temp.length;i++) {
				nodeArray[i] = temp[i];
			}
		}
		nodeArray[count] = this;
		count++;
	}
	/**
	 * textRepresentation computes a string that reflects the String Expression
	 * @return a String expression
	 */
	public String textRepresentation() {
		return str;
	}
	/**
	 * getId returns the id linked to the node
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * accept() is passed the same visitor object but then the method visit() is called using
	 * the visitor object
	 */
	public void accept(ASTVisitor visitor) {
		visitor.visit(this);
	}

}
