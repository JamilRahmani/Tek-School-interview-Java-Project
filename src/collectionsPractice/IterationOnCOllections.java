package collectionsPractice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IterationOnCOllections {
	public static void main(String[] args) {
		
		ArrayList<String> data = new ArrayList<>();
		data.add("1");
		data.add("11");
		data.add("111");
		data.add("1111");
		
		System.out.println(data);
		System.out.println("********** using for loop");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		System.out.println("********** using foreach");
		for (String s : data) {
			System.out.println(s);
		}
		System.out.println("********** using iterator");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			if(s.equals("111")) {
				it.remove();
			}
		}
		System.out.println(data);
		
		System.out.println("********** using listIterator");
		ListIterator<String> listIt = data.listIterator();
		while (listIt.hasNext()) {
			String s = listIt.next();
			System.out.println(s);
		}
		
		System.out.println("********** using Enumeration");
		
		Vector<String> vec = new Vector<>();
		vec.add("a");
		vec.add("b");
		vec.add("c");
		vec.add("d");
		
		Enumeration<String> en = vec.elements();
		
		while (en.hasMoreElements()) {
			String s = en.nextElement();
			System.out.println(s);
		}
		
		
		System.out.println("***************** workinf with set and map");
		HashSet<String> mySet = new HashSet<>();
		mySet.add("1");
		mySet.add("2");
		mySet.add("3");
		mySet.add("4");
		
		for (String s : mySet) {
			System.out.println(s);
		}
		
		Iterator<String> mySetIterator = mySet.iterator();
		
		while (mySetIterator.hasNext()) {
			String s = mySetIterator.next();
			System.out.println(s);
		}
		
		HashMap<String, String> myMap = new HashMap<>();
		myMap.put("a", "test1");
		myMap.put("b", "test2");
		myMap.put("c", "test3");
		myMap.put("d", "test4");
		
		for (String k : myMap.keySet()) {
			System.out.println("Key: " + k + "   Value: " + myMap.get(k));
			
		}
		
		Iterator<String> myMapIterator = myMap.keySet().iterator();
		
		while (myMapIterator.hasNext()) {
			String s = myMapIterator.next();
			System.out.println(s + "    " + myMap.get(s));
		}
		
		
		
		
	}
}
