package com.shariful.oct29.string;

public class SubstringTest2 {

	public static void main(String[] args) {
		String str = "hello";
		String str1 = str.substring(0,5);	
		System.out.println(str1);			//hello
		
		System.out.println(str == str1);
		
		System.out.println(str.equals(str1));
	}
}
