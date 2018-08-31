package com.shariful.aug1.interviewprograms;

public class ReverseNumber {

	public int reverseNumber(int num){
		int revNum = 0;
		while(num !=0) {
			int mod = num%10;
			revNum = (revNum*10) + mod;
			num = num/10;
		}
		return revNum;
	}
	
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		System.out.println("Reverse Number: "+obj.reverseNumber(123));
	}
}
