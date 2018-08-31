package com.shariful.nov10.socketprog.program4;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


class ClassDetails implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String className;
	String methodName;
	Class<?> paramTypes[];
	Object paramvalues[];
	
	public ClassDetails(String className, String methodName,
			Class<?>[] paramTypes, Object[] paramvalues) {
		super();
		this.className = className;
		this.methodName = methodName;
		this.paramTypes = paramTypes;
		this.paramvalues = paramvalues;
	}
	
}
public class Client4
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		Socket socket=new Socket(InetAddress.getLocalHost(),5001);
		
		//ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
		ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
		String className="com.socket.program4.Server4";
		String methodName="add";
		Class<?> paramTypes[]=new Class[2];
		Object paramvalues[]=new Object[2];
		
		paramTypes[0]=int.class;
		paramTypes[1]=int.class;
		
		paramvalues[0]=10;
		paramvalues[1]=20;
	
		oos.writeObject(new ClassDetails(className, methodName, paramTypes, paramvalues));
		oos.flush();					//empties the buffer for the session
		oos.close();
	}
	
}



