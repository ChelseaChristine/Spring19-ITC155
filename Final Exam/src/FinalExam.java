import java.util.*;

//Question 1
//Answer is O(N^2)


public class FinalExam {

	public static void main(String[] args) {
		//here is my testing for Question 2, which is located near the end of this class
		Integer[] test = {3,7,6,5,2,1};
		
		Stack<Integer> q = new Stack<Integer>();
		
		//adds all items into the stack
		for(int a : test) {
			q.add(a);
			
		}
		
		System.out.println(q);
		//these two should appear the same as the previous print
		System.out.println(copyStack(q));
		System.out.println(q);
		
  		
		
		//Here is my testing for Question 3, which is the method is located at the end of LinkedIntList.java
		
		//should return true
		LinkedIntList list = new LinkedIntList();
		list.add(-13);
		list.add(8);
		list.add(10);
		list.add(50);
		list.add(65);
		list.add(72);
		System.out.println(list.isSorted());
		
		//should return false
		LinkedIntList list2 = new LinkedIntList();
		list2.add(53);
		list2.add(20);
		list2.add(45);
		list2.add(-200);
		list2.add(1);
		list2.add(12);
		System.out.println(list2.isSorted());
		
		//should return true
		LinkedIntList list3 = new LinkedIntList();
		System.out.println(list3.isSorted());

	}
	
	
	public static Stack<Integer> copyStack(Stack<Integer> t) {
		Queue<Integer> temp= new LinkedList<Integer>();
		Stack<Integer> copy = new Stack<Integer>();
		
		//this will move the item's, in reverse order, to the queue
		while(!t.isEmpty()){
			int n = t.pop();
			temp.add(n);
	        
		}
		//this will add it back into the stack, but in reverse order
		while(!temp.isEmpty()){
			int n = temp.remove();
			t.push(n);
		}
		//adds the items back into the queue at the correct order
		while(!t.isEmpty()){
			int n = t.pop();
			temp.add(n);
	        
		}
		//adds the items back into now both stacks from the queue into the correct order
		while(!temp.isEmpty()){
			int n = temp.remove();
			t.push(n);
			copy.push(n);
		}
		return copy;
		
	}

}
