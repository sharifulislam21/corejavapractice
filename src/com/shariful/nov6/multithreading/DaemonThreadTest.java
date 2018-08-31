/*2.	MULTITHREADING: 
 * Add a new infinite thread in previous assignment called Tong. 
 * Observe behavior of Tong thread by making it daemon & non-daemon thread.
*/
package com.shariful.nov6.multithreading;

public class DaemonThreadTest implements Runnable {

	String word;
	boolean isDaemon;
	
	public DaemonThreadTest(String word, boolean isDaemon) {
		
		this.word = word;
		this.isDaemon = isDaemon;
	}

	@Override
	public void run() {
	
		try{
			for(int  i = 0; i<10; i++)
            {
                       System.out.println(word);
                       Thread.sleep(300) ;
             }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args)
    { 
        Runnable p1 =  new DaemonThreadTest("PING",false);
        Thread    t1 = new Thread(p1);
        t1.start();

        Runnable p2 = new DaemonThreadTest("\tPONG",false);
        Thread t2 = new Thread(p2);
        t2.start();
        
        Runnable p3 = new DaemonThreadTest("\t\tTONG",true);
        Thread t3 = new Thread(p3);
        t3.start();
    }
}
