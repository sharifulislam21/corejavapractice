/*9.STRING:
 * Write a program to prove that class String is immutable &
 * StringBuffer/StringBuilder is mutable.*/

package com.shariful.oct29.string;

public class MutableTest 
{
	public static void main(String[] args) {
		
		String s1=new String("Shariful").intern();
		String s2 = "Shariful";
		System.out.println(s1==s2);
//		System.out.println(s1);
//		String s4 = s1.concat("Islam");
//		System.out.println(s1);
//		System.out.println(s4);
		
//		StringBuilder s2=new StringBuilder("Xoriant");
//		System.out.println(s2);
//		System.out.println("String Length:"+s2.length());
//		System.out.println("String Capacity:"+s2.capacity());
//		s2.append("Solutions");
//		System.out.println(s2);
//		System.out.println("String Length:"+s2.length());
//		System.out.println("String Capacity:"+s2.capacity());
//		s2.append("Pvt. Limited");
//		System.out.println(s2);
//		System.out.println("String Length:"+s2.length());
//		System.out.println("String Capacity:"+s2.capacity());
	}

}

