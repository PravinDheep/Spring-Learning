package com.corejava;
abstract class TestAbstract{
    public void test1(){
        System.out.println("test 1 concrete");
    }
    public abstract void test2();
    public abstract void test3();
}
class test4 {
    void test4(){
        System.out.println("test 4");
    }
}
public class AbstractExampleNew extends test4{
    void test1(){
        System.out.println("test 1 abstract");
    }
    void test2(){
        System.out.println("test 2 abstract impl");
    }
    void test3(){
        System.out.println("test 3 abstract impl");
    }
    public static void main(String[] args) {
        AbstractExampleNew ae = new AbstractExampleNew();
        ae.test2();
        ae.test3();
        ae.test4();
        ae.test1();
    }
         
}
