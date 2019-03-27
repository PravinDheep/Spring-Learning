package com.creatingthreads;

public class CreatingThreadsInMainClass {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run(){
				for(int i=1;i<=10;i++){
					System.out.println("Hello Thread" + i);
					try { 
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
	}

}
