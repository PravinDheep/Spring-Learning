package com.exceptions;

import java.io.IOException;

class M{
	void method() throws IOException {
		throw new IOException("device error");
	}
}
public class TestThrows {

	public static void main(String[] args) throws IOException {
		M m = new M();
		m.method();
		
		System.out.println("Normal Flow");
	}

}
