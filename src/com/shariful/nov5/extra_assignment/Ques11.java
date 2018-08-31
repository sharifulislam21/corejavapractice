//Array with Duplicate elements removed

package com.shariful.nov5.extra_assignment;

import java.util.Scanner;

public class Ques11 
{
	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int input=sc.nextInt();
		int arr[]=new int[input];
		System.out.println("Enter "+input+" elements:");
		for(int i=0;i<input;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					while(j<(size)-1)
					{
						arr[j]=arr[j+1];
						j++;
					}
					size--;
				}
			}
		}
		System.out.println("Array with duplicate elements removed:");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
