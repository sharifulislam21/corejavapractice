/*1.	
 * Write a singleton class.Confirm that singletone class cannot be inherited.*/

package com.shariful.oct27.oopbasics;

public class SingletonTest {
	
	private static SingletonTest m = null;
	
	private SingletonTest()
	{
		
	}

	public static SingletonTest getSingleton()
	{
		if(m==null)
		{
			m= new SingletonTest();
		}
        return m;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonTest a=new SingletonTest();
		SingletonTest b=new SingletonTest();
		System.out.println("object A:"+ a.getSingleton());			//hashcode of both object should be same
		System.out.println("object B:"+ b.getSingleton());			//to prove that, it is a singleton class
	}

}
