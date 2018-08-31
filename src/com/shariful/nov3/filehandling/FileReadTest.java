//7.	FILE HANDLING: Write an application to read all the contents from one file & insert them into another file.

package com.shariful.nov3.filehandling;

import java.io.*;

public class FileReadTest {

	public static void main(String[] args) throws Exception{
		
		File file1=new File("hello1.txt");
		System.out.println(file1.getAbsolutePath());
		FileInputStream fis=new FileInputStream(file1);
		File file2=new File("java1.txt");
		FileOutputStream fos=new FileOutputStream(file2);
		int i=0;
		StringBuilder sb=new StringBuilder();
		do{
			i=fis.read();
			if(i!=-1)
			{
				fos.write((char)i);
				sb.append((char)i);
			}
		}while(i!=-1);
		fos.flush();
		fis.close();
	}

}
