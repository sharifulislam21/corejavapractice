//Exception Handling Demo

package com.shariful.oct30.exceptionhandling;

public class ExceptionHandlingTest 
{
	public static void main(String[] args) 
	{	
		try												//it contains that code which can generate exception
		{
			int x=0;
			int y=20/x;
			
		}
		catch(ArithmeticException e)					//it catches that exception
		{
			e.printStackTrace();
			System.out.println("Do not divide by zero");
		}
	}

}
