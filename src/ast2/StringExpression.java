package ast2;
/**
 * String Expression represents a string expression for the modeled programming
 * language
 * @author JayanthGangadhar
 *
 */
public class StringExpression extends Expression {
	/**
	 * str represents the string
	 */
	private String str;
	/**
	 * constructor
	 * @param str is the string parameter to the expression
	 */
	public StringExpression(String str) {
		this.str=str;
	}
	/**
	 * textRepresentation computes a string that reflects the String Expression
	 * @return a String expression
	 */
	public String textRepresentation() {
		return str;
	}

}
