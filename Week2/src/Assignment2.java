import java.util.*;

public class Assignment2 {
	
	public static void removeEvenLength(ArrayList<String> arr1) {
		for(int i = 0; i < arr1.size(); i++) {
			int word = (arr1.get(i)).length();
			if( word % 2 == 0) {
				arr1.remove(i);
				}

		}
		
	}

	public static void main(String[] args) {
		ArrayList<String> animalNames = new ArrayList<String>();
		animalNames.add("Cat");
		animalNames.add("Dog");
		animalNames.add("Bird");
		animalNames.add("Bat");
		animalNames.add("Mouse");
		animalNames.add("Deer");
		animalNames.add("Moose");
		System.out.println(animalNames);
		removeEvenLength(animalNames);
		System.out.println(animalNames);
		


	}

}
