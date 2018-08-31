package com.shariful.aug1.interviewprograms;

public class SwapNumbersWithoutUsingTemp {

	public static void main(String[] args) {
		int a = 20, b = 35;
		
		System.out.println("Before Swaping: a= "+a+", b= "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swaping: a= "+a+", b= "+b);
	}
}
