/*12.JAVA CLONING:
 * Write a program to create shallow copy & deep copy of a user defined Employee object which has a field called date_of_birth.*/

package com.shariful.oct29.cloning;

class Date implements Cloneable
{
	int day;
	int month;
	int year;
	
	public Date(int day, int month, int year)
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

/*---------------------Shallow Cloning---------------------*/
public class CloneShallowTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Date d1=new Date(21,5,2015);
		Date d2=(Date)d1.clone();
		System.out.println("D1 hashcode:"+d1.hashCode()+" D1 Date:"+d1);
		System.out.println("D2 hashcode:"+d2.hashCode()+" D2 Date:"+d2);
	}
}
