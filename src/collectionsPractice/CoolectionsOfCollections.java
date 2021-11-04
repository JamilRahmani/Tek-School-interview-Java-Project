package collectionsPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CoolectionsOfCollections {
	public static void main(String[] args) {

		ArrayList<ArrayList<String>> ar = new ArrayList<ArrayList<String>>();
		ar.add(new ArrayList<String>());
		ar.add(new ArrayList<String>());
		ar.add(new ArrayList<String>());
		ar.add(new ArrayList<String>());

		ar.get(0).add("1");
		ar.get(0).add("2");
		ar.get(0).add("3");

		ar.get(1).add("7");

		ar.get(2).add("8");
		ar.get(2).add("9");

		ar.get(3).add("4");
		ar.get(3).add("5");
		ar.get(3).add("6");

		System.out.println(ar);

		for (int i = 0; i < ar.size(); i++) {
//			System.out.println(ar.get(i));
			for (int j = 0; j < ar.get(i).size(); j++) {
				System.out.print(ar.get(i).get(j) + " ");
			}
			System.out.println();
		}
		System.out.println("---------- using for each loop ");
		for (ArrayList<String> i : ar) {
			for (String v : i) {
				System.out.print(v + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------");
		Map<Integer, ArrayList<String>> hm = new HashMap<Integer, ArrayList<String>>();
		hm.put(1, new ArrayList<String>());
		hm.put(2, new ArrayList<String>());
		hm.put(3, new ArrayList<String>());

		hm.get(2).add("Jack");
		hm.get(2).add("David");
		hm.get(2).add("Ana");

		System.out.println(hm);

		for (Integer k : hm.keySet()) {
			System.out.println(k + " " + hm.get(k));
			
		}

		
		
		
	}
}
