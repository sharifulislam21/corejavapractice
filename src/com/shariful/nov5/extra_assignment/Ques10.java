//Merge Sort

package com.shariful.nov5.extra_assignment;

import java.util.Scanner;

public class Ques10 
{
	
	private static Scanner sc;

	public static void mergeSort(int[] a,int low,int high)
	{
		int num=high-low;
		if(num<=1)
			return;
		
		int mid=low+num/2;
		
		//breaking the array from middle,and then recursively sorting it
		mergeSort(a, low, mid);
		mergeSort(a, mid, high);
		
		//sorting and merging
		int[] temp=new int[num];
		int i=low,j=mid;
		for(int k=0;k<num;k++)
		{
			if(i==mid)
				temp[k]=a[j++];
			else if(j==high)
				temp[k]=a[i++];
			else if(a[j]<a[i])
				temp[k]=a[j++];
			else
				temp[k]=a[i++];
		}
		for(int k=0;k<num;k++)
		{
			a[low+k]=temp[k];
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("-----MERGE SORT-----");
		sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int input=sc.nextInt();
		int arr[]=new int[input];
		System.out.println("Enter "+input+" elements:");
		for(int i=0;i<input;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before Sorting:");
		for(int i=0;i<input;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		mergeSort(arr, 0, arr.length);
		System.out.println("\nAfter Sorting:");
		for(int i=0;i<input;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
