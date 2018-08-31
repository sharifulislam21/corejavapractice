package com.shariful.nov6.multithreading;

public class ThreadPriorityTest extends Thread{

	public void run(){
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		ThreadPriorityTest t1 = new ThreadPriorityTest();
		ThreadPriorityTest t2 = new ThreadPriorityTest();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}
