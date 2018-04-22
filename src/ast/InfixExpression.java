package ast;
/**
 * InfixExpression represents an expression where Operators are written 
 * in-between their operands(Expression)
 * @author JayanthGangadhar
 *
 */
public class InfixExpression extends Expression{
	/**
	 * exp1 represents the first operand(expression)
	 * exp2 represents the second operand(expression)
	 * op represents the operator
	 */
	private Expression exp1;
	private Expression exp2;
	private Operator op;
	/**
	 * constructor
	 * @param op is the operator
	 * @param exp1 is the first operand
	 * @param exp2 is the second operand
	 */
	public InfixExpression(Operator op, Expression exp1, Expression exp2) {
		this.op = op;
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	/**
	 * textRepresentation computes a string that reflects the Infix Expression
	 * @return a string representation of the infix expression
	 */
	public String textRepresentation() {
		return exp1.textRepresentation()+" "+op.getOp()+" "+exp2.textRepresentation();
	}

}
