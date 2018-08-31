package com.shariful.nov6.multithreading;

public class ThreadJoinTest extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		ThreadJoinTest t1 = new ThreadJoinTest();
		ThreadJoinTest t2 = new ThreadJoinTest();
		ThreadJoinTest t3 = new ThreadJoinTest();
		t1.start();
		try {
			t1.join(500);
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}
