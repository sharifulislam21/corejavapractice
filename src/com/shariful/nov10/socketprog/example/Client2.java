package com.shariful.nov10.socketprog.example;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client2 extends Thread{
		
		public static void main(String[] args) throws Exception {
			
			Socket socket=new Socket(InetAddress.getLocalHost(),5000);
			
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
