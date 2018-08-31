package com.shariful.jul18.arrays;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		Integer array[] = { 1, 2, 3, 4, 5, 6, 7 };

		// using for loop
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// using Arrays.asList(array)
		System.out.println(Arrays.asList(array));

		// using for each loop
		String[] array2 = { "hi", "hello", "namaskar" };

		for (String str : array2) {
			System.out.println(str);
		}

		// using Arrays.asList(array)
		System.out.println(Arrays.asList(array2));

		// using Arrays.toString(array)
		System.out.println(Arrays.toString(array2));

		// using Arrays.deepToString(array)
		int[][] array3 = new int[][] { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };

		System.out.println(Arrays.deepToString(array3));

	}
}
