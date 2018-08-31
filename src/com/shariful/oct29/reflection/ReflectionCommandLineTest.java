/*6.REFLECTION: 
 * Pass the class name as command line argument. Write a program to instantiate that class. 
 * Note that sometimes the class may have only parameterized constructor.*/

package com.shariful.oct29.reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

class DemoTry 
{
	public DemoTry()
	{
		System.out.println("Default Constructor");
	}
	public DemoTry(String nme) 
	{
		System.out.println("Parametrized Constructor");
	}

}


public class ReflectionCommandLineTest 
{
	public static void methodInvoker(String className) throws Exception
	{
		Class myClass=Class.forName(className);
		boolean flag=true;
		Constructor c[]=myClass.getDeclaredConstructors();
		for(int i=0;i<c.length;i++)
		{

			if(c[i].getParameterCount() == 0)
			{
				flag = false;
				break;
			}
		}
		if (flag)
		{
			Class paraTypes[] = c[0].getParameterTypes();
			Object paramValues[] = new Object[paraTypes.length];
			
			for (int i = 0; i < paraTypes.length; i++) 
			{
				switch (paraTypes[i].toString()) 
				{
				case "int":
					paramValues[i] = 10;
					break;
				case "String":
					paramValues[i] = "Xoriant";
					break;
				case "long":
					paramValues[i] = 10;
					break;
				case "float":
					paramValues[i] = 1.5f;
					break;
				case "short":
					paramValues[i] = (short)0;
					break;
				default:
					paramValues[i] = null;
					break;
				}
			}
			c[0].newInstance(paramValues);			
		}
		else
		{
			myClass.newInstance();
		}
	}
	public static void main(String[] args) throws Exception 
	{	
		methodInvoker(args[0]);
	}
}
