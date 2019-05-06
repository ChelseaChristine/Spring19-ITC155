
public class assignment5 {

	public static void main(String[] args) {
		//tests to make sure it will print atleast 1
		writeNums(1);
		System.out.println();
		//two tests to make sure it rans as needed
		writeNums(5);
		System.out.println();
		writeNums(30);
		//When uncommented, the below method will throw out the IllegalArgumentException
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
