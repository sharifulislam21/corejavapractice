package com.shariful.may2.practice;

import java.util.Scanner;

public class SumOfOdds {

	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println("Enter the value upto what you find the sum:");
		scan = new Scanner(System.in);
		int input=scan.nextInt();
		System.out.println("Sum :"+SumOfOdd(input));
	}

	public static int SumOfOdd(int input) {
		int counter, sum=0;
		for(counter=1; counter<=input; counter++){
			if(counter%2!=0){
				System.out.println("odd number "+counter);
				sum += counter;
			}
		}
		return sum;
	}

}
