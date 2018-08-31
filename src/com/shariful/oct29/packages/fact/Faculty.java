package com.shariful.oct29.packages.fact;

public class Faculty
{
	//int marks=50;
	static int marks=60;
	public void getStudentMarks(int roll_no)
	{
		System.out.println("Marks: " + marks);		
	}

	public static void main(String args[])
	{
		Faculty f=new Faculty();
		f.getStudentMarks(001);
	}
}