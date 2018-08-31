package com.shariful.oct29.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Person2 implements Comparable
{
	String personName;
	int personHeight;
	int personWeight;
	
	public Person2(String personName, int personHeight, int personWeight) 
	{
		this.personName = personName;
		this.personHeight = personHeight;
		this.personWeight = personWeight;
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Person2 personObj=(Person2)obj;  
		if(personHeight==personObj.personHeight)  
			return 0;  
		else if(personHeight>personObj.personHeight)  
			return 1;  
		else  
			return -1;
	}
	
 
}

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person2> list=new ArrayList<Person2>();
		list.add(new Person2("Amit",68,54));
		list.add(new Person2("Kanak",60,48));
		list.add(new Person2("Surbhi",62,50));
		list.add(new Person2("Shariful",65,57));
		 
		System.out.println("\nSort by HEIGHT...");  
		Collections.sort(list);  
		Iterator itr=list.iterator();  
		while(itr.hasNext())
		{  
			Person2 person=(Person2)itr.next();  
			System.out.println("Name:"+person.personName+"\t Height:"+person.personHeight+"\t Weight:"+person.personWeight);  
		} 
		
	}
}
