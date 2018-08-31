//Generate Armstrong number from 100 to 999

package com.shariful.nov5.extra_assignment;
public class Ques03 {

	public static void main(String[] args) {

		System.out.println("List of Armstrong Number from 100 to 999 are:");
		
		for(int i=100;i<999;i++)
		{
			 int a = i / 100;
	         int b = (i - a * 100) / 10;
	         int c = (i - a * 100 - b * 10);
	 
	         int d = a*a*a + b*b*b + c*c*c;
	 
	         if(i == d)
	            System.out.println("\t"+ i);
		}
		
		

	}

}
