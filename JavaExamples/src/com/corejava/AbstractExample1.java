package com.corejava;
public class AbstractExample1 {
    public static void main(String[] args) {

        Iphone ip = new Iphone();
        Samsung sa = new Samsung();
        show(sa);
    }

    public static void show(Phone p){
        p.displayPhoneConfig();
        p.config();
    }
}

abstract class Phone {
    public abstract void config();

    public void displayPhoneConfig(){
        System.out.print("Display Phones: \t");
    }
}

class Iphone extends Phone{
    public void config(){
        System.out.print("2gb,IOS,32gb internal memory \n\n");
    }
}

class Samsung extends Phone{
    public void config(){
        System.out.print("2gb,Android,32gb internal memory \n\n");
    }
}
