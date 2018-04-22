package tests;

import static org.junit.jupiter.api.Assertions.*;
import ast.*;

import org.junit.jupiter.api.Test;
/**
 * ASTTest is a class to test functionality of all expression and statements of Node class
 * @author JayanthGangadhar
 *
 */
class ASTTests {

	@Test
	public void test1(){
		Variable x = new Variable("x");
		Expression one = new NumberExpression(1);
		Expression two = new NumberExpression(2);
		Operator plus = new Operator("+");
		Expression exp = new InfixExpression(plus, one, two);
		Statement decl = new Declaration(x);
		Statement assign = new Assignment(x, exp);
		Statement seq = new Sequence(decl, assign);
		assertEquals(seq.textRepresentation(), "var x; x = 1 + 2;");
	}
	@Test
	public void test2(){
		Variable x = new Variable("x");
		Expression one = new NumberExpression(1.2);
		Expression two = new NumberExpression(2.4);
		Operator plus = new Operator("+");
		Expression exp = new InfixExpression(plus, one, two);
		Statement decl = new Declaration(x);
		Statement assign = new Assignment(x, exp);
		Statement seq = new Sequence(decl, assign);
		assertEquals(seq.textRepresentation(), "var x; x = 1.2 + 2.4;");
	}
	@Test
	public void test3(){
		Variable a = new Variable("a");
		Expression one= new StringExpression("hello");
		Statement decl = new Declaration(a);
		Statement assign = new Assignment(a, one);
		Statement seq = new Sequence(decl,assign);
		assertEquals(seq.textRepresentation(), "var a; a = hello;");
	}
	@Test
	public void test4(){
		Variable a = new Variable("a");
		Variable b = new Variable("b");
		Expression one= new StringExpression("hello");
		Expression two= new StringExpression("bye");
		Statement decl = new Declaration(a);
		Statement decl2 = new Declaration(b);
		Statement assign = new Assignment(a, one);
		Statement assign2 = new Assignment(b, two);
		Statement seq = new Sequence(decl,assign);
		Statement seq2 = new Sequence(decl2,assign2);
		Statement seq3 = new Sequence(seq2,seq);
		assertEquals(seq3.textRepresentation(), "var b; b = bye; var a; a = hello;");
	}
	@Test
	public void test5(){
		Variable x = new Variable("x");
		Expression one = new NumberExpression(1);
		Expression two = new NumberExpression(2);
		Operator plus = new Operator("+");
		Expression exp = new PrefixExpression(plus, one, two);
		Statement decl = new Declaration(x);
		Statement assign = new Assignment(x, exp);
		Statement seq = new Sequence(decl, assign);
		assertEquals(seq.textRepresentation(), "var x; x = + 1 2;");
	}
	@Test
	public void test6(){
		Variable a = new Variable("a");
		Variable b = new Variable("b");
		Statement decl = new Declaration(a);
		Expression var = new VariableExpression(b);
		Statement assign = new Assignment(a, var);
		Statement seq = new Sequence(decl,assign);
		assertEquals(seq.textRepresentation(), "var a; a = b;");
	}
	
}
