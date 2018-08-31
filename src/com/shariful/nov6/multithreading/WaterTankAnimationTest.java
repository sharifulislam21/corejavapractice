/*4.	MULTITHREADING: 
 *  Write a program to maintain the water into water tank around 80%.
 *  Water tank has inlet that pours water with the speed of 50 liters/sec & outlet that gets water out at 70 liters/sec. 
 *  Total capacity of water tank is 1000 liters. 
 *  Create a third thread ‘controller’ as daemon thread. Note: use suspend() & resume() methods.
 *  */

package com.shariful.nov6.multithreading;

import java.awt.*;
import java.awt.event.*;

public class WaterTankAnimationTest extends Frame 
{
	int height = 100;
	int y = 400;
	int capacity = 0;					//initial status of tank set to 0

	public WaterTankAnimationTest() {
		setSize(650, 600);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}

	public void paint(Graphics g) {
		System.out.println();
		g.drawString("CAPCITY : "+capacity+" litres", 0, 0);
		//g.setColor(Color.WHITE);
		g.drawRect(200, 100, 300, 400);
		g.setColor(Color.BLUE);
		g.fillRect(202, y, 296, height);

		Thread inlet = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				do
				{	System.out.println("INLET:\t"+capacity);
					if 	(capacity < 950) 
					{		
						try 
						{
							Thread.sleep(1000);
						} 
						catch (InterruptedException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						height += 10;
						y -= 10;
						capacity += 50;
						repaint();
					} 
					else 
					{		
						try 
						{
							Thread.sleep(1000);
						}
						catch (InterruptedException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} while (true);
			}
		});
		
		Thread outlet = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				do {System.out.println("OUTLET:\t"+capacity);
					if (capacity > 50) 
					{	
						try 
						{
							Thread.sleep(1000);
						} catch (InterruptedException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						height -= 15;
						y += 15;
						capacity -= 70;
						repaint();
					} 
					else 
					{
						try 
						{
							Thread.sleep(1000);
						} 
						catch (InterruptedException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} while (true);
			}
		});
		
		Thread controller = new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				if(capacity == 0)
				{
					inlet.start();
					inlet.suspend();
					outlet.start();
					outlet.suspend();
				}
				do {
					System.out.println("CAPACITY:"+ capacity);
					try 
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (capacity < 800) 
					{
						System.out.println("Outlet Suspend");
						outlet.suspend();
						inlet.resume();
						System.out.println("Inlet Resume");
					} 
					else if (capacity >= 800) 
					{
						System.out.println("Inlet Suspend");
						inlet.suspend();
						outlet.resume();
						System.out.println("Outlet Resume");
					}

				} while (true);

			}
		});
		
		controller.setDaemon(true);
		controller.start();
	}
	
	public void startThreads()
	{
		
	}

	public static void main(String[] args) {
		WaterTankAnimationTest mf = new WaterTankAnimationTest();
		mf.startThreads();
	}

}

