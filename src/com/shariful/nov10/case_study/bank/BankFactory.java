package com.shariful.nov10.case_study.bank;

public abstract class BankFactory {

	public abstract SavingAcc getNewSavingAccount();
	
	public abstract CurrentAcc getNewCurrentAccount();
	
	public abstract SavingAcc setNewSavingAcc(int accNo , String accNm , boolean isSalaried);
	
	public abstract CurrentAcc setNewCurrentAcc(int accNo , String accNm , float creditLimit);

}

class MMBankFactory extends BankFactory
{
	@Override
	public SavingAcc getNewSavingAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public MMSavingAcc getNewSavingAcc(int accNo,String accNm,float accBal,boolean isSalaried)
	{
		return null;
	}
	
	public MMCurrentAcc getNewCurrentAcc(int accNo,String accNm,float accBal,float creditLimit)
	{
		return null;
	}

	@Override
	public SavingAcc setNewSavingAcc(int accNo, String accNm, boolean isSalaried) {
		// TODO Auto-generated method stub
		return MMSavingAcc.getMMSavingAcc(accNo, accNm, 1000, isSalaried);
		
	}

	@Override
	public CurrentAcc setNewCurrentAcc(int accNo, String accNm,
			float creditLimit) {
		// TODO Auto-generated method stub
		return MMCurrentAcc.getMMCurrentAcc(accNo, accNm, 0, creditLimit);
		
	}
}