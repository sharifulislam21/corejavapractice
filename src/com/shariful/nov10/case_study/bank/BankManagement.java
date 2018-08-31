package com.shariful.nov10.case_study.bank;

public class BankManagement {
	
	public BankManagement() {
		
		@SuppressWarnings("unused")
		BankFactory bankFactory=new MMBankFactory();
		
		//SavingAcc savingAcc=((MMBankFactory)bankFactory).getNewSavingAcc(1010, "Shariful", 10000, true);
		SavingAcc savingAcc = MMSavingAcc.getMMSavingAcc(1010, "Shariful", 10000, true);
		//CurrentAcc currentAcc=((MMBankFactory)bankFactory).getNewCurrentAcc(2010, "Shariful", 20000 , 5000.75f);
		CurrentAcc currentAcc = MMCurrentAcc.getMMCurrentAcc(2010, "Shariful", 20000 , 5000.75f);
		
		System.out.println(savingAcc);
		System.out.println(currentAcc);
//		savingAcc.withdraw(1000);
//		currentAcc.withdraw(400);
//		System.out.println(savingAcc);
//		System.out.println(currentAcc);
//		savingAcc.toString();
		
	}
	public static void main(String[] args) 
	{
		new BankManagement();
	}

}
