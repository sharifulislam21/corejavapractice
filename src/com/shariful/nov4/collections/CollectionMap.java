package com.shariful.nov4.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Shruti", "CMP");
		map.put("Shariful", "Datamart");
		map.put("Surbhi", "CI365");
		map.put("Surbhi", "LiveLink");
		
		Set<String> keys = map.keySet();
		
		for(String key: keys){
			System.out.println("Key :"+key+"\t Values: "+map.get(key));
		} 
	}

}
