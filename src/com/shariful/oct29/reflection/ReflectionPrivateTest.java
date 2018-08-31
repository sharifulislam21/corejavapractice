/*7.REFLECTION: 
 * Call a private field and private method of a class using reflection. 
 * (Refer: AccessibleObject)*/

package com.shariful.oct29.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Try
{
	private int x=100;
	private String name="Shariful";
	private void print()
	{
		System.out.println("This is a private function...");
	}
}

public class ReflectionPrivateTest {

	public static void main(String[] args) throws Exception {
		
		Try t=new Try();
		
		Method m=Try.class.getDeclaredMethod("print");
		m.setAccessible(true);
		m.invoke(t);
		
		Field f1=Try.class.getDeclaredField("x");
		f1.setAccessible(true);
		System.out.println(f1.get(t));

		Field f2=Try.class.getDeclaredField("name");
		f2.setAccessible(true);
		System.out.println(f2.get(t));
		
	}

}
