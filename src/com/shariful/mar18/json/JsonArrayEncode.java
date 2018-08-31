package com.shariful.mar18.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class JsonArrayEncode {
	
	public static void main(String args[]){    
		  JSONArray arr = new JSONArray();  
		  arr.add("Rohit Shende");    
		  arr.add(new Integer(27));    
		  arr.add(new Double(600000)); 
		  System.out.print(arr);  
		  
		  List arr2 = new ArrayList();  
		  arr2.add("Amit");    
		  arr2.add(new Integer(27));    
		  arr2.add(new Double(600000));   
		  String jsonText = JSONValue.toJSONString(arr2);  
		  System.out.print(jsonText); 
		}
}
