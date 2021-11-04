package interviewQuestions;

public class Question2 {

	public static void main(String[] args) {
		System.out.println(freedomSum(1, 5, 3));
	}

	public static int freedomSum(int a, int b, int c) {
		if (a == 10) {
			return 0;
		} else if (b == 10) {
			return a;
		} else if (c == 10) {
			return a + b;
		} else {
			return a + b + c;
		}
	}
}
