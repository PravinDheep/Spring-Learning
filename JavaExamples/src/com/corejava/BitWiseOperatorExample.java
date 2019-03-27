package com.corejava;
/* Bit Wise Operator : & AND | OR
 AND
   1  1  1   True  True   True
   0  0  0   False False  False
   1  0  0   True  False  False
   0  1  0   False True   False
 OR
   1  1  1   True  True   True
   0  0  0   False False  False
   1  0  1   True  False  True
   0  1  1   False True   True
*/
public class BitWiseOperatorExample {
    public static void main(String[] args) {
        int a = 25; // 11001
        int b = 15; // 01111

        int c = a & b;
        int d = a | b;
        System.out.printf("AND %d :: OR %d", c,d);

    }
}
