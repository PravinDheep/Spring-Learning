package com.corejava;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		//Set<E>;
		//LinkedHashSet lhs;		
		HashSet  hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add(null);
		hs.add(1);
		System.out.println("Add existing : \t" + hs.add("B"));
		System.out.println("Hash Set Elements:" + hs);
		LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add("C");
		lhs.add("B");
		lhs.add("A");
		System.out.println("LinkedHS Elements:" + lhs);
		SortedSet ss  = new TreeSet<>();
		// NULL ACCEPTANCE ONLY ONE TIME IN TREE SET (only for empty tree set)
		ss.add("14");
		ss.add("12");
		ss.add("11");
		ss.add("13");
		System.out.println("Head Set: " + ss.headSet("13"));
		System.out.println("Tail Set: " + ss.tailSet("12"));
		System.out.println("Sub Set:" + ss.subSet("12", "14"));
		System.out.println("Sorted Set implementation Tree Set: " + ss);
	}

}
