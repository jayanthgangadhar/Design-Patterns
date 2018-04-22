package visitor_4a;
/**
 * PrefixExpression represents an expression where Operators are written 
 * before their operands(Expression)
 * @author JayanthGangadhar
 *
 */
public class PrefixExpression extends Expression implements ASTNode {
	/**
	 * exp1 represents the first operand(expression)
	 * exp2 represents the second operand(expression)
	 * op represents the operator
	 */
	private Expression exp1;
	private Expression exp2;
	private Operator op;
	private int id;
	/**
	 * constructor
	 * @param op is the operator
	 * @param exp1 is the first operand
	 * @param exp2 is the second operand
	 */
	public PrefixExpression(Operator op, Expression exp1, Expression exp2) {
		this.op = op;
		this.exp1 = exp1;
		this.exp2 = exp2;
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
	 * textRepresentation computes a string that reflects the prefix expression
	 * @return a string representation of the prefix expression
	 */
	public String textRepresentation() {
		return op.getOp()+" "+exp1.textRepresentation()+" "+exp2.textRepresentation();
	}
	/**
	 * getId returns the id linked to the node
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * accept() is passed the same visitor object but then the method visit() is called using
	 * the visitor object
	 */
	public void accept(ASTVisitor visitor) {
		visitor.visit(this);
	}

}
