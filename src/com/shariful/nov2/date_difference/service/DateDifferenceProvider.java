package com.shariful.nov2.date_difference.service;

//import com.shariful.service.pojoDate.MyDate;
import com.shariful.nov2.date_difference.service.pojoDate.MyDate;
public class DateDifferenceProvider {
	
	static final int JAN=31;
	static final int FEB=28;
	static final int MAR=31;
	static final int APR=30;
	static final int MAY=31;
	static final int JUN=30;
	static final int JUL=31;
	static final int AUG=31;
	static final int SEP=30;
	static final int OCT=31;
	static final int NOV=30;
	static final int DEC=31;
	
	static int[] months={JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
	public static long getDifference(MyDate startDate, MyDate endDate)
	{
		//return 0;
		long diff=9999;
		if(sameDate(startDate,endDate))
			diff=0;
		else if(sameYear(startDate,endDate) && sameMonth(startDate,endDate))
			diff= endDate.getDd()-startDate.getDd();
		else if(sameYear(startDate,endDate) && !sameMonth(startDate,endDate))
			diff=sameYearDifferentDate(startDate,endDate);
		else if(!sameYear(startDate, endDate))
			diff=differentYear(startDate, endDate)+numberOfLeapYears(startDate, endDate);
		return diff;
	}

	public static boolean sameDate(MyDate startDate,MyDate endDate)
	{
		if(startDate.getYyyy()==endDate.getYyyy())
			if(startDate.getMm()==endDate.getMm())
				if(startDate.getDd()==endDate.getDd())
					return true;
		return false;
	}
	
	public static boolean sameDay(MyDate startDate, MyDate endDate)
	{
		if(startDate.getDd()==endDate.getDd())
			return true;
		return false;
	}
	public static boolean sameMonth(MyDate startDate, MyDate endDate)
	{
		if(startDate.getMm()==endDate.getMm())
				return true;
		return false;
	}
	public static boolean sameYear(MyDate startDate, MyDate endDate)
	{
		if(startDate.getYyyy()==endDate.getYyyy())
				return true;
		return false;
	}
	public static long sameYearDifferentDate(MyDate startDate,MyDate endDate)
	{
		long diff=0;
		if(isLeapYear(startDate.getYyyy()))
			if(startDate.getMm()<=2 && endDate.getMm()>2)
				diff++;
		for(int i=startDate.getMm();i<endDate.getMm()-1;i++) // Month Difference
		{
			diff=diff+months[i];
		}
		diff=diff+(months[startDate.getMm()-1]-startDate.getDd()); // startdate : start date to end of month
		diff=diff+endDate.getDd(); // endDate : start of month to end date
		return diff;
	}
	public static long differentYear(MyDate startDate, MyDate endDate)
	{
		long diff=0;
		diff= (endDate.getYyyy()-startDate.getYyyy()-1)*365; // Year Difference
		for(int i=startDate.getMm();i<12;i++) // start month to december
		{
			diff=diff+months[i];
		}
		diff=diff+(months[startDate.getMm()-1]-startDate.getDd());  // startdate : start date to end of month
		for(int i=0;i<endDate.getMm()-1;i++) // jan to end month
		{
			diff=diff+months[i];
		}		
		diff=diff+endDate.getDd(); // endDate : start of month to end date
		return diff;
	}
	public static boolean isLeapYear(int year)
	{
		if(year%400==0 || (year%4==0 && year%100!=0))
			return true;
		return false;
	}
	public static int numberOfLeapYears(MyDate startDate, MyDate endDate)
	{
		int numberOfLeapYear=0;
		int startYear=startDate.getYyyy();
		int endYear=endDate.getYyyy();
		for(int i=startYear+1;i<endYear;i++)
		{
			if(isLeapYear(i))
				numberOfLeapYear++;
		}
		if(startDate.getMm()<=2)
		{
			if(isLeapYear(startDate.getYyyy()))
				numberOfLeapYear++;
		}
		if(endDate.getMm()>2)
		{
			if(isLeapYear(endDate.getYyyy()))
				numberOfLeapYear++;
		}

		return numberOfLeapYear;
	}
}
