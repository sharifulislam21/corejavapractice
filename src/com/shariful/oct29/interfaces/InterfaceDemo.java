package com.shariful.oct29.interfaces;

interface Phone{
	
	void call();
	default void message(){
		System.out.println("Message Default");
	}
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
		System.out.println("Android phone call!");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Phone p = new AndroidPhone();
		p.call();
		p.message();
		
	}
}
