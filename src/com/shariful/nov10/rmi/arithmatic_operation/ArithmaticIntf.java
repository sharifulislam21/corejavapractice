package com.shariful.nov10.rmi.arithmatic_operation;
import java.rmi.*;

public interface ArithmaticIntf extends Remote {

	public int getAdd(int a,int b) throws RemoteException;
	public int getSub(int a,int b) throws RemoteException;
	public int getMul(int a,int b) throws RemoteException;
	public int getDiv(int a,int b) throws RemoteException;
}
