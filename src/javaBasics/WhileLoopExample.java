package javaBasics;

import java.util.Scanner;

public class WhileLoopExample {
	public static void main(String[] args) {

		int x = 10;

//		while (x >= 0) {
//			if (x == 5) {
//				x--;
//				continue;
//			}
//			System.out.println(x--);
//		}

		// break - it will stop the loop - get out of the loop
		// continue - skip that iteration

		// infinite loop
//		while(true) {
//			System.out.println(x++);
//		}

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the Name: ");
		String test = obj.nextLine();

		while (test.equals("NA")) {
			System.out.println("Can not have NA as name, Please enter the Name again: ");
			test = obj.nextLine();
		}

		System.out.println("Name: " + test);


	}
}
