package com.shariful.aug1.interviewprograms;

import java.util.Scanner;

public class CheckPrime {

	public boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		CheckPrime obj = new CheckPrime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check prime or not: ");
		int number = sc.nextInt();
		System.out.println("Entered number is Prime: "+obj.isPrime(number));

	}
}
