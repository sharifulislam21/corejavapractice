/*Consider a CUI based application, 
 * where you are asking a user to enter his Login name and password, 
 * after entering the valid user-id and password 
 * it will print the message “Welcome” along with user name. 
 * As per the validation is concerned, the program should keep a track of login attempts.
 * After three attempts a message should be flashed saying “Contact Admin” and 
 * the program should terminate.*/
package com.shariful.nov5.extra_assignment;
import java.util.Scanner;

public class Ques07 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		int count=0;
		
		while(count<3)
		{	
			System.out.print("Enter Your Username:");
			String userid=sc.next();
			System.out.print("Enter Your Password:");
			String passwrd=sc.next();
			if(userid.equalsIgnoreCase("shariful") && passwrd.equals("1234"))
			{
				System.out.println("Welcome "+userid);
				count=3;
			}
			else
			{
				System.out.println("You have entered invalid credentials...");
				count++;
				System.out.println("Login Attempts:"+count);
				if(count==3)
				{
					System.out.println("Maximum Limit of Login Attempt "+count+" is over....Please Contact Admin");	
					System.exit(0);
				}
			}
		}
	}

}


