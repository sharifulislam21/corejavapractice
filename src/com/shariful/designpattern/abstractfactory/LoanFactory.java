package com.shariful.designpattern.abstractfactory;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		if (loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("Education")) {
			return new EduLoan();
		} else
			return null;
	}

}
