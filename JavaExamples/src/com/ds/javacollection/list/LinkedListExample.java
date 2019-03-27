package com.ds.javacollection.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// If frequent operation is INSERTION or DELETION in middle, highly recommended for LinkedList
		// If frequent operation is SEARCHING or RETRIEVAL, linked list is the WORST choice.
		// Underlying data structure is Doubly Linked List
		// Insertion preserved, duplicates allowed, Heterogenous allowed, null insertion allowed
		// Implements Serializable and Clonable
		// to write Stack or Queue in linked list, we have 6 specific methods in linked list which are
		// void addFirst(Object o); void addLast(Object o); Object getFirst(); Object getLast(); Object removeFirst(); Object removeLast();
		// Constructors : 2 
		// LinkedList l = new LinkedList();  creates an empty linked list object
		// LinkedList l = new LinkedList(Collection c); interconnection of collection
		
		LinkedList<Object> l = new LinkedList<>();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		l.set(0, "software");
		l.add(0,"venky");
		l.removeLast();
		l.addFirst("CCC");
		System.out.println(l);
		
	}

}
