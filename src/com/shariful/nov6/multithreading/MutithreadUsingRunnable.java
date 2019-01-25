package com.shariful.nov6.multithreading;

class RunnableThread implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<100; i++){
			System.out.println(i);
		}
		
	}
}

class RunnableThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=100; i<200; i++){
			System.out.println(i);
		}
		
	}
}
public class MutithreadUsingRunnable {

	public static void main(String[] args) {
		RunnableThread thread1 = new RunnableThread();
		Thread t = new Thread(thread1);
		t.start();	
		
		RunnableThread2 thread2 = new RunnableThread2();
		Thread t2 = new Thread(thread2);
		t2.start();	
	}
	
}
