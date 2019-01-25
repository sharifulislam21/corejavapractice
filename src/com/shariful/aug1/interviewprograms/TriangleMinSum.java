package com.shariful.aug1.interviewprograms;

import java.util.List;

public class TriangleMinSum {

	static int A[][] = {{7},
						{3,8},
						{8,1,0},
						{2,7,4,4},
						{4,5,2,6,5}};
	
	/*public int minimumTotal(List<List<Integer>> triangle){
		
		for(int i= triangle.size()-2; i>=0; i--){
			for(int j=0; j<=i; j++){
				triangle.get(i).set(j, triangle.get(i).get(j) +
						Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
			}
		}
		
		return triangle.get(0).get(0);
		
	}*/
	
	static int minimumTotal(){
		int memo[] = new int[A.length];
		int n = A.length-1;
		
		for(int i=0; i<A[n].length; i++)
			memo[i] = A[n][i];
			
		for(int i=A.length-2; i>=0; i--){
			for(int j=0; j < A[i+1].length -1; j++){
				memo[j]=A[i][j] + (int)Math.min(memo[j], memo[j+1]);
			}
		}
		
		return memo[0];
	}
	
	public static void main(String[] args) {
		System.out.println(minimumTotal());
	}
}
