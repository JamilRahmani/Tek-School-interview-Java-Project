package javaBasics;

public class OperatorsExamples {
	public static void main(String[] args) {

		int x = 10;
		int y = 10;

		System.out.println(x != y);

		String str1 = new String("test");
		String str2 = new String("test");

		System.out.println(str1 == str2);

		System.out.println("checking relational operator: " + (x <= y));

		System.out.println("---------------------");

		// || OR operator
		// && AND operator
		// ! NOT Operator
		// ^

		if (x >= y && x == y) {
			System.out.println("the condition resulted in true");
		}

		System.out.println("true || false = " + (true || false));
		System.out.println("false || false = " + (false || false));
		System.out.println("true || false = " + (false || true));

		System.out.println("true && true = " + (true && true));
		System.out.println("true && false = " + (true && false));
		System.out.println("false && false = " + (false && false));

		System.out.println("! true && true = " + !(true && true));
		System.out.println("! true && false = " + !(true && false));
		System.out.println("! false && false = " + !(false && false));

		System.out.println("true ^ true = " + (true ^ true));
		System.out.println("true ^ false = " + (true ^ false));
		System.out.println("false ^ true = " + (true ^ false));
		System.out.println("false ^ false = " + (false ^ false));

		// rule 1: True or anything is true
		// rule 2: false and anything is false

		int z = 1;

		System.out.println(true || 10 < z++);
		System.out.println(false && 10 < z++);

		System.out.println(z);

		System.out.println("1 + 1 - 2 / 2   ==> " + (1 + 1 - 2 / 2));
		System.out.println("1 + 1 - 2 / 2   ==> " + ((1 + 1 - 2) / 2)); 

	}
}
