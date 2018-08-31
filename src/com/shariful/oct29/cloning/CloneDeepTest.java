/*12.JAVA CLONING:
 * Write a program to create shallow copy & deep copy of a user defined Employee object which has a field called date_of_birth.*/

package com.shariful.oct29.cloning;

class Person implements Cloneable
{
	int id;
	String name;
	String cname;
	MyDate date;
	
	public Person(int id,String name,String cname, MyDate date)
	{
		this.id=id;
		this.name=name;
		this.cname=cname;
		this.date=date;
	}
	
	public String toString()
	{
		return id + "-" + name + "-" + cname + "-" + date;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		
		Person per=(Person)super.clone();
		per.date=(MyDate)this.date.clone();
		return per;
	}
	
}

class MyDate implements Cloneable
{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String toString()
	{
		return day + "/" + month + "/" + year;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

/*---------------------Deep Cloning---------------------*/
public class CloneDeepTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyDate d1=new MyDate(1,10,2015);
		Person p1=new Person(3933,"Shariful","Xoriant",d1);
//		MyDate d2=(MyDate)d1.clone();
		Person p2=(Person)p1.clone();
		
		
		System.out.println("P1 hashcode:"+p1.hashCode()+" P1:"+p1+" D1 hashcode:"+p1.date.hashCode());
		System.out.println("P2 hashcode:"+p2.hashCode()+" P2:"+p2+" D2 hashcode:"+p2.date.hashCode());
	}

}

