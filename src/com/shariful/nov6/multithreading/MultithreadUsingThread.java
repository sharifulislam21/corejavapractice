package com.shariful.nov6.multithreading;

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++){
			System.out.println(i);
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=100; i<200; i++){
			System.out.println(i);
		}
	}
}

public class MultithreadUsingThread{
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
		
	}
}
