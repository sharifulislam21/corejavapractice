//Exception Handling
//b.	Nested try/ catch blocks

package com.shariful.oct30.exceptionhandling;

public class ExceptionHandling3b {

	public static void main(String[] args)
	{
	try{  
	    try{  
	     System.out.println("Division...");  
	     int b = 50/0;  
	    }
	    catch(ArithmeticException e)
	    {
	    	System.out.println(e);
	    	System.out.println("\nArithmetic Exception catch executed");
	    }  
	   
	    try{  
	    	int a[]=new int[5];  
	    	a[5]=4;  
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println(e);
	    	System.out.println("\nArrayIndexOutOfBoundsException catch executed");
	    }   
	  }
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("other statement handeled"); 
	}  
  }  
}
