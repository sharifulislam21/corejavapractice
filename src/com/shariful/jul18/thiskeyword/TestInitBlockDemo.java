/*
 * When we want certain common resources to be executed with every constructor we can put the code in the init block. 
 * Init block is always executed before any constructor, whenever a constructor is used for creating a new object
 * */

package com.shariful.jul18.thiskeyword;

public class TestInitBlockDemo {

	{
		System.out.println("Init Block");
	}
	
	TestInitBlockDemo(){
		System.out.println("Default Constructor");
	}
	
	TestInitBlockDemo(int x){
		System.out.println("Parametrized Constructor");
	}
	
	public static void main(String[] args) {
		new TestInitBlockDemo();
		new TestInitBlockDemo(4);
	}
}
