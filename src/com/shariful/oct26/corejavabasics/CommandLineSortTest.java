//Pass integer numbers through command line & display them in sorted fashion.

package com.shariful.oct26.corejavabasics;

public class CommandLineSortTest {

	public static void main(String[] args)
	{
		
		int a[]=new int[5];
		int i,j,temp;
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);	
		}

		for(i=0;i<args.length;i++)
		{
			for(j=0;j<args.length-i-1;j++)
			{
				if(a[j]>a[j+1])					//Bubble Sort Logic
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array is:" + "\n");
		for(i=0;i<args.length;i++)
		{
			System.out.println(a[i] + "\n");
		}

	}
}
