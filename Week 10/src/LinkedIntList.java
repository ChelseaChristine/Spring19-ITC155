
public class LinkedIntList {
	private ListNode front; // first value in the list

	// construct an empty list
	public LinkedIntList() {
		front = null;
	}

	// append a value to the end of the list
	public void add(int value) {
		if (front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while (current.next != null) {
				current = current.next;
			}

			current.next = new ListNode(value);
		}

	}

	// return a comma separated, bracketed version of the list
	public String toString() {
		if (front == null) {
			return "[]";
		} else {
			String result = "[" + front.data; // fence post
			ListNode current = front.next;
			while (current != null) {
				result += " , " + current.data;
				current = current.next;
			}

			result += "]";
			return result;
		}
	}
	//Here is my isSorted method for assignment 9
	public boolean isSorted(){
		//sets the return result to true to begin with
	    boolean result = true;
	    //if the list is null, returns true as it technically is sorted, ending the method here
	    if(front == null)
	        return result;
	    
	    //assigns one variable to the beginning of the LinkedList, and the other variable to the next value
	    ListNode previous = front;
	    ListNode current = previous.next;
	    //Will run through all the nodes at this point until it hits null
	    while (current != null){
	    	//this will determine if its in order, if not it makes result false
	        if(previous.data > current.data)
	            result = false;
	        else
	        	//if the two items previously are in order, it will move on to the next set of nodes and compares them, with 
	        	//the result staying true, and only changing to false if something isnt in order
	            previous = current;
	            current = current.next;
	    }
	    //returns either true if its in order, or false if any part of it is not in order
	    return result;
	}


}
