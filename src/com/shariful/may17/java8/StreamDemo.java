package com.shariful.may17.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		 
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<100; i++){
			list.add(i);
		}
		System.out.println(list.stream().filter(i -> {
			System.out.println("Hello");
			return true;
		}).findAny().orElse(0));
	}
}
