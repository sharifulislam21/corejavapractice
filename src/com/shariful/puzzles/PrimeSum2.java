package com.shariful.puzzles;

import java.util.Scanner;

public class PrimeSum2 {

	public static void main(String[] args) {
	    
		long range, primeSum = 2;
		System.out.print("Enter Range:");
		Scanner sc = new Scanner(System.in);
	    range = sc.nextInt();
	    
	    for (int i = 3; i <= range; i++) {
	        boolean prime = isPrime(i);
	        if(prime){
	            primeSum+=i;
	        }
	    }
	    
	    System.out.println("Sum = " + primeSum);
	}

	public static boolean isPrime(int n) {
	    
	    if (n % 2 == 0)
	        return false;
	 
	    for (int i = 3; i*i <= n; i += 2) {
	        if (n % i == 0)
	            return false;
	    }
	    return true;
	}
	
}
