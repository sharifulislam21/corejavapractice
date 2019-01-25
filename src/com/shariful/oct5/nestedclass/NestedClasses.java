package com.shariful.oct5.nestedclass;

// Static Inner Classes
class OuterClass {

	int i = 10;
	static int j=11;

	static void methodOne() {
		System.out.println("Static Method One of Outer Class");
	}

	void methodTwo() {
		System.out.println("Non Static Method Two");
	}

	static class NestedClassOne {
		int i = 20;

		static void methodOne() {
			System.out.println("Static Method One of NestedClassOne");
		}
	}

	static class NestedClassTwo {
		int i = 30; // Non-static Field of NestedClassTwo

		static void methodOne() {
			System.out.println("Static Method One of NestedClassTwo");
		}
	}
}

public class NestedClasses{
	public static void main(String[] args) {
	
		OuterClass.methodOne();      //static member can be accessed directly through class name.
		System.out.println(OuterClass.j); //static member can be accessed directly through class name.
		OuterClass outer = new OuterClass();
        System.out.println(outer.i);  //Instance member must be accessed through object reference
 
        OuterClass.NestedClassOne.methodOne();  //static member can be accessed directly through class name.
        OuterClass.NestedClassOne nestedOne = new OuterClass.NestedClassOne();
        System.out.println(nestedOne.i);     //Instance member must be accessed through object reference
 
        OuterClass.NestedClassTwo.methodOne();  //static member can be accessed directly through class name.
        OuterClass.NestedClassTwo nestedTwo = new OuterClass.NestedClassTwo();
        System.out.println(nestedTwo.i);     //Instance member must be accessed through object reference
    
	}
}
