package collectionsPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("value 1");
		ar.add("value 2");
		ar.add("value 3");
		ar.add("value 4");
		ar.add("value 5");
		
		System.out.println(ar);
		System.out.println(ar.contains("value 7"));
		
		
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		for (String s : ar) {
			System.out.println(s);
		}
		
		
		
	} 
	
	
	
}
