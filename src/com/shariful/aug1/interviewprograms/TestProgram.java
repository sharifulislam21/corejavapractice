package com.shariful.aug1.interviewprograms;

public class TestProgram {

	/*public static void m1(int i, float f){
		System.out.println("INT - FLOAT");
	}
	
	public static void m1(float f, int i){
		System.out.println("FLOAT - INT");
	}
	
	public static void main(String[] args) {
		TestProgram t = new TestProgram();
		t.m1(10,10); 		//Compile Time Error
	}*/

	public static void main(String[] args) {
		int[] x= new int[3];
		String s = "Shariful";
		System.out.println(x.length);
		//System.out.println(x.length());	//Error
		System.out.println(s.length());
		//System.out.println(s.length);		//Error
	}
}
