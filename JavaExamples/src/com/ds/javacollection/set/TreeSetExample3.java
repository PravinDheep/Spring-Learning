package com.ds.javacollection.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		// Comparator(I) - for customized sorting
		// java.util package
		// 2 methods : compare(); returns int , equals();
		// compare(Object obj1, Object obj2)
		// returns -ve if and only if obj1 has to come BEFORE obj2
		// returns +ve if and only if obj1 has to come AFTER obj2
		// returns 0 if and only if obj1 and obj2 are EQUAL
		// No implementation of equals() method needed since Object(Parent) class contains equals() method which is available through inheritance
		// In Comparator Negative means placed left in Balanced Tree, Positive means placed right in Balanced Tree
		
		Integer arr[] = {3,2,1,5,4};
		TreeSet<Integer> tt = new TreeSet<Integer>(Arrays.asList(arr));
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
//		Collections.sort(list, new MyComparator());
//		System.out.print(">> " + list + "\t");
		System.out.print("\n Array Sorted: " + tt);
		
		TreeSet<Integer> t = new TreeSet<>(new MyComparator());
		t.add(10);
		t.add(0);  
		t.add(15);
		t.add(20);
		t.add(5);
		t.add(20);
		t.addAll(tt);
		System.out.println("\n Descending Order : " + t);
	}

}
	
class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if(i1 < i2){
			return +1;
		}else if(i1 > i2) {
			return -1;
		}else {
			return 0;
		}
	}
	

}