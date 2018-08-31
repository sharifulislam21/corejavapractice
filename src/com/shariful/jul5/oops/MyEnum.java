package com.shariful.jul5.oops;

public class MyEnum {

	private Fruits myFruit;
	
	public MyEnum(Fruits myFruit){
		this.myFruit = myFruit;
	}
	
	public void getFruitsDesc(){
		switch(myFruit){
		case APPLE:
			System.out.println("I love Apple");
			break;
		case MANGO:
			System.out.println("I love Mango");
			break;
		case BANANA:
			System.out.println("I love Banana");
			break;
		default:
			System.out.println("I dont like fruits");
			break;
		}
	}
	
	public static void main(String[] args) {
		MyEnum apple = new MyEnum(Fruits.APPLE);
		apple.getFruitsDesc();
		MyEnum mango = new MyEnum(Fruits.MANGO);
		mango.getFruitsDesc();
		MyEnum banana = new MyEnum(Fruits.BANANA);
		banana.getFruitsDesc();
//		MyEnum obj = new MyEnum(Fruits.LEMON);
//		obj.getFruitsDesc();
	}
}


enum Fruits{
	APPLE, MANGO, BANANA, LEMON;
}