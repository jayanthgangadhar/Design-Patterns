package ast_3a;
/**
 * Declaration represents the declaration statement for the modeled programming language
 * @author JayanthGangadhar
 *
 */
public class Declaration extends Statement {
	private Variable dec;
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
	@Override
	public int getId() {
		return id;
	}

}
