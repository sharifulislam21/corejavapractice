/*
 * There are mainly three different ways to compare two dates in Java.

1. Using compareTo() method
2. Using equals(), before() and after() method
3. Using getTime() method
 * 
 * */

package com.shariful.aug1.interviewprograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDates {

	public static void main(String[] args) {

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		/*
		 * Method 1: compareTo() Method comparing date1 and date2 by
		 * date1.compareTo(date2) Return 0 if date1 and date2 are equal. Return
		 * value less than 0 if date1 is before date2. Return value more than 0
		 * if date1 is after date2.
		 */

		try {
			Date d1 = df.parse("21-05-1993");
			Date d2 = df.parse("28-02-1994");

			if (d1.compareTo(d2) == 0) {
				System.out.println("Date1 and Date2 are same");
			} else if (d1.compareTo(d2) < 0) {
				System.out.println("Date1 is before Date2");
			} else if (d1.compareTo(d2) > 0) {
				System.out.println("Date2 is before Date1");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * Method 2: equals(), before() and after() Method equals() method
		 * returns true if two dates are equal, otherwise returns false.
		 * before() method returns true if first date is before second date,
		 * otherwise returns false. after() method returns true if first date is
		 * after second date, otherwise returns false.
		 */

		try {
			Date d1 = df.parse("9-1-2016");
			Date d2 = df.parse("7-01-2016");

			if (d1.equals(d2)) {
				System.out.println("Date1 and Date2 are equal");
			} else if (d1.before(d2)) {
				System.out.println("Date1 is before Date2");
			} else if (d1.after(d2)) {
				System.out.println("Date1 is after Date2");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		/*
		 * Method 3: getTime() getTime() method of java.util.Date class can be
		 * also used to compare dates in Java. getTime() method returns the
		 * number of milliseconds since January 1, 1970.
		 */
		
		try {
            Date d1=df.parse("21-3-2007");
            Date d2=df.parse("3-3-2004");
            
            if(d1.getTime()==d2.getTime()){
                System.out.println("Date1 and Date2 are equal");
            }
            else if(d1.getTime()<d2.getTime()){
                System.out.println("Date1 is before Date2");                
            }
            else if(d1.getTime()>d2.getTime()){
                System.out.println("Date1 is after Date2");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } 
	}
}
