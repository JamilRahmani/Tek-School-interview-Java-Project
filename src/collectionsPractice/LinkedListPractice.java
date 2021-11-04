package collectionsPractice;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		
		
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("value 1");
		li.add("value 2");
		li.add("value 3");
		li.add("value 4");
		li.add("value 5");
		
		System.out.println(li);
		
//		List<Integer> li2 = new LinkedList<Integer>();
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		for (String s : li) {
			System.out.println(s);
		}
	}
	
	
}
