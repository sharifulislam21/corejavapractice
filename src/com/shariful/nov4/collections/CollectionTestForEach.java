package com.shariful.nov4.collections;

import java.util.Arrays;
import java.util.List;

public class CollectionTestForEach {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Banana", "Lemon", "Orange", "Apple");
		 
		fruits.forEach(fruit -> System.out.println(fruit));

	}

}
