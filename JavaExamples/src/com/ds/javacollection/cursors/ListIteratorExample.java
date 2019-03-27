package com.ds.javacollection.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// Bi-directional, replace, addition of new objects POSSIBLE
		// Adding new element while iterating(while iterating which avoids ConcurrentModificationException) POSSIBLE
		// Forward  [ hasNext(); - boolean, next(); - Object, nextIndex(); - int ]
		// Backward [ hasPrevious(); - boolean, previous(); - Object, previousIndex(); - int ]
		// Others   [ remove();, set(Object new); - for replace, add(Object new); - add even while iterating ]
		// ListIterator itr = l.listIterator();
		// APPLICABLE ONLY FOR LIST IMPLEMENTATIONS
		
		LinkedList<Object> l = new LinkedList<Object>();		
		l.add("Ajith");
		l.add("Vijay");
		l.add("Kamal");
		l.add("Rajini");
		System.out.println(l);
		
		ListIterator<Object> litr = l.listIterator();
		while(litr.hasNext()) {
			String str = (String) litr.next();
			if(str.equals("Kamal")) {
				litr.remove();
			}else if(str.equals("Vijay")) {
				// Immediately after Vijay Maddy(Madhavan) will be added, and not at last
				litr.add("Maddy(Madhavan)");
			}else if(str.equals("Rajini")) {
				litr.set("Suriya");
			}			
		}
		System.out.print("" + l + "\t");	
	}

}
