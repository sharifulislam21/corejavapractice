package com.shariful.jul18.arrays;

public class MergeAndSortArray {

	private static void mergeArrays(int[] arr1, int size1, int[] arr2,
			int size2, int[] arr3) {
		
		int i=0, j=0, k=0;
		
		// Traverse both array 
		while(i<size1 && j<size2){
			if(arr1[i]<arr2[j])
				arr3[k++]=arr1[i++];
			else
				arr3[k++]=arr2[j++];
		}
		
		// Store remaining elements of first array 
		while(i<size1){
			arr3[k++]=arr1[i++];
		}
		
		// Store remaining elements of second array 
		while(j<size2){
			arr3[k++]=arr2[j++];
		}
	}
	
	public static void main(String[] args) {
		
		int arr1[] = {0,2,4,6,8,9};
		int size1 = arr1.length;
		
		int arr2[] = {1,3,5,7,9,11,13};
		int size2 = arr2.length;
		
		int arr3[] = new int[size1+size2];
		mergeArrays(arr1, size1, arr2, size2, arr3);
		for(int i=0; i<size1+size2; i++){
			System.out.print(arr3[i]+" ");
		}
	}

}
