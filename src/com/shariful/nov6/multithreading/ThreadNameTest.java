package com.shariful.nov6.multithreading;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadNameTest {

	public static void main(String[] args) {
		MyThread thread = new MyThread();

		
		System.out.println(thread.getId());
		thread.start();

		thread.setName("My Thread 2"); // changing the name of the thread when
										// thread is active
		System.out.println(thread.getName() + " " + thread.getId());
		try {
			thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread.setName("My Thread 3"); // Changing the name of the thread when
										// thread is sleeping
		System.out.println(thread.getName() + " " + thread.getId());
	}
}
