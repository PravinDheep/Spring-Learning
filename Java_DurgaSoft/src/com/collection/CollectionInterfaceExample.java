package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class CollectionInterfaceExample {

	public static void main(String[] args) {
		
		Collection<String> str = new ArrayList<String>();
		List<String> str1 = new ArrayList<String>();
		str.add("test");
		str.add("aaa");
		str.add("bbb");
		str.add("ccc");
		str1.add("ddd");
		str1.add("eee");
		str1.add("fff");
		str1.add("test");
		
//		for(String s : str) {
//			Collections.swap(str, 0,2);
//		}
		str1.set(3, "tests");
		str1.add("tests");
		str1.add("null");
		str1.add("null");
		//for(String ss: str1)
			System.out.println(str);
		str.retainAll(str1);
		
		System.out.println(str);
	}
}