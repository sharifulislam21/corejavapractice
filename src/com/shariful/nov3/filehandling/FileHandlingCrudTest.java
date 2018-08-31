/*13.	FILE HANDLING: 
 * Write an application to perform CRUD operations on Account. 
 * Use RandomAccessFile class. 
 * Also a functionality to print the Accounts where account balance is more than 10000.*/

package com.shariful.nov3.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

class Account{
	int accountId;
	String accountName;
	double accountBalance;
	
	
	public Account() {
		super();
	}
	
	public Account(int id, String holdername, double balance) {
		super();
		this.accountId = id;
		this.accountName = holdername;
		this.accountBalance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + accountId + ", holdername=" + accountName
				+ ", balance=" + accountBalance + "]";
	}
}

public class FileHandlingCrudTest 
{
	File file=new File("crud.txt");
	RandomAccessFile raf;
	{	
		try
		{
			raf=new RandomAccessFile(file,"rw");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void create(Account acc) throws Exception
	{
		raf.write(acc.accountId);
		raf.writeUTF(acc.accountName);
		raf.writeDouble(acc.accountBalance);
	}
	public Account read(int id) throws Exception
	{
		Account acc=new Account();
		raf.seek(0);
		int cid=raf.read();
		while(true)
		{
			if(raf.getFilePointer()==raf.length()) 
				break;
			if(id!=cid){
				raf.readUTF();
				raf.readDouble();
			}
			else
			{
				acc.accountId=id;
				acc.accountName=raf.readUTF();
				acc.accountBalance=raf.readDouble();
			}
			cid=raf.read();
		}
		return acc;
	}
	public Boolean update(int id,Double balance)  throws Exception
	{
		raf.seek(0);
		int cid=raf.read();
		while(true)
		{
			if(raf.getFilePointer()==raf.length()) 
				break;
			if(id!=cid)
			{
				raf.readUTF();
				raf.readDouble();
			}
			else
			{
				raf.readUTF();
				raf.writeDouble(balance);
			}
			cid=raf.read();
		}

		return true;
	}
	public Boolean delete(int id)  throws Exception
	{
		raf.seek(0);
		int userId=raf.read();
		while(true)
		{
			if(raf.getFilePointer()==raf.length()) 
				break;
			if(id!=userId)
			{
				raf.readUTF();
				raf.readDouble();
			}
			else
			{
				raf.writeUTF("");
				raf.writeDouble(0.0);
			}
			userId=raf.read();
		}
		return true;
	}
	public static void main(String args[]) throws Exception
	{
		FileHandlingCrudTest crudObj=new FileHandlingCrudTest();
		crudObj.create(new Account(101,"Amit",20000.50));
		crudObj.create(new Account(102,"Nihit",9500.30));
		crudObj.create(new Account(103,"Sumit",500.60));
		crudObj.update(102, 1500d);
		//crudObj.delete(103);
		System.out.println(crudObj.read(101));
		System.out.println(crudObj.read(102));
		System.out.println(crudObj.read(103));
		
		
	}
}
