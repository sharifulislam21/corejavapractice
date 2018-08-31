package com.shariful.nov10.rmi.arithmatic_operation;
import java.rmi.*;

public class ArithmaticClient 
{
	public static void main(String[] args) throws Exception {
	
		ArithmaticIntf remoteObj=(ArithmaticIntf)Naming.lookup("rmi://localhost/ADD_OPR_SERVICE");
		System.out.println("Sum:"+remoteObj.getAdd(15, 20));
		System.out.println("Difference:"+remoteObj.getSub(25, 20));
		System.out.println("Product:"+remoteObj.getMul(15, 10));
		System.out.println("Quotient:"+remoteObj.getDiv(15, 3));
	}
	
}

