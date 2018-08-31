package com.shariful.jul5.oops;

public class Test {
	public static void main(String[] args) {
		TestParent p = new TestParent();
		p.methodOne();
		TestChild c = new TestChild();
		c.methodTwo();
		TestParent p2 = new TestChild();
		p2.methodOne();
//		TestChild c2 = new TestParent(); //Child class reference cannot be used to hold parent class object
//		c2.methodOne();
//		c2.methodTwo();
	}
}
