package com.ds.javacollection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// Linked Hash Set (1.4V) Child class of HashSet
		// INSERTION ORDER PRESERVED but duplicates not allowed
		// Underlying Data Structure is Hashtable and LinkedList
		// Used in Cache based applications
		
		LinkedHashSet<Object> s = new LinkedHashSet<>();		
		s.add("B");		
		s.add("C");
		s.add("D");
		s.add("Z");
		s.add(null);
		s.add(10);
		System.out.println(s.add("Z"));
		System.out.println(s);

	}

}
