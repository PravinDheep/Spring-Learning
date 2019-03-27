package com.ds.javacollection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// Index plays very important role in List
		// Duplicates are allowed, Insertion order preserved
		
		List<Object> list = new ArrayList<Object>();
		
		list.add("A");
		list.add("B");
		list.add(2,"C");
		list.add("D");
		list.add("A");
		list.add(null);
		list.remove(3);
		list.remove("D");
		System.out.println(list.indexOf("A"));
		System.out.println(list.lastIndexOf("A"));
		System.out.println(list.get(1));
		System.out.println(list.set(3,"D"));
		System.out.println(list);
		
	}

}
