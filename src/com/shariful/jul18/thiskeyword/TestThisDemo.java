/*
 * this keyword
 * "this"is a predefined instance variable to hold current object reference
 * */

package com.shariful.jul18.thiskeyword;

public class TestThisDemo {
	int p, q;
	 
	TestThisDemo(int a, int b){
	 //this must be used to access instance variable if both instance and local variable names are same
	      p=a;
	      q=b;
	 }
	 
	    public static void main(String[] args){
	 
	    	TestThisDemo obj= new TestThisDemo(1,2);
	        
	        System.out.println(obj.p);
	        System.out.println(obj.q);
	}
}
