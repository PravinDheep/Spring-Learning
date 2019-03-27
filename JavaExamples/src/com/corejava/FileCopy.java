package com.corejava;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
class FileCopy
{
public static void main(String[] args)throws IOException
{
@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
System.out.println("enter filename + " + s + "");
String st1=s.nextLine();
FileInputStream fin=new FileInputStream(st1);
FileOutputStream fo=new FileOutputStream("D:/Learning/PROJECTS/Custom-Docs/hibernate.txt");
int x=0;
while((x=fin.read())!=-1)
{
fo.write((char)x);
}
fo.close();
fin.close();
System.out.println("copy");
}
}