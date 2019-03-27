package com.corejava;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
public class BasicTriangle {

	public static void main(String[] args) {
		for(int i = 0 ; i < 5; i++){
			for(int j = 0; j <= i ; j++){
				System.out.print("*");
			}
			System.out.println("\n");
		}
		try {
		File f = new File("C:/Users/Pradeep/Desktop/Q4-Tasks.txt.txt");
		FileReader fs = new FileReader(f);
		BufferedReader bf = new BufferedReader(fs);
		String line = null;
		while((line = bf.readLine()) != null)
			do{
				System.out.print(line);
			}while(line.endsWith("\n"));
		bf.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
