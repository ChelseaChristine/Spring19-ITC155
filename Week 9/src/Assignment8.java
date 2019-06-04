
public class Assignment8 {

	public static void main(String[] args) {
		
		//makes a new instance of the class ArrayIntList
		ArrayIntList listTest = new ArrayIntList();
		
		//Using the add method,  I added values into ArrayIntList listTest to fill up the list without causing extra space
		listTest.add(12);
		listTest.add(25);
		listTest.add(1);
		listTest.add(67);
		listTest.add(-43);
		listTest.add(1);
		listTest.add(18);
		listTest.add(87);
		
		//will print the list according to my toString method
		System.out.println(listTest.toString());
		
		//will replace any instance of 1 to 333
		listTest.replaceAll(1, 333);
		
		//prints and shows the difference
		System.out.println(listTest.toString());
		
		///replaces all 333 now with 101
		listTest.replaceAll(333, 101);
		
		//prints showing the change
		System.out.println(listTest.toString());
		
		// replaces all 12's with 10
		listTest.replaceAll(12, 10);
		
		//print to show change in Array
		System.out.println(listTest.toString());
	}

}
