package com.shariful.jul4.garbagecollection;

public class FinalizeDemo {
	public static void main(String[] args) {
		String s = new String("shariful");
		FinalizeDemo obj = new FinalizeDemo();
		//s = null;
		obj = null;
		System.gc();
		System.out.println("End of main");
		
	}
	
	public void finalize(){
		System.out.println("Finalize method is executed!");
	}
}
