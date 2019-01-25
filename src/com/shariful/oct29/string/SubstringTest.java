package com.shariful.oct29.string;

public class SubstringTest {

	public static void main(String[] args) {
		String str = "shariful islam";
		String str1 = str.substring(1);		//hariful islam
		System.out.println(str1);
		
		String str2 = str.substring(0, 7);		//sharifu
		System.out.println(str2);
		
		String str3 = str.substring(str.length());
		System.out.println("substring: "+str3);
	}
}
