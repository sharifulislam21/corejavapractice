// Sum of Array Elements

package com.shariful.aug1.interviewprograms;

public class ArraySum {

	public static void main(String[] args) {
		int arr[] = { 1, 6, 5, 4, 3, 2, 8 };
		System.out.println("Sum of Array Elements: " + sumOfArray(arr));
	}

	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}
}
