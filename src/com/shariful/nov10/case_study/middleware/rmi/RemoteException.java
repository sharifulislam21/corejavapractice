package com.shariful.nov10.case_study.middleware.rmi;

public class RemoteException {

	String msg=null;

	public RemoteException(String msg) 
	{
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Remote Exception Message=:" + msg;
	}
	
	
}
