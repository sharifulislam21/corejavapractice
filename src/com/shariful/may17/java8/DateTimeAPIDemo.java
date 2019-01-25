package com.shariful.may17.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeAPIDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalTime zonalTime = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(zonalTime);
	}
}
