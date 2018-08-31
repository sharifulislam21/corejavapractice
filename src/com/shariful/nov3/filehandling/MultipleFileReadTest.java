//10.	FILE HANDLING: 
//Write an application to read the contents of 3 files using a single input stream.

package com.shariful.nov3.filehandling;

import java.io.*;
import java.util.Vector;
public class MultipleFileReadTest {

	public static void main(String[] args) throws Exception{
		File f1=new File("file1.txt");
		File f2=new File("file2.txt");
		File f3=new File("file3.txt");
		FileInputStream fis1=new FileInputStream(f1);
		FileInputStream fis2=new FileInputStream(f2);
		FileInputStream fis3=new FileInputStream(f3);
		
		int i=0;
		Vector<FileInputStream> v=new Vector();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		SequenceInputStream sis=new SequenceInputStream(v.elements());
		do{
			i=sis.read();
			if(i!=-1)
			{
				System.out.println((char)i);
			}
		}while(i!=-1);
	}

}
