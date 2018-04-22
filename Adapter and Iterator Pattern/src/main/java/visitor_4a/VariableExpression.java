package visitor_4a;
/**
 * Variable Expression represents an variable expression in the modeled
 * programming language 
 * @author JayanthGangadhar
 *
 */
public class VariableExpression extends Expression implements ASTNode {
	/**
	 * var represents a variable 
	 */
	private int id;
	private Variable var;
	/**
	 * constructor
	 * @param var represents a variable
	 */
	public VariableExpression(Variable var) {
		this.var = var;
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
	 * textRepresentation computes a string that reflects the variable Expression
	 * @return a string representation of the variable expression
	 */
	public String textRepresentation() {
		return var.getVar();
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
