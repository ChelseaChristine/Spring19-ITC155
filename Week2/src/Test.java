import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;



public class Test {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//creates new array called names
		ArrayList<String> names = new ArrayList<String>();
		
		//adds values into the array
		names.add("Marty Stepp");
		names.add("Stuart Reges");
		names.add("Chelsea Jansen");
		
		//adding at a specific index
		names.add(2, "Charolette Richardson");
		
		//removing at a specific index
		names.remove(0);
		
		//prints out a message when it gets a value that starts with an "A"
		for (int i = 0; i < names.size(); i++) {
			if(names.get(i).startsWith("C")) {
				System.out.println("Names starts with C!");
			}
		}
		
		if(names.contains("Chelsea Jansen")) {
			System.out.println("That name exists!");
		}
		
		//prints out the array, printing either way doesn't make a difference
		System.out.println(names.toString());
		System.out.println(names);
		
		//creating an ArrayList to scan a file and add all words into an array
		ArrayList<String> allWords = new ArrayList<String>();
		Scanner input = new Scanner(new File("words.txt"));
		
		while (input.hasNext()) {
			String word = input.next();
			allWords.add(word);
		}
		System.out.println(allWords);
		
		//reverses the order of the initial ArrayList
		ArrayList<String> reverseWords = new ArrayList<String>();
		int indexNum = 0;
		for (int i = allWords.size(); i > 0; i--){		
			reverseWords.add(indexNum, allWords.get(i-1));
			indexNum++;
			
		}
		System.out.println(reverseWords);
		
		//removes all plural words
		
		for (int i = 0; i < allWords.size(); i++) {
		    String word = allWords.get(i);
		    if (word.endsWith("s")) {
		        allWords.remove(i);
		        i--;
		    }
		}
		input.close();
		
		
		//utilizing a wrapper, then a double, wrapper holds a primitive value
		ArrayList<Double> grades = new ArrayList<Double>();
		grades.add(3.2);
		grades.add(2.7);
		grades.add(2.9);
		grades.add(4.0);

		double myGrade = grades.get(0);
		
		System.out.println(myGrade);
		
		//adds all the grades together then prints out the average
		double total = 0;
		for (int i = 0; i <grades.size(); i++) {
			total += grades.get(i);
			System.out.println(total);
			
		}
		System.out.println(total/grades.size());
		
		

		
		
		
		
		
	
	}
}