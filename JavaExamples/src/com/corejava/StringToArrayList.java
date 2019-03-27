package com.corejava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Pradeep
 */
public class StringToArrayList {
        public static void changeValue(String value) {
            value = "modified";
        }
  public static void main(String args[]){
      //  System.out.println('A'+'A');
      //  String s1 = new String("Hello");
      //  String s2 = new String(s1);
      //  System.out.println((s1==s2) + " " + s1.equals(s2));
        String value = "original";
        changeValue(value);
        System.out.println(value);
    }
}