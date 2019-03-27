package com.ds.javacollection.set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		// Underlying Data Strutcture for HashSet is Hashtable
		// Insertion order not preserved(all objects will be inserted based on HashCode of objects)
		// Duplicates not allowed, when tried to include, no error, add method return false
		// Heterogeneous, null insertion possible
		// implement serializable and clonable interfaces
		// SEARCH OPERATION - because its based on HashCode of objects
		// Constructors : 4
		// All constructors are same for HS, LHS, HM, IHM, WHM, Htable
		// 1. HashSet h = new HashSet(); - Default Initial Capacity 16 and Fill Ratio : 0.75
		// Fill Ratio is also known as Load Factor
		// Once filling 75 percent fill ratio, a new hash set is going to be cretaed
		// 2. HashSet h  = new HashSet(int initialCapacity); Load Factor or Fill Ratio is 0.75
		// 3. HashSet h = new HashSet(int initialCapacity, float loadFactor)
		// 4. HashSet h = new HashSet(Collection c)
		HashSet<Object> s = new HashSet<>();		
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
