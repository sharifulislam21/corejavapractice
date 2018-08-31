/*
 * 
 * Type 2 : From base class: by using super() keyword to call constructor from the base class.
 * 
 * */

package com.shariful.jul18.thiskeyword;

class Base{
	
	String name;
	
	Base(){
		System.out.println("Base class default constructor");
	}
	
	Base(String x){
		this();
		System.out.println("Base class parametrised constructor");
	}
	
}

class ConstructorChaining extends Base{
	
	ConstructorChaining(){
		//this();				//Recursive constructor invocation ConstructorChaining()
		this(" derived ");
		System.out.println("Derived class default constructor");
	}
	
	ConstructorChaining(String y){
		super(y);
		System.out.println("Derived class parametrised constructor");
	}
	
	public static void main(String[] args) {
		//new ConstructorChaining("shariful");
		new ConstructorChaining();
	}
}

