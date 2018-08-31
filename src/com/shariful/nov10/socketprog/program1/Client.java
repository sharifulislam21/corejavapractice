package com.shariful.nov10.socketprog.program1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class Client {

	public static void main(String[] args) throws Exception {
		
		Socket socket=new Socket(InetAddress.getLocalHost(),5000);
		System.out.println("TCP-IP Client started....");
		System.out.println("Start Conversation\nClient says>");
		DataInputStream dis=new DataInputStream(socket.getInputStream());
		DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
		DataInputStream in=new DataInputStream(System.in);
		
		while(true)
		{
			dos.writeUTF(in.readLine());
			String serverMessage=dis.readUTF();
			System.out.println("Server says> " + serverMessage);
			
		}
	}

}
