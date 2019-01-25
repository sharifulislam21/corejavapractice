package com.shariful.nov6.multithreading;

public class MultithreadTest3 {

	static class Thread1 extends Thread{
		@Override
		public void run() {

			System.out.println("static class Thread1");
		}
	}
	
	static class Thread2 implements Runnable{
		@Override
		public void run() {
			System.out.println("static class Thread2");
		}
	}
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		Thread thread = new Thread(t2);
		thread.start();
	}
}
