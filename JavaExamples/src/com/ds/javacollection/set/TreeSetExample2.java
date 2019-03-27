package com.ds.javacollection.set;

import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
			// Comparable(I)
			// only one method: 	compareTo(); return int 
			// call as obj1.compareTo(obj2);
			// obj1 - element we are trying to insert, obj2 - element already inserted
			// obj1.compareTo(obj2) returns -ve if and only obj1 has to come BEFORE obj2
			// obj1.compareTo(obj2) returns +ve if and only obj1 has to come AFTER obj2
			// obj1.compareTo(obj2) returns 0 if and only obj1 and obj2 are EQUAL
			System.out.println("Compare String object :: " + "A".compareTo("Z"));
			System.out.println("Compare String object :: " + "Z".compareTo("A"));
			System.out.println("Compare String object :: " + "A".compareTo("A"));
			TreeSet<Object> t = new TreeSet<>();
			// Since String object implements comparable(I) and homogeneous
			t.add("B");
			t.add("Z");  // "Z".compareTo("B"); returns +ve 
			t.add("A");	 // "A".compareTo("B"); return -ve	
			System.out.println(t);
			
			
	}

}