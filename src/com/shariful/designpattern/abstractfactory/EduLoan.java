package com.shariful.designpattern.abstractfactory;

public class EduLoan extends Loan{

	@Override
	void getInterestRate(double r) {
		rate = r;
		
	}

}
