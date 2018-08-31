/*3.	
 * Write a program to consider saving & current account in the bank. 
 * Saving account holder has ‘Fixed Deposits’ whereas Current account holder has cash credit. 
 * Apply polymorphism to find out total cash in the bank.*/

package com.shariful.oct27.oopbasics;

class AccountDetails
{
	private String name;
	private int id;
	private double balance;
	
	public AccountDetails(int id, String name, double bal) {
		this.id = id;
		this.name = name;
		this.balance = bal;
	}
	
	public double getBalance() {
		return balance;
	}
	
}

class Saving extends AccountDetails
{
	private double fd;
	
	public Saving(int id, String name, double bal, double fd)
	{
		super(id,name,bal);
		this.fd=fd;
	}
	public double getBalance() {
		return super.getBalance() + fd;
	}
}

class Current extends AccountDetails
{
	private double credit;
	
	public Current(int id, String name, double bal, double credit)
	{
		super(id,name,bal);
		this.credit=credit;
	}
	public double getBalance() {
		return super.getBalance() + credit;
	}
}

public class AccountTest {
	
	public static double getTotalBal(AccountDetails acc[]) {
		double totalBal = 0.0;
		for(int i=0; i<acc.length; i++) {
			totalBal = totalBal + acc[i].getBalance();
		}
		return totalBal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails a[] = new AccountDetails[3];
		a[0] = new Saving(1, "Shariful", 10000, 5000);
		a[1] = new Saving(2, "Navin", 5000, 2000);	
		a[2] = new Saving(3, "Amit", 5500, 3000);		
		System.out.println("Total Bal = " + getTotalBal(a));
	}

}

