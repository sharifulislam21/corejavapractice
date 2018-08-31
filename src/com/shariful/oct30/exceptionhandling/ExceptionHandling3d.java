//Exception Handling
//d.	Try with finally

package com.shariful.oct30.exceptionhandling;

public class ExceptionHandling3d {

	public static void main(String[] args) {
		try
		{  
		    int a[]=new int[5];  
		    a[5]=30/0;  
		}  
		
		finally
		{
			 System.out.println("\nfinally executed");
		}

	}

}
