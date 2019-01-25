package com.shariful.aug1.interviewprograms;

import java.util.Scanner;

public class PalendromeList {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower limit: ");
		int lowerLimit = sc.nextInt();
		System.out.println("Enter the upper limit: ");
		int upperLimit = sc.nextInt();
		
		int number, remainder, rev = 0;
		System.out.println("Palendrome Numbers from "+ lowerLimit +" to "+ upperLimit + " are:");
		
		for(int i=lowerLimit; i<=upperLimit; i++){
			number = i;
			while(number != 0){
				remainder = number % 10;
				rev = rev * 10 + remainder;
				number = number/10;
			}
			if(rev == i){
				System.out.print(i+" ");
			}
			rev = 0;
		}
	}
}
