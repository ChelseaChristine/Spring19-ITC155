

public class ArrayIntList {
	private int[] elementData;
	private int size;
	
	//constructor
	public ArrayIntList() {
		elementData = new int[100];
		size = 0;
	}
	
	//method is used to add elements into the array, then increases it by one so the array isnt full of empty space
	public void add(int value) {
		elementData[size] = value;
		size++;
	}
	
	//displays all the elements as a toString
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		else {
			String result ="[" +elementData[0];
			for (int i = 1; i < size; i++) {
				result += ", " + elementData[i];
			}
			result += ']';
			return result;
		}
	}
	
	//this method will take two values, then loop through a list replacing the first value noted with the second value everywhere in the list
	public void replaceAll(int value1, int value2) {
		
		//Loops through the list comparing each element to value1, if it matches it replaces that element with value2
		for(int i = 0; i<size; i++) {
			if(elementData[i] == value1) {
				elementData[i] = value2;
			}
		}
		
	}

}
