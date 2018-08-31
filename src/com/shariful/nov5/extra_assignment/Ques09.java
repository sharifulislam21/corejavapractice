//Selection Sort

package com.shariful.nov5.extra_assignment;

import java.util.Scanner;

public class Ques09 
{
	 private static Scanner sc;

	public static void selectionSort( int arr[] )
	 {
	        int size = arr.length;
	        int i, j, pos, temp;
	        for (i = 0; i < size-1; i++)
	        {
	            pos = i;
	            for (j = i+1; j < size; j++)
	            {
	                if (arr[j] < arr[pos])
	                {
	                    pos = j;
	                }
	            }
	            temp = arr[i];
	            arr[i] = arr[pos];
	            arr[pos]= temp;            
	        }        
	    }
	
	public static void main(String[] args) 
	{
		System.out.println("-----Sequential Sort-----");
		sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int input=sc.nextInt();
		int arr[]=new int[input];
		System.out.println("Enter "+input+" elements:");
		for(int i=0;i<input;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		selectionSort(arr);
		System.out.println("Elements after sorting:");
		for(int i=0;i<input;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
