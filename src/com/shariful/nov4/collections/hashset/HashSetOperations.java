package com.shariful.nov4.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet hset=new HashSet();
		
		hset.add(new Integer("1"));
		hset.add(new Integer("2"));
		hset.add(new Integer("3"));
		hset.add(new Integer("4"));
		
		System.out.println("Elements of Hashset are: "+hset);
		
		Iterator itr = hset.iterator(); 
	    System.out.println("HashSet contains : ");
	    while(itr.hasNext())
	      System.out.println(itr.next());
	    
		boolean ifExists=hset.contains(new Integer("3"));
		System.out.println("HashSet exist in the Set - "+ifExists);
		
		System.out.println("Size of HashSet : "+hset.size());
		
		hset.remove(new Integer("3"));
	    System.out.println("Size of HashSet after removal : " + hset.size());
	    
	    hset.clear();
	    System.out.println("HashSet after clear() : " + hset);
	    
	    System.out.println("Is HashSet empty ? " + hset.isEmpty());
	}
}
