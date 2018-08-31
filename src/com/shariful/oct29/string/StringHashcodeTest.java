package com.shariful.oct29.string;

import java.util.HashMap;

class Demo{
	
	@Override
	public int hashCode() {
		System.out.println("hashcode method called...");
		return super.hashCode();
	}
}
public class StringHashcodeTest {

	public static void main(String[] args) {
		
		/*String str = "Hello";
		str.hashCode();
		str.hashCode();
		str.hashCode();*/
		
		HashMap<Demo, Integer> hm = new HashMap<>();
		//HashMap<String, Integer> hm = new HashMap<>();
		Demo d = new Demo();
		hm.put(d, 1);
		//hm.put("shari", 1)
		hm.get(d);
		hm.get(d);
		//hm.get("shari");
	}
}
