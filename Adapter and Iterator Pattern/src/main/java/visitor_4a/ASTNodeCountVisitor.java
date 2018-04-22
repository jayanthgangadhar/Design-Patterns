package visitor_4a;
/**
 * ASTNodeCountVisitor is a concrete visitor that implements ASTVisitor
 * @author JayanthGangadhar
 */
public class ASTNodeCountVisitor implements ASTVisitor {
	/**
	 * infixCount represents the count of InfixExpression node
	 * prefixCount represents the count of PrefixExpression node
	 * numCount represents the count of NumberExpression node
	 * strCount represents the count of StringExpression node
	 * varCount represents the count of VariableExpression node
	 * decCount represents the count of DeclarationExpression node
	 * assignCount represents the count of AssignmentExpression node
	 * seqCount represents the count of SequenceExpression node
	 */
	public int infixCount=0;
	public int prefixCount=0;
	public int numCount=0;
	public int strCount=0;
	public int varCount=0;
	public int decCount=0;
	public int assignCount=0;
	public int seqCount=0;
	/**
	 * increments count of InfixExpression every time an InfixExpression is created
	 */
	public void visit(InfixExpression infix) {
		infixCount++;
	}
	/**
	 * increments count of PrefixExpression every time an PrefixExpression is created
	 */
	public void visit(PrefixExpression prefix) {
		prefixCount++;
	}
	/**
	 * increments count of NumberExpression every time an NumberExpression is created
	 */
	public void visit(NumberExpression num) {
		numCount++;
	}
	/**
	 * increments count of StringExpression every time an StringExpression is created
	 */
	public void visit(StringExpression str) {
		strCount++;
	}
	/**
	 * increments count of VariableExpression every time an VariableExpression is created
	 */
	public void visit(VariableExpression var) {
		varCount++;
	}
	/**
	 * increments count of Declaration every time a Declaration statement is created
	 */
	public void visit(Declaration dec) {
		decCount++;	
	}
	/**
	 * increments count of Assignment every time an Assignment statement is created
	 */
	public void visit(Assignment assign) {
		assignCount++;
	}
	/**
	 * increments count of Sequence every time a Sequence statement is created
	 */
	public void visit(Sequence seq) {
		seqCount++;
	}

}
