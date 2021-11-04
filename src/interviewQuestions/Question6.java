package interviewQuestions;

public class Question6 {

	// find out if a word is palindrome

	public static void main(String[] args) {

		String word = "ABcba";

		System.out.println("isPalindrome1 " + isPalindrome1(word));
		System.out.println("isPalindrome2 " + isPalindrome2(word));
		System.out.println("isPalindrome3 " + isPalindrome3(word, true));
		
	}

	public static boolean isPalindrome1(String word) {
		// String builder or buffer has a method reverse that you can use to reverse
		// string
		StringBuilder sb = new StringBuilder(word);
		return word.equals(String.valueOf(sb.reverse()));
	}

	public static boolean isPalindrome2(String word) {
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			rev += word.charAt(i);
		}
		return word.equals(rev);
	}

	public static boolean isPalindrome3(String word, boolean considerCase) {
		String w = "";
		if(considerCase) {
			w = word;
		} else {
			w = word.toLowerCase();
		}
		
		for (int fwd = 0, bck = w.length() - 1; fwd < w.length(); fwd++, bck--) {
			if (fwd == bck || fwd > bck) {
				return true;
			}

			if (w.charAt(fwd) == w.charAt(bck)) {
				continue;
			}
			return false;
		}
		return true;
	}

}
