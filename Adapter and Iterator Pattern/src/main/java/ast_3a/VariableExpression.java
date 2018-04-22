package ast_3a;
/**
 * Variable Expression represents an variable expression in the modeled
 * programming language 
 * @author JayanthGangadhar
 *
 */
public class VariableExpression extends Expression {
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
	@Override
	public int getId() {
		return id;
	}

}
