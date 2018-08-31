//Lottery System

package com.shariful.nov5.extra_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Ques13 {

	private static Scanner sc;

	//User Input Checking Method
	public static boolean checkNumber(int input, int[] array) {
		boolean flag = false;
		for (int x : array) {
			if (x == input) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	//Lottery Number Generator Method
	private static int[] getLotteryNumber(int size) {
		// TODO Auto-generated method stub
		int[] lotteryNumbers = new int[size];
		for (int i = 0; i < lotteryNumbers.length; i++) {
			int random=0;
			do {
				random = (int) (Math.random()*50);
			} while (checkNumber(random, lotteryNumbers));
				
			lotteryNumbers[i] = random;
		}
		return lotteryNumbers;
	}
	
	//Common Number S
	public static int[] common(int[] userinput, int[] lotteryNumbers) {
		int[] commonNumbers = new int[userinput.length];
		int index = 0;
		for(int i=0;i<lotteryNumbers.length;i++)
		{
			if(checkNumber(userinput[i], lotteryNumbers))
			{
				commonNumbers[index++] = userinput[i];
			}
		}
		return Arrays.copyOf(commonNumbers, index);
	}

	public static void main(String[] args) 
	{
		int size=6;
		int input[]=new int[size];
		System.out.println("-----LOTTERY SYSTEM-----");
		System.out.println("Enter your numbers:");
		sc = new Scanner(System.in);
		for(int i=0;i<input.length;i++)
		{
			int userNumber=sc.nextInt();
			if(checkNumber(userNumber,input)||(userNumber<0 || userNumber>49))
			{
				System.out.println("invalid input... enter only unique number in range 1-49");
				i--;
			}
			else
				input[i]=userNumber;
		}
		
		int lotteryNumbers[] = getLotteryNumber(size);
		System.out.println("----------Lottery Numbers----------");
		for (int var : lotteryNumbers) {
			System.out.println(var);
		}
		
		int[] commonNumbers = common(input, lotteryNumbers);
		System.out.println("----------Lottery Bingo Board----------");
		if (commonNumbers.length == 0) {
			System.out.println("Better Luck Next Time...");
		} 
		else 
		{
			System.out.println("Congratulation....Following Number(s) Selected");
			for (int var : commonNumbers) {
				System.out.println(var);
			}
		}
	}
	
}
