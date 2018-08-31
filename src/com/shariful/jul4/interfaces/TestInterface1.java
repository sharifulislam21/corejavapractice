package com.shariful.jul4.interfaces;

@FunctionalInterface
public interface TestInterface1 {
	
	public abstract void test1();
	public static void test2(){
		System.out.println("Test 2 method");
		}
	
	default void test3(){
		System.out.println("Test 3 method");
	}
}
