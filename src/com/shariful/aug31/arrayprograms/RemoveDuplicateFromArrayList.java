/*
 * We can remove repeated elements in arraylist by two ways.

Using HashSet – Do not maintain the insertion order.
Using LinkedHashSet – Maintain the insertion order.
 */

package com.shariful.aug31.arrayprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		HashSet<String> set1 = new HashSet<String>();
		
		ArrayList<String> list2 = new ArrayList<String>();
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();

		list1.add("Java");
		list1.add("C#");
		list1.add("Python");
		list1.add("Java");
		list1.add("Java8");
		list1.add("AI");
		
		list2.addAll(list1);
		
		System.out.println("HashSet:");
		System.out.println("Before:"+list1);
		
		set1.addAll(list1);
		list1.clear();
		list1.addAll(set1);
		System.out.println("After:"+list1);
		
		System.out.println("Linked Hashset:");
		System.out.println("Before:"+list2);
		set2.addAll(list2);
		list2.clear();
		list2.addAll(set2);
		System.out.println("After:"+list2);
		
		
		
	}
}
