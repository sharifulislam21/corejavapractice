/*1.	MULTITHREADING: 
 * Create 2 threads, first displays Ping & another displays Pong on the console. 
 * Try this program with Runnable, Anonymous inner class & extending Thread. */

package com.shariful.nov6.multithreading;

public class MultithreadTest1 extends Thread {
public void run()
{
int i =10;
while(i>0)
{
   if(Thread.currentThread().getName().equals("T1"))
   {
       System.out.println("\nPING");
       try {Thread.sleep(300);} 
       catch (InterruptedException e) {e.printStackTrace();}   
   }
   else if (Thread.currentThread().getName().equals("T2"))
   {
       System.out.println("\tPONG");
       try {Thread.sleep(600);} 
       catch (InterruptedException e) {e.printStackTrace();}
   }
i--;
}
}

public static void main(String[] args) 
{
   Thread t1 = new  MultithreadTest1();
   Thread t2 = new  MultithreadTest1();
   t1.setName("T1");
   t2.setName("T2");
   t1.start();
   t2.start();
}
}
