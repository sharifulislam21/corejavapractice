package com.shariful.nov10.case_study.middleware.rmi.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import com.shariful.nov10.case_study.middleware.rmi.Remote;
public class Naming {

	public static void rebind(String name, Remote remoteObj) throws UnknownHostException, IOException
	{
		Socket socket=new Socket(InetAddress.getLocalHost(),1099);

		ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
		
		oos.writeObject("setRegistry");				//server rebinds the funtion to the rmiRegistry
		oos.writeObject(name);						
		oos.writeObject(remoteObj);
		oos.flush();
		oos.close();
		socket.close();
	}
	
	public static Remote lookup(String name) throws UnknownHostException, IOException, ClassNotFoundException
	{
		Socket socket=new Socket(InetAddress.getLocalHost(),1099);
		
		ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
		
		oos.writeObject("getRegistry");
		oos.writeObject(name);
		Remote remoteObject=(Remote)ois.readObject();
		
		oos.flush();
		oos.close();
		ois.close();
		socket.close();
		
		return remoteObject;
	}
}
