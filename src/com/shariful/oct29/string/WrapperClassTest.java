/*11.WRAPPER CLASSES: 
 * Write a program to convert string into different primitives like byte, short, int, long, float, double, char, Boolean etc.*/

package com.shariful.oct29.string;

public class WrapperClassTest 
{
	public static void main(String args[])
	{	
		String string= "100";
		System.out.println(string);
		System.out.println("Boolean : "  + Boolean.parseBoolean(string));
		System.out.println("Byte : "  + Byte.parseByte(string));
		System.out.println("Short : "  + Short.parseShort(string));
		System.out.println("Integer : "  + Integer.parseInt(string));
		System.out.println("Long : "  + Long.parseLong(string));
		System.out.println("Float : "  + Float.parseFloat(string));
		System.out.println("Double : "  + Double.parseDouble(string));
		
	}
}

