package com.shariful.aug1.interviewprograms;

import java.nio.file.Files;
import java.util.Scanner;

public class TriangleMaxSum {
	
	/*static int N = 3;

	static int maxPathSum(int tri[][], int m, int n){
		
		for(int i=m-1; i>0; i--){
			for(int j=0; j<= i; j++){
				if(tri[i+1][j] > tri[i+1][j+1])
					tri[i][j] += tri[i+1][j];
				else
					tri[i][j] += tri[i+1][j+1];
			}
		}
		
		return tri[0][0];
	}
	public static void main(String[] args) {
		
		int tri[][] = {	{1,0,0},
						{4,8,0},
						{1,5,3}
					};
		
		System.out.println(maxPathSum(tri,2,2));
	}*/
	
	public static void main(String[] args) {
		
		int arr[][] = { {7},
						{3,8},
						{8,1,3},
						{2,7,4,4},
						{4,5,2,6,5}};
		
		for(int i=arr.length-1; i>0; i--){
			for(int j=0; j<arr[i].length-1; j++){
				
//				arr[i-1][j] += Math.max(arr[i][j], arr[i][j+1]);
				if(arr[i][j]>arr[i][j+1])
					arr[i-1][j] += arr[i][j];
				else
					arr[i-1][j] += arr[i][j+1];

//				System.out.println(arr[i][j]+"->");
			}			
		}
		
		System.out.println(arr[0][0]);
	}
}
