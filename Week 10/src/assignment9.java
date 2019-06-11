
public class assignment9 {

	public static void main(String[] args) {
		
		//should return true
		LinkedIntList list = new LinkedIntList();
		list.add(-20);
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(80);
		list.add(100);
		System.out.println(list.isSorted());
		
		//should return false
		LinkedIntList list2 = new LinkedIntList();
		list2.add(100);
		list2.add(20);
		list2.add(60);
		list2.add(-20);
		list2.add(40);
		list2.add(60);
		System.out.println(list2.isSorted());
		
		//should return true
		LinkedIntList list3 = new LinkedIntList();
		System.out.println(list3.isSorted());

	}

}
