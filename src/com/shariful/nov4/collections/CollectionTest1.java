/*COLLECTION FRAMEWORK: 
 * Write a class Person having weight, height & name. 
 * Create multiple person objects & print them in the sorted order. 
 * In the sorting order first sort based upon their weight & 
 * it two persons have same weight then sort them based upon their height.
 * Use TreeSet.
*/

package com.shariful.nov4.collections;

import java.util.Comparator;
import java.util.TreeSet;

class Persons
{
	String name;
	double weight;
	double height;
	public Persons(String name, double weight, double height) 
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
	}	
}
class ComparePersons implements Comparator<Persons>

{
	@Override
	public int compare(Persons o1, Persons o2) {
		if(o1.weight>o2.weight)
		{
			return 1;
		}
		else if(o1.weight<o2.weight)
		{
			return -1;
		}
		else if(o1.weight==o2.weight)
		{
			if(o1.height>o2.height)
			{
				return 1;
			}
			else if(o1.height<o2.height)
			{
				return -1;
			}
		}
		return 0;
	}
}
public class CollectionTest1 {

	public static void main(String[] args) {
		TreeSet<Persons> p=new TreeSet<Persons>(new ComparePersons());
		p.add(new Persons("Tom",20,45));
		p.add(new Persons("Andy",39,36));
		p.add(new Persons("Jerry",12,14)); 
		p.add(new Persons("Mickey",12,15));
		p.add(new Persons("Mini",22,35));
		for(Persons pr:p)	
		{
			System.out.println("Name:" +pr.name + ",\t Weight:" + pr.weight + ",\tHeight:" + pr.height);
		}

	}

}
