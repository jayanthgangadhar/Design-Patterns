package ast_4;

import static org.junit.Assert.*;

import org.junit.Test;

import visitor_4a.*;
/**
 * ASTNodeCountVisitorTests is used to test functionality of ASTVisitor
 * @author JayanthGangadhar
 *
 */
public class ASTNodeCountVisitorTests {

	/**
	 * Testing toString() and node visit functions.
	 */
	@Test
	public void test() {
		
		ASTFactory astFactory = ASTFactory.instance();
		Variable x = astFactory.makeVariable("x");
		Expression one = astFactory.makeNumberExpression(1.2);
		Expression two = astFactory.makeNumberExpression(2.4);
		Operator plus = astFactory.makeOperator("+");
		Expression exp = astFactory.makeInfixExpression(plus, one, two);
		Statement decl = astFactory.makeDeclaration(x);
		Statement assign = astFactory.makeAssignment(x, exp);
		Statement seq = astFactory.makeSequence(decl, assign);
		ASTNodeVisit node = new ASTNodeVisit();
		ASTNodeCountVisitor visitor = new ASTNodeCountVisitor();
		ASTSearchVisitor search = new ASTSearchVisitor(x);
		node.accept(visitor);
		node.accept(search);
		NodeSet ns = new NodeSet();
		ns = search.setNode;
		assertEquals("var x;x = 1.2 + 2.4;" , ns.toString());
		assertEquals(2,visitor.numCount);
		assertEquals(1,visitor.decCount);
		assertEquals(1,visitor.seqCount);
	}
}
