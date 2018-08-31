/*5.REFLECTION:
 * Write a class Middleware with the invokeMethod(--) function. 
 * Use this function for calling any method on any class.*/

package com.shariful.oct29.reflection;

import java.lang.reflect.*;

class NameOpr{
	
	String name;
	
	public String getCapName(String name)
	{
	//	this.String.name.toUpperCase(name);
		name = name.toUpperCase();
		System.out.println(name);
		return name;
		
	}
}

class Middleware
{
	public static Object invokeMethod(String classname,String funcName, Class paramTypes[],Object paramValues[]) throws Exception {
		// 	TODO Auto-generated method stub
		//	Method,invoke(), newInstance()
		
		Class myClass=Class.forName(classname);
		Object o=myClass.newInstance();
		Method m=myClass.getDeclaredMethod(funcName, paramTypes);
		
		if(Modifier.isStatic(m.getModifiers()))
			System.out.println("Static");
		
		else
			
			System.out.println("Not Static");
		
		return m.invoke(o, paramValues);	
		
	}
}
public class MiddlewareTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class paramTypes[]=new Class[1];
		paramTypes[0]=Class.forName("java.lang.String");
		
		Object paramValues[]=new Object[1];
		paramValues[0]="Shariful";
		
		Middleware.invokeMethod("NameOpr", "getCapName", paramTypes, paramValues);

	}

}



