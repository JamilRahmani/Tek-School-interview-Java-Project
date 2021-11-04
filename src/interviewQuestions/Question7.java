package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class Question7 {
	public static void main(String[] args) {

		String[] data = { "test", "take", "nice", "pass", "test", "nice" };

		System.out.println("Method 1");
		printDuplicatesInArray1(data);
		System.out.println("Method 2");
		printDuplicatesInArray2(data);
	}

	public static void printDuplicatesInArray1(String[] data) {
		out: for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].equals(data[j])) {
					System.out.println("Duplicate value found: " + data[i] + " on indexes " + i + " and " + j);
//					break out;
				}
			}
		}
	}

	public static void printDuplicatesInArray2(String[] data) {

		Set<String> temp = new HashSet<String>();

		for (int i = 0; i < data.length; i++) {
			if (!temp.add(data[i])) {
				// this element is a duplicate
				System.out.println("Duplicate element found on index " + i + " with value of:" + data[i]);
			}
		}

	}

}
