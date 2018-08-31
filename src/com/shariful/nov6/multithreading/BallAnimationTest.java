/*3.	MULTITHREADING: 
 * Write a program to show 3 balls are moving up & down with different speed. 
 * The base GUI program is already provided.*/

package com.shariful.nov6.multithreading;

import java.awt.*;
import java.awt.event.*;

public class BallAnimationTest extends Frame implements Runnable{

	int rY=500,bY=500,gY=500;
	Thread red,blue,green;
	public BallAnimationTest() {
		red=new Thread(this);
		green=new Thread(this);
		blue=new Thread(this);
		red.setName("RedThread");
		green.setName("GreenThread");
		blue.setName("BlueThread");
		red.start();
		green.start();
		blue.start();
		setBackground(Color.WHITE);
		setSize(650, 600);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}
	public void paint(Graphics g) {	
		g.setColor(Color.RED);
		g.fillOval(100, rY, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(300, gY, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(500, bY, 50, 50);
	}
	public static void main(String[] args) {
		Frame mf = new BallAnimationTest();
	}
	@Override
	public void run() {
	
		if(Thread.currentThread().getName().equals("RedThread"))
		{
			while(true)
			{
				while(rY!=0)
				{
					rY-=5;
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for(rY=0;rY<=500;rY+=5)
				{		
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		else if(Thread.currentThread().getName().equals("GreenThread"))
		{
			while(true)
			{
				while(gY!=0)
				{
					gY-=5;
					repaint();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for(gY=0;gY<=500;gY+=5)
				{	
					repaint();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		else if(Thread.currentThread().getName().equals("BlueThread"))
		{
			while(true)
			{
				while(bY!=0)
				{
					bY-=5;
					repaint();
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for(bY=0;bY<=500;bY+=5)
				{	
					repaint();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}

}
