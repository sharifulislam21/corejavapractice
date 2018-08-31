package com.shariful.nov10.rmi.arithmatic_operation;
import java.rmi.*;
import java.rmi.server.*;
public class ArithmaticImpl extends UnicastRemoteObject implements ArithmaticIntf
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArithmaticImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Remote Object Created...");
	}

	@Override
	public int getAdd(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Additon operation");
		return a+b;
	}

	@Override
	public int getSub(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int getMul(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int getDiv(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a/b;
	}
}
