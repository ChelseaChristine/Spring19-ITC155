package week3;

import java.util.*;


public class TestLL {
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("seal");
		animals.add("wolf");
		animals.add("wolverine");
		animals.add("hippopotamus");
		
		System.out.println(longest(animals));
		System.out.println(animals);
		
		removeEvenLength(animals);	
		System.out.println(animals);
		
		System.out.println(longest(animals));
		
		
	}
	//improved RemoveEvenLengths uses LinkedList and iterator
	public static void removeEvenLength(LinkedList<String> list) {
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			String element = i.next();
			if (element.length() % 2 == 0) {
				//is even
				i.remove();
			}
		}
		
	}
	//return longest string in a list
	public static String longest(LinkedList<String> list) {
		Iterator<String> i =  list.iterator();
		String result = i.next();  //store in a var to avoid advancing
		System.out.println("results: " + result);
		while(i.hasNext()) {
			String next = i.next();
			System.out.println("next " + next);
			if(next.length() > result.length()) {
				result = next;
			}
		}
		return result;
	}


}
