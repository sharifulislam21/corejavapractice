package com.shariful.aug1.interviewprograms;


public class RemoveDuplicateFromArray {

	public static int[] removeDuplicate(int[] input) {
		
		int i=0, j=1;
		
		//return if the array length is less than 2
//		if(input.length < 2){
//			return input;
//		}
		
		while(j < input.length){
			if(input[j] == input[i]){
				j++;
				
			}else{
				input[++i] = input[j++];
			}
		}
		
		int[] output = new int[i+1];
		for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }
		return output;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,4,4,4,4,4,5,6,6,7,7,7,8,9};
//		int[] arr = {4,4,5,6,6,7,7,7,8,9,1,2,3,3,4,4,4,4};
//		Arrays.sort(arr);
		int outputArr[] = removeDuplicate(arr);
		for(int i:outputArr){
			System.out.print(i+" ");
		}
	}

	
}
