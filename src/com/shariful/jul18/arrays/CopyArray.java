package com.shariful.jul18.arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] arr = {2,6,8,9,10};
		System.out.println("Size of array: "+arr.length);
		int[] newArr = Arrays.copyOf(arr, 10);
		System.out.println("Size of new array: "+newArr.length);
	}
}
