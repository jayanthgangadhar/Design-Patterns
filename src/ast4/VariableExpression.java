package ast4;
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
	private Variable var;
	/**
	 * constructor
	 * @param var represents a variable
	 */
	public VariableExpression(Variable var) {
		this.var = var;
	}
	/**
	 * textRepresentation computes a string that reflects the variable Expression
	 * @return a string representation of the variable expression
	 */
	public String textRepresentation() {
		return var.getVar();
	}

}
