package com.shariful.jul18.arrays;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
		String[] stringArr= {"shariful","tapas","rahul" };
		List<String> strList= Arrays.asList(stringArr);
		System.out.println(stringArr);
		System.out.println(strList);
		System.out.println(strList.size());
	}
}
