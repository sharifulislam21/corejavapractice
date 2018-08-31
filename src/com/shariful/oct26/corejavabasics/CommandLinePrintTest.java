//Write a program to print all command line arguments.

package com.shariful.oct26.corejavabasics;

class CommandLinePrintTest
{
	public static void main(String[] args)
	{
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);	
	}
}
