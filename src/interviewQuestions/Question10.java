package interviewQuestions;

public class Question10 {
	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			isEvenOrOdd(i);
		}
		
	}

	public static void isEvenOrOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is an Even Number");
		} else {
			System.out.println(num + " is an Odd Number");
		}
	}
}
