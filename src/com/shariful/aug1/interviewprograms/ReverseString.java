// Write a program to reverse a string using recursive algorithm
package com.shariful.aug1.interviewprograms;

public class ReverseString {

	String reverse = "";
	
	public String reverseString(String string) {
		if(string.length() == 1){
			return string;
		}
		else {
			reverse += string.charAt(string.length()-1)
					+ reverseString(string.substring(0, string.length()-1));
			return reverse;
		}
		
//		if(string.equals(reverse))
//			System.out.println("String is palendrome");
//		else
//			System.out.println("String is not palendrome");
	}
	
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		System.out.println("Reverse String: "+obj.reverseString("shariful"));
	}
}
