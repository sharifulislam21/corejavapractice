package com.shariful.nov10.case_study.bank;

abstract class CurrentAcc extends BankAcc
{	
	private final float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo,accNm,accBal);
		this.creditLimit=creditLimit;
	}
	
	public float getCreditLimit() {
		return creditLimit;
	}

	public void withdraw(float amount)
	{
		if((super.getAccBal()+creditLimit)>amount)
		{
			System.out.println("Credit Limit Exceeded...");
		}
		else
		{
			super.setAccBal(super.getAccBal()-amount);
			System.out.println(amount+" Amount Withdrawn....");
		}
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
	
}
