package com.shariful.jul19.static_keyword;

import java.util.ArrayList;
import java.util.List;

public class TestStaticBlockDemo {

	private static List<String> list;
	
	static{
		//created required instances
        //create ur in-memory objects here
		list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
	}
	public void testList(){
		System.out.println("List:" +list);
//		list.add("four");
//		System.out.println("List:" +list);
	}
	
	public static void main(String[] args) {
		TestStaticBlockDemo obj = new TestStaticBlockDemo();
		obj.testList();
	}
}
