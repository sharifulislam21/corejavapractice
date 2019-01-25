package com.shariful.designpattern.abstractfactory;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {

		if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		} else
			return null;
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

}
