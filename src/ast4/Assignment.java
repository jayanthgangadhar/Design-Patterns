package ast4;
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
	/**
	 * constructor
	 * @param var is variable to be assigned a value
	 * @param exp is the expression assigned to the variable
	 */
	public Assignment(Variable var,Expression exp) {
		this.var = var;
		this.exp = exp;
	}
	/**
	 * textRepresentation computes a string that reflects the assignment statement
	 * @return a string representation of the assignment statement 
	 */
	public String textRepresentation() {
		return var.getVar() + " = "+exp.textRepresentation()+";";
	}
	
}
