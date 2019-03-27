package com.corejava;
interface Abc{
    void show(int n);
}
//interface Pqr{
//    void pack();
//}
//class AbcImpl implements Abc, Pqr{
//    public void show(){
//        System.out.println("Implements Abc");
//    }
//
//    public void pack(){
//        System.out.println("Packed");
//    }
//}

public class InterfaceExample {
    public static void main(String[] args) {
//        Abc obj = new AbcImpl();
//        obj.show();
//        Pqr obj1 = new AbcImpl();
//        obj1.pack();


//          Abc obj = new Abc(){
//              public void show(){
//                  System.out.println("Shown");
//              }
//          };

          Abc obj = (n) -> System.out.println("Display int value: \t" + n);
          obj.show(5);
    }
}
