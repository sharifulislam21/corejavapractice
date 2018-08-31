/*7.Develop an application for Dessert shop. 
 * The application should allow owner to add items like Candy, Cookie or IceCream in the shop storage. 
 * Also customers should be able to place an order.
 * DessertItem is an abstract class having two abstract methods getCost(), getTax(). 
 * The sub classes are supposed to override these methods. 
 * When we run the application, it should ask us our role i.e. owner or customer. 
 * If role is owner, we should be able to add dessert items in our storage. 
 * If role is customer, then we should be able to place an order.*/

package com.shariful.oct27.oopbasics;

import java.util.ArrayList;
import java.util.Scanner;

abstract class DessertItem
{
	public String dessertName;
	public double price;
	public int quantity;
	
	abstract double getCost();
	
	void setName(String name)
	{
		this.dessertName=name;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
	void setQuantity(int q)
	{
		this.quantity=q;
	}
	void getDetails()
	{
		System.out.println( dessertName+ " " + price+ " "+ quantity);
	}
	void decrementQuantity()
	{
		quantity--;
	}
	int getQuantity()
	{
		return quantity;
	}
}
class IceCream extends DessertItem
{
	public IceCream()
	{}
		
	double getCost()
	{
		return price;
	}
	
}
class Cookie extends DessertItem
{
	public Cookie()
	{}
	
	double getCost()
	{
		return price;
	}
}
class Candy extends DessertItem
{
	public Candy()
	{}
	
	double getCost()
	{
		return price;
	}
}


class Storage
{
	ArrayList<IceCream> iceCreamList=new ArrayList<IceCream>();
	ArrayList<Cookie> cookieList=new ArrayList<Cookie>();
	ArrayList<Candy> candyList=new ArrayList<Candy>();

}


public class DessertShop {

