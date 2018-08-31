package com.shariful.aug1.interviewprograms;

public class FindMissingNumer {

	public static void main(String[] args) {
		int[] arrNum = {1,2,3,4,6,7,8};
		int length = arrNum.length;
		int missingNum = getMissingNumber(arrNum, length);
		System.out.println("Missing Number:"+ missingNum);
	}

	private static int getMissingNumber(int[] a,int n) {
		int i, total;
		total = n*(n+1)/2;
		for(i=0;i<n-1;i++){
			total = total-a[i];
		}
		return total;
	} 
}
