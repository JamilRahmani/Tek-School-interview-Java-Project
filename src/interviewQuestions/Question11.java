package interviewQuestions;

public class Question11 {
	public static void main(String[] args) {

		printFizzBuzz(7, 700);

	}

	public static void printFizzBuzz(int start, int end) {
		for (int i = start; i <= end; i++) {
			// divisible by 3 - Fizz
			// divisible by 5 - Buzz
			// divisible by 3 & 5 - FizzBuzz
			// print the number

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}

		}
	}

}
