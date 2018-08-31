/*EXCEPTION HANDLING: 
 * Write a user defined exception called ‘InsufficientBalanceException’. 
 * Use this exception in withdraw() method of class Account. 
 * Test it by making the exception checked & then unchecked.*/

package com.shariful.oct30.exceptionhandling;

class AccountBal
{
	int accountNo;
	double balance;
	public AccountBal(int accNo,double bal)
	{
		accountNo=accNo;
		balance=bal;
	}
	public void deposit(double amount)
	{
		accountNo+=amount;
	}
	public double Withdraw(double amount) throws InsufficientBalanceException
	{
		if(balance<amount)
		{
			throw new InsufficientBalanceException();
		}
		else
			return this.balance-amount;
	}
}
class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException()
	{
		System.out.println("This is User Defined Exception Class");
	}
	public String toString()
	{
		return "\nIt is Working";
	}
}

public class ExceptionHandlingAccount{
	public static void main(String args[])
	{
		AccountBal accountBal=new AccountBal(50100,34000.59);
		try
		{
			accountBal.Withdraw(50000);
		}
		catch(InsufficientBalanceException e)
		{
			e.printStackTrace();
		}
	}
}
