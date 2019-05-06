
public class assignment5 {

	public static void main(String[] args) {
		writeNums(1);
		System.out.println();
		writeNums(5);
		System.out.println();
		writeNums(30);
		//writeNums(0);
		

	}
	public static void writeNums(int n) throws IllegalArgumentException{
		if(n<1) {
			throw new IllegalArgumentException("Must be one or more");
		}
		else if(n==1) {
			System.out.print(n);
		}
		else {
			writeNums(n-1);
			System.out.print(", " + n);
		}
		
	}

}
