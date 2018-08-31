package com.shariful.mar18.json;

import org.json.simple.JSONObject;

public class JsonEncode {

	public static void main(String[] args) {
		JSONObject obj=new JSONObject();    
		  obj.put("name","shariful");    
		  obj.put("age",new Integer(22));    
		  obj.put("salary",new Double(30000));    
		  System.out.println(obj);
	}

}
