package com.ds.javacollection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample6 {

	public static void main(String[] args) {
		
		// StringBuffer doesn't implement Comparable interface, so default natural sorting cannot be done, use customized sorting order
		
		//TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>(new SortingStringBuffer());
		TreeSet<Object> ts = new TreeSet<Object>(new SortingStringBuffer());
		ts.add(new StringBuffer("DA"));
		ts.add(new StringBuffer("AD"));
		ts.add(new StringBuffer("BA"));
		ts.add(new StringBuffer("CC"));
		ts.add(new StringBuffer("AA"));
		ts.add(new StringBuffer("AAA"));
		ts.add("BB");
		System.out.println(ts);
	}

}

class SortingStringBuffer implements Comparator<Object>{
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}
}