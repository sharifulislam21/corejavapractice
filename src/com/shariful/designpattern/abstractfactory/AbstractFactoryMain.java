package com.shariful.designpattern.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryMain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out
				.print("Enter the name of Bank from where you want to take loan amount: ");
		String bankName = br.readLine();

		System.out
				.print("\nEnter the type of loan e.g. Home or Education loan : ");
		String loanName = br.readLine();

		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);

		System.out.print("\n");
		System.out.print("Enter the interest rate for " + b.getBankName()
				+ ": ");

		double rate = Double.parseDouble(br.readLine());
		System.out.print("\n");
		System.out.print("Enter the loan amount you want to take: ");

		double loanAmount = Double.parseDouble(br.readLine());
		System.out.print("\n");
		System.out
				.print("Enter the number of years to pay your entire loan amount: ");
		int years = Integer.parseInt(br.readLine());

		System.out.print("\n");
		System.out.println("you are taking the loan from " + b.getBankName());

		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);

	}

}