	/**
	 * @Shariful Islam
	 */
	public static void main(String args[])
	{
		int userChoice,choice,itemChoice;	
		Storage s=new Storage();
		do{
			System.out.println("1. Owner");
			System.out.println("2. Customer");
			System.out.println("3. Display Store");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice");
			Scanner sc =new Scanner(System.in);
			userChoice=sc.nextInt();
			switch(userChoice)
			{
				case 1:						//Owner Menu
					{			
						System.out.println("-----Welcome Owner-----");
						System.out.println("Enter the item you want to add in your Store ...");
						do{
							System.out.println("1. IceCream");
							System.out.println("2. Cookie");
							System.out.println("3. Candy");
							System.out.println("4. Display");
							System.out.print("Please Enter your Choice : ");
							itemChoice=sc.nextInt();
							switch(itemChoice)
							{
								case 1:
									DessertItem iceCream=new IceCream();								
									System.out.print("Enter IceCream Name : ");
									String name=sc.next();
									iceCream.setName(name);
									System.out.print("Enter Price : ");
									double p=sc.nextDouble();
									iceCream.setPrice(p);
									System.out.print("Enter Quantity : ");
									int q=sc.nextInt();
									iceCream.setQuantity(q);
									
									s.iceCreamList.add((IceCream)iceCream);
									System.out.println("Item Added in Store");
									break;
								case 2:
									DessertItem cookie=new Cookie();
									System.out.print("Enter Cookie Name : ");
									cookie.setName(sc.next());
									System.out.print("Enter Price : ");
									cookie.setPrice(sc.nextDouble());
									System.out.print("Enter Quantity : ");
									cookie.setQuantity(sc.nextInt());
									
									s.cookieList.add((Cookie)cookie);
									System.out.println("Item Added in Store...");
									break;
								case 3:
									DessertItem candy=new Candy();
									System.out.print("Enter Candy Name  : ");
									candy.setName(sc.next());
									System.out.print("Enter Price : ");
									candy.setPrice(sc.nextDouble());
									System.out.print("Enter Quantity : ");
									candy.setQuantity(sc.nextInt());
								
									s.candyList.add((Candy)candy);
									System.out.println("Data Added in the Store");
									break;
								case 4:
									
									display_storage(s);				//display all items in store
																
							}										//This is the end of the switch case of owner
							System.out.print("Do you want to continue press 1 : ");
						choice=sc.nextInt();
					}while(choice==1);								//This is the end of owner inserting items in store loop
					break; 											//This break is for Owner Menu 
				}
				case 2: //Customer Menu
					{					
						System.out.println("-----Welcome Customer-----");
						System.out.println("\n***************Dessert Shop Menu Board***************");
						display_storage(s);
						System.out.println("What do you want to buy : ");
						do{
							System.out.println("1. IceCream");
							System.out.println("2. Cookie");
							System.out.println("3. Candy");
							System.out.print("Please Enter your Choice : ");
							itemChoice=sc.nextInt();
						switch(itemChoice)
						{
							case 1:
								{
									System.out.println("\n***********IceCream***********");
									if(s.iceCreamList.size()>0)
									{
										for (int i = 0; i < s.iceCreamList.size(); i++) 
										{
											IceCream iceCream=new IceCream();
											iceCream=s.iceCreamList.get(i);
											System.out.print((i+1)+") ");
											iceCream.getDetails();
										}
									}
									else
									{
										System.out.println("No IceCream Available");
										break;
									}
									System.out.print("Please Select Index for your IceCream : ");
									int j=sc.nextInt();
									for (int i = 0; i < s.iceCreamList.size(); i++) 
									{
										if(i==j-1)
										{
											IceCream iceCream=new IceCream();
											iceCream=s.iceCreamList.get(i);
											iceCream.getDetails();
											if(iceCream.getQuantity()>0)
											{
												iceCream.decrementQuantity();
											}
											else
												System.out.println("Sorry!! No IceCream Available");
											iceCream.getDetails();
										}
									}
									break;
								}
							case 2:
							{
								System.out.println("\n***********Cookie***********");
								if(s.cookieList.size()>0)
								{
									for (int i = 0; i < s.cookieList.size(); i++) 
									{
										Cookie cookie=new Cookie();
										cookie=s.cookieList.get(i);
										System.out.print((i+1)+") ");
							            cookie.getDetails();
									}
								}
								else
								{
									System.out.println("No Cookie Available");
									break;
								}
								System.out.print("Please Select Index for your Cookie : ");
								int j=sc.nextInt();
								for (int i = 0; i < s.cookieList.size(); i++) 
								{
									if(i==j-1)
									{
										Cookie cookie=new Cookie();
										cookie=s.cookieList.get(i);
										cookie.getDetails();
										if(cookie.getQuantity()>0)
										{
											cookie.decrementQuantity();
										}
										else
											System.out.println("Sorry!! No Cookie Available");
										cookie.getDetails();
									}
								}
								break;
							}
							case 3:
							{
								System.out.println("\n***********Candy***********");
								if(s.candyList.size()>0)
								{
									for (int i = 0; i < s.candyList.size(); i++) 
									{
										Candy candy=new Candy();
										candy=s.candyList.get(i);
										System.out.print((i+1)+") ");
							            candy.getDetails();
									}
								}
								else
									System.out.println("No Candy Available");
								
								System.out.print("Please Select Index for your Cookie : ");
								int j=sc.nextInt();
								for (int i = 0; i < s.candyList.size(); i++) 
								{
									if(i==j-1)
									{
										Candy candy=new Candy();
										candy=s.candyList.get(i);
										candy.getDetails();
										if(candy.getQuantity()>0)
										{
											candy.decrementQuantity();
										}
										else
											System.out.println("Sorry!! No Candy Available");
										candy.getDetails();
									}
								}
								break;
							}
							
						}
						System.out.print("Do you want to Exit ....press 1 : ");
						choice=sc.nextInt();
					}while(choice!=1);		
						break;
				}
			
				case 3: 
				{
					display_storage(s);
					break;
				}
			
				case 4:;
		}
	}while(userChoice!=4);
	}
	static void display_storage(Storage s)
	{
		System.out.println("---- Displaying Store ---- ");
		System.out.println("\n***********IceCream***********");
		if(s.iceCreamList.size()>0)
		{
			for (int i = 0; i < s.iceCreamList.size(); i++) 
			{
				IceCream iceCream=new IceCream();
				iceCream=s.iceCreamList.get(i);
	            iceCream.getDetails();
			}
		}
		else
			System.out.println("No IceCream Available");
		
		System.out.println("\n***********Cookie***********");
		if(s.cookieList.size()>0)
		{
			for (int i = 0; i < s.cookieList.size(); i++) 
			{
				Cookie cookie=new Cookie();
				cookie=s.cookieList.get(i);
	            cookie.getDetails();
			}
		}
		else
			System.out.println("No Cookie Available");
		
		System.out.println("\n***********Candy***********");
		if(s.candyList.size()>0)
		{
			for (int i = 0; i < s.candyList.size(); i++) 
			{
				Candy candy=new Candy();
				candy=s.candyList.get(i);
	            candy.getDetails();
			}
		}
		else
			System.out.println("No Candy Available");
		
	}


}
