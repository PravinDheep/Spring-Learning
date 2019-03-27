package com.ds.javacollection.set;

import java.util.Comparator;

public class Student1 implements Comparator<Object>{
		
		private int rollNo;
		private String name;
		private float cgpa;
		
		public Student1() {
			super();
		}

		public Student1(int rollNo, String name, float cgpa) {
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
			return "\n Student1 [rollNo=" + rollNo + ", name=" + name + ", cgpa=" + cgpa + "]";
		}

		@Override
		public int compare(Object o1, Object o2) {
			Student1 s1 = (Student1) o1;
			Student1 s2 = (Student1) o2;
			String str1 = s1.name;
			String str2 = s2.name;
				return str1.compareTo(str2);	
		}
				
		
}
