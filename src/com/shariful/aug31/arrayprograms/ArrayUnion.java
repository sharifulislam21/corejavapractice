package com.shariful.aug31.arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUnion {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr1[] = { 1, 2, 3, 5, 9, 7, 8, 6 };
		int arr2[] = { 2, 4, 5, 6, 8, 1 };
		int i = 0, j = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		// System.out.println(Arrays.toString(arr1));
		System.out.println("Union of Arrays: ");
		
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
			} else {
				if (arr2[j] < arr1[i]) {
					System.out.print(arr2[j] + " ");
					j++;
				} else {
					System.out.print(arr1[i] + " ");
					i++;
					j++;
				}
			}
		}

		if (i < arr1.length)
			while (i < arr1.length) {
				System.out.print(arr1[i] + " ");
				i++;
			}

		if (j < arr2.length)
			while (j < arr2.length) {
				System.out.print(arr2[j] + " ");
				j++;
			}

	}
}
