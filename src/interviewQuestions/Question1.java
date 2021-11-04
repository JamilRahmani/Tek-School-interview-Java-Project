package interviewQuestions;

import java.util.HashSet;

public class Question1 {

	public static void main(String[] args) {

		String testValue = "Free$dom&Mort%gage Free$dom&Mort%gage Free$dom&Mort%gage";

		System.out.println(getResultBasedOnRules(testValue));

	}

	public static String getResultBasedOnRules(String str) {
		String reg = str.replaceAll("[a-zA-Z]", "");
		String[] words = str.split("[^a-zA-Z]");

		String res = "";

		for (int i = 0; i < words.length; i++) {

			res += processWord(words[i]);

			if (i <= reg.length() - 1) {
				res += reg.charAt(i);
			}
		}

		return res;
	}

	private static String processWord(String str) {
		String r = str.substring(1, str.length() - 1);
		HashSet<Character> chars = new HashSet<Character>();

		for (int i = 0; i < r.length(); i++) {
			chars.add(r.charAt(i));
		}

		return "" + str.charAt(0) + chars.size() + str.charAt(str.length() - 1);
	}

}
