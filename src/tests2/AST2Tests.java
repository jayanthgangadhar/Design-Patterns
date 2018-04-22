package tests2;

import ast2.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * ASTTest is a class to test functionality of all expression and statements of Node class
 * @author JayanthGangadhar
 *
 */
class AST2Tests {

	@Test
	public void test1(){
		ASTFactory astFactory = new ASTFactory();
		Variable x = astFactory.makeVariable("x");
		Expression one = astFactory.makeNumberExpression(1);
		Expression two = astFactory.makeNumberExpression(2);
		Operator plus = astFactory.makeOperator("+");
		Expression exp = astFactory.makeInfixExpression(plus, one, two);
		Statement decl = astFactory.makeDeclaration(x);
		Statement assign = astFactory.makeAssignment(x, exp);
		Statement seq = astFactory.makeSequence(decl, assign);
		assertEquals(seq.textRepresentation(), "var x; x = 1 + 2;");
	}
	@Test
	public void test2(){
		ASTFactory astFactory = new ASTFactory();
		Variable x = astFactory.makeVariable("x");
		Expression one = astFactory.makeNumberExpression(1.2);
		Expression two = astFactory.makeNumberExpression(2.4);
		Operator plus = astFactory.makeOperator("+");
		Expression exp = astFactory.makeInfixExpression(plus, one, two);
		Statement decl = astFactory.makeDeclaration(x);
		Statement assign = astFactory.makeAssignment(x, exp);
		Statement seq = astFactory.makeSequence(decl, assign);
		assertEquals(seq.textRepresentation(), "var x; x = 1.2 + 2.4;");
	}
	@Test
	public void test3(){
		ASTFactory astFactory = new ASTFactory();
		Variable a = astFactory.makeVariable("a");
		Expression one= astFactory.makeStringExpression("hello");
		Statement decl = astFactory.makeDeclaration(a);
		Statement assign = astFactory.makeAssignment(a, one);
		Statement seq = astFactory.makeSequence(decl, assign);
		assertEquals(seq.textRepresentation(), "var a; a = hello;");
	}
	@Test
	public void test4(){
		ASTFactory astFactory = new ASTFactory();
		Variable a = astFactory.makeVariable("a");
		Variable b = astFactory.makeVariable("b");
		Expression one= astFactory.makeStringExpression("hello");
		Expression two= astFactory.makeStringExpression("bye");
		Statement decl = astFactory.makeDeclaration(a);
		Statement decl2 = astFactory.makeDeclaration(b);
		Statement assign = astFactory.makeAssignment(a, one);
		Statement assign2 = astFactory.makeAssignment(b, two);
		Statement seq = astFactory.makeSequence(decl,assign);
		Statement seq2 = astFactory.makeSequence(decl2,assign2);
		Statement seq3 = astFactory.makeSequence(seq2,seq);
		assertEquals(seq3.textRepresentation(), "var b; b = bye; var a; a = hello;");
	}
	@Test
	public void test5(){
		ASTFactory astFactory = new ASTFactory();
		Variable x = astFactory.makeVariable("x");
		Expression one = astFactory.makeNumberExpression(1);
		Expression two = astFactory.makeNumberExpression(2);
		Operator plus = astFactory.makeOperator("+");
		Expression exp = astFactory.makePrefixExpression(plus, one, two);
		Statement decl = astFactory.makeDeclaration(x);
		Statement assign = astFactory.makeAssignment(x, exp);
		Statement seq = astFactory.makeSequence(decl, assign);
		assertEquals(seq.textRepresentation(), "var x; x = + 1 2;");
	}
	@Test
	public void test6(){
		ASTFactory astFactory = new ASTFactory();
		Variable a = astFactory.makeVariable("a");
		Variable b = astFactory.makeVariable("b");
		Statement decl = astFactory.makeDeclaration(a);
		Expression var = astFactory.makeVariableExpression(b);
		Statement assign = astFactory.makeAssignment(a, var);
		Statement seq = astFactory.makeSequence(decl,assign);
		assertEquals(seq.textRepresentation(), "var a; a = b;");
	}
	
}
