package com.ds.javacollection.list;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// Stack is the child class of Vector
		// Last In First Out (LIFO)
		// One Constructor: Stack s = new Stack();
		// push(Object o) - to add, 
		// pop() - to remove and return last element which is the top of the stack
		// peek() - to return top of the stack without removal
		// empty() - legacy, so method naming is different
		// search("A"); returns offset(stack number from top of the stack), if not there it returns -1
		Stack<Object> s = new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		
	}

}
