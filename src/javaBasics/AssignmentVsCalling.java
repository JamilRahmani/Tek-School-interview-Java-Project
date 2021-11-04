package javaBasics;

public class AssignmentVsCalling {
	public static void main(String[] args) {
		
		int x = 10;
		
		x += 5; // ===> x = x(10) + 5 
		
		System.out.println(x); // x = 15
		
		System.out.println(x + 5);
		
		System.out.println(x);
		
		
		// ++
		// -- 
		System.out.println("Y variable");
		int y = 1;
		System.out.println(y--);
		System.out.println(y);
		
		
		
		
	}
}
