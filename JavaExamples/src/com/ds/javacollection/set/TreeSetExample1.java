package com.ds.javacollection.set;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args)  {
		// When used first constructor, the objects should be HOMOGENEOUS AND COMPARABLE, only then it will perform default natural sorting order
		// StringBuffer objects declared are homogeneous, but not comparable, because StringBuffer doesn't implement Comparable(I)
		
		TreeSet<Object> t = new TreeSet<>();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));
		System.out.println(t); // ClassCastException
		// Use comparator for customized sorting
	}

}
