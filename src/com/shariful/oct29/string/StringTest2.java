//Explains the differe3nce between mutability and immutability 

package com.shariful.oct29.string;

public class StringTest2 {

	public static void main(String[] args) {
		String s = new String("Shariful");
		s.concat("Islam");
		System.out.println(s);					//it will print "Shariful" only, since string is immutable
		
		StringBuilder sb = new StringBuilder("Shariful");
		sb.append("Islam");
		System.out.println(sb);					//since StringBuilder is mutable/changeable, it can display SharifulIslam
	}

}
