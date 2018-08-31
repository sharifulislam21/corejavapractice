package com.shariful.nov10.case_study.middleware.rmi.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import com.shariful.nov10.case_study.middleware.rmi.Remote;

public class RmiRegistry
{
	static HashMap<String, Remote> rmiRegistry=new HashMap<String, Remote>();
	private static ServerSocket serverSocket;
	
	public void setRegistry(String name,Remote remoteObj)
	{
		rmiRegistry.put(name, remoteObj);
	}

	public Remote getRegistry(String name)
	{
		return rmiRegistry.get(name);
	}
	
	public static void main(String[] args) throws Exception
	{
		serverSocket = new ServerSocket(1099);
		System.out.println("RMI Registry Invoked..");
		
		for(;;)
		{
			Socket socket=serverSocket.accept();
			System.out.println("TCP-IP Client connected....");
			ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
			ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
			
			String serviceName=(String)ois.readObject();
			
			if(serviceName.equals("getRegistry"))
			{
				String name=(String)ois.readObject();
				Object obj= RmiRegistry.rmiRegistry.get(name);
				oos.writeObject(obj);
			}
			
			else if(serviceName.equals("setRegistry"))
			{
				String name=(String)ois.readObject();
				Remote remoteObj=(Remote)ois.readObject();
				RmiRegistry.rmiRegistry.put(name, remoteObj);
			}
		}
	}
	
}
