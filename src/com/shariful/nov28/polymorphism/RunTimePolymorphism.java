package com.shariful.nov28.polymorphism;


class Vehicle{
	public void drive(){
		System.out.println("Driving Vehicle...");
	}
}

class Truck extends Vehicle{
	@Override
	public void drive(){
		System.out.println("Driving Truck...");
	}

	public void load(){
		System.out.println("Loading Truck...");
	}
}

class Car extends Vehicle{
	@Override
	public void drive(){
		System.out.println("Driving Car...");
	}
	
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Vehicle vehicleObj = new Vehicle();
		vehicleObj.drive();
		
		Vehicle carObj = new Car();
		carObj.drive();
		
		Vehicle truckObj = new Truck();
		truckObj.drive();
		
		//Compile time error
	    //truckObj.load();
	     
	    Truck truck = new Truck();
	    truck.load();
	}

}
