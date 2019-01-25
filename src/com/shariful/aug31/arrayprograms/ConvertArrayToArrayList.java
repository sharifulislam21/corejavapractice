/**
 * There are mainly two ways to convert a Java array to arraylist.

1. Using Arrays.asList() method
2. Using Collections.addAll() method
*/

package com.shariful.aug31.arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertArrayToArrayList {
	public static void main(String[] args) {
		
		String str[]= {"C", "C++", "Java", "Python", "C#"};
		
		//Using Arrays.asList() method
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(str));
		
		for(int i=0; i<strList.size();i++){
			System.out.println(strList.get(i));
		}
		
		//Using Collections.addAll() method
		/*
		 * It is faster than Arrays.asList() method. 
		 * */
		ArrayList<String> strList2 = new ArrayList<String>();
		
		Collections.addAll(strList2, str);
		for(int i=0; i<strList2.size();i++){
			System.out.println(strList2.get(i));
		}
	}

}
