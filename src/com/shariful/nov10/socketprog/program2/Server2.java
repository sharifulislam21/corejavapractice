/*2.SOCKET PROGRAMMING: 
 * Write a TCP-IP server & client & provide chatting among clients. 
 * Here the server is only going to broadcast the messages to all clients send by a client.*/

package com.shariful.nov10.socketprog.program2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server2 {

	public static void main(String[] args) throws IOException {

		String message = "message>";
		ServerSocket serverSocket = new ServerSocket(5000);
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		ArrayList<Socket> clientSocket = new ArrayList<Socket>();

		while (true) {
			Socket socket = serverSocket.accept();
			executorService.execute(new Runnable() {

				@Override
				public void run() {
					try {
						System.out.println("REQUEST ACCEPTED...");
						System.out.println("szie : " + clientSocket.size());
						clientSocket.add(socket);

						DataInputStream dataInputStream = new DataInputStream(
								socket.getInputStream());
						while (true) {
							String msg = dataInputStream.readUTF();

							for (Socket tempSocket : clientSocket) {

								DataOutputStream dos = new DataOutputStream(
										tempSocket.getOutputStream());
								System.out.println("BROADCASTING : " + msg);
								dos.writeUTF(msg);
							}
						}

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			});
		}

	}
	
}

