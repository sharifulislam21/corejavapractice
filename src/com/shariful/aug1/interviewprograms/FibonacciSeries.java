package com.shariful.aug1.interviewprograms;

import java.util.Scanner;

public class FibonacciSeries {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter number count:");
		int fibCount = sc.nextInt();
		int[] fib = new int[fibCount];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2; i<fibCount; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		//Print Fibonacci Series
		System.out.println("Fibonacci Series:  ");
		for(int i=0; i<fibCount; i++){
			System.out.println(fib[i] + " ");
		}
	}
}
