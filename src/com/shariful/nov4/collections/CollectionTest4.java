/*COLLECTION FRAMEWORK: Write a program using Hashtable or HashMap 
 * where Date of birth is a key & Employee name as value. 
 * Design the class Date is such a way where the get method fails 
 * if two employees have same day & month of birth but birth year is different. */

package com.shariful.nov4.collections;

import java.util.HashMap;

class Date
{
 int dd;
 int mm;
 int yyyy;
 public Date(int dd, int mm, int yyyy) 
 {
	super();
	this.dd = dd;
	this.mm = mm;
	this.yyyy = yyyy;
 }
 
 public boolean equals(Object obj)
 {
	if(this.dd==((Date)obj).dd && this.mm==((Date)obj).mm)
		return true;
	return false;	 
 }
 
 public int hashCode()
 {
	 return 12345;
 }

}
public class CollectionTest4 {

	public static void main(String[] args) 
	{
		HashMap<Date, String> ht=new HashMap<Date, String>();
		Date dob;
		String name;
		ht.put(new Date(12,5,1982),"John");
		ht.put(new Date(21,6,2013),"Tom");
		ht.put(new Date(12,5,1993),"Ricky");
		ht.put(new Date(25,9,1996),"Micky");
		ht.put(new Date(21,5,2002),"Goofy");
		ht.put(new Date(21,5,1994),"Toofy");
		
		System.out.println(ht.get(new Date(12,5,1982)));
		System.out.println(ht.get(new Date(21,6,2013)));
		System.out.println(ht.get(new Date(12,5,1993)));
		System.out.println(ht.get(new Date(25,9,1996)));
		System.out.println(ht.get(new Date(21,5,2002)));
		System.out.println(ht.get(new Date(21,5,1994)));
	}

}
