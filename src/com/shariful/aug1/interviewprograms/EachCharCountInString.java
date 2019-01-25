package com.shariful.aug1.interviewprograms;

import java.util.HashMap;
import java.util.Map;

public class EachCharCountInString {

	static void characterCount(String inputStr){
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = inputStr.toCharArray();
		
		for(char c:strArray){
			if(charCountMap.containsKey(c))
				charCountMap.put(c, charCountMap.get(c)+1);
			
			else
				charCountMap.put(c,1);
		}
		
		System.out.println(charCountMap);
	}
	
	public static void main(String[] args) {

		characterCount("Java J2EE Spring J2SE");
		characterCount("All iss Well");
	}

}
