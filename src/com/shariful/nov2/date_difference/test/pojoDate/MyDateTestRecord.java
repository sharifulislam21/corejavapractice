package com.shariful.nov2.date_difference.test.pojoDate;

import com.shariful.nov2.date_difference.service.pojoDate.MyDate;

public class MyDateTestRecord {
	private MyDate startDate;
	private MyDate endDate;
	private long differenceResult;
	
	public MyDateTestRecord(MyDate startDate, MyDate endDate, long differenceResult)
	{
		this.startDate=startDate;
		this.endDate=endDate;
		this.differenceResult=differenceResult;
	}

	public long getExpectedResult() {
		// TODO Auto-generated method stub
		return this.differenceResult;
	}

	public MyDate getStartDate() {
		return startDate;
	}

	public MyDate getEndDate() {
		return endDate;
	}


}
