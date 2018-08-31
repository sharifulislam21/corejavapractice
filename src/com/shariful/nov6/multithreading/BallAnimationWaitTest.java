/*MULTITHREADING:
 * Write a program to show 3 balls are moving up & down with different speed. 
 * If any ball reaches top level, it will wait for other balls. 
 * When all balls reach top level then only they will start coming downwards. 
 * Try this assignment with synchronization */

package com.shariful.nov6.multithreading;

import java.awt.*;
import java.awt.event.*;

public class BallAnimationWaitTest extends Frame implements Runnable{

	int redY=500,blueY=500,greenY=500;
	Thread redThread,blueThread,greenThread;
	public BallAnimationWaitTest() {
		
		redThread=new Thread(this);
		greenThread=new Thread(this);
		blueThread=new Thread(this);
		redThread.setName("RedThread");
		greenThread.setName("GreenThread");
		blueThread.setName("BlueThread");
		redThread.start();
		greenThread.start();
		blueThread.start();
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
		g.fillOval(100, redY, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(300, greenY, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(500, blueY, 50, 50);
	}
	public static void main(String[] args) {
		new BallAnimationWaitTest();
	}
	
	public synchronized void check() throws InterruptedException{
		
		if(redY==greenY && greenY==blueY)	
		{
			notifyAll();
		}
		else
		{
			wait();
		}
		
	}
	
	@Override
	public void run() {
		while(true) {
			if(Thread.currentThread().getName().equals("RedThread"))
			{	
				while(redY!=0)
				{
					redY-=5;
					repaint();
				
					try {
							Thread.sleep(10);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					
				try {
						check();
				} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for(redY=0;redY<=500;redY+=5)
				{	
					repaint();
					try {
							Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
				try {
					check();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		else if(Thread.currentThread().getName().equals("GreenThread"))
		{
				while(greenY!=0)
				{
					greenY-=5;
					repaint();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					check();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for(greenY=0;greenY<=500;greenY+=5)
				{	
					repaint();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					check();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		
		else if(Thread.currentThread().getName().equals("BlueThread"))
		{
			
				
				while(blueY!=0)
				{
					blueY-=5;
					repaint();
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					check();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for(blueY=0;blueY<=500;blueY+=5)
				{	
					repaint();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					check();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		
		}
	}

}
