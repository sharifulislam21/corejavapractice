/*1.INTERFACES: 
 * Write the interface Printable with the print() method. 
 * Write classes Employee & Circle those implement Printable interface. 
 * Demonstrate the functionality of printing the objects.*/

package com.shariful.oct29.interfaces;

interface Printable
{
	public void print();
}

class Emp1 implements Printable
{
	String name;
	
	public Emp1(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return "Employee: "+this.name;
	}
	public void print()
	{
		System.out.println("this is Employee Class");
	}
}

class Circle1 implements Printable
{
	int radius;
	
	public Circle1(int radius)
	{
		this.radius=radius;
	}
	public String toString()
	{
		return "Circle: "+this.radius;
	}
	public void print()
	{
		System.out.println("this is Circle Class");
	}
}

public class PrintableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p[]=new Printable[4];
	
		p[0]=new Circle1(3);
		p[1]=new Circle1(2);
		p[2]=new Emp1("Rama");
		p[3]=new Emp1("Ravana");
	
		for(int i=0;i<p.length;i++)
		{
			p[i].print();
			System.out.println(p[i]);
		}
		
	}

}

