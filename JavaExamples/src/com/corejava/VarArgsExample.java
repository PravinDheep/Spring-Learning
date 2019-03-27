package com.corejava;
public class VarArgsExample {

	static void display(int i, String... str){
		System.out.println("Display method invoked. \t" + i +">>");
		
		try{
			i = 10/0;
		}catch(ArithmeticException e){
			try{
				int t = 100/0;
			}catch(ArithmeticException | NumberFormatException el){
				el.printStackTrace();
				System.out.println("Inner Catch Executed \t" + str[0]);
			}
			
		}finally{
			try{
				int ta = 1000/0;
			}catch(ArithmeticException ell){
				ell.printStackTrace();
				System.out.println("Finally Executed \t" + str[0]);
			}
		}
	}
	
	public static void main(String[] args) {
		display(10,"gud","day");
		display(20, "test");
	}

}