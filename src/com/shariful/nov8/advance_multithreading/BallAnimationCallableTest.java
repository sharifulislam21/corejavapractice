package com.shariful.nov8.advance_multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class BallAnimationCallableTest extends Frame{

	static int redY=500,blueY=500,greenY=500;
	
	public BallAnimationCallableTest() {
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
	
	public static void main(String[] args) 
	{	
		ExecutorService executor = Executors.newFixedThreadPool(3);
		//Frame mf = new BallAnimationCallableTest();
		final BallAnimationCallableTest bf=new BallAnimationCallableTest();
		Callable<Integer> callable1=new Callable<Integer>() {
			@Override
			public Integer call() throws Exception 
			{
				while(true)
				{
					while(redY!=0)
					{
						redY-=5;
						bf.repaint();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					for(redY=0;redY<=500;redY+=5)
					{
						bf.repaint();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}				
				}
				//return 0;
			}
		};
		Callable<Integer> callable2=new Callable<Integer>() {
			@Override
			public Integer call() throws Exception 
			{
				while(true)
				{
					while(greenY!=0)
					{
						greenY-=5;
						bf.repaint();
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					for(greenY=0;greenY<=500;greenY+=5)
					{
						bf.repaint();
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}				
				}
				//return 0;
			}
		};
		Callable<Integer> callable3=new Callable<Integer>() {
			@Override
			public Integer call() throws Exception 
			{
				while(true)
				{
					while(blueY!=0)
					{
						blueY-=5;
						bf.repaint();
						try {
							Thread.sleep(15);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					for(blueY=0;blueY<=500;blueY+=5)
					{
						bf.repaint();
						try {
							Thread.sleep(15);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}				
				}
				//return 0;
			}
		};
		
		Future<Integer> future1 = executor.submit(callable1);

		Future<Integer> future2 = executor.submit(callable2);
		
		Future<Integer> future3 = executor.submit(callable3);
	
	}
}
