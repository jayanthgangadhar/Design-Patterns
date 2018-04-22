package visitor_4a;
/**
 * Operator represents the operators in the modeled programming language
 * @author JayanthGangadhar
 *
 */
public class Operator {
	/**
	 * op represents the operator 
	 */
	private String op;
	/**
	 * constructor
	 * @param op is the operator
	 */
	public Operator(String op) {
		this.op = op;
	}
	/**
	 * getter function to return the operator
	 * @return string representation of the operator
	 */
	public String getOp() {
		return op;
	}


}
