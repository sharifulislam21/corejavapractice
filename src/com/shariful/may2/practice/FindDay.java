/*Find the day(Friday) of a date input given as MM-dd-yyyy (format)
input:12-27-2012
output:Thursday*/

package com.shariful.may2.practice;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class FindDay {

	public static void main(String[] args) {
		Date d1=new Date(12/28/2017);
		System.out.println("Day is: "+getDay(d1));
	}

	private static String getDay(Date d1) {
		String s1;
		SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
		s1=sdf.format(d1);
		return s1;
	}

}
