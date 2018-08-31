/*
 * Sort or order a HashMap or TreeSet or any map item by value. 
 * Write a comparator which compares by value, not by key. 
 * Entry class might helps you here.
 * */

package com.shariful.aug1.interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Shariful", 93);
		map.put("Shruti", 95);
		map.put("Rohit", 91);
		map.put("Surbhi", 90);
		
		Set<Entry<String,Integer>> set = map.entrySet();
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(set);
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo( o1.getValue() );
			}
		});
		for(Entry<String, Integer> entry:list){
	        System.out.println(entry.getKey()+" ==> "+entry.getValue());
	    }
	}
	
}
