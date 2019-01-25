package com.shariful.nov4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	
	int rollNo, marks;
	String name;
	public Student(int rollNo, int marks, String name) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student : rollNo=" + rollNo + ", marks=" + marks + ", name="
				+ name;
	}

	@Override
	public int compareTo(Student o) {
		return marks>o.marks?1:-1;
	}
	
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student(101, 85, "Shariful"));
		stud.add(new Student(102, 86, "Shruti"));
		stud.add(new Student(103, 95, "Surbhi"));
		stud.add(new Student(104, 75, "Amit"));
		
		//Collections.sort(stud);
		
		Collections.sort(stud, (i,j) -> i.name.equals(j.name)?1:-1);
		
		for(Student s: stud){
			System.out.println(s);
		}
	}
	
	
}
