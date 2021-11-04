package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question9 {

	public static void main(String[] args) {

		int[] nums = { 1, 121, 321, 5, 11, 5, 12, 15, 1, 21, 5, 21, 113, 5, 111, 2, 1 };

		System.out.println("Largest: " + findLargestValue(nums));
		System.out.println("Smallest: " + findSmallestValue(nums));
		System.out.println("Sum: " + getSumOfValues(nums));
		System.out.println("Average: " + getAverageOfValues(nums));
		System.out.println("Second Largest: " + findSecondLargestValue(nums));
		System.out.println("Second Smallest: " + findSecondSmallestValue(nums));

		int[] nums2 = { 5, 7, 7, 4, 5, 6 };
		System.out.println(findLargestValueWithPosition(nums2, 4, false));

	}

	// nums = the input numbers /// position is starting from 1, largest = 1,
	// secondLargest = 2 ///// direction true = largest, direction false = smallest
	public static int findLargestValueWithPosition(int[] nums, int position, boolean direction) {
		// Convert the numbers in the given array to a set
		Set<Integer> numbersSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			numbersSet.add(nums[i]);
		}

		// Convert the set to a list
		List<Integer> numbersList = new ArrayList<Integer>(numbersSet);

		// Sort the list
		if (!direction) {
			// we are looking for largest numbers
			Collections.sort(numbersList, Collections.reverseOrder());
		} else {
			// we are looking for smallest numbers
			Collections.sort(numbersList);
		}

		// Return the number on the given position
		position -= 1; // to account for the fact the input starts from 1, and index numbers start from
						// 0
		if (position > numbersList.size() - 1 || position < 0) {
			System.out.println("We have " + numbersList.size()
					+ " unique numbers in the data provided and the position " + (position + 1) + " is not valid!");
			return -1;
		} else {
			return numbersList.get(position);
		}

	}

	// finding the second largest value
	public static int findSecondLargestValue(int[] nums) {
		int secondLargest = nums[0];
		int largest = findLargestValue(nums);

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > secondLargest && nums[i] < largest) {
				secondLargest = nums[i];
			}
		}

		return secondLargest;
	}

	// finding the second smallest value
	public static int findSecondSmallestValue(int[] nums) {
		int smallest = findSmallestValue(nums);
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > smallest && nums[i] < secondSmallest) {
				secondSmallest = nums[i];
			}
		}
		return secondSmallest;
	}

	public static int findLargestValue(int[] nums) {
		int largest = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (largest < nums[i]) {
				largest = nums[i];
			}
		}
		return largest;
	}

	public static int findSmallestValue(int[] nums) {
		int smallest = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < smallest) {
				smallest = nums[i];
			}
		}
		return smallest;
	}

	public static int getSumOfValues(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	public static double getAverageOfValues(int[] nums) {
		return (double) getSumOfValues(nums) / nums.length;
	}

}
