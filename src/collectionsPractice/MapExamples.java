package collectionsPractice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExamples {
	public static void main(String[] args) {
			
		System.out.println("--------------- HashTable");
		// no null for key and value
		// un-ordered
		// synchronized / thread-safe
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "value 1");
		ht.put(2, "value 2");
		ht.put(3, "value 3");
		ht.put(1, "value 1 - 2");
//		ht.put(5, null);
		
		System.out.println(ht);
		
		System.out.println("--------------- HashMap");
		//it can take null
		//un-ordered
		//non-synchronized
		//its backed by an array of Nodes
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("K1", "V1");
		hm.put("K2", "V2");
		hm.put("K3", "V3");
		hm.put("K5", "V4");
		hm.put("K1", "V5");
		hm.put(null, null);
		
		System.out.println(hm);
		
		System.out.println("--------------- LinkedHashMap");
		//it can take null
		//non-synchronized
		//ordered - it will store elements based on the order of entry
		//its backed by a doubly linked list structure of Nodes
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put(null, null);
		lhm.put("1", "v1");
		lhm.put("2", "v2");
		lhm.put("5", "v5");
		lhm.put("3", "v3");
		lhm.put("4", "v4");
		
		System.out.println(lhm);
		
		
		System.out.println("--------------- TreeMap");
		// no null value
		// backed by Tree structure
		// its going to sort based on the keys - ASC
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("4", "V4");
		tm.put("1", "V1");
		tm.put("2", "V2");
		tm.put("5", "V5");
		tm.put("3", "V3");
		tm.put("4", "V4 - 2");
		
		
		
		System.out.println(tm);
		
	}
}
