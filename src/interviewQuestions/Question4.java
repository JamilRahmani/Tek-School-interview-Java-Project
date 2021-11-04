package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Question4 {

	// write a function that counts the occurrence of each character in a given
	// string

	public static void main(String[] args) {

		System.out.println(charsWithCount(
				"this is a test of the method that is going to count the number of chars in this string"));

	}

	public static Map<Character, Integer> charsWithCount(String str) {
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (chars.containsKey(str.charAt(i))) {
				// the char is already in the map
				// 1. get the current
				// 2. increase the count by one
				// 3. assign this new count to that key in the map
				chars.put(str.charAt(i), chars.get(str.charAt(i)) + 1);
			} else {
				// the char does not exist as a key in the map
				// add the char as a key
				// add count of 1
				chars.put(str.charAt(i), 1);
			}
		}
		return chars;
	}

}
