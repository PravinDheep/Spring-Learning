package com.ds.javacollection.list;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
//		 Index plays very important role in List
//		 Duplicates are allowed, Insertion order preserved
//		 Data Structure : Resizable array or growable array
//		 Heterogeneous objects are allowed(Different data types) 
//		 Heterogeneous allowed in every collection except in Treeset and Treemap
//		 null insertion is allowed
//		 Constructors are defined below, 3 constructors
//		 Array List default initial capacity is 10 when used as ArrayList a = new ArrayList(); initial capacity 10
//		 When initial capacity crossed, the new capacity forumulae is new capacity = ( cc * 3/2 ) + 1 cc: current capacity
//		 example:: nc = (10 * 3/2) + 1 = 16
//		 Performance slow : so, can use initial capacity constructor ex: ArrayList a = new ArrayList(int initialcapacity);
//		 ArrayList a = new ArrayList(Collection c); interconnection of collection, linkedlist to arraylist
//		 Every collection class implement Serializable and Clonable interface
//		 ArrayList and Vector class implements RandomAccess(Marker : util package) interface, so that 
//		 any random element we can access with the same speed
//		 If our frequent operation is retrieval operation , highly recommended to go for ArrayList or Vector
//		 ArrayList, when frequent operation is RETRIEVAL or SEARCH its the BEST choice, when frequent operation is 
//		 add or delete(INSERTION OR DELETION in middle) array list is the WORST choice since shifting needed
		 
		ArrayList<Object> l = new ArrayList<>();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"M");
		l.add("N");
		System.out.println(l);
		
		
		
	}

}
