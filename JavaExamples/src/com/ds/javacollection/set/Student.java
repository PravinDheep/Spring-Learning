package com.ds.javacollection.set;

public class Student implements Comparable<Object> {
	
	private int rollNo;
	private String name;
	private float cgpa;
	
	public Student(int rollNo, String name, float cgpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
	
//	public int compare(Object o1, Object o2) {
//		String s1 = o1.toString();
//		String s2 = o2.toString();
//		return s1.compareTo(s2);
//	}

	@Override
	public int compareTo(Object o) {
		int stud1 = this.rollNo;
		Student s1 = (Student)o;
		int stud2 = s1.rollNo;
		if(stud1 < stud2)
			return -1;
		else if(stud1 > stud2) {
			return +1;
		}else {
			return 0;
		}
	}
	
	
}
