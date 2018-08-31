package com.shariful.nov3.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class OrderApproach01 
{	
	public enum Status
	{
		NEW,ACCEPTED,REJECTED,COMPLETED;
	}

	int orderId;
	String orderName;
	double price;
	int quantity;
	Status status;
	
	public OrderApproach01(int orderId, String orderName, double price, int quantity,
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
		return "\nOrderID: " + orderId + "\nOrder Name: " + orderName + "\nPrice: " + price + "\nQuantity: " + quantity + "\nStatus: " + status;
	}
	
	 public double getPrice() {
		 return price;
	    }
	
	public static void printPriceMoreThan(List<OrderApproach01> obj) {
	    for (OrderApproach01 p : obj) {
	        if (p.getPrice() >= 10000) {
	           System.out.println(p);
	        }
	    }
	}
	
	public static void main(String[] args) 
	{
		List<OrderApproach01> orderList=new ArrayList<OrderApproach01>();
		orderList.add(new OrderApproach01(0001,"PC",102000,5,OrderApproach01.Status.ACCEPTED));
		orderList.add(new OrderApproach01(0002,"Laptop",22000,1,OrderApproach01.Status.NEW));
		orderList.add(new OrderApproach01(0003,"Headset",200,1,OrderApproach01.Status.REJECTED));
		orderList.add(new OrderApproach01(0004,"USB Drice",400,1,OrderApproach01.Status.COMPLETED));
		printPriceMoreThan(orderList);
	}

}
