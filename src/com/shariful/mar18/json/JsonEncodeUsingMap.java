package com.shariful.mar18.json;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;

public class JsonEncodeUsingMap {

	public static void main(String[] args) {
		 Map mapObject=new HashMap();    
		  mapObject.put("name","sonoo");    
		  mapObject.put("age",new Integer(27));    
		  mapObject.put("salary",new Double(600000));   
		  String jsonText = JSONValue.toJSONString(mapObject);  
		  System.out.print(jsonText);  
	}

}
