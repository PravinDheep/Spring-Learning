package com.creatingthreads;

class Runner extends Thread{
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println("Hello Thread" + i);
			try { 
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class CreatingThreads {
	
	public static void main(String[] args) {
		Runner r = new Runner();
		r.start();
		Runner r1 = new Runner();
		r1.start();
	}

}
