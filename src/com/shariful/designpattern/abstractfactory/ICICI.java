package com.shariful.designpattern.abstractfactory;

public class ICICI implements Bank{
private final String BNAME;
	
	public ICICI() {
		
		BNAME = "ICICI";
	}

	@Override
	public String getBankName() {
		
		return BNAME;
	}

}
