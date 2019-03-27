package com.corejava;
public class DecimalExample {
	double result; 
	void bodmas(){
		result = 1 + 4 * 1.2 - 4 + 8 / 2;
		System.out.println(result);
		
		int x = 400; //wrapper class
		int y = 400;
		if(x == y){
		System.out.println("Same"); // answer
		}else{
		System.out.println("Not Same");
		}
	}
}
class test {
	public static void main(String[] args){
		DecimalExample d = new DecimalExample();
		d.bodmas();
	}
}