package com.shariful.jul18.thiskeyword;

public class TestThisDemo4 {
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	TestThisDemo4 show() {
		return this;

	}

	public static void main(String[] args) {
		TestThisDemo4 obj = new TestThisDemo4();
		obj.setA(4);
		System.out.println(obj.getA());
		TestThisDemo4 obj2 = obj.show();
		System.out.println(obj2.getA());
	}
}
