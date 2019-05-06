import java.util.*;


public class assignment3 {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(12);
		numbers.add(3);
		numbers.add(1);
		numbers.add(22);
		numbers.add(1);
		System.out.println(countUnique(numbers));

	}
	//This method takes a linkedlist and runs through each item and adding it to a separate list if that number is not currently present in the new list, and adding to the unique counter
	public static int countUnique(List<Integer> num){
		int unique= 0;
		//checks if the list is empty and running the if statement if it isnt
		if(!num.isEmpty()){
			LinkedList<Integer> temp = new LinkedList<Integer>();
			Iterator<Integer> i = num.iterator();
			Collections.sort(num);
			int current = i.next();
			//runs through each item but the last one
			while(i.hasNext()){
				
				if(temp.contains(current)) {
					current = i.next();
				}
				else {
					unique++;
					temp.add(current);
					current = i.next();
				}
				
				
			}
			
			//runs through the last one checking if it was added to the temp list
			if(temp.contains(current)) {
				
			}
			else {
				unique++;
				temp.add(current);
			}
		}
		
		return unique;

		
		
	}

}
