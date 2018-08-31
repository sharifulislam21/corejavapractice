package com.shariful.nov10.case_study.bank;

public abstract class BankAcc {

	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc() {
		
	}

	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return this.accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}
	
	protected void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public abstract void withdraw(float amount);
	
	public abstract void deposit(float bal);

	@Override
	public String toString() {
		return "BankAcc [Account No=" + accNo + ", Account Name=" + accNm + ", Account Balance="
				+ accBal + "]";
	}
}




