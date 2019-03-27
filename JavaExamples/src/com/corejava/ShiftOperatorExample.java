package com.corejava;
public class ShiftOperatorExample {
    public static void main(String[] args) {
        int a = 8;
        int b =  a << 2;
        int c =  a >> 2;

        System.out.printf("Left Shift(Extra Zeros) %d \t::\t Right Shift %d", b,c);
    }
}
