package com.shariful.aug10.synchronization;

class Customer {
	int amount = 1000;

	synchronized void withdraw(int amount) {
		System.out.println("Withdraw...");

		if (this.amount < amount) {
			System.out.println("Less Balanace...");
			try {
				wait();
			} catch (Exception e) {

			}
			this.amount -= amount;
			System.out.println("Withdraw Completed!!");
		}
	}

	synchronized void deposit(int amount) {
		System.out.println("Deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}

public class TestCommunication {

	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}
}
