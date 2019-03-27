package com.corejava;
import java.io.IOException;
public class TestAscii {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char c = '?';
		//if(System.out.printf("Hello World") == null) {
		//	int dd = 10;
		//}
		int j = 5;
		int k = j >> 2;
		
		int l;
		try {
			l=System.in.read();//returns ASCII code of 1st character  
			System.out.println((char)l + ">>>>>>>> " + System.in.read());//will print the character  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(int i=1;i<=127;i++) {
			System.out.printf("%d : %c : %d \n ", i,i,k);
		}
	}
}