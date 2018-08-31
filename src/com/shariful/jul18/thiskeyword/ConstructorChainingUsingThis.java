/*
 * Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
 * 
 * Type 1 : Within same class: It can be done using this() keyword for constructors in same class
 * */

package com.shariful.jul18.thiskeyword;

public class ConstructorChainingUsingThis {

	int a, b;

	public ConstructorChainingUsingThis() {
		this(1, 2);
		System.out.println("Default Constructor");
	}
	
	public ConstructorChainingUsingThis(int x, int y){
		this(3,4,5);
		a=x; b=y;
		System.out.println("2 Param Constructor"+ a + " " + b);
	}
	
	public ConstructorChainingUsingThis(int x, int y, int z){
		System.out.println("3 Param Constructor");
	}
	
	public static void main(String[] args) {
		ConstructorChainingUsingThis obj = new ConstructorChainingUsingThis();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
