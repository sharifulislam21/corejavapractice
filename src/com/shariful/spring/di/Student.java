package com.shariful.spring.di;

public class Student {

	private String studentName;
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void display(){
		System.out.println("Student Name: "+studentName);
	}
}
