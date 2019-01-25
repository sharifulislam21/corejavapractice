/*
 * Copy Array to Another in Java
 * 
 * There are mainly four different ways to copy all elements of one array into another array in Java.

1. Manually
2. Arrays.copyOf()
3. System.arraycopy()
4. Object.clone()

 */

package com.shariful.aug31.arrayprograms;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		/*
		 * Method 1 : Manually
		 */
		int a[] = { 1, 3, 5, 2, 4 };
		int b[] = new int[a.length];

		// copying one array to another
		for (int i = 0; i < a.length; ++i) {
			b[i] = a[i];
		}
		// printing array
		System.out.println("Array 1 - Copied manually");
		for (int i = 0; i < b.length; ++i) {
			System.out.print(b[i] + " ");
		}

		/*
		 * Method 2 : Arrays.copyOf()
		 */
		int c[] = new int[a.length];

		c = Arrays.copyOf(a, a.length);
		// printing array
		System.out.println("\nArray 2 - Copied using Arrays.copyOf()");
		for (int i = 0; i < c.length; ++i) {
			System.out.print(c[i] + " ");
		}

		/*
		 * Method 3 : System.arraycopy()
		 */
		int d[] = new int[a.length];

		System.arraycopy(a, 0, d, 0, a.length);
		// printing array
		System.out.println("\nArray 3 - Copied using System.arraycopy()");
		for (int i = 0; i < d.length; ++i) {
			System.out.print(d[i] + " ");
		}
		
		/*
		 * Method 4 : Object.clone()
		 */
		int e[] = new int[a.length];
		
		e = a.clone();
		
		// printing array
		System.out.println("\nArray 3 - Copied using Object.clone()");
		for (int i = 0; i < e.length; ++i) {
			System.out.print(e[i] + " ");
		}
		
	}
}
