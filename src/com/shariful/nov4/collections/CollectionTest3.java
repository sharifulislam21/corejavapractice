/*COLLECTION FRAMEWORK: 
//	Create a ArrayList with few elements & 
//	print it in backward direction. Use ListIterator.*/

package com.shariful.nov4.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionTest3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("AAA");
		al.add("BBB");
		al.add("ACB");
		al.add("ABC");
		System.out.println("\n-------Array List--------\n");
		ListIterator<String> itr_al = al.listIterator(4);
//		System.out.println("\n-------Entered Order--------\n");
//		
//		while(((ListIterator<String>)itr_al).hasNext())								
//		{
//			String value=itr_al.next();
//			System.out.println(value);
//		}
		System.out.println("\n-------Reverse Order--------\n");
		while(itr_al.hasPrevious())								
		{
			String value=itr_al.previous();
			System.out.println(value);
		}
		
	}

}
