package com.threadsynchronization;
class ExampleThread extends Thread {
    private volatile int testValue;
    public ExampleThread(String str){
        super(str);
    }
    public void run() {
        for (int i = 0; i <= 3; i++) {
            try {
                System.out.println(getName() + " : "+i);
                if (getName().equals("Thread 1"))
                {
                    
                    System.out.println( "Test Value Thread 1 : " + testValue);
                    testValue = 10;
                }
                if (getName().equals("Thread 2"))
                {
                	
                    System.out.println( "Test Value Thread 2 : " + testValue);
                    testValue = 5;
                }               
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
public class VolatileExample {

	public static void main(String[] args) {
		new ExampleThread("Thread 1").start();
        new ExampleThread("Thread 2").start();
	}

}