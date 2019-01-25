package com.shariful.oct30.exceptionhandling;

public class NullPointerExceptionTest {

	public static void main(String[] args) {

		String str = null;

		try {
			if ("cfg".equals(str))
				System.out.println("Same");
			else
				System.out.println("Not Same");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught");
		}
	}
}
