package com.shariful.jul18.arrays;

import java.util.Arrays;

public class ArrayCopyOfRange {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7 };

		// using for loop
		for (int i = 0; i < array.length; i++) {
			System.out.println("ARRAY"+array[i]);
		}

		int newArray[] = Arrays.copyOfRange(array, 1, 5);
		
		for(int i:newArray){
			System.out.println("New Array" + i + "");
		}

	}
}
