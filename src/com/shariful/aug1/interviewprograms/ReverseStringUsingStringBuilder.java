package com.shariful.aug1.interviewprograms;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		
		System.out.println("Enter the String to reverse:");
		Scanner read = new Scanner(System.in);
		
		String str = read.nextLine();
		
		//Method 1
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1; i>=0; i--){
			sb.append(str.charAt(i));
		}
		
		System.out.println("Reverse : "+sb.toString());
		
		//Method 2
		StringBuilder sb2 = new StringBuilder(str);
		System.out.println("Reverse : "+sb2.reverse().toString());
	}
}
