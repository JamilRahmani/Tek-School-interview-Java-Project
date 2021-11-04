package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Question8 {

	public static void main(String[] args) {

		String[] data = { "test", "take", "nice", "pass", "test", "nice" };

		System.out.println("Method 1");
		printDuplicatesInArray(data);
	}

	public static void printDuplicatesInArray(String[] data) {
		Map<String, Integer> temp = new HashMap<String, Integer>(); // this map is to count each word 
		Map<String, Integer> duplicates = new HashMap<String, Integer>(); // this map is to separate the duplicates
		for (int i = 0; i < data.length; i++) {
			if (temp.containsKey(data[i])) {
				temp.put(data[i], temp.get(data[i]) + 1);
			} else {
				temp.put(data[i], 1);
			}
		}
		for (String key : temp.keySet()) { // goes through the first map and find the ones that have count of more one
			if(temp.get(key) > 1) {
				duplicates.put(key, temp.get(key));
			}
		}
		System.out.println(duplicates); // prints the map of duplicates
	}
}
