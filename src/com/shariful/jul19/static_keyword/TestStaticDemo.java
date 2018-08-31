package com.shariful.jul19.static_keyword;

public class TestStaticDemo {

	private String str= "Non Static String";
	private static String str2= "Static String";
	
	public TestStaticDemo(String s) {
		this.str = s;
	}
	
	public static void testStaticMethod(){
		System.out.println("Hey... I am in static method...");
        //you can call static variables here
        System.out.println(TestStaticDemo.str2);
        //you can not call instance variables here.
	}
	
	public void testObjectMethod(){
        System.out.println("Hey i am in non-static method");
        //you can also call static variables here
        System.out.println(TestStaticDemo.str2);
        //you can call instance variables here
        System.out.println("Name: "+this.str);
    }
	
	public static void main(String[] args) {
		TestStaticDemo.testStaticMethod();
		TestStaticDemo obj =  new TestStaticDemo("Eclipse");
		obj.testObjectMethod();
	}
}
