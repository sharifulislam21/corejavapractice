/*10.STRING:
 * Print a running banner "Welcome to Java" on the console using StringBuffer or StringBuilder.*/

package com.shariful.oct29.string;

public class StringBuilderBannerTest {

	public static void main(String[] args) throws Exception {
		
//		StringBuilder obj=new StringBuilder("Welcome to String Builder Banner ");
		StringBuffer obj=new StringBuffer("Welcome to String Builder Banner ");
		System.out.println(obj);
		for(;;)
		{
			char ch=obj.charAt(0);
			obj.delete(0,1);
			obj.append(ch);
			System.out.println(obj);
			Thread.sleep(100);
		}
	}

}
