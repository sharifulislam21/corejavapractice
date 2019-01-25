package com.shariful.oct30.exceptionhandling;

public class IllegalArgumentExceptionTest {

	public static void main(String[] args) {
		
		String str = null;
		
		System.out.println(str.length());
	}
	
//	public static int getLength(String s) 
//    { 
//        if (s == null) 
//            throw new IllegalArgumentException("The argument cannot be null"); 
//        return s.length(); 
//    } 
}
