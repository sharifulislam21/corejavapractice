package com.shariful.nov5.extra_assignment;
import java.util.Scanner;

//Enter your CTC and display the Tax Amount
/*Note:-Assume slab is consider for Male, Female as well as Senior citizen
Slab A
Income Range:0-1,80,000
Tax payable in Percentage:Nil
Slab B
Income Range:1,81,001-3,00,000
Tax payable in Percentage:10%
Slab C
Income Range:3,00,001-5,00,000
Tax payable in Percentage:20%
Slab D
Income Range:5,00,001-10,00,000
Tax payable in Percentage:30%*/

public class Ques05 {
	
	private static Scanner sc;

	public static void main(String[] args) {

		System.out.println("-----Tax System-----");
		long ctc;
		sc = new Scanner(System.in);
		System.out.println("Enter Your CTC");
		ctc=sc.nextLong();
		double tax;
		//double diff;
		
		if(ctc>0 && ctc<=180000)
			System.out.println("Slab:A\nTax Amount=NIL");
		else if(ctc>180000 && ctc<=300000)
		{
			//diff=ctc-180000;
			tax=ctc*0.1;
			System.out.println("Slab:B\nTax Amount="+tax);
		}
		else if(ctc>300000 && ctc<=500000)
		{
			//diff=ctc-300000;
			tax=ctc*0.2;
			System.out.println("Slab:C\nTax Amount="+tax);
		}
		else if(ctc>500000 && ctc<=1000000)
		{
			//diff=ctc-500000;
			tax=ctc*0.3;
			System.out.println("Slab:D\nTax Amount="+tax);
		}
		else
			System.out.println("Black Money !!!!!!!!");
			
	}

}
