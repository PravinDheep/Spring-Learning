package com.corejava;
class SC {
	//SC(){
		//System.out.println("constructor");
	//}
	SC(){
		System.out.println("SCvoid");
	}
	static void sc1(){
		System.out.println("static");
	}
	static {
		System.out.println("staticempty");
	}
	{
		System.out.println("blockempty");
	}
	public void sc2(){
		System.out.println("static");
	}
	
}

public class StaticConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SC.sc1();
		//new SC();
	}
}
