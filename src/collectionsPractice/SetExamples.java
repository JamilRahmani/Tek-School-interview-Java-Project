package collectionsPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	public static void main(String[] args) {
		
		// HashSet is an un-ordered set
		Set<String> s = new HashSet<String>();
		
		s.add("test1");
		s.add("test2");
		s.add("test3");
		s.add("test1");
		
		System.out.println(s);
		System.out.println("-------------------------------");
		
		// LinkedHashSet will add data to the set based on the order of entry
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("test1");
		ls.add("test3");
		ls.add("test2");
		ls.add("test1");
		
		System.out.println(ls);
		
		System.out.println("-------------------------------");
		// Tree will be adding on a sorted base
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("test3");
		ts.add("test2");
		ts.add("test1");
		ts.add("test3");
		System.out.println(ts);
		
		
	}
}
