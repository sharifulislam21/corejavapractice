/*Supply marks of three subject and declare the result, result declaration is based on  below conditions:
a.	Condition 1: -All subjects marks is greater than 60 is Passed 
b.	Condition 2: -Any two subjects marks are greater than 60 is Promoted
c.	Condition 3: -Any one subject mark is greater than 60 or all subjects’ marks less than 60 is failed.
*/

package com.shariful.oct26.corejavabasics;

class Result
{
	int s1,s2,s3;
	
	public Result(int s1, int s2, int s3) 
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	void printResult()
	{
		System.out.println("Result [Subject 1= " + s1 + ", Subject 2= " + s2 + ", Subject 3= " + s3 + "]");
		
		if(s1>60 && s2>60 && s3>60)
		{
			System.out.println("----PASSED----");
		}
		else if((s1>60 && s2>60) || (s2>60 && s3>60) || (s1>60 && s3>60))
		{
			System.out.println("----PROMOTED----");
		}
		else if((s1>60 && s2<60 && s3<60) || (s2>60 && s3<60 && s1<60) || (s3>60 && s1<60 && s2<60) || (s1<60 && s2<60 && s3<60) )
		{
			System.out.println("----FAILED----");
		}
	}
	
}

class ResultDemo
{
	public static void main(String args[])
	{
		Result result=new Result(23,32,35);
		result.printResult();
	}
}
