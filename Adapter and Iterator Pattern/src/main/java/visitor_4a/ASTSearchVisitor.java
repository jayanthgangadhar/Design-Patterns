package visitor_4a;

import set_3b.*;

/**
 * ASTSearchVisitor allows us to search the assignments 
 * and declaration for given variable 
 * @author jayanthgangadhar
 *
 */
public class ASTSearchVisitor implements ASTVisitor {
	Variable var;
	public NodeSet setNode; 
	public ASTSearchVisitor(Variable var) {
		setNode = new NodeSet();
		this.var = var;
	}
	public void visit(InfixExpression infix) {

	}

	public void visit(PrefixExpression prefix) {


	}

	public void visit(NumberExpression num) {

	}

	public void visit(StringExpression str) {

	}

	public void visit(VariableExpression var) {

	}
	/**
	 * Checks the declaration for a variable. 
	 */
	public void visit(Declaration dec) {
		int id = dec.getId();
		Node n = dec.getNode(id);
		if(n instanceof Declaration) {
			Declaration d1 = (Declaration)n;
			if(d1.getDec().getVar().equals(var.getVar())) {
				setNode.add(n);
			}
		}

	}
	/**
	 * Checks the assignment for a variable. 
	 */
	public void visit(Assignment assign) {
		int id = assign.getId();
		Node n = assign.getNode(id);
		if(n instanceof Assignment) {
			Assignment d1 = (Assignment)n;
			if(d1.getVar().getVar().equals(var.getVar())) {
				setNode.add(n);
			}
		}

	}

	public void visit(Sequence seq) {

	}

}
