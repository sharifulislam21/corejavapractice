//Write a class Account & add methods like deposit, withdraw, print etc.

package com.shariful.oct26.corejavabasics;

class AccountDetail
{
	private int accountId;
	private String accountName;
	private double amount;
	
	
	public AccountDetail(int id,String name,double amt)
	{
		this.accountId=id;	
		this.accountName=name;
		this.amount=amt;
	}
	
	public void deposit(double amt)
	{
		System.out.println("\nAfter Deposit:"+amt);
		amount=amount+amt;
	}
	
	public void withdraw(double amt)
	{
		System.out.println("\nAfter Withdrawal:"+amt);
		amount=amount-amt;
	}
	
	public void print()
	{
		System.out.println("A/C no.: " + accountId + "\nAccount Holder Name: " + accountName + "\nBalance: " + amount);
	}
}

class AccountDemo
{
 public static void main(String args[])
 {
 	AccountDetail ad=new AccountDetail(2105,"Shariful Islam",20599.50);
	ad.print();
	ad.deposit(1200.10);
	ad.print();
	ad.withdraw(1005.42);
	ad.print();
 }
}
