package com.ds.javacollection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample7 {

	public static void main(String[] args) {
				// When performing Customized sorting, the objects need not be homogeneous, we will add heterogeneous objects in the program
		
				TreeSet<Object> ts = new TreeSet<Object>(new SortingDifferent());
				ts.add(new StringBuffer("DA"));
				ts.add(new StringBuffer("AD"));
				ts.add(new StringBuffer("A"));
				ts.add(new StringBuffer("D"));
				ts.add(new StringBuffer("BA"));
				ts.add(new StringBuffer("CC"));
				ts.add(new StringBuffer("AA"));
				ts.add(new StringBuffer("AAA"));
				ts.add("BB");
				System.out.println(ts);
	}

}

class SortingDifferent implements Comparator<Object>{
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1 < l2) {
			return -1;
		}else if(l1 > l2) {
			return 1;
		}else{
			return s1.compareTo(s2);
		}
	}
}