package ast;
/**
 * NumberExpression represents an Expression containing numbers.
 * @author JayanthGangadhar
 *
 */
public class NumberExpression extends Expression{
	/**
	 * intNum represents an integer object that stores the integer numeric value
	 * doubleNum represents an double object that stores the floating number value
	 * numType represents type of numeric value of the expression
	 */
	private int intNum;
	private double doubleNum;
	private String numType;
	/**
	 * constructor
	 * @param i represents the numeric value
	 */
	public NumberExpression(int i) {
		this.intNum = i;
		this.numType = "Integer";
	}
	/**
	 * constructor
	 * @param i represents the numeric value
	 */
	public NumberExpression(double i) {
		this.doubleNum = i;
		this.numType = "Double";
	}
	/**
	 * textRepresentation computes a string that reflects number expression
	 * @return a string representation of the number expression 
	 * node
	 */
	public String textRepresentation() {
		switch(numType) {
		case "Integer":return String.valueOf(intNum);
		case "Double":return String.valueOf(doubleNum);
		default:return null;
		}
		
		}
}



