package interviewQuestions;

import java.util.Stack;

public class Question14 {
	public static void main(String[] args) {
		String sample1 = "()()()()()()()()()()()";
		String sample2 = "(((()()()(()))))";
		String sample3 = ")((()()()(()))))";
		String sample4 = "<(()){}{<((({{{{}}}})))>()<>()}>";
		String sample5 = "<{[()]}>";
		String sample6 = "<{[(test)(test2)]}>";
		String sample7 = null;

		System.out.println("Sample 1: " + isBalanced(sample1));
		System.out.println("Sample 2: " + isBalanced(sample2));
		System.out.println("Sample 3: " + isBalanced(sample3));
		System.out.println("Sample 4: " + isBalanced(sample4));
		System.out.println("Sample 5: " + isBalanced(sample5));
		System.out.println("Sample 6: " + isBalanced(sample6));
		System.out.println("Sample 7: " + isBalanced(sample7));

	}

	public static boolean isBalanced(String str) {
		// validation - make sure that the str is not null
		if(str == null) {
			System.out.println("Input was null");
			return false;
		}

		// stack for chars
		Stack<Character> chars = new Stack<Character>();

		for (Character c : str.toCharArray()) {
			// if its an opening - add it to the stack
			if (c == '(' || c == '{' || c == '[' || c == '<') {
				chars.add(c);
			} else {
				// at this point, there must be at least one var in the stack
				if (chars.size() < 1) {
					return false;
				}
				// else its closing - compare that with the last value added to the stack
				// checking (
				if (c == ')' && chars.pop() != '(') {
					return false;
				}
				// checking {
				if (c == '}' && chars.pop() != '{') {
					return false;
				}
				// checking [
				if (c == ']' && chars.pop() != '[') {
					return false;
				}
				// checking <
				if (c == '>' && chars.pop() != '<') {
					return false;
				}
				
			}
		}

		return chars.size() == 0;
	}
}
