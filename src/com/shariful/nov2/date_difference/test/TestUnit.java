package com.shariful.nov2.date_difference.test;

import java.util.ArrayList;

import com.shariful.nov2.date_difference.service.DateDifferenceProvider;
import com.shariful.nov2.date_difference.service.pojoDate.MyDate;
import com.shariful.nov2.date_difference.test.pojoDate.MyDateTestRecord;

public class TestUnit {
	
	public static void main(String[] args)
	{
		ArrayList<MyDateTestRecord> testDateList=new ArrayList<MyDateTestRecord>();
		
		MyDate startDate1=new MyDate(2,11,2015);
		MyDate endDate1=new MyDate(2,11,2015);
		long expectedResult1=0;
		MyDateTestRecord myDateTestRecord1= new MyDateTestRecord(startDate1, endDate1, expectedResult1);
		testDateList.add(myDateTestRecord1);
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 4, 2011), new MyDate(18, 4, 2011), 12));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 4, 2011), new MyDate(18, 5, 2011), 42));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 4, 2011), new MyDate(18, 6, 2011), 73));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 4, 2011), new MyDate(18, 12, 2011), 256));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 4, 2011), new MyDate(18, 12, 2012), 622));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 4, 2011), new MyDate(18, 12, 2013), 987));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 4, 2011), new MyDate(18, 12, 2113), 37511));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 4, 2011), new MyDate(18, 12, 2413), 147084));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 4, 2011), new MyDate(18, 12, 2813), 293181));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 1, 2011), new MyDate(6, 3, 2011), 59));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 1, 2012), new MyDate(6, 3, 2012), 60));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 2, 2012), new MyDate(6, 3, 2012), 29));
		
		testDateList.add(new MyDateTestRecord(new MyDate(22, 1, 2012), new MyDate(15, 11, 2012), 298));
		
		testDateList.add(new MyDateTestRecord(new MyDate(6, 2, 2012), new MyDate(6, 12, 2012), 304));
		
		testDateList.add(new MyDateTestRecord(new MyDate(2, 11, 2015), new MyDate(2, 11, 2014), -365));
		
		testDateList.add(new MyDateTestRecord(new MyDate(2, 11, 2015), new MyDate(2, 11, 2016), 366));
		
		testDateList.add(new MyDateTestRecord(new MyDate(2, 11, 2012), new MyDate(2, 11, 2015), 1095));
		
		testDateList.add(new MyDateTestRecord(new MyDate(25, 10, 1900), new MyDate(25, 11, 2016), 42400));
		
		testDateList.add(new MyDateTestRecord(new MyDate(26, 11, 1502), new MyDate(26, 2, 2012), 185991));
		
		testDateList.add(new MyDateTestRecord(new MyDate(26, 11, 1598), new MyDate(26, 2, 2014), 151658));
		int i=0;
		for(MyDateTestRecord testRecord: testDateList)
		{
			long actualResult=DateDifferenceProvider.getDifference(testRecord.getStartDate(), testRecord.getEndDate());
			if(actualResult==testRecord.getExpectedResult()){ 
				System.out.println("Case "+ ++i +" Passed... Actual Result:" + actualResult +"   ----  Expected Result:"+ testRecord.getExpectedResult());
			}
			else{
				System.err.println("Case "+ ++i +" Failed... Actual Result:" + actualResult +"   ----  Expected Result:"+ testRecord.getExpectedResult());
			}
			
		}
	}

}
