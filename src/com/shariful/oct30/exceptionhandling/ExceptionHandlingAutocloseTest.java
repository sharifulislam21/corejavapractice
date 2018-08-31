//Exception Handling
//Write a user defined auto closable class & test its close method invocation by using the try with resources.

package com.shariful.oct30.exceptionhandling;

class Test implements AutoCloseable
{
	Test()
	{
		System.out.println("This is a Test Class..");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Process Autoclosed...");
	}
	
}

public class ExceptionHandlingAutocloseTest 
{
	public static void main(String[] args)
	{
		try
		{  
			Test a=new Test();
			a.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
