package com.shariful.nov10.socketprog.program2;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client2 {
	public static void main(String[] rags) throws Exception {
		Socket socket = new Socket("localhost", 5000);
		DataInputStream dataInputStream = new DataInputStream(
				socket.getInputStream());
		DataOutputStream dataOutputStream = new DataOutputStream(
				socket.getOutputStream());
		DataInputStream in = new DataInputStream(System.in);

		while (true) {
			System.out.println("ENTER MESSAGE.");
			dataOutputStream.writeUTF(in.readLine());
			String serverMessage = dataInputStream.readUTF();
			System.out.println("server Says : " + serverMessage);
		}
	}
}

