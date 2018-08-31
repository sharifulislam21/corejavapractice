/*Sum of fibonaaci series upto given input.
input:3
logic:1+1+2
output:4
*/

package com.shariful.may2.practice;

import java.util.Scanner;

public class FibonacciSum {

	public static void main(String[] args) {
		System.out.println("Enter the number of values:");
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		System.out.println(SumOfFibonnacci(input));
	}

	public static int SumOfFibonnacci(int input) {
		int sum=0;
		int a=0, b=1, c=0;
		
		for(int i=0; i<input; i++){
			c=a+b;
			a=b;
			b=c;
			System.out.println(c+"\t");
			sum+=c;
		}
		System.out.println("Sum of Fibonacci Series: ");
		return sum;
	}

}
