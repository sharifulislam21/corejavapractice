package com.shariful.jul18.arrays;

public class MaxOfArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,6,9,-10};
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		
		System.out.println("Max of Array:"+max);
	}
}
