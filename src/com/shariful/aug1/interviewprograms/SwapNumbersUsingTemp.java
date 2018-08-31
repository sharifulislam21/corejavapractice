package com.shariful.aug1.interviewprograms;

public class SwapNumbersUsingTemp {

	public static void main(String[] args) {
		int a = 20, b = 35;
		int temp;
		System.out.println("Before Swaping: a= " + a + ", b= " + b);

		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swaping: a= " + a + ", b= " + b);
	}
}
