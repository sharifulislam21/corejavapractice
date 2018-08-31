package com.shariful.nov3.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

interface CheckOrder {
    boolean test(OrderApproach02 p);
}
class CheckOrderEligible implements CheckOrder {
    public boolean test(OrderApproach02 p) {
        return p.status == OrderApproach02.Status.ACCEPTED || p.status == OrderApproach02.Status.COMPLETED  && p.getPrice() >= 10000;
    }
}


public class OrderApproach02 {
	
	public enum Status
	{
		NEW,ACCEPTED,REJECTED,COMPLETED;
	}
	
	int orderId;
	String orderName;
	double price;
	int quantity;
	Status status;

	public OrderApproach02(int orderId, String orderName, double price, int quantity,
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
	
	 
	 public static void printOrder(
			    List<OrderApproach02> obj, CheckOrder test) {
			    for (OrderApproach02 p : obj) {
			        if (test.test(p)) {
			            System.out.println(p);
			        }
			    }
			}

		public static void main(String[] args) 
		{
			List<OrderApproach02> orderList=new ArrayList<OrderApproach02>();
			orderList.add(new OrderApproach02(0101,"PC",102000,5,OrderApproach02.Status.ACCEPTED));
			orderList.add(new OrderApproach02(0102,"Laptop",22000,1,OrderApproach02.Status.NEW));
			orderList.add(new OrderApproach02(0103,"Headset",200,1,OrderApproach02.Status.REJECTED));
			orderList.add(new OrderApproach02(0104,"USB Drive",400,1,OrderApproach02.Status.COMPLETED));
			orderList.add(new OrderApproach02(0105,"USB Cable",14000,1,OrderApproach02.Status.COMPLETED));
			printOrder(orderList, new CheckOrderEligible());
		}

}
