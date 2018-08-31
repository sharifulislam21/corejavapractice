package com.shariful.oct29.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Person
{
	String personName;
	int personHeight;
	int personWeight;
	
	public Person(String personName, int personHeight, int personWeight) 
	{
		this.personName = personName;
		this.personHeight = personHeight;
		this.personWeight = personWeight;
	}
}
class NameComparator implements Comparator
{  
	public int compare(Object o1,Object o2)
	{  
		Person p1=(Person)o1;  
		Person p2=(Person)o2;  
		
		if(p1.personName.compareTo(p2.personName)>0)
			return 1;
		else if(p1.personName.compareTo(p2.personName)<0)
			return -1;
		
		return 0; 
	}


}  
class HeightComparator implements Comparator
{  
		public int compare(Object o1,Object o2)
		{
			Person p1=(Person)o1;  
			Person p2=(Person)o2;  
  
			if(p1.personHeight==p2.personHeight)  
				return 0;  
			else if(p1.personHeight>p2.personHeight)  
				return 1;  
			else  
				return -1;  
		}
		
}  
class WeightComparator implements Comparator
{  
		public int compare(Object o1,Object o2)
		{
			Person p1=(Person)o1;  
			Person p2=(Person)o2;  
  
			if(p1.personWeight==p2.personWeight)  
				return 0;  
			else if(p1.personWeight>p2.personWeight)  
				return 1;  
			else  
				return -1;  
		}
}
 
public class ComparatorTest 
{
	public static void main(String[] args)
	{
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("Amit",68,54));
		list.add(new Person("Kanak",60,48));
		list.add(new Person("Surbhi",62,50));
		list.add(new Person("Shariful",65,57));
		
		System.out.println("Sort by NAME....");
		
		Collections.sort(list,new NameComparator());  
		Iterator<Person> itr=list.iterator();  
		while(itr.hasNext())
		{  
			Person person=itr.next();  
			System.out.println("Name:"+person.personName+"\t Height:"+person.personHeight+"\t Weight:"+person.personWeight);  
		}
		
		System.out.println("\nSort by HEIGHT...");  
		  
		Collections.sort(list,new HeightComparator());  
		Iterator itr2=list.iterator();  
		while(itr2.hasNext())
		{  
			Person person=(Person)itr2.next();  
			System.out.println("Name:"+person.personName+"\t Height:"+person.personHeight+"\t Weight:"+person.personWeight);  
		}  
		
		System.out.println("\nSort by WEIGHT...");  
		  
		Collections.sort(list,new WeightComparator());  
		Iterator itr3=list.iterator();  
		while(itr3.hasNext())
		{  
			Person person=(Person)itr3.next();  
			System.out.println("Name:"+person.personName+"\t Height:"+person.personHeight+"\t Weight:"+person.personWeight);  
		} 
	}
}
		

