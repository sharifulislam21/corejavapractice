/*4.SOCKET PROGRAMMING: 
 * Write a program where client sends the class name, method name, parameter types & parameter values to the RMI server; 
 * RMI server will invoke the requested method & return the method response to the client.*/

package com.shariful.nov10.socketprog.program4;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

public class Server4 {

	public static void main(String args[]) throws Exception
	{
		ServerSocket serverSocket=new ServerSocket(5001);
		System.out.println("TCP-IP Server started....");
		Socket socket=serverSocket.accept();
		System.out.println("TCP-IP Client connected....");
		ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
		
		ClassDetails classDetails=(ClassDetails)ois.readObject();
		Class<?> remoteClass=Class.forName(classDetails.className);
		Method remoteMethod=remoteClass.getDeclaredMethod(classDetails.methodName,classDetails.paramTypes);
		
		int result=(int) remoteMethod.invoke(remoteClass.newInstance(), classDetails.paramvalues);
		System.out.println("result:"+result);
		ois.close();

	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}
}
