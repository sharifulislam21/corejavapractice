/*Write an application to Serialize & Deserialize Account object which has Date dob field. 
 * Note: test ‘transient’ keyword & 
 * confirm that deserialization fails if serialVersionUID is incorrect.*/

package com.shariful.nov3.serialization;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Date01 implements Externalizable
{
	private static final long serialVersionUID=3933;
	int dd;
	int mm;
	int yy;
	
	public Date01() {
		this.dd = 0;
		this.mm = 0;
		this.yy = 0;
	}
	public Date01(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		this.dd=in.readInt();
		this.mm=in.readInt();
		this.yy=in.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(dd);
		out.writeInt(mm);
		out.writeInt(yy);
		
	}
}

class Account01 implements Externalizable
{
	private static final long serialVersionUID=3933;
	int accountid;
	String name;
	double bal;
	Date01 dob;
	
	public Account01()
	{
		this.accountid=0;
		this.name=null;
		this.bal=0.0;
		this.dob=null;
	}
	public Account01(int accountid, String name, double bal, Date01 dob) {
		super();
		this.accountid = accountid;
		this.name = name;
		this.bal = bal;
		this.dob=dob;
	}
	@Override
	public String toString() {
		return "accountid=" + accountid + ", name=" + name + ", bal="
				+ bal + ", DateOfBirth=" + dob;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		this.accountid=in.readInt();
		this.name=in.readUTF();
		this.bal=in.readDouble();
		this.dob=(Date01)in.readObject();
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(accountid);
		out.writeUTF(name);
		out.writeDouble(bal);
		out.writeObject(dob);
	}
	
}

public class ExternaliseTest {

	public static void main(String[] args) throws Exception {
		Date01 d=new Date01(21, 05, 1993);
		Account01 acc1=new Account01(4751, "Shariful", 2500, d);
		File file=new File("accountext.dat");

		/*---serialization---*/
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		acc1.writeExternal(oos);
		oos.flush();
		fos.close();
		
		/*---deserialization---*/
		Account01 acc2=new Account01();
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		acc2.readExternal(ois);
		fis.close();
		ois.close();
		
		System.out.println("Account: "+acc1);
		System.out.println("Account: "+acc2);
	}

}
