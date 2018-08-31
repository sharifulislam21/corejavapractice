/*1.	MULTITHREADING: 
 * Create 2 threads, first displays Ping & another displays Pong on the console. 
 * Try this program with Runnable, Anonymous inner class & extending Thread. */

package com.shariful.nov6.multithreading;


class MultithreadTest2 implements Runnable
{
    String word;
    MultithreadTest2(String s)
    {  
           this.word = s;
    }
    public void run() 
    {
    try
        {
             for(int  i = 0; i<10; i++)
              {
                         System.out.println(word);
                         Thread.sleep(300) ;
               }
         }catch (Exception e)
         { e.printStackTrace(); }
    }
 
    public static void main(String[] args)
    { 
        Runnable p1 =  new MultithreadTest2("PING");
        Thread    t1 = new Thread(p1);
        t1.start();

        Runnable p2 = new MultithreadTest2("\tPONG");
        Thread t2 = new Thread(p2);
        t2.start();
    }
}
 