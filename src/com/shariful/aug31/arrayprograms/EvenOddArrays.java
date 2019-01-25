package com.shariful.aug31.arrayprograms;

import java.util.Scanner;

public class EvenOddArrays {

	public static void main(String[] args) {
		
		int n;
		int j = 0, k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		n = sc.nextInt();
		
		int a[] = new int[n];
		int even[] = new int[n];
		int odd[] = new int[n];
		
		System.out.println("Enter elements in the array:");
		for(int i=0; i<n;i++){
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
			if(a[i]%2 != 0){
				odd[j] = a[i];
				j++;
			}
			else{
				even[k] = a[i];
				k++;
			}
		}
		
		System.out.println("Odd:");
		if(j>1){
			for(int i=0; i<j-1; i++){
				System.out.print(odd[i]+", ");
			}
			System.out.print(odd[j-1]);
		}else
			System.out.println("No Number");
		
		System.out.println("\nEven:");
		if(k>1){
			for(int i=0; i<k-1; i++){
				System.out.print(even[i]+", ");
			}
			System.out.print(even[k-1]);
		}else
			System.out.println("No Number");
	}
}
