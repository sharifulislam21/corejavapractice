package com.shariful.aug1.interviewprograms;

public class FindTwoMaxNumbers {

	public static void main(String[] args) {
		int[] arr = {1,66,5,22,89,43,58,76,98};
		FindTwoMaxNumbers obj = new FindTwoMaxNumbers();
		obj.twoMaxNumbers(arr);
	}

	public void twoMaxNumbers(int[] arr) {
		
		int max1 = 0;
		int max2 = 0;
		for(int i:arr){
			if(max1<i){
				max2 = max1;
				max1 = i;
			}else if(max2<i){
				max2 = i;
			}
		}
		System.out.println("Max One:"+max1);
		System.out.println("Max Two:"+max2);
	}
}
