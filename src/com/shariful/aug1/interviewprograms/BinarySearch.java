package com.shariful.aug1.interviewprograms;

import java.util.Scanner;

public class BinarySearch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int num, x, first, last, mid, flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to enter in the array:");
		num = sc.nextInt();
		
		int array[] = new int[num];
		System.out.println("Enter the array elements:");
		for(int i=0; i<num; i++){
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element you want to search:");
		x = sc.nextInt();
		
		first = 0;
		last = num-1;
		
		while(first<=last){
			mid = (first+last)/2;
			
			if(array[mid]>x)
				last = mid - 1;
				else
					if(array[mid]<x)
						first = mid + 1;
					else{
						flag = 1;
						System.out.println("Element Found!!!");
						break;
					}
		}
		if(flag == 0)
			System.out.println("Element Not Found!!!");
	}
}
