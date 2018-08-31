package com.shariful.may2.practice;

import java.util.ArrayList;
import java.util.List;

public class MergeCommonElements {

	public static int MergeArray(int[] a, int[] b) {
		List<Integer> list1= new ArrayList<Integer>();
		List<Integer> list2= new ArrayList<Integer>();
		int d=0;
		
		for(int i=0; i<a.length; i++)
			list1.add(a[i]);
		for(int i=0; i<b.length; i++)
			list2.add(b[i]);
		
		list1.retainAll(list2);
		
		for(int i=0; i<list1.size(); i++)
			d= (Integer)list1.get(i);
		return d;
		
	}
	
	public static void main(String[] args) {
		
		int a[]={1,2,3};
		int b[]={3,4,5,2};
		System.out.println(MergeArray(a,b));
	}

}
