package com.shariful.may17.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*
 * Passing method as a parameter, is Call by Method Reference
 * 
 * */
public class MethodReferenceDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Shariful", "Shruti", "Surbhi");

		// Using method reference
		list.forEach(System.out::println);
		
		// Using Consumer Interface
		Consumer<String> con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		list.forEach(con);
		
		// Using lambda expression
		list.forEach(str -> System.out.println(str));
	}
}
