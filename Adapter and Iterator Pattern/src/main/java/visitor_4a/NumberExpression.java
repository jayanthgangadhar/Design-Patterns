package visitor_4a;
/**
 * NumberExpression represents an Expression containing numbers.
 * @author JayanthGangadhar
 *
 */
public class NumberExpression extends Expression implements ASTNode{
	/**
	 * intNum represents an integer object that stores the integer numeric value
	 * doubleNum represents an double object that stores the floating number value
	 * numType represents type of numeric value of the expression
	 */
	private int id;
	private int intNum;
	private double doubleNum;
	private int numType;
	/**
	 * constructor
	 * @param i represents the numeric value
	 */
	public NumberExpression(int i) {
		this.intNum = i;
		this.numType = 1;
		id = count;
		if(count==0) {
			nodeArray = new Node[count+1];
		}
		else {
			Node[] temp = nodeArray;
			nodeArray = new Node[count+1];
			for(int j=0;j<temp.length;j++) {
				nodeArray[j] = temp[j];
			}
		}
		nodeArray[count] = this;
		count++;
	}
	/**
	 * constructor
	 * @param i represents the numeric value
	 */
	public NumberExpression(double i) {
		this.doubleNum = i;
		this.numType = 2;
		id = count;
		if(count==0) {
			nodeArray = new Node[count+1];
		}
		else {
			Node[] temp = nodeArray;
			nodeArray = new Node[count+1];
			for(int j=0;j<temp.length;j++) {
				nodeArray[j] = temp[j];
			}
		}
		nodeArray[count] = this;
		count++;
	}
	/**
	 * textRepresentation computes a string that reflects number expression
	 * @return a string representation of the number expression 
	 * node
	 */
	public String textRepresentation() {
		switch(numType) {
		case 1:return String.valueOf(intNum);
		case 2:return String.valueOf(doubleNum);
		default:return null;
		}
		
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



