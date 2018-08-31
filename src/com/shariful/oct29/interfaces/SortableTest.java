/*2.INTERFACES: 
 * Write a sortable interface with the compare() method. 
 * Add the classes Employee & Circle those implement Sortable interface. 
 * Demonstrate the functionality of sorting the objects.*/

package com.shariful.oct29.interfaces;

interface Sortable
{
	public boolean compare(Sortable s);

}

class Circle implements Sortable
{
	int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	public boolean compare(Sortable s)
	{
		if(this.radius > (((Circle)s).radius))
			return true;
		return false;
	}
	
	public String toString()
	{
		return "Circle: "+this.radius;
	}
	
	
}

class Emp implements Sortable
{
	String name;

	Emp(String name)
	{
		this.name=name;
	}
	
	public boolean compare(Sortable s)
	{
		if(this.name.compareTo(((Emp)s).name)>0)
			return true;
		return false;
	}
	
	public String toString()
	{
		return "Employee: "+this.name;
	}
	
}
	


public class SortableTest {

	public static void sortAll(Sortable st[])
	{
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].compare(st[j]))
				{
					Sortable temp;
					temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}		
	}
	public static void main(String[] args) {
		Sortable s1[]=new Sortable[3];
		
		s1[0]=new Circle(4);
		s1[1]=new Circle(2);
		s1[2]=new Circle(3);
		
		Sortable s2[]=new Sortable[3];
		s2[0]=new Emp("Rama");
		s2[1]=new Emp("Raj");
		s2[2]=new Emp("Shaam");
		
		sortAll(s1);
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		sortAll(s2);
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
	}

}

