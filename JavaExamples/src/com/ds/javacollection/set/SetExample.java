package com.ds.javacollection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// Duplicates are not allowed, Insertion order not preserved
		// If we try to add duplicate value, it just return the boolean value false
		// Set interface doesn't define any new methods, we need to use Collection interface methods only
		// BEST FOR SEARCH OPERATION 
		
		Set<Object> s = new HashSet<Object>();
		s.add(2);
		s.add(1);		
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println(s.add(1));
		System.out.println(s);
	}
}
