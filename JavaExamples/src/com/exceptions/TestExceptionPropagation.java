package com.exceptions;

//import java.io.IOException;

public class TestExceptionPropagation {

	void m() {
		int data = 30/0; // (UnChecked Exception)
		//throw new java.io.IOException("I/O Exception"); //(Checked Exception)
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("Exception handled in p()");
		}
	}
	public static void main(String[] args) {
		TestExceptionPropagation tep = new TestExceptionPropagation();
		tep.p();
		System.out.println("Normal Flow");
	}

}
