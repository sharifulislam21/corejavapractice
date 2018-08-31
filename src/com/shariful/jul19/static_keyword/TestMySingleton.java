package com.shariful.jul19.static_keyword;

public class TestMySingleton {
	public static void main(String[] args) {
		MySingleton obj = MySingleton.getInstance();
		obj.testSingleton();
	}
}

class MySingleton {

	private static MySingleton instance;

	static {
		instance = new MySingleton();
	}

	private MySingleton() {
		System.out.println("Creating Singleton Object!");
	}

	public static MySingleton getInstance() {
		return instance;
	}

	public void testSingleton() {
		System.out.println("Instance got created..!");
	}
}
