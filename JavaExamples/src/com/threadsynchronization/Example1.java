package com.threadsynchronization;

import java.util.Scanner;

/*
 * When two threads access the same data, data may get cached. In order to prevent
 * caching, using volatile.
 */
class Processor extends Thread{
	private volatile boolean running = true;
	public void run(){
		while(running){
			System.out.println("Hello Thread");
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();	
			}
		}		
	}
	public void shutdown(){
		running = false;
	}
}
public class Example1 {
	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();
		System.out.println("Enter Return key to exit!!!");
		Scanner pressKey = new Scanner(System.in);
		pressKey.nextLine();
		p1.shutdown();
		pressKey.close();	
	}
}
