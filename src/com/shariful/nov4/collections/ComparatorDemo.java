package com.shariful.nov4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(202);
		list.add(369);
		list.add(154);
		
		//Collections.sort(list);			// default sorting
		
		// custom sort method using anonymous class
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				
				if(i%10>j%10)
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(list, c);
		
		// custom sort method using lambda expression
		//Comparator<Integer> c1 = (Integer i, Integer j) -> i%10>j%10?1:-1;
		
		Collections.sort(list, (i,j) -> i%10>j%10?1:-1);
		
		for(Integer o : list){
			System.out.println(o);
		}
	}
}
