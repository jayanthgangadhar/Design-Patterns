package ast_3a;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
/**
 * ASTFactory Factory classes to generate object of concrete class based on given information
 * @author JayanthGangadhar
 *
 */

public class ASTFactory extends ASTAbstract {
	/**
	 * ASTFactory is a static variable that ensures only one instance of the singleton class ever exists 
	 */
	private static ASTFactory theFactory = null;
	/**
	 * empty constructor
	 */
	private ASTFactory() {}
	  /**
	   * instance method creates an object of ASTFactory
	   * @return an object of ASTFactory
	   */
	public static ASTFactory instance() {
	  if (theFactory == null) {
	    theFactory = new ASTFactory();
	  }
	  return theFactory;
	}
	/**
	 * makeVariable represents creation of a variable object 
	 * @param var is the variable
	 * @return a variable object
	 */
	public Variable makeVariable(String var) {
		varCount+=1;
		return new Variable(var);
	}
	/**
	 * makeOperator represents creation of a operator object 
	 * @param op is the operator
	 * @return an operator object
	 */
	public Operator makeOperator(String op) {
		operatorCount+=1;
		return new Operator(op);
	}
	/**
	 * makeNumberExpression represents creation of a number expression object
	 * @param num is the integer number 
	 * @return a number expression object
	 */
	public NumberExpression makeNumberExpression(int num) {
		numberCount+=1;
		return new NumberExpression(num);
	}
	/**
	 * makeNumberExpression represents creation of a number expression object
	 * @param num is the floating number 
	 * @return a number expression object
	 */
	public NumberExpression makeNumberExpression(double num) {
		numberCount+=1;
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
		infixCount+=1;
		return new InfixExpression(op, exp1, exp2);
	}
	/**
	 * makePreExpression represents creation of a prefix expression object
	 * @param op is operator
	 * @param exp1 is the first operand(expression)
	 * @param exp2 is the second operand(expression)
	 * @return an Prefix expression object
	 */
	public PrefixExpression makePrefixExpression(Operator op, Expression exp1, Expression exp2) {
		prefixCount+=1;
		return new PrefixExpression(op, exp1, exp2);
	}
	/**
	 * makeStringExpression represents creation of a string expression object
	 * @param str represents the string
	 * @return a String expression object
	 */
	public StringExpression makeStringExpression(String str) {
		stringCount+=1;
		return new StringExpression(str);
	}
	/**
	 * makeVariableExpression represents creation of a variable expression object
	 * @param var represents the variable
	 * @return a variable expression object
	 */
	public VariableExpression makeVariableExpression(Variable var) {
		variableCount+=1;
		return new VariableExpression(var);
	}
	/**
	 * makeDeclaration represents creation of a declaration statement object
	 * @param var represents the variable to be declared
	 * @return a declaration statement object
	 */
	public Declaration makeDeclaration(Variable var) {
		declarationCount+=1;
		return new Declaration(var);
	}
	/**
	 * makeAssignment represents creation of a assignment statement object
	 * @param var represents the variable to be assigned
	 * @param exp represents the expression to be assigned to variable
	 * @return a assignment statement object
	 */
	public Assignment makeAssignment(Variable var,Expression exp) {
		assignmentCount+=1;
		return new Assignment(var,exp);
	}
	/**
	 * makeSequence represents creation of sequence statement
	 * @param statement1 represents first statement of sequence
	 * @param statement2 represents second statement of sequence
	 * @return a sequence object
	 */
	public Sequence makeSequence(Statement statement1,Statement statement2) {
		sequenceCount+=1;
		return new Sequence(statement1,statement2);
	}
	
	public void report() {
		Logger log = Logger.getLogger("ast");
		log.setUseParentHandlers(false);
		log.addHandler(new StreamHandler(System.out, new SimpleFormatter()));
		log.log(Level.ALL,"Number Expressions{0}",numberCount);
		log.log(Level.ALL,"Infix Expressions{0}",infixCount);
		log.log(Level.ALL,"Prefix Expressions{0}",prefixCount);
		log.log(Level.ALL,"String Expressions{0}",stringCount);
		log.log(Level.ALL,"Variable Expressions{0}",variableCount);
		log.log(Level.ALL,"Sequence Statement{0}",numberCount);
		log.log(Level.ALL,"Declaration Statement{0}",numberCount);
		log.log(Level.ALL,"Assignment Statement{0}",numberCount);
	}
	
	public List<Integer> reportTest() {
		List<Integer> countList = new ArrayList<Integer>();
		countList.add(numberCount);
		countList.add(infixCount);
		countList.add(prefixCount);
		countList.add(variableCount);
		countList.add(stringCount);
		countList.add(assignmentCount);
		countList.add(sequenceCount);
		countList.add(declarationCount);
		return countList;
	}
	
}
