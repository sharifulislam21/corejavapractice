package com.shariful.nov6.multithreading;

import java.util.HashMap;
import java.util.Map;

public class ThreadTestWithLambdaExp {

	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> System.out.println("Hello From Another Thread"));
		thread.start();
		
		Map<String, Integer> nameMap = new HashMap<>();
		Integer value = nameMap.computeIfAbsent("John", s -> s.length());
	}
}
