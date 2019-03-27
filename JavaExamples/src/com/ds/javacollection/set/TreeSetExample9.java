package com.ds.javacollection.set;

import java.util.TreeSet;

public class TreeSetExample9 {

	public static void main(String[] args) {
		TreeSet<Student1> ts = new TreeSet<Student1>(new Student1());
		Student1 s1 = new Student1(4,"Pradeep",8.9f);
		Student1 s2 = new Student1(5,"Ramesh",8.1f);
		
		ts.add(new Student1(3,"Pradeep",8.74f));
		ts.add(new Student1(6,"Ajith",8.1f));
		ts.add(new Student1(2,"Raja",8.2f));
		ts.add(new Student1(2,"Raja",8.3f));
		ts.add(new Student1(1,"Raja",8.3f));
		ts.add(s1);
		ts.add(s2); 
		
		System.out.println("\n" + ts );
	}

}
