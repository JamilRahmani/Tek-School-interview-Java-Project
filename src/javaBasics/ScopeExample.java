package javaBasics;

public class ScopeExample {

	int a = 10;

	public static void max(int a, int b) {
		System.out.println(a > b ? "A is bigger" : "B is bigger");
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 15;

		max(a, b);
		
		
		
	}



}
