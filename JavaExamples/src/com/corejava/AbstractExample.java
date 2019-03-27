package com.corejava;
public class AbstractExample {
    public static void main(String[] args) {
        // MaheshPhone mp = new MaheshPhone(); Cannot instantiate the abstract class
        // mp.call();
        MaheshPhone mp = new SureshPhone();
        mp.call();
        mp.move();
        mp.dance();
        mp.cook();
    }
}

abstract class MaheshPhone{
    public void call(){
        System.out.println("Calling...");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone{
    public void move(){
        System.out.println("Moving...");
    }
}

class SureshPhone extends RameshPhone{
    public void dance(){
        System.out.println("Dance...");
    }
    public void cook(){
        System.out.println("Cook...");
    }
}