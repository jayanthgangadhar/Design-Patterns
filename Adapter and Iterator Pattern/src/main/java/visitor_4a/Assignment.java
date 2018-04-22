package visitor_4a;
/**
 * Assignment represents the assignment statement for the modeled programming language
 * @author JayanthGangadhar
 *
 */
public class Assignment extends Statement implements ASTNode{
	/**
	 * var represents a variable
	 * exp represents an expression
	 */
	private Variable var;
	public Variable getVar() {
		return var;
	}
	private Expression exp;
	private int id;
	/**
	 * constructor
	 * @param var is variable to be assigned a value
	 * @param exp is the expression assigned to the variable
	 */
	public Assignment(Variable var,Expression exp) {
		this.var = var;
		this.exp = exp;
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
	 * textRepresentation computes a string that reflects the assignment statement
	 * @return a string representation of the assignment statement 
	 */
	public String textRepresentation() {
		return var.getVar() + " = "+exp.textRepresentation()+";";
	}
	/**
	 * getId() returns id associated with this node
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
