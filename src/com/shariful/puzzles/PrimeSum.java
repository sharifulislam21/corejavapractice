package com.shariful.puzzles;

import java.util.Scanner;

public class PrimeSum {

	public static void main(String args[])
    {
        long range, primeSum=0;
        long startTime = System.currentTimeMillis();
        System.out.print("Enter Range:");
        Scanner sc = new Scanner(System.in);
        range = sc.nextInt();
        
        for(long i=2;i<range;i++)
        {
            int flag=0;
            for(long j=2;j<i;j++)
            {
                if(i%j==0)
                    flag=1;
            }
            if(flag==0)
            {
                //System.out.print(i+" ");
                primeSum=primeSum+i;
            }
        }
        System.out.println("Sum = "+primeSum);
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

}
