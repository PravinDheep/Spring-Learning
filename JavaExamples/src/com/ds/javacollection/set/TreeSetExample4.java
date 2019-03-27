package com.ds.javacollection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample4 {

	public static void main(String[] args) {
		//TreeSet<Integer> t = new TreeSet<>(new MyComparator1());
		TreeSet<Integer> t = new TreeSet<>(new MyComparator2());
		//TreeSet<Integer> t = new TreeSet<>(new MyComparator3());
		//TreeSet<Integer> t = new TreeSet<>(new MyComparator4());
		//TreeSet<Integer> t = new TreeSet<>(new MyComparator5());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(5);
		t.add(20);
		System.out.println("\n Sorted Order : " + t);
	}

}

// For Ascending Order
class MyComparator1 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i1.compareTo(i2); // equals return -i2.compareTo(i1);
	}
}

// For Descending Order
class MyComparator2 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1); // equals return -i1.compareTo(i2);
		
	}
}

// For Insertion Order
class MyComparator3 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return +1;		
	}
}

//For REVERSE Insertion Order  
class MyComparator4 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return -1;		
	}
}

//ONLY FIRST ELEMENT INSERTED, ALL OTHER ELEMENTS CONSIDERED AS DUPLICATES
class MyComparator5 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return 0;		
	}
}