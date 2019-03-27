package com.ds.javacollection.set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// Underlying Data Structure is Balanced Tree
		// Duplicates not allowed
		// Insertion order not applicable, all elements inserted according to sorting order
		// HETEROGENEOUS OBJECTS ARE NOT ALLOWED ONLY IN TREESET AND TREEMAP
		// null acceptance possible -  but ONLY ONCE
		// Constructors : 4
		// TreeSet t = new TreeSet(); --> elements will be inserted according to default natural sorting order
		// TreeSet t = new TreeSet(Comparator c); --> elements will be inserted according to customized sorting order described by Comparator object
		// TreeSet t = new TreeSet(Collection c);
		// TreeSet t = new TreeSet(SortedSet s); --> for the given SortedSet object we can create an equivalent TreeSet object
		
		// For NON EMPTY TREESET, if we insert null element, it will throw NullPointerException
		// IN JDK 1.5 For empty TreeSet, null is allowed only as first element (no other element can be added, otherwise comparison of object takes place and throws NPE)
		// IN JDK 1.8 ,, THE SAME THROWS NPE
		
		
		TreeSet<Object> t = new TreeSet<>();
//		t.add(null);
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
//		 t.add(new Integer(10));
		
		System.out.println(t);
	}
}
