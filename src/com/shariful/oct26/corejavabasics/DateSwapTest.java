/*Write the class Date having attributes like day, month &year. 
 * Add default & parameterized constructors. Add getters & setters. 
 * Add method to print the date. Add method to swap two dates.*/

package com.shariful.oct26.corejavabasics;

class DateSwapTest
{
	private int date;
	private int month;
	private int year;
	
	public DateSwapTest()
	{}

	public DateSwapTest(int date, int month, int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}

	public int getDate()
	{
		return date;
	}
	public void setDate(int date)
	{
		this.date=date;
	}

	public int getMonth()
	{
		return month;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public int getYear() 
	{
	   	return year;
	}
	public void setYear(int year) 
	{
	   	this.year = year;
	}
	public String toString()
	{  
	     	return  date+"/"+ month+"/"+year;  
	}

	public static void swapDate(DateSwapTest d1, DateSwapTest d2)
	{
		DateSwapTest temp;
		
		temp = d1;
	    d1 = d2;
	    d2 = temp;
		System.out.println("\nAfter Swapping:");
	    System.out.println("date1:-"+ d1);
	    System.out.println("date2:-"+d2 );
	      
	}
	
	public static void main(String args[])
	{
		DateSwapTest d1 =new DateSwapTest(21,05,2015);
		DateSwapTest d2 =new DateSwapTest(28,02,2015);
		System.out.println("Entered Dates:");
	    System.out.println("date1:-"+d1);
	    System.out.println("date2:-"+d2);
	   	swapDate(d1, d2);
	
	}
}
