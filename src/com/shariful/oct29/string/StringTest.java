/*8.STRING:
 * Try two ways of creating the string: A) String s = "ABC"; B) String s = new String("ABC"); 
 * Understand the difference between them by using == &equals() method.*/

package com.shariful.oct29.string;

public class StringTest 
{
	public static void main(String[] args) {
		
		String s1="Shariful";
		String s2=new String("Shariful");
		String s3="Shariful";
		String s4=new String("Shariful");
		System.out.println(s1==s3);				//true,from same String Pool
		System.out.println(s1.equals(s3));		//true,equals checks the value
		System.out.println(s1==s2);				//false,not from same StringPool
		System.out.println(s1.equals(s2));		//true
		System.out.println(s2==s4);				//false
		System.out.println(s2.equals(s4));		//true
	}

}

