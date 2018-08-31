package com.shariful.aug1.interviewprograms;

class Test {
	int x;
}

public class Main {
	public static void main(String[] args) {
		Test i = new Test();
		i.x = 10;
		Test j = new Test();
		j.x = 20;
		System.out.println("Before Swap - i.x = " + i.x + ", j.x = " + j.x);
		swap(i, j);
		System.out.println("After Swap - i.x = " + i.x + ", j.x = " + j.x);
	}

	public static void swap(Test i, Test j) {
		int temp = i.x;
		i.x = j.x;
		j.x = temp;
	}
}
