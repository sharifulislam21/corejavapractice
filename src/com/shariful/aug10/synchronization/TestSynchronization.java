package com.shariful.aug10.synchronization;

class Table{
	
	synchronized void printTable(int n){
		for(int i=0; i<=5; i++){
			System.out.println(n*i);
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread{
	TestTable t;
	
	public MyThread1(TestTable t) {
		this.t = t;
	}
	public void run(){
		t.printTable(5);
	}
}

class MyThread2 extends Thread{
	TestTable t;
	
	public MyThread2(TestTable t) {
		this.t = t;
	}
	public void run(){
		t.printTable(10);
	}
}

public class TestSynchronization {

	public static void main(String[] args) {
		TestTable obj = new TestTable();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		t1.start();
		t2.start();
		
	}
}
