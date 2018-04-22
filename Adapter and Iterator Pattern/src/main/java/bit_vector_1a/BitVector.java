package bit_vector_1a;
/**
 * BitVector represents set of natural numbers where the i'th 
 * bit indicates whether the number i is in the set. 
 * @author JayanthGangadhar
 *
 */
public class BitVector implements IBitVector {
	/**
	 * bitVectorArray represents an array of integers to store bit vectors
	 * size represents the number of elements in bitVectorArray
	 * count represents number of non-zero bits in the BitVector
	 */
	int[] bitVectorArray; 
	int size;
	int count;
	/**
	 * constructor
	 */
	public BitVector() {
		this.count= 0;
		this.size = 1;
		this.bitVectorArray = new int[size];
	}
	/**
	 * Determine if the bit at position i is set.
	 * @param i represents the bit position
	 */
	public boolean get(int i) {
		int bit = i/32;
		if(bit+1>size)return false;
		int bitPosition = i%32;
		int tempBit = 1<<bitPosition;
		int tempCheck = bitVectorArray[bit] & tempBit;
		return (tempCheck!=0);
	}
	/**
	 * Set the bit at position i.
	 * @param i represents the bit position
	 */
	public void set(int i) {
		if(!get(i)) {
		int temp;
		int bit = i/32;
		int bitPosition = i%32;
		if(bit+1>size) {
			size = bit+1;
			int[] tempArray = new int[size];
			for(int j=0;j<bitVectorArray.length;j++) {
				tempArray[j] = bitVectorArray[j];
			}
			bitVectorArray = tempArray;
		}
		temp = 1<<bitPosition;
		bitVectorArray[bit]= bitVectorArray[bit] | temp;
		count+=1;
		}}
	/**
	 * Clear the bit at position i.
	 * @param i represents the bit position
	 */
	public void clear(int i) {
		int bit = i/32;
		int bitPosition = i%32;
		int temp = 1<<bitPosition;
		if(bit+1<=size && this.get(i)) {
			bitVectorArray[bit]= bitVectorArray[bit] & (~ temp);
			count-=1;}
	}
	/**
	 * Set the bits in the argument BitVector b.
	 * @param b represents a bitVector 
	 */
	public void copy(BitVector b) {
		int bSize = b.size;
		for(int i=0;i<bSize;i++) {
			for(int j=0;j<32;j++) {
				int temp = i*32+j;
				if(b.get(temp) && !this.get(temp)) {
					this.set(temp);}
				}
		}
	}
	/**
	 * Determine the number of non-zero bits in the BitVector.
	 */
	public int size() {
		return count;
	}

}
