package com.shariful.aug29.linkedlistprograms;

import java.util.LinkedList;

public class TestJavaLinkedList {

	public static void main(String[] args) {
		LinkedList<String> obj = new LinkedList<String>();
		
		obj.add("Shruti");
		obj.add("Surbhi");
		obj.addFirst("Shariful");
		obj.addLast("Rohit");
		obj.add(3, "Navin");
		System.out.println("Linked List: "+obj);
		
		obj.remove("Surbhi");
		obj.remove(3);
		System.out.println("Linked List: "+obj);
	}
}
