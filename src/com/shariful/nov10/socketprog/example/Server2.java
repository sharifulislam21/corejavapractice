package com.shariful.nov10.socketprog.example;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	public static void main(String[] args) throws Exception{
		
		ServerSocket serverSocket=new ServerSocket(5000);
		System.out.println("TCP-IP Server started....");
		
		while(true)
		{	
			Socket socket=serverSocket.accept();
			System.out.println("Client Connected from:"+socket.getLocalAddress());
		
			Client2 client1=new Client2();
			Client2 client2=new Client2();
			Thread t1 = new Thread(client1);
            Thread t2 =new Thread(client2);
            t1.start();
            t2.start();

		}

	}

}
