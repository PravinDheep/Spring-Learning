package com.ds.javacollection.list;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Underlying Data Structure is Resizable or Growable Array
		// Duplicates allowed and insertion order preserved, null allowed, heterogeneous objects allowed
		// implements serializable, clonable interface and RANDOMACCESS interface
		// most of the methods are Synchronized, so Thread-Safe
		// Vector is legacy, since name of methods is like old generation (too long)
		// Vector Specific Methods
		// for adding add(Object o) from Collection - List(I), add(int index, Object o) from List, addElement(Object o) from Vector
		// for removing Remove(Object o) from Collection, removeElement(Object o) from Vector, remove(int index) from List,
		// RemoveElementAt(int index) from Vector, clear() from Collection, removeAllElements() from Vector
		// for retrieve Object get(int index) from Collection, Object elementAt(int index) from Vector,
		// Object firstElement() from Vector, Object lastElement() from Vector
		// Other methods : int size(); int capacity(); Enumeration elements() - get values one by one;
		// Vector Constructors : 4
		// Vector v = new Vector(); initial capacity - 10
		// new capacity = 2 * currentcapacity;
		// Vector v = new Vector(int initialCapacity);
		// Vector v = new Vector(int initialCapacity, int incrementalCapacity); // where we can specify our increment vector size
		// Vector v = new Vector(Collection c);
		
		Vector<Object> v = new Vector<>();
		System.out.println(v.capacity());
		for(int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);
		
		
	}
}
