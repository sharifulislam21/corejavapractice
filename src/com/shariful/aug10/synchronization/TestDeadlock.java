package com.shariful.aug10.synchronization;

public class TestDeadlock {

	public static void main(String[] args) {
		final String s1 = "shariful";
		final String s2 = "Islam";

		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (s1) {
					System.out.println("Thread 1: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (s2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};

		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (s2) {
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (s1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
