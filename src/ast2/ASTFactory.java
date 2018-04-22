package ast2;
/**
 * ASTFactory Factory classes to generate object of concrete class based on given information
 * @author JayanthGangadhar
 *
 */
public class ASTFactory {
	/**
	 * makeVariable represents creation of a variable object 
	 * @param var is the variable
	 * @return a variable object
	 */
	public Variable makeVariable(String var) {
		return new Variable(var);
	}
	/**
	 * makeOperator represents creation of a operator object 
	 * @param op is the operator
	 * @return an operator object
	 */
	public Operator makeOperator(String op) {
		return new Operator(op);
	}
	/**
	 * makeNumberExpression represents creation of a number expression object
	 * @param num is the integer number 
	 * @return a number expression object
	 */
	public NumberExpression makeNumberExpression(int num) {
		return new NumberExpression(num);
	}
	/**
	 * makeNumberExpression represents creation of a number expression object
	 * @param num is the floating number 
	 * @return a number expression object
	 */
	public NumberExpression makeNumberExpression(double num) {
		return new NumberExpression(num);
	}
	/**
	 * makeInfixExpression represents creation of a infix expression object
	 * @param op is operator
	 * @param exp1 is the first operand(expression)
	 * @param exp2 is the second operand(expression)
	 * @return an Infix expression object
	 */
	public InfixExpression makeInfixExpression(Operator op, Expression exp1, Expression exp2) {
		return new InfixExpression(op, exp1, exp2);
	}
	/**
	 * makePrefixExpression represents creation of a prefix expression object
	 * @param op is operator
	 * @param exp1 is the first operand(expression)
	 * @param exp2 is the second operand(expression)
	 * @return an Prefix expression object
	 */
	public PrefixExpression makePrefixExpression(Operator op, Expression exp1, Expression exp2) {
		return new PrefixExpression(op, exp1, exp2);
	}
	/**
	 * makeStringExpression represents creation of a string expression object
	 * @param str represents the string
	 * @return a String expression object
	 */
	public StringExpression makeStringExpression(String str) {
		return new StringExpression(str);
	}
	/**
	 * makeVariableExpression represents creation of a variable expression object
	 * @param var represents the variable
	 * @return a variable expression object
	 */
	public VariableExpression makeVariableExpression(Variable var) {
		return new VariableExpression(var);
	}
	/**
	 * makeDeclaration represents creation of a declaration statement object
	 * @param var represents the variable to be declared
	 * @return a declaration statement object
	 */
	public Declaration makeDeclaration(Variable var) {
		return new Declaration(var);
	}
	/**
	 * makeAssignment represents creation of a assignment statement object
	 * @param var represents the variable to be assigned
	 * @param exp represents the expression to be assigned to variable
	 * @return a assignment statement object
	 */
	public Assignment makeAssignment(Variable var,Expression exp) {
		return new Assignment(var,exp);
	}
	/**
	 * makeSequence represents creation of sequence statement
	 * @param statement1 represents first statement of sequence
	 * @param statement2 represents second statement of sequence
	 * @return a sequence object
	 */
	public Sequence makeSequence(Statement statement1,Statement statement2) {
		return new Sequence(statement1,statement2);
	}
	
	
}
