package com.shariful.nov10.case_study.bank;


class MMCurrentAcc extends CurrentAcc
{
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public static MMCurrentAcc getMMCurrentAcc(int accNo, String accNm, float accBal,float creditLimit)
	{
		return new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
	}
	public void withdraw(float amount)
	{
		super.withdraw(amount);
	}

	@Override
	public void deposit(float bal) 
	{
		// TODO Auto-generated method stub
		super.setAccBal(super.getAccBal()+bal);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [" +super.toString()+ "]";
	}
	
	
}