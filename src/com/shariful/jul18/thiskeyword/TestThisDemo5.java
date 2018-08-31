/*
 *  its not possible to use this keyword in static block
 *  
 *  its possible to access static variable of a class using this but its discouraged and 
 *  as per best practices this should be used on non static reference.
 * */

package com.shariful.jul18.thiskeyword;

public class TestThisDemo5 {
	static int p;

	static {
		//this.p = 10;	//Error : Cannot use this in a static context
	}

	public static void main(String[] args) {

		TestThisDemo5 obj = new TestThisDemo5();

	}
}
