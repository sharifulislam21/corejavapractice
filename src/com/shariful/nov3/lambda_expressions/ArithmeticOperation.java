package com.shariful.nov3.lambda_expressions;

public class ArithmeticOperation {
	
	interface MathOperation
	{
		int operation(int a,int b);
	}

	private int operate(int a, int b, MathOperation mathOperation){
	    return mathOperation.operation(a, b);
	 }

	public static void main(String[] args) {
		
		ArithmeticOperation obj=new ArithmeticOperation();
		
		MathOperation addition = (int a, int b) -> a + b;		//With type declaration
		
		MathOperation subtraction = (a, b) -> a - b;			//With out type declaration
		
		MathOperation multiplication = (int a, int b) -> { return a * b; };		//With return statement along with curly braces
		
		MathOperation division = (int a, int b) -> a / b;						//Without return statement and without curly braces
		
		System.out.println("15 + 12 = " + obj.operate(15, 12, addition));
	    System.out.println("10 - 8 = " + obj.operate(10, 8, subtraction));
	    System.out.println("18 x 5 = " + obj.operate(18, 5, multiplication));
	    System.out.println("90 / 18 = " + obj.operate(90, 18, division));

	}
}
