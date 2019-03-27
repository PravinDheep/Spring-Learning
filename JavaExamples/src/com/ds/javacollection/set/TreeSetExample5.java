package com.ds.javacollection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample5 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new DescendingComparator());
		ts.add("Siva");
		ts.add("Pradeep");
		ts.add("Ashwanth");
		ts.add("Yazar");
		ts.add("Bharathi");
		ts.add("Ravee");
	
		System.out.println(ts);
		
	}

}

class DescendingComparator implements Comparator<Object> {
	
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = (String) o2;
		return s2.compareTo(s1);
	}
}