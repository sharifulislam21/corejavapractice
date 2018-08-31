package com.shariful.aug1.interviewprograms;

import java.util.Scanner;

public class Palendrome {

	public static void main(String[] args) {
		int num, revNum = 0, temp, mod;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp = num;
		while(num!=0){
			mod = num % 10;
			revNum = revNum *10 + mod;
			num = num/10;
		}
		
		System.out.println("Number: "+temp);
		System.out.println("Rev Number: "+revNum);
		
		if(revNum == temp)
			System.out.println("Number "+temp+" is Palendrome");
		
		else
			System.out.println("Number "+temp+" is not Palendrome");
	}
	
	
}
