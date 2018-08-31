package com.shariful.aug1.interviewprograms;

public class DeadlockThreads {

	String str1= "Shariful";
	String str2= "Rohit";
	
	Thread thread1 = new Thread("Thread 1"){
		public void run(){
			while(true){
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1 +" "+ str2);
					}
				}
			}
		}
	};
	
	Thread thread2 = new Thread("Thread 2"){
		public void run(){
			while(true){
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(str2 +" "+ str1);
					}
				}
			}
		}
	};
	
	public static void main(String[] args) {
		DeadlockThreads lock = new DeadlockThreads();
		lock.thread1.start();
		lock.thread2.start();
	}
}
