package astTests;

import static org.junit.Assert.*;

import org.junit.Test;
import visitor_4a.*;
//import ast_3a.*;
//import set_3b.*;

/**
 * NodeSetTests represents a class to check functionality of Node
 * @author JayanthGangadhar
 *
 */
public class NodeSetTests {
	/**
	 * to test getId()
	 */
	
	@Test
	public void testId2(){
		ASTFactory astFactory = ASTFactory.instance();
		Variable x = astFactory.makeVariable("x");
		Expression one = astFactory.makeNumberExpression(1.2);
		Expression two = astFactory.makeNumberExpression(2.4);
		Operator plus = astFactory.makeOperator("+");
		Expression exp = astFactory.makeInfixExpression(plus, one, two);
		Statement decl = astFactory.makeDeclaration(x);
		Statement assign = astFactory.makeAssignment(x, exp);
		Statement seq = astFactory.makeSequence(decl, assign);
		assertEquals(5,seq.getId());
		assertEquals(0,one.getId());
	}
	/**
	 * to test getId() and getNode()
	 */
	@Test
	public void testId() {
		ASTFactory astFactory = ASTFactory.instance();
		Variable x = astFactory.makeVariable("x");
		Expression one = astFactory.makeNumberExpression(1);
		Expression two = astFactory.makeNumberExpression(2);
		Operator plus = astFactory.makeOperator("+");
		Expression exp = astFactory.makeInfixExpression(plus, one, two);
		assertEquals(8, exp.getId());
		assertEquals(exp, exp.getNode(8));
	}
	/**
	 * to test NodeSet functionality
	 */
	@Test
	public void testNodeSet() {
		NodeSet node = new NodeSet();
		ASTFactory astFactory = ASTFactory.instance();
		Variable x = astFactory.makeVariable("x");
		Expression one = astFactory.makeNumberExpression(1.2);
		Expression two = astFactory.makeNumberExpression(2.4);
		Operator plus = astFactory.makeOperator("+");
		Expression exp = astFactory.makeInfixExpression(plus, one, two);
		node.add(one);
		node.add(two);
		node.add(exp);
		assertEquals(true, node.contains(two));
		assertEquals(true, node.contains(one));
		node.remove(one);
		assertEquals(false, node.contains(one));
		assertEquals(2,node.size());
	}
	/**
	 * to test addAll() of NodeSet
	 */
	@Test
	public void testAddAll() {
		NodeSet node = new NodeSet();
		NodeSet node2 = new NodeSet();
		ASTFactory astFactory = ASTFactory.instance();
		Variable x = astFactory.makeVariable("x");
		Expression one = astFactory.makeNumberExpression(1.2);
		Expression two = astFactory.makeNumberExpression(2.4);
		Operator plus = astFactory.makeOperator("+");
		Expression exp = astFactory.makeInfixExpression(plus, one, two);
		node.add(one);
		node.add(two);
		node.add(exp);
		System.out.println(one.getId());
		System.out.println(two.getId());
		System.out.println(exp.getId());
		Variable y = astFactory.makeVariable("y");
		Expression one_y = astFactory.makeNumberExpression(1);
		Expression two_y = astFactory.makeNumberExpression(2);
		Operator plus_y = astFactory.makeOperator("+");
		Expression exp_y = astFactory.makeInfixExpression(plus_y, one_y, two_y);
		node2.add(one_y);
		node2.add(two_y);
		node2.add(exp_y);
		System.out.println(one_y.getId());
		System.out.println(two_y.getId());
		System.out.println(exp_y.getId());
		node.addAll(node2);
		assertEquals(6,node.size());
		node.remove(one_y);
		assertEquals(5,node.size());
	}
}
