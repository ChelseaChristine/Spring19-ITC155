import java.util.Arrays;

//I believe this algorithm not to be any faster than the normal sort, mainly due to the fact nothing, in terms of the loops
//has changed, with the list just going in reverse this time instead of forwards, and one added variable, the index
//in order to know where to place the last number, making this algorithm's complexity class to be O(N^2), the same
//as the normal selectionSort since it goes over N * 2, but the work of the 2 for loops
public class Assignment7 {

	public static void main(String[] args) {
		int[] list= {12,2,44,5,17,3};
		//prints out the list not sorted
		System.out.println(Arrays.toString(list));
		selectionSort(list);
		//prints out the list sorted, by going from the end of the list and placing the largest numbers there
		System.out.println(Arrays.toString(list));

	}
	
	public static void swap(int[] list, int i, int j) {
		int temp= list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	public static void selectionSort(int[] a) {
		//runs through the entire list, starting at the end and working its way to the beginning
		for(int i= a.length-1; i >= 0; i--) {
			//grabs the index number of the last number along with the actual number, knowing where to start off with
			int largest = a[i];
			int index = i;
			//loops through the entire list again, but mainly to pick up the largest number and place it last, along with getting the index so the later swap knows where to place it
			for(int j = 0; j < i; j++) {
				if(a[j] > largest) {
					largest = a[j];
					index = j;
				}
				
			}
			//swaps the largest one to the back
			swap(a, i, index);
			
		}
		
	}

}
