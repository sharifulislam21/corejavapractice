package com.shariful.aug1.interviewprograms;

public class Pattern {

	public Pattern(){
		
	}
	public static void main(String[] args) {

		/*
		 * 1 2 3 4 5 
		 * 2 3 4 5 
		 * 3 4 5 
		 * 4 5 
		 * 5
		 */
		 
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("=====================================");
		/* 1  
		 * 1 2  
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5 
		 */
		 
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("=====================================");
		/*
		 * $ $ $ $
		 * $     $
		 * $     $
		 * $ $ $ $ 
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i==1 || i==5 || j==1 || j==5)
					System.out.print("$ ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
		
		System.out.println("=====================================");

	}
}
