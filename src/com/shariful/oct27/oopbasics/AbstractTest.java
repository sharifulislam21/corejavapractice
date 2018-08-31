//4.
//Testing Abstract Class Properties

package com.shariful.oct27.oopbasics;

abstract class Vehicle					//abstract class cannot be private or final as it is not allowed										//You cant declare a class abstract without having any abstract method
{
	abstract void vehicleType();		//any method can only be declared abstract if its associated class is abstract
}

class Car extends Vehicle
{
	@Override							//since parent class is abstract, so its methods must be overriden by the child class
	void vehicleType() 
	{
		// TODO Auto-generated method stub
		System.out.println("I am in class Class Car");
	}
	
}

class Bike extends Vehicle
{
	@Override
	void vehicleType() {
		// TODO Auto-generated method stub
		System.out.println("I am in class Class Bike");
	}
	
}
public class AbstractTest 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle alto=new Car();
		Vehicle pulsar=new Bike();
		//Vehicle vehicle=new Vehicle();			//cannot instantiate the abstract class
		
		alto.vehicleType();
		pulsar.vehicleType();
	}

}
