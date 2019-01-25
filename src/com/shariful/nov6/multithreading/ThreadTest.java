package com.shariful.nov6.multithreading;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Before Sleeping");
 
//        try
//        {
            Thread.sleep(5000);
//        }
//        catch (InterruptedException e)
//        {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
 
        System.out.println("After Sleeping");
    }
}
