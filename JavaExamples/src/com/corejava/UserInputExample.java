package com.corejava;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputExample  {
    public static void main(String[] args) throws Exception {

        //System.In.Read

            /*int i = System.in.read();
            System.out.print((char)i);
            String str = "";
            while ((i=System.in.read()) != 48){
                str = str + (char)i;
            }
            System.out.print(str);*/

        // BufferedReader
            /*String str = "";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();

            System.out.println("Hello " + str);*/

        // Scanner
            String str = "";
            int i = 0;
            Scanner sc = new Scanner(System.in);

            str = sc.nextLine();

            i = Integer.parseInt(sc.nextLine());

            System.out.println("Hello " + str + " I value is " + i);
    }
}
