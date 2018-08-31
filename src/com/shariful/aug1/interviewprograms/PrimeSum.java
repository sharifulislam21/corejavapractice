package com.shariful.aug1.interviewprograms;

import java.util.Scanner;

public class PrimeSum {

	private static Scanner sc;

	public static void main(String[] args) {
		
		int number=2;
		int count = 0;
		long sum=0;
		
		sc = new Scanner(System.in);
		System.out.println("Count of Prime Numbers:");
		int countOfPrimeNumbers = sc.nextInt();
		
		
		while(count<countOfPrimeNumbers){
			if(isPrimeNumber(number)){
				sum += number;
				count++;
			}
			number++;
		}
		System.out.println("Sum of Prime Numbers:"+sum);
	}
	
	public static boolean isPrimeNumber(int number){
		
		for(int i=2; i<=number/2; i++){
			if(number%i==0)
				return false;
		}
		return true;
	}
}
