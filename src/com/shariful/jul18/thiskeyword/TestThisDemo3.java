package com.shariful.jul18.thiskeyword;

public class TestThisDemo3 {
	int a, b;
	
	TestThisDemo3(int a, int b){
		this.a = a;
		this.b = b;
		
	}
	
	void show(){
		System.out.println("Inside Show");
	}
	
	void print(){
		
		System.out.println("Inside Print: "+a+" "+b);
		this.show();		// we can use this keyword to call current class non static methods
	}
	
	public static void main(String[] args) {
		TestThisDemo3 obj = new TestThisDemo3(3,4);
		obj.print();
	}
}
