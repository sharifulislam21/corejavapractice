package com.shariful.jul19.static_keyword;

public class StaticBlockVsConstructor {

	static{
		System.out.println("I am in static block");
        System.out.println("Static block will be called first than constructor!!!");
        System.out.println("Static block will be called only once.");
	}
	
	public StaticBlockVsConstructor() {
		System.out.println("I am in constructor");
		System.out.println("I will be called every time when the object of this class is created");
	}
	
	public static void main(String[] args) {
		StaticBlockVsConstructor obj1 = new StaticBlockVsConstructor();
		StaticBlockVsConstructor obj2 = new StaticBlockVsConstructor();
		StaticBlockVsConstructor obj3 = new StaticBlockVsConstructor();
		
	}
}
