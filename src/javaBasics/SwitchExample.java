package javaBasics;

public class SwitchExample {
	public static void main(String[] args) {

		String str = "sample2";

		switch (str) {
		case "sample":
			System.out.println("line 1");
			System.out.println("line 2");
			break;
		case "sample1":
			System.out.println("line 3");
			break;
		default:
			System.out.println("default block");
		}

		
		
		
	}
}
