/*COLLECTION FRAMEWORK:
 *  Prove that HashSet is unordered &
 *   LinkedHashSet is ordered.*/

package com.shariful.nov4.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionTest2 {

	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		hset.add("AAA");
		hset.add("BBB");
		hset.add("ACB");
		hset.add("ABC");
		hset.add("AAA");
		System.out.println("\n-------Hash Set--------\n");
		Iterator<String> itr_set=hset.iterator();
		while(itr_set.hasNext())
		{
			String value=itr_set.next();
			System.out.println(value);
		}									//HashSet is unordered
		
		LinkedHashSet<String> lhset=new LinkedHashSet<String>();
		lhset.add("AAA");
		lhset.add("ACB");
		lhset.add("BBB");
		lhset.add("ABC");
		
		System.out.println("\n-------Linked Hash Set--------\n");
		Iterator<String> itr_lhset=lhset.iterator();
		while(itr_lhset.hasNext())
		{
			String value2=itr_lhset.next();
			System.out.println(value2);
		}									//LinkedHashSet is ordered
	}

}
