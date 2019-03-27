package com.ds.javacollection.set;

public class SortedSetExample {

	public static void main(String[] args) {
		// Child Interface of Set
		// Duplicates are not allowed, but represent objects in some sorting order
		// Sorted Set specific methods
		// 100 101 103 104 107 110 115
		// first(); , last();, headSet(Object o) headSet(104) --> which are less than 104 [ 100 101 103]	
		// tailSet(Object o) tailSet(104) --> elements greater than 104 [104 107 110 115]
		// subSet(Object o,Object oo) subSet(103,110) --> elements greater than 103 but less than 110 [ 103 104 107]
		// comparator() returns comparator object
		// Default Natural Sorting : Numbers --> Ascending , String -->  Alphabetical
		
		
		
	}
	
}
