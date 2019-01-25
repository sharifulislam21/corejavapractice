package com.shariful.aug31.arrayprograms;

import java.util.Scanner;

public class FindMaxAndMinFromArray {

	public static void main(String[] args) {
	
		int n, max, min;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements in the array:");
		for(int i=0; i<n;i++)
			a[i] = sc.nextInt();
		
		max=min=a[0];
		for(int i=1;i<n;i++){
			if(a[i]>max){
				max = a[i];
			}
			if(a[i]<min){
				min = a[i];
			}
		}
		System.out.println("Largest value in array:"+max);
		System.out.println("Smallest value in array:"+min);
	}
}
