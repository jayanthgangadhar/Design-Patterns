package visitor_4a;
/**
 * ASTVisitor represents an interface that defines visit operations for each type of node in the
AST.
 * @author JayanthGangadhar
 */
public interface ASTVisitor {
	public void visit(InfixExpression infix);
	public void visit(PrefixExpression prefix);
	public void visit(NumberExpression num);
	public void visit(StringExpression str);
	public void visit(VariableExpression var);
	public void visit(Declaration dec);
	public void visit(Assignment assign);
	public void visit(Sequence seq);
	}
