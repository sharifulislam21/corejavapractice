package com.shariful.aug1.interviewprograms;

public class TestProgram {

	public static void m1(int i, float f){
		System.out.println("INT - FLOAT");
	}
	
	public static void m1(float f, int i){
		System.out.println("FLOAT - INT");
	}
	
	public static void main(String[] args) {
		TestProgram t = new TestProgram();
		/*t.m1(10,10);*/ 		//Compile Time Error
	}
}
