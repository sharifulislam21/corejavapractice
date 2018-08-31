/*ENUM: 
 * Write an enumnamed ‘Status’ with the possible values NEW, REJECTED, ACCEPTED, COMPLETED. 
 * Assign a numeric value to every order status & add possibility to retrieve this value from Status object. 
 * Write a class Order that maintains order status along with order id, name, quantity, price etc.*/

package com.shariful.nov3.enum_demo;

enum Status{
	NEW(1),
	REJECTED(2),
	ACCEPTED(3),
	COMPLETED(4);
	
	private int value;
	Status(int value)
	{
		this.value=value;
	}
	
	public int getValue()
	{
		return this.value;
	}
};

class Order
{
	int orderId;
	String orderName;
	double price;
	int quantity;
	Status status;
	
	
	public Order(int orderId, String orderName, double price, int quantity,
			 Status status) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.price = price;
		this.quantity = quantity;
		this.status = status;
	}
	public String toString()
	{
		return "\nOrderID: " + orderId + "\nOrder Name: " + orderName + 
				"\nPrice: " + price + "\nQuantity: " + quantity + "\nStatus: " + status;
	}
	
}
public class EnumTest {

	public static void main(String[] args) {
		
		Status s=Status.NEW;
		Order obj=new Order(1,"PC",2000,10,s);
		System.out.println(obj);
		
		Status s2=Status.COMPLETED;
		Order obj2=new Order(5,"Laptop",2500,15,s2);
		System.out.println(obj2);
		
	}
}
