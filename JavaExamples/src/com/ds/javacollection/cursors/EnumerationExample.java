package com.ds.javacollection.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
	//	Supported only for LEGACY classes
	//  accessed using elements() which returns Object
	//  has two methods hasMoreElements(); , nextElement();
	//  No REMOVE method
	//  Bi-Direction, replace, addition of new objects(while iterating which avoids ConcurrentModificationException) not possible
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		System.out.println("Initial Capacity::\t" + v.capacity());
		for(int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		
		Enumeration<Integer> en = v.elements();
		while(en.hasMoreElements()) {
			Integer i = (Integer) en.nextElement();
			if(i % 2 == 0) {
				System.out.print(" "+i+ "\t");
			}
		}
		System.out.println(v);

	}

}
