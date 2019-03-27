package com.ds.javacollection.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		
		// Universal: Support all collection classes
		// Read and REMOVE
		// accessed through iterator() return Iterator
		// three methods : hasNext();, next();, remove();
		//  Bi-Direction, replace, addition of new objects(while iterating which avoids ConcurrentModificationException) not possible
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<=10;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		Iterator<Integer> iterate = list.iterator();

		while(iterate.hasNext()) {
			Integer i = iterate.next();
			if(i % 2 == 0) {
				System.out.print(" " + i + "\t");
			}else {
				iterate.remove();
			}
		}
			System.out.println(list);
	}
}
