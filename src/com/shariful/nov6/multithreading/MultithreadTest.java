/*1.	MULTITHREADING: 
 * Create 2 threads, first displays Ping & another displays Pong on the console. 
 * Try this program with Runnable, Anonymous inner class & extending Thread. */

package com.shariful.nov6.multithreading;

class PingPongThreadTest implements Runnable
{
	String msg;

	public PingPongThreadTest(String msg) {
		
		this.msg = msg;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("PING"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("PING");
				try{
					Thread.sleep(300);
				}
				catch(Exception e)
				{
					
				}
			}
		}
		else if(currentThread.getName().equals("PONG"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("PONG");
				try{
					Thread.sleep(600);
				}
				catch(Exception e)
				{
					
				}
			}

		}
		
	}
	public void start() {
		// TODO Auto-generated method stub
		
	}
}

public class MultithreadTest {

	public static void main(String[] args) {
	
		PingPongThreadTest t1=new PingPongThreadTest("PING");
		PingPongThreadTest t2=new PingPongThreadTest("PONG");
		t1.start();
		t2.start();
		
	}

}
