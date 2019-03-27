package com.corejava;
// Java 1.8 New Features Default, Static in Interface

interface Abcd {

    void take();

    default void show(){
        System.out.println("Show from default");
    }

    static void pack(){
        System.out.println("Pack from static");
    }
}

public class InterfaceNewExample {
    public static void main(String[] args) {
        Abcd ii = () -> System.out.println("taken");
        ii.take();
        ii.show();
        Abcd.pack();
    }
}
