package com.shariful.nov10.socketprog.program2;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class Client1 {
	public static void main(String[] rags) throws Exception {
		Socket socket = new Socket("localhost", 5000);
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		DataInputStream in = new DataInputStream(System.in);
		System.out.println("//********CLIENT*1****/");
		Thread input = new Thread(new Runnable() {

			@Override
			public void run() {

				while (true) {
					String serverMessage = "";
					try {
						serverMessage = dataInputStream.readUTF();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.err.println("#: " + serverMessage);
				}

			}
		});

		Thread output = new Thread(new Runnable() {

			@Override
			public void run() {

				while (true) {

					try {
						System.out.println("Enter message : ");
						String str = in.readLine();

						dataOutputStream.writeUTF(str);

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (Exception e) {
					}

				}
			}

		});

		input.start();
		output.start();
	}
}

