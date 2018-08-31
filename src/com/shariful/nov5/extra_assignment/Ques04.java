package com.shariful.nov5.extra_assignment;
import java.util.Scanner;

//Take marks of 3 subjects and display the result based upon:
/*Condition 1: -All subjects marks is greater than 60 is Passed
Condition 2: -Any two subjects marks is greater than 60 is Promoted
Condition 3: -Any one subject marks is greater than 60 or all subjects’ marks less than 60 is failed.
*/

public class Ques04 
{
	private static Scanner in;

	public static void main(String args[])
	{	
		int s1,s2,s3;
		System.out.println("------Result------");
		in = new Scanner(System.in);
	    System.out.println("Enter marks of subject 1:");      
	    s1 = in.nextInt();
	    System.out.println("Enter marks of subject 2:");      
	    s2 = in.nextInt();
	    System.out.println("Enter marks of subject 3:");      
	    s3 = in.nextInt();
	    int total=s1+s2+s3;
		System.out.println("Total marks: " +total+"\n");
		

		if(s1>60 && s2>60 && s3>60)
		{
			System.out.println("----PASSED----");
		}
		else if((s1>60 && s2>60) || (s2>60 && s3>60) || (s1>60 && s3>60))
		{
			System.out.println("----PROMOTED----");
		}
		else if((s1>60 && s2<60 && s3<60) || (s2>60 && s3<60 && s1<60) || (s3>60 && s1<60 && s2<60) || (s1<60 && s2<60 && s3<60))
		{
			System.out.println("----FAILED----");
		}		
		
	}

}
