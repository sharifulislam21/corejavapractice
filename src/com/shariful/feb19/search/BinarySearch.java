package com.shariful.feb19.search;

public class BinarySearch {

	public static void main(String[] args) {
		 
		BinarySearch bs=new BinarySearch();
		int arr1[]={1,3,5,7,9,11};
		System.out.println("Index of 5 is "+bs.binarySearch(arr1, 5));
		int arr2[]={11,13,15,17,19,21};
		System.out.println("Index of 19 is "+bs.binarySearch(arr2, 19));
	}

	private int binarySearch(int[] inputArr, int key) {
		
		int start=0;
		int end=inputArr.length -1;
		
		while(start<=end){
			int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }		}
		return -1;
	}

}
