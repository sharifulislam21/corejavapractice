package com.shariful.jul18.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortUsingComparator {

	public static void main(String[] args) {
		String[] strArr = {"Java", "C", "C++","Perl", "Python", "COBOL"};
		Arrays.sort(strArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		
		});
		
		for(String i:strArr){
			System.out.println(i);
		}
		
		
	}
}
