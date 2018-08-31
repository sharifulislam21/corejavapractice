/*4.REFLECTION:
 * Write a class that displays information about the constructor, 
 * fields & methods of a class passed as command line argument.*/

package com.shariful.oct29.reflection;

import java.lang.reflect.*;

public class ReflectionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class myClass=Class.forName("java.lang.String");
		
		Constructor c[]=myClass.getDeclaredConstructors();
		for(int i=0;i<c.length;i++)
				System.out.println(c[i]);
		
		Field f[]=myClass.getDeclaredFields();
		for(int i=0;i<f.length;i++)
			System.out.println(f[i]);
		
		Method m[]=myClass.getDeclaredMethods();
		for(int i=0;i<m.length;i++)
			System.out.println(m[i]);
		
		
	}

}
