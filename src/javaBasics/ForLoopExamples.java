package javaBasics;

public class ForLoopExamples {

	public static void main(String[] args) {

//		for (int i = 1; i <= 5 ; i++) {
//			System.out.println("Start");
//			for(int j = 5; j >= 1; j--) {
//				System.out.println(j);
//			}
//		}

//		for (; true;) {
//			System.out.println();
//		}

		for (int i = 0, j = 10; i <= 10; i++, j--) {
			System.out.println("i " + i + "   j " + j);
		}

		int[] arr = { 1, 2, 3, 4, 5 };
		
		System.out.println("*************************");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------------------");
		for(int i: arr) {
			System.out.println(i);
		}
		
	}

}
