package com.shariful.jul4.garbagecollection;

import java.sql.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		
		// Runtime class is a singleton class
		Runtime r = Runtime.getRuntime();
		System.out.println("Total memory of heap: "+ r.totalMemory());
		System.out.println("Total free memory of heap: " + r.freeMemory());
		
		for(int i=0; i<100; i++){
			Date d = new Date(i);
			d= null;
		}
		
		System.out.println("Total memory of heap: "+ r.totalMemory());
		r.gc();
		System.out.println("Total free memory of heap: " + r.freeMemory());
	}
	
}
