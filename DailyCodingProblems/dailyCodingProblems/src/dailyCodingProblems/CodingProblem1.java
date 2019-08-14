package dailyCodingProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Vector;

/**
*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
*
*For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*
*Bonus: Can you do this in one pass?
*
*
*Doing this with Linked List, Array List, and Vector for practice
*/

public class CodingProblem1 {
	//setting variable, random object, and lists
	private static int k = 29;
	
	private static Random rand = new Random();
	private static LinkedList<Integer> numLinkedList = new LinkedList<Integer>();
	private static ArrayList<Integer> numArrayList = new ArrayList<Integer>();
	private static Vector<Integer> numVector = new Vector<Integer>();
	
	public static boolean inList() {
		//Linked List implementation
//		for(Integer num : numLinkedList) { //iterate through the list, setting num to the current integer
//			if(numLinkedList.contains(k - num)) { //if the list contains the value of k - num, that means two numbers add up to k
//				return true;
//			}
//		}
		
		//Array List implementation
//		for(Integer num : numArrayList) { //iterate through the list, setting num to the current integer
//			if(numArrayList.contains(k - num)) { //if the list contains the value of k - num, that means two numbers add up to k
//				return true;
//			}
//		}
		
		//Vector implementation
		for(Integer num : numVector) { //iterate through the list, setting num to the current integer			
			if(numVector.contains(k - num)) { //if the list contains the value of k - num, that means two numbers add up to k
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		//loop to add random numbers to each list
		for(int i = 0; i < 10; i++) {
			int numToAdd = rand.nextInt(30) + 1; //add 1 to prevent "Bound must be positive exception" nextInt() uses bound - 1 which results in occasional 0 - 1 instaces and produces error.
			
			numLinkedList.add(rand.nextInt(numToAdd));
			numArrayList.add(rand.nextInt(numToAdd));
			numVector.add(rand.nextInt(numToAdd));
		}
		
		System.out.println("Values in Linked List:" + numLinkedList);
		System.out.println("Values in Array List:" + numArrayList);
		System.out.println("Values in Vector:" + numVector);

		if(inList()) {
			System.out.println("Two numbers add up to " + k);
		}
	}
}
