package com.shariful.jul4.interfaces;

public class TestClass implements TestInterface1 {

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

//	public void test3(){
//		System.out.println("Test 3 class method");
//	}
	
	public static void main(String[] args) {
		TestInterface1 t1 = new TestClass();
//		TestInterface a1 = new TestInterface();
//		TestInterface a2 = new TestInterface();
//		if(a1==a2)
//			System.out.println("True");
//		else
//			System.out.println("False");
//		
//		if(a1.equals(a2))
//			System.out.println("True");
//		else
//			System.out.println("False");
		
		
		String s1 = "shariful";
		String s2 = new String("shariful");
		
		if(s1==s2)
			System.out.println("True");
		else
			System.out.println("False");
		
		if(s1.equals(s2))
			System.out.println("True");
		else
			System.out.println("False");
		
		t1.test3();
	}
}
