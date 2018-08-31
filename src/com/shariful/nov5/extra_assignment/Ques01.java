//Generate the table of entered input and 
//give out the square of multiple 


package com.shariful.nov5.extra_assignment;
import java.util.Scanner;

public class Ques01 {

	private static Scanner sc;

	public static void main(String[] args)
	{
		int input;
		sc = new Scanner(System.in);
		System.out.println("Enter the Number to generate table:");
		input =sc.nextInt();
		System.out.println("Table of "+input+" :\n");
		for(int i=0; i<10; i++)
		{
			System.out.println(input+" * "+i+" = "+input*i+"\t Square of Multiple:"+input*i*input*i);
		}
		
	}
	
}
