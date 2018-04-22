package ast_3a;
/**
 * String Expression represents a string expression for the modeled programming
 * language
 * @author JayanthGangadhar
 *
 */
public class StringExpression extends Expression {
	/**
	 * str represents the string
	 */
	private int id;
	private String str;
	/**
	 * constructor
	 * @param str is the string parameter to the expression
	 */
	public StringExpression(String str) {
		this.str=str;
		id= count;
		if(count==0) {
			nodeArray = new Node[count+1];
		}
		else {
			Node[] temp = nodeArray;
			nodeArray = new Node[count+1];
			for(int i=0;i<temp.length;i++) {
				nodeArray[i] = temp[i];
			}
		}
		nodeArray[count] = this;
		count++;
	}
	/**
	 * textRepresentation computes a string that reflects the String Expression
	 * @return a String expression
	 */
	public String textRepresentation() {
		return str;
	}
	@Override
	public int getId() {
		return id;
	}

}
