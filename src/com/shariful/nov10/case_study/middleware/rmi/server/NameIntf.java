package com.shariful.nov10.case_study.middleware.rmi.server;

import com.shariful.nov10.case_study.middleware.rmi.Remote;

public interface NameIntf extends Remote
{
	public String getCapName(String name);
}
