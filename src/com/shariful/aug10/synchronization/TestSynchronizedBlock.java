package com.shariful.aug10.synchronization;

class Test {

	void printTest(int n) {
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}// end of the synchronized block
	}// end of the method
}

class MyTestThread extends Thread {
	Test t;

	MyTestThread(Test t) {
		this.t = t;
	}

	public void run() {
		t.printTest(5);
	}

}

class MyTestThread2 extends Thread {
	Test t;

	MyTestThread2(Test t) {
		this.t = t;
	}

	public void run() {
		t.printTest(2);
	}

}

public class TestSynchronizedBlock {

	public static void main(String[] args) {
		Test obj = new Test();
		MyTestThread t1 = new MyTestThread(obj);
		MyTestThread2 t2 = new MyTestThread2(obj);
		
		t1.start();
		t2.start();
	}
}
