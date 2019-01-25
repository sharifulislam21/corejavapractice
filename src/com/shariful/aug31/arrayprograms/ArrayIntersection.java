package com.shariful.aug31.arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = { 1, 2, 3, 5, 9, 7, 8, 6 };
		int arr2[] = { 2, 4, 5, 6, 8, 1, 7 };
		int i = 0, j = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		// System.out.println(Arrays.toString(arr1));
		System.out.println("Intersection of Arrays: ");
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else {
				if (arr2[j] < arr1[i]) {
					j++;
				} else {
					System.out.print(arr1[i] + " ");
					i++;
					j++;
				}
			}
		}
	}
}
