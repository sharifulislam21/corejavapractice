package com.shariful.nov10.socketprog.program1;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Server {

	public static void main(String[] args) throws Exception{
		
		ServerSocket serverSocket=new ServerSocket(5000);
		System.out.println("TCP-IP Server started....");
		Socket socket=serverSocket.accept();
		
		DataInputStream dis=new DataInputStream(socket.getInputStream());
		DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
		DataInputStream in=new DataInputStream(System.in);
		
		while(true)
		{
			String clientMessage=dis.readUTF();
			System.out.println("Client says> " + clientMessage);
			dos.writeUTF(in.readLine());
		}
		

	}

}
