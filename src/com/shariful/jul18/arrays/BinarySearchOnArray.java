package com.shariful.jul18.arrays;

import java.util.Arrays;

public class BinarySearchOnArray {

	public static void main(String[] args) {
		char[] charArray= {'a','b','c'};
		int index = Arrays.binarySearch(charArray, 'c');
		int index2 = Arrays.binarySearch(charArray, 0, charArray.length-1, 'a');
		System.out.println("Your serached character index is "+index);
		System.out.println("Your serached character index is "+index2);
	}
	
}
