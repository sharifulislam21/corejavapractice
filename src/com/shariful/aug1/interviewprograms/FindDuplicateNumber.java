package com.shariful.aug1.interviewprograms;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumber {

	public int findDuplicateNumber(List<Integer> numbers) {

		int highestNumber = numbers.size()-1;
		int total = getSum(numbers);
		int duplicateNum = total - (highestNumber*(highestNumber+1)/2);
		
		return duplicateNum;
	}

	public int getSum(List<Integer> numbers) {
		int sum = 0;
		for(int num:numbers){
			sum+=num;
		}
		System.out.println("Sum: "+sum);
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<10;i++){
			numbers.add(i);
		}
		
		numbers.add(7);
		
		FindDuplicateNumber obj = new FindDuplicateNumber();
		System.out.println("Duplicate Number: "+obj.findDuplicateNumber(numbers));	
	}
}
