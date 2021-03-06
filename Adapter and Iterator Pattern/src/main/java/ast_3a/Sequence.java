package ast_3a;
/**
 * Sequence represents the sequence of statements for the modeled programming language
 * @author JayanthGangadhar
 *
 */
public class Sequence extends Statement{
	/**
	 * statement1 represents the first statement of sequence
	 * statement2 represents the second statement of sequence
	 */
	private Statement statement1;
	private Statement statement2;
	private int id;
	/**
	 * constructor
	 * @param statement1 is the first statement of sequence
	 * @param statement2 the second statement of sequence
	 */
	public Sequence(Statement statement1,Statement statement2) {
		this.statement1=statement1;
		this.statement2=statement2;
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
	 * textRepresentation computes a string that reflects the sequence of statements
	 * @return a string representation of the sequence of statements 
	 */
	public String textRepresentation() {
		return statement1.textRepresentation()+" "+statement2.textRepresentation();
	}
	@Override
	public int getId() {
		return id;
	}

}
