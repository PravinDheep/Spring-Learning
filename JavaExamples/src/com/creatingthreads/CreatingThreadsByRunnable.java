package com.creatingthreads;

class RunnerThread implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Hello Thread" + i);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class CreatingThreadsByRunnable {

	public static void main(String[] args) {
		Thread t = new Thread(new RunnerThread());
		Thread t1 = new Thread(new RunnerThread());
		t.start();
		t1.start();
	}

}
