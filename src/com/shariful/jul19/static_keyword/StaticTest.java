package com.shariful.jul19.static_keyword;

public class StaticTest {

	private static int aStaticVariable = 1; 
	private int aNonStaticVariable = 2; 
	
	public static void staticMethod(){
		System.out.println("Static method");
		//aNonStaticMethod();
	}
	
	private void aNonStaticMethod() { 
		System.out.println("Static Variable "+aStaticVariable); 
		System.out.println("Non Static Variable "+aNonStaticVariable); 
		staticMethod();
//		main(new String[1]);
	}

	public static void main(String[] args) {
		System.out.println("From Main Method: Static Variable " + aStaticVariable);
		//System.out.println("From Main Method: Non Static Variable " + aNonStaticVariable);		//Error
		
		StaticTest object = new StaticTest(); 
		System.out.println("Calling non static variable using object, Non Static Variable: " + object.aNonStaticVariable); 
		object.aNonStaticMethod(); 
		
	}
}
