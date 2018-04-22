package ast;
/**
 * Declaration represents the declaration statement for the modeled programming language
 * @author JayanthGangadhar
 *
 */
public class Declaration extends Statement {
	/**
	 * dec represents the variable to be declared
	 */
	private Variable dec;
	/**
	 * constructor
	 * @param declaration is the variable to be declared
	 */
	public Declaration(Variable declaration) {
		this.dec = declaration;
	}
	/**
	 * textRepresentation computes a string that reflects the declaration statement
	 * @return a string representation of the declaration statement 
	 */
	public String textRepresentation() {
		return "var "+dec.getVar()+";";
	}

}
