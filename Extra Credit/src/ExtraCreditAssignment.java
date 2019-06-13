
public class ExtraCreditAssignment {

	public static void main(String[] args) {
		IntTree test = new IntTree(12);
		System.out.println("Tree Structure:");
		test.printSideways();
		//should return 13
		System.out.println(test.countEmpty());
		
		IntTree test2 = new IntTree(8);
		System.out.println("Tree Structure:");
		test2.printSideways();
		//should return 9
		System.out.println(test2.countEmpty());
		
		IntTree test3 = new IntTree(1);
		System.out.println("Tree Structure:");
		test3.printSideways();
		//should return 2
		System.out.println(test3.countEmpty());

	}

}
