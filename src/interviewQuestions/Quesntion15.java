package interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class Quesntion15 {
	public static void main(String[] args) {
		int[] sample = {1,2,3,5,6,7};

		findLongestConsqSetOfNums(sample);
	}

	public static void findLongestConsqSetOfNums(int[] nums) {
		TreeSet<Integer> numbers = new TreeSet<>();
		for (int i : nums) { // add all of the numbers given to a TreeSet
			numbers.add(i);
		}

		// create collection to store all consecutive number sets
		List<Stack<Integer>> seqns = new ArrayList<>();

		int counter = 0; // create int counter to keep track of the index we work on
		// go through all of the numbers in the set
		for (Integer num : numbers) {
			if (seqns.size() == 0) {
				seqns.add(new Stack<Integer>()); // initialize the stack in the first index
				seqns.get(counter).add(num); // add the number to that stack in the first index
				continue;
			}
			if (seqns.get(counter).peek() + 1 == num) {
				// we are still in a sequence of numbers
				// we just add the number to the same stack
				seqns.get(counter).add(num);
			} else {
				// we are not in that sequence anymore
				// we go to the next index of the list
				seqns.add(new Stack<Integer>()); // add a new index to the list and init the stack
				counter++; // increase the counter
				seqns.get(counter).add(num); // add the number of that iteration to the stack
			}
		}
		
		
		int largest = Integer.MIN_VALUE; 
		for (int i = 0; i < seqns.size(); i++) {
			if(seqns.get(i).size() >= largest) {
				largest = seqns.get(i).size();
			}
		}
		System.out.println("Largest set of nums has size of " + largest);
		System.out.println("With Values " );
		for (Stack<Integer> s : seqns) {
			if(s.size() == largest) {
				System.out.println(s);
			}
		}
	}

}
