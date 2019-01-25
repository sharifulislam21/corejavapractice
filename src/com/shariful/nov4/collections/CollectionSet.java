package com.shariful.nov4.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * HashSet works on hashing so it will traverse in a random fashion whereas
 * TreeSet sorts the collection in the ascending order
 * 
 * HashSet follows the hashing algorithm
 * 
 * */
public class CollectionSet {

	public static void main(String[] args) {
		
		//Set<Integer> values = new HashSet<Integer>();
		
		Set<Integer> values = new TreeSet();
		
		System.out.println(values.add(123));
		System.out.println(values.add(1232));
		System.out.println(values.add(1234));
		System.out.println(values.add(12314));
		System.out.println(values.add(123));
		
		for(int i: values){
			System.out.println(values);
		}
	}
}
