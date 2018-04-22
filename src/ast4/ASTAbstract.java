package ast4;


/**
 * ASTAbstract is a abstract class for creating objects and keeping a track of number of instances created 
 * @author JayanthGangadhar
 *
 */
public abstract class ASTAbstract {
	/**
	 * varCount represents count of variables
	 * operatorCount represents count of operators
	 * numberCount represents count of number expressions
	 * infixCount represents count of infix expressions
	 * prefixCount represents count of prefix expressions
	 * stringCount represents count of string expressions
	 * variableCount represents count of variable expressions
	 * declarationCount represents count of declaration statements
	 * assignmentCount represents count of assignment statements
	 * sequenceCount represents count of sequence statements
	 */
	int varCount=0;
	int operatorCount=0;
	int numberCount=0;
	int infixCount=0;
	int prefixCount=0;
	int stringCount=0;
	int variableCount=0;
	int declarationCount=0;
	int assignmentCount=0;
	int sequenceCount=0;
	/**
	 * makeVariable represents creation of a variable object 
	 * @param var is the variable
	 * @return a variable object
	 */
	public abstract Variable makeVariable(String var);
	/**
	 * makeOperator represents creation of a operator object 
	 * @param op is the operator
	 * @return an operator object
	 */
	public abstract Operator makeOperator(String op);
	/**
	 * makeNumberExpression represents creation of a number expression object
	 * @param num is the integer number
	 * @return a number expression object
	 */
	public abstract NumberExpression makeNumberExpression(int num);
	/**
	 * makeNumberExpression represents creation of a number expression object
	 * @param num is the floating number
	 * @return a number expression object
	 */
	public abstract NumberExpression makeNumberExpression(double num);
	/**
	 * makeInfixExpression represents creation of a infix expression object
	 * @param op is operator
	 * @param exp1 is the first operand(expression)
	 * @param exp2 is the second operand(expression)
	 * @return an Infix expression object
	 */
	public abstract InfixExpression makeInfixExpression(Operator op, Expression exp1, Expression exp2);
	/**
	 * makePrefixExpression represents creation of a prefix expression object
	 * @param op is operator
	 * @param exp1 is the first operand(expression)
	 * @param exp2 is the second operand(expression)
	 * @return an Prefix expression object
	 */
	public abstract PrefixExpression makePrefixExpression(Operator op, Expression exp1, Expression exp2);
	/**
	 * makeStringExpression represents creation of a string expression object
	 * @param str represents the string
	 * @return a String expression object
	 */
	public abstract StringExpression makeStringExpression(String str);
	/**
	 * makeVariableExpression represents creation of a variable expression object
	 * @param var represents the variable
	 * @return a variable expression object
	 */
	public abstract VariableExpression makeVariableExpression(Variable var);
	/**
	 * makeDeclaration represents creation of a declaration statement object
	 * @param var represents the variable to be declared
	 * @return a declaration statement object
	 */
	public abstract Declaration makeDeclaration(Variable var);
	/**
	 * makeAssignment represents creation of a assignment statement object
	 * @param var represents the variable to be assigned
	 * @param exp represents the expression to be assigned to variable
	 * @return a assignment statement object
	 */
	public abstract Assignment makeAssignment(Variable var,Expression exp);
	/**
	 * makeSequence represents creation of sequence statement
	 * @param statement1 represents first statement of sequence
	 * @param statement2 represents second statement of sequence
	 * @return a sequence object
	 */
	public abstract Sequence makeSequence(Statement statement1,Statement statement2);
}
