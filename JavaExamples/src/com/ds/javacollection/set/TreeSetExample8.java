package com.ds.javacollection.set;

import java.util.TreeSet;

public class TreeSetExample8 {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();
		Student s1 = new Student(4,"Pradeep",8.9f);
		Student s2 = new Student(5,"Ramesh",8.1f);
		
		ts.add(new Student(3,"Pradeep",8.74f));
		ts.add(new Student(1,"Raja",8.3f));
		ts.add(new Student(2,"Raja",8.2f));
		ts.add(new Student(2,"Raja",8.3f));
		ts.add(s1);
		ts.add(s2); 
		
		System.out.println("\n" + ts );
	}

}
