/**
 *there are two ways to convert ArrayList to array.

Using manual way
Using toArray() method
 */

package com.shariful.aug31.arrayprograms;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Samsung");
		list1.add("MI");
		list1.add("OnePlus");
		list1.add("Google");

		String str1[] = new String[list1.size()];

		/* Manually */
		// converting ArrayList to String Array
		for (int i = 0; i < list1.size(); ++i) {
			str1[i] = list1.get(i);
		}

		// printing the converted String Array
		for (int i = 0; i < str1.length; ++i) {
			System.out.println(str1[i] + " ");
		}

		/* toArray() */
		String str2[] = new String[list1.size()];

		str2 = list1.toArray(str2);
		// printing the converted String Array
		for (int i = 0; i < str2.length; ++i) {
			System.out.println(str2[i] + " ");
		}

	}
}
