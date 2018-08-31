//Exception Handling
//c.	Try, catch & finally

package com.shariful.oct30.exceptionhandling;

public class ExceptionHandling3c {

	public static void main(String[] args) {
		
		try{  
		    int a[]=new int[5];  
		    a[5]=30/0;  
		}  
		catch(ArithmeticException e)
		{
			  e.printStackTrace();
			  System.out.println("\ncatch executed");
		}
		finally
		{
			 System.out.println("\nfinally executed");
		}
	}

}
