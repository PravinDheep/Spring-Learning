package com.corejava;
public class ShortHandExample {
    public static void main(String[] args) {
        byte b = 8;

        //b =  (byte) (b * 2.5);
        b *= 2.5;   // *= Short Hand
        System.out.println(b);
    }
}
