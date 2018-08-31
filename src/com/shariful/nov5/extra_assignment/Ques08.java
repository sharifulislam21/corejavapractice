package com.shariful.nov5.extra_assignment;
import java.util.Scanner;

//Linear Search

public class Ques08 {
	
	private static Scanner sc;

	public static void main(String[] args) {
	
		sc = new Scanner(System.in);
		System.out.println("Enter number of elements to be entered:");
		int input=sc.nextInt();
		int array[]=new int[input];											//declaring array
		System.out.println("Enter elements:");
		int flag=0;
		for(int i=0;i<input;i++)												//taking array input
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Enter element to be searched:");
		int value=sc.nextInt();
		
		for(int i=0;i<input;i++)												//searching code
		{
			if(array[i]==value)
			{
				System.out.println(value+" found at "+ (i+1) +" location");
				flag++;
			}			
		}
		if(flag==0)														//array element if not found
			System.out.println(value+" is not present...");
	}

}
