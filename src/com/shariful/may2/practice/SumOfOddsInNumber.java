/*
 * A number is given as input. Find the odd digits in the number, add them and find
if the sum is odd or not.if even return -1, if odd return 1
input:52315
logic:5+3+1+5=14(even)
output:-1
input:1112
logic:1+1+1=3(odd)
output:1
*/

package com.shariful.may2.practice;

import java.util.Scanner;

public class SumOfOddsInNumber {

	private static Scanner sc;
	
	public static int SumOfOddsAndEvens(int n){
		
		int n1, n2=0, n3;
	
		while(n!=0){
			
			n1=n%10;
			if((n1%2)!=0)
				n2+=n1;
			
			n/=10;
		}
		if(n2%2==0)
			 n3=-1;
		else
			 n3=1;

		return n3;
	}
	
	public static void main(String[] args) {
		
		int input;
		sc = new Scanner(System.in);
		System.out.println("Please Enter a Number: ");
		input= sc.nextInt();
		System.out.println(SumOfOddsAndEvens(input));
	}

}
