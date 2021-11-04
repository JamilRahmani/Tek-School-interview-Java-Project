package collectionsPractice;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		
		st.add("E1");
		st.add("E2");
		st.add("E3");
		st.add("E4");
		
		
		System.out.println(st);
		System.out.println("peek: " + st.peek());
		System.out.println("firstElement: " + st.firstElement());
		System.out.println("pop: " + st.pop());
		System.out.println(st);
		
	
		
		
	}
}
