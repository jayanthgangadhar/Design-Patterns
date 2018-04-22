package visitor_4a;
/**
 * Declaration represents the declaration statement for the modeled programming language
 * @author JayanthGangadhar
 *
 */
public class Declaration extends Statement implements ASTNode {
	private Variable dec;
	public Variable getDec() {
		return dec;
	}
	private int id;
	/**
	 * constructor
	 * @param declaration is the variable to be declared
	 */
	public Declaration(Variable declaration) {
		this.dec = declaration;
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
	 * textRepresentation computes a string that reflects the declaration statement
	 * @return a string representation of the declaration statement 
	 */
	public String textRepresentation() {
		return "var "+dec.getVar()+";";
	}
	
	/**
	 * getId() returns id associated with this node
	 */
	public int getId() {
		return id;
	}
	/**
	 * accept() is passed the same visitor object but then the method visit() is called using
	 * the visitor object
	 */
	public void accept(ASTVisitor visitor) {
		visitor.visit(this);
	}

}
