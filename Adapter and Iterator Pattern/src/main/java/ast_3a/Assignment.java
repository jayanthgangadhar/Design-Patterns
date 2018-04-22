package ast_3a;
/**
 * Assignment represents the assignment statement for the modeled programming language
 * @author JayanthGangadhar
 *
 */
public class Assignment extends Statement{
	/**
	 * var represents a variable
	 * exp represents an expression
	 */
	private Variable var;
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
	@Override
	public int getId() {
		return id;
	}
	
}
