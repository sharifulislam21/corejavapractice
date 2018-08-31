//Exception Handling
//a.	Try with multiple catch

package com.shariful.oct30.exceptionhandling;

public class ExceptionHandling3a {

	public static void main(String[] args) {
		
		try{  
		    int a[]=new int[5];  
		    a[5]=30/0;  
		}  
		catch(ArithmeticException e)
		{
			  e.printStackTrace();
			  System.out.println("\ntask1 is completed");
		}  
		catch(ArrayIndexOutOfBoundsException e)
		{
			  // e.printStackTrace();
			   System.out.println("task 2 completed");
		}  
		catch(Exception e)
		{
			System.out.println("common task completed");
		}  

	}

}
