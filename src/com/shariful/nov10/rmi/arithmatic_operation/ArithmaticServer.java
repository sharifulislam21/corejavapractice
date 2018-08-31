package com.shariful.nov10.rmi.arithmatic_operation;
//3.RMI: Write a program to implement remote arithmetic operations using RMI.

import java.rmi.Naming;

public class ArithmaticServer {

	public static void main(String[] args) throws Exception
	{
		ArithmaticIntf remoteObj=new ArithmaticImpl(); 
		
		Naming.rebind("ADD_OPR_SERVICE", remoteObj);
		System.out.println("RMI server started....");

	}

}
