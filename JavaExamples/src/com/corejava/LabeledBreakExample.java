package com.corejava;
public class LabeledBreakExample {
    public static void main(String[] args) {

        pravin:
        for(int i = 1; i <5; i++){
            for(int j = 1; j <5; j++){
                if(i==3)
                    break pravin;
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
