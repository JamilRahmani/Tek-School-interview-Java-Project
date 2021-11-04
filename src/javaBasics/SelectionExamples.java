package javaBasics;

public class SelectionExamples {
	public static void main(String[] args) {

		int x = 11;
		int y = 10;

		String z = x > y ? "X is bigger" : "Y is bigger";

		System.out.println(z);

		if (x > y) {
			System.out.println("X is bigger");
		} else {
			System.out.println("Y is bigger");
		}

		double grade = 90;

		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		

		// 90 - 100 - A
		// 80 - 90 - B
		// 70 - 80 - C
		// 60 - 70 - D
		// < 60 - F
		
		
		
		
		
		
		
		

	}
}
