/*8.	FILE HANDLING: 
 * Write an application that prints the details of all files situated inside a specified directory. 
 * The file details should include file name, size, date, file permissions, directory or file etc.*/

package com.shariful.nov3.filehandling;

import java.io.File;
import java.sql.Date;

public class ListFileDirectoryTest {

	public static void main(String[] args) {
		String dirPath = "D:/X3933";
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files.length == 0) {
		    System.out.println("The directory is empty");
		} else {
		    for (File aFile : files) {
		        System.out.println(aFile.getName() + " - Size:" + aFile.length() + " bytes, last modifed:" + new Date(aFile.lastModified()));
		       
		    }
		}
	}
}
