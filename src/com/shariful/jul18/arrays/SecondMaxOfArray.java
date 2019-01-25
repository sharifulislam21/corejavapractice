package com.shariful.jul18.arrays;

public class SecondMaxOfArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,6,9,-10};
		
		int max = arr[0];
		int max2 = arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max2 = max;
				max = arr[i];
				
			} else if(arr[i]>max2){
				max2 = arr[i];
			}
		}
		
		System.out.println("Seocond Max of Array:"+max2);
	}
}
