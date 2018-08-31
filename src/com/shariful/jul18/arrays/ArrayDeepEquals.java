package com.shariful.jul18.arrays;

import java.util.Arrays;

public class ArrayDeepEquals {

	public static void main(String[] args) {
		String[] strArr = {"Java", "C", "C++"};
		String[] strArrCopy = {"Java", "C", "C++"};
		System.out.println(" strArr and strArr2 are same: "+ Arrays.deepEquals(strArr, strArrCopy));
		String[] strArrMod = {"C", "C++"};
		System.out.println(" strArr and strArr2 are same: "+ Arrays.deepEquals(strArr, strArrMod));
	}
}
