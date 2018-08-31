package com.shariful.nov6.multithreading;

public class ThreadSleepTest extends Thread{
	
	public void run(){
		for(int i=1;i<5;i++){
			try{
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			//System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadSleepTest t1 = new ThreadSleepTest();
		ThreadSleepTest t2 = new ThreadSleepTest();
		
		t1.run();
		t2.run();
		
	}
}
