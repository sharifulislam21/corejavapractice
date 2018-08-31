package com.shariful.jul18.thiskeyword;

public class TestThisDemo2 {
	int a, b;

	TestThisDemo2() {
		System.out.println("Default Const");
	}
	
	TestThisDemo2(int a, int b){
		//	We can use this keyword in constructor overloading
		//	To call one constructor from another we need this();; 
		//  and this() call should be first statement of the constructor
		this();
		this.a = a;
		this.b = b;
		
	}
	
	public static void main(String[] args) {
		TestThisDemo2 obj = new TestThisDemo2(3,4);
		System.out.println(obj.a);
        System.out.println(obj.b);
	}
	
	
}
