package com.shariful.aug1.concepts;

import java.util.Collections;
import java.util.List;

public final class TestImmutability {

	private final int id;
	private static List<String> list;

	
	public TestImmutability(int id, List<String> list) {
		
		this.id = id;
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public List<String> getList() {
		return list;
	}

	public static void main(String[] args) {

		list = Collections.unmodifiableList(list);
		
	}

}
