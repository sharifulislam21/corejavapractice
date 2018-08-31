package com.shariful.nov8.io;

import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Java I/O");
		System.err.println("Error!!!!");
		int i=System.in.read();				//returns ASCII code of 1st character  
		System.out.println((char)i);		//will print the character  
	}

}
