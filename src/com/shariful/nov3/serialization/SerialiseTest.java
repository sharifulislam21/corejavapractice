/*Serialize & Deserialize the account object using Externalizable interface*/

package com.shariful.nov3.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Date implements Serializable
{
	private static final long serialVersionUID=3930;
	int dd;
	int mm;
	int yy;
	
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
}

class Account implements Serializable
{
	private static final long serialVersionUID=3931;
	int accountid;
	String name;
	transient double bal;
	Date dob;
	public Account(int accountid, String name, double bal, Date dob) {
		super();
		this.accountid = accountid;
		this.name = name;
		this.bal = bal;
		this.dob=dob;
	}
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", name=" + name + ", bal="
				+ bal + ", DateOfBirth=" + dob + "]";
	}
	
}

public class SerialiseTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Date d=new Date(21, 05, 1993);
		Account acc1=new Account(4751, "Shariful", 2500, d);
		File file=new File("account.dat");
		
		/*---serialization---*/
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(acc1);
		oos.close();
		fos.close();
		
		/*---deserialization---*/
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account acc2=(Account)ois.readObject();
		ois.close();
		fis.close();
		
		System.out.println("Account: "+acc1);
		System.out.println("Account: "+acc2);
	}

}
