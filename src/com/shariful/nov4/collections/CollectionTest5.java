/*COLLECTION FRAMEWORK: 
 * Write a user defined class say Employee that overrides equals() & hashCode() methods. 
 * Equals() always returns true & hashCode() always returns a fixed number. 
 * Make such a class as key of your Hashtable. 
 * Observe the behavior while calling put & get methods. */

package com.shariful.nov4.collections;

import java.util.Hashtable;

class Employee
{
	String name;
	public Employee(String name) {
		super();
		this.name = name;
	}
	public boolean equals(Object obj)
	{
		return true;	 
	 }

	public int hashCode()
	 {
		 return 12345;
	 }
	
}

public class CollectionTest5 {

	public static void main(String[] args) 
	{
		Hashtable<Employee,String> ht=new Hashtable<Employee,String>();
		ht.put(new Employee("Ram"),"Kapoor");
		ht.put(new Employee("Ravan"),"Kumar");
		ht.put(new Employee("Laxman"),"Sharma");
		System.out.println(ht.get(new Employee("Ram")));
		System.out.println(ht.get(new Employee("Ravan")));
		System.out.println(ht.get(new Employee("Laxman")));
	}

}
