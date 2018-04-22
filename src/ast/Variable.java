package ast;
/**
 * Variable represents the variables for the modeled programming language
 * @author JayanthGangadhar
 *
 */
public class Variable {
	/**
	 * var represents the variable
	 */
	private String var;
	/**
	 * constructor
	 * @param var is the variable
	 */
	public Variable(String var) {
		this.var = var;	}
	/**
	 * getter function to return the variable
	 * @return string representation of the variable
	 */
	public String getVar() {
		return var;
	}
	

}
