/*3.PACKAGES: 
 * Add the classes Student & Faculty into stud & fact packages resp. 
 * Faculty has getStudentMarks(introll_no) method. Call this method from Student class.*/

package com.shariful.oct29.packages.stud;

import com.shariful.oct29.packages.fact.Faculty;

import static com.shariful.oct29.packages.fact.Faculty.*;
public class Student
{
	
	public void display(int r)
	{
		System.out.println("Roll No.:" + r);
	}

	public static void main(String args[])
	{
		Student s=new Student();
		s.display(100);
		Faculty f=new Faculty();
		f.getStudentMarks(100);

	}
}
