package com.shariful.aug1.interviewprograms;

public class DivisibleBy2WithoutUsingArithmeticOperator {

	public static void main(String[] args) {
		 int number = 7;
		 int factor = 2;
		 
		 if(isDivisibleBy2(number, factor))
			 System.out.println("Divisible	");
		 else
			 System.out.println("Not Divisible");
	}

	public static boolean isDivisibleBy2(int n, int f) {
		
		if((n & ((1 << f) -1 )) == 0)
			return true;
		
		return false;
	}
}
