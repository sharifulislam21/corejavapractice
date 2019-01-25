package com.shariful.aug31.arrayprograms;

public class FindCommonElementsInArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 23, 4, 5, 6, 8 };
		int[] arr2 = { 4, 65, 7, 3, 52, 3, 23 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
