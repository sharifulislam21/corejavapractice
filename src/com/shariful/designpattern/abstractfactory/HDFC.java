package com.shariful.designpattern.abstractfactory;

public class HDFC implements Bank{
	private final String BNAME;
	
	public HDFC() {
		
		BNAME = "HDFC";
	}

	@Override
	public String getBankName() {
		
		return BNAME;
	}

}
