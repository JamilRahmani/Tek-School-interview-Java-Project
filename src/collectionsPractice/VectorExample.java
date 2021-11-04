package collectionsPractice;

import java.util.Stack;
import java.util.Vector;

public class VectorExample {

	
	public static void main(String[] args) {
		
		
		Vector<String> vec = new Vector<String>();
		
		int x = 1;
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		vec.add("test" + x++);
		
		System.out.println(vec);
		System.out.println(vec.capacity());

	}
}
