package com.shariful.nov3.filehandling;

import java.io.*;

public class FileDataTest {
	public static void main(String[] args) throws Exception {
		File f1=new File("AccountDetail.txt");
		FileOutputStream fos=new FileOutputStream(f1);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.write(3933);
		dos.writeUTF("Shariful Islam");
		dos.writeDouble(10000);
		FileInputStream fis=new FileInputStream("AccountDetail.txt");
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.read());
		System.out.println(dis.readUTF());
		System.out.println(dis.readDouble());
	}

}
