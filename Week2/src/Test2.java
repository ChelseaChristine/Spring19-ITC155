//ArrayList examples
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
				//build the list of stop words
				ArrayList<String> stopWords = new ArrayList<String>();
				stopWords.add("a");
				stopWords.add("be");
				stopWords.add("by");
				stopWords.add("how");
				stopWords.add("is");
				stopWords.add("it");
				stopWords.add("or");
				stopWords.add("that");
				stopWords.add("the");
				stopWords.add("this");
				stopWords.add("to");
				stopWords.add("why");
				
				//process the file printing all but the stop words
				
				
				@SuppressWarnings("resource")
				Scanner input = new Scanner(new File("words.txt"));
				
				while(input.hasNext()){
					String next = input.next();
					if(!stopWords.contains(next.toLowerCase())){
						System.out.println(next + " ");
					}
					
				}
				//build a list of words, add tildes, and then removes them
				
				//create an array list
				ArrayList<String> words = new ArrayList<String>();
				
				//fill the list
				words.add("seal");
				words.add("cat");
				words.add("dog");
				words.add("fox");
				words.add("slot");
				
				System.out.println("Words: " + words);
				
				//insert one tilde in front of each word
				for(int i = 0; i < words.size(); i+=2){  
					words.add(i, "~");
				
				}
				System.out.println("After we added the tilde =" + words);
				
				//remove the tildes
				for(int i = 0; i < words.size(); i++){
					words.remove(i);
				}
				System.out.println("After we removed the tilde" + words);
				
				//create an ArrayList of Integers
				ArrayList<Integer> list = new ArrayList<Integer>();
				
				//populate the ArrayList
				list.add(13);
				list.add(47);
				list.add(15);
				list.add(9);
			
				int sum = 0;
				for(int n : list){  //for each element  in the list
					System.out.println(n);
					System.out.println("Sum is : " + sum);
					sum+=n;
				}
				
				System.out.println(list);
				System.out.println("Sum: " + sum);
				



		
	}

}
