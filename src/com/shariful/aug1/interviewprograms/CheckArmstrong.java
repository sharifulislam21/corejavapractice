package com.shariful.aug1.interviewprograms;

import java.util.Scanner;

public class CheckArmstrong {

	public boolean isArmstrong(int number){
	
		int temp = number;
		int sum = 0, remainder;
		
		while(temp != 0){
			remainder = temp%10;
			//sum += Math.pow(remainder, 3);
			sum += remainder*remainder*remainder;
			temp = temp/10;
		}
		
		if(sum==number)
			return true;
		else
			return false;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		CheckArmstrong obj = new CheckArmstrong();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check armstrong or not: ");
		int number = sc.nextInt();
		// 371, 153 are Armstrong Number
		System.out.println("Entered number is Armstrong: "+obj.isArmstrong(number));
	}
}
