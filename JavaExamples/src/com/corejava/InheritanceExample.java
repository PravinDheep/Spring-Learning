package com.corejava;
class Parent{
	public void display() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	//void display() {
		//System.out.println("Child");
	//}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.display();
	}

}
