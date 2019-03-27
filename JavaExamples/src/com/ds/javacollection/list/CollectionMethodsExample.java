package com.ds.javacollection.list;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethodsExample {
	public static void main(String[] args) {

			Collection<Object> l = new ArrayList<Object>() {
			private static final long serialVersionUID = 1L;
			{
				add("A");
				add(1);
				add("A");
				add(null);
			}
		};		
		System.out.println(l);
	}
}
