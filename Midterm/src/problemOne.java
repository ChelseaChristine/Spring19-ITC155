import java.util.*;



//problem 2

//[1, 2, 6, 8]
//[10, 30, 40, 20, 60, 50]
//[-4, 1, 25, 4, 16, 9, 64, 36, 49]



//problem 3

//returns 6
//return 8

public class problemOne {

	public static void main(String[] args) {
		//creates an arraylist of numbers for testing
		ArrayList<Integer> test = new ArrayList<Integer>();
		//will be left empty for testing
		ArrayList<Integer> test2 = new ArrayList<Integer>();
		test.add(1);
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(3);
		test.add(3);
		test.add(3);
		test.add(4);
		test.add(10);
		test.add(10);
		test.add(10);

		
		
		//should return 4, as there are 3 4's
		System.out.println(maxOccurences(test));
		
		//adds more numbers to change the mode
		test.add(10);
		test.add(10);
		test.add(10);
		
		//should return 6 as there are 6 10's
		System.out.println(maxOccurences(test));
		
		//should return 0 as it is an empty list
		System.out.println(maxOccurences(test2));

	}
	
	//problem 1
	public static int maxOccurences(List<Integer> list) {
		int mode= 0;
		//checks to see if the list is empty, and if it is, returns 0 for the most occurences
		if(!list.isEmpty()) {
			Map<Integer, Integer> occurence = new TreeMap<Integer, Integer>();
			Iterator<Integer> itr = list.iterator();
			int temp = itr.next();
			int count= 0;
			
			//runs through the list and creates a map of the number : times of occurence
			while(itr.hasNext()){
				if(occurence.containsKey(temp)) {
					count = occurence.get(temp);
					occurence.put(temp, count+1);
					temp = itr.next();
					
				}
				else {
					occurence.put(temp, 1);
					temp = itr.next();
				}
				
			}
			
			//runs through the list for the last item
			if(occurence.containsKey(temp)) {
				count = occurence.get(temp);
				occurence.put(temp, count+1);
				
			}
			else {
				occurence.put(temp, 1);
			}
			//Runs through the values and assigns mode to the highest number, which was calculated to be the highest occurence in the previos work
			System.out.println(occurence);
			Collection<Integer> modeSet = occurence.values();
			for (int m : modeSet) {
				if(mode < m) {
					mode = m;
				}
				
			}
		}
		//makes the mode 0 if the list is empty
		else {
			mode = 0;
		}
		return(mode);
		
		
	}
		
}


