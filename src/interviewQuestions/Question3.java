package interviewQuestions;

public class Question3 {

	// Write a function that print all the 3 digit combination of number
	// between 1 and 5
	// 1, 1, 1
	// 1, 1, 2
	// 5, 5, 5

	public static void main(String[] args) {
		printNums(1, 5);
	}

	public static void printNums(int start, int end) {
		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {
				for (int n = start; n <= end; n++) {
					System.out.println(i + ", " + j + ", " + n);
				}
			}
		}

	}

}
