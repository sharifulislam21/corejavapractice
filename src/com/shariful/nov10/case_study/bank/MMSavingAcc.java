package com.shariful.nov10.case_study.bank;

class MMSavingAcc extends SavingAcc
{
	private static final float MINBAL=1000;
	
	public static float getMinbal() {
		return MINBAL;
	}

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	
	}

	public static MMSavingAcc getMMSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried)
	{
		return new MMSavingAcc(accNo, accNm, accBal, isSalaried);
	}
	
	public void withdraw(float amount)
	{
		super.withdraw(amount);
	}

		@Override
	public void deposit(float bal) {
		// TODO Auto-generated method stub
		super.setAccBal(super.getAccBal()+bal);
	}
		
	@Override
	public String toString() {
		return "MMSavingAcc ["+super.toString()+"]";
	}



}
