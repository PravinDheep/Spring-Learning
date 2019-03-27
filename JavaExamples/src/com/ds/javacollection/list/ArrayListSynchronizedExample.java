package com.ds.javacollection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSynchronizedExample {

	public static void main(String[] args) {
		
		// We can use Collections class to get synchronized version of List,Set and Map 
		// Given example is a synchronized method of List
		
		ArrayList<Object> a = new ArrayList<>();
		List<Object> l = Collections.synchronizedList(a);
		System.out.println(l);
		
		
	}

}
