/*2.	
 * Write a program that describes the hierarchy of an organization. 
 * Here we need to write 3 classes Employee, Manager & Labour 
 * where Manager & Labour are the sub classes of the Employee. 
 * Manager has incentive & Labour has over time. 
 * Add the functionality to calculate total salary of all the employees. 
 * Use polymorphism i.e. method overriding.*/

package com.shariful.oct27.oopbasics;

class Employee
{
	private int empId;
	private String empName;
	private int empSal;
	
	Employee(int empId, String empName, int empSal) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getSalary() 						//method to be overriden
	{
		return this.empSal;
	}
	
	
}

class Manager extends Employee
{
	private  int incent;

	public Manager(int empId, String empName, int empSal, int incent) 
	{
		super(empId, empName, empSal);
		this.incent = incent;
	}

	public int getSalary() 					//Overriden Method
	{
		return super.getSalary() + this.incent;
	}
	
	
}
class Labour extends Employee
{
	private  int overtime ;

	public Labour(int empId, String empName, int empSal, int overtime) 
	{
		super(empId, empName, empSal);
		this.overtime = overtime;
	}

	public int getSalary() 						//Overriden Method
	{
		return super.getSalary() + this.overtime;
	}
	
}
public class EmployeeTest 
{
	public static int getTotalSalary(Employee[] a)
	{
		int totalSalary=0;
		for(int i=0;i<a.length;i++)
		{
			totalSalary=totalSalary+a[i].getSalary();
		}
		return totalSalary;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee a[]=new Employee[3];
		a[0]=new Manager(3933,"Shariful",20000,5406);
		a[1]=new Labour(2121,"Raj",5000,3010);
		a[2]=new Labour(2123,"Ram",5500,500);
		
		System.out.println("Total Salary of All Employees:"+getTotalSalary(a));
		
	}
}
