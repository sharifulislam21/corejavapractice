/*10.STRING:
 * Print a running banner "Welcome to Java" on the console using StringBuffer or StringBuilder.*/

package com.shariful.oct29.string;

public class StringBannerTest {

	public static void main(String[] args) throws Exception {
		String s1="Welcome to Xoriant ";
		for(;;)
		{
			char ch=s1.charAt(0);
			s1=s1.substring(1)+ch;
			System.out.println(s1);
			Thread.sleep(100);
		}

	}

}

