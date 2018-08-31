package com.shariful.nov5.extra_assignment;
import java.util.Scanner;


public class Ques12 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int numberStudents=sc.nextInt();
		
		System.out.println("Enter the number of subjects:");
		int numberSubjects=sc.nextInt();
		
		for(int i=0; i<numberStudents;i++)
		{
			System.out.println("Enter marks of Student number:"+(i+1));
			int subjectMarks[]=new int[numberSubjects];
			int sum=0,avg=0;
			for(int j=0;j<numberSubjects;j++)
			{
				
				System.out.println("Enter marks of Subject "+(j+1)+":");
				subjectMarks[j]=sc.nextInt();	
			}
			for(int num : subjectMarks)
			{
				sum+=num;
				avg=sum/numberSubjects;
			}
			System.out.println("Total Marks:"+sum+"\t	Average:"+avg);
		}
		
		

	}

}
