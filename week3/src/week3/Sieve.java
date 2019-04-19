package week3;
//Uses a linked list to implement the Sieve of
//Eratosthenes algorithm for finding prime numbers.

import java.util.*;

public class Sieve {

	public static void main(String[] args) {
		
		// greeting
		System.out.println("This program will tell you all prime numbers up to a max number");
		Scanner console = new Scanner(System.in);
		System.out.print("Max number?");
		int max = console.nextInt();
		
		LinkedList<Integer> primes= sieve(max);
        System.out.println("Prime numbers up to " + max + ":");
        System.out.println(primes);

	}
    // Returns a list of all prime numbers up to the given maximum
    // using the Sieve of Eratosthenes algorithm.
	public static LinkedList<Integer> sieve(int max) {
		
		LinkedList<Integer> primes = new LinkedList<Integer>();
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		for(int i = 2; i<= max; i++) {
			numbers.add(i);
		}
		 while (!numbers.isEmpty()) {
	            // remove a prime number from the front of the list
	            int front = numbers.remove(0);
	            primes.add(front);

	            // remove all multiples of this prime number
	            Iterator<Integer> itr = numbers.iterator();
	            while (itr.hasNext()) {
	                int current = itr.next();
	                if (current % front == 0) { //front is not prime
	                    itr.remove(); //removes it from the list then
	                }
	            }
	      }
		 return primes;
	}

}
