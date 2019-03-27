package com.corejava;
public class WrapperExample {
    public static void main(String[] args) {
        int i = 5;
        Integer ii = new Integer(i); // Boxing
        Integer jj = i; // Auto Boxing from java 1.5

        int j = jj.intValue(); // Fetches the primitive value from object UnBoxing

        int k = jj; // Auto UnBoxing



    }
}
