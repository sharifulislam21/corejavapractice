package com.shariful.oct29.string;

public class StringLengthWithoutFunction {

	public static void main(String[] args) {
		String str = "My name is Shariful Islam!";
		int i=0;
		for(char c: str.toCharArray()){
			i++;
		}
		System.out.println("Length: "+i);
	}
	
}
