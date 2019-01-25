package com.shariful.may17.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		Stream<Integer> s = list.stream();
		
		s.forEach(System.out::println);
		s.forEach(System.out::println); // will generate exception, as one stream can be used only once
		
	}

}
