package com.shariful.nov10.case_study.bank;

abstract class SavingAcc extends BankAcc
{
	private boolean isSalaried;
	private static final float MINBAL=1000;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo,accNm,accBal);
		this.isSalaried=isSalaried;
	}
	
	public boolean isSalaried() {
		return isSalaried;
	}

	public void withdraw(float amount)
	{
		if((super.getAccBal()-amount)<MINBAL)
		{
			System.out.println("Insufficient Balance...!!");
		}
		else
		{
			super.setAccBal(super.getAccBal()-amount);
			System.out.println(amount+" Amount Withdrawn....");
		}
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalaried + "]";
	}
}