package com.shariful.nov8.advance_multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultithreadCallableTest02 extends Thread {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Callable<Integer> callable=new Callable<Integer>(){
			@Override
			public Integer call() throws Exception 
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
				return 0;
			}
		};
		Callable<Integer> callable2=new Callable<Integer>(){
			@Override
			public Integer call() throws Exception 
			{
				
				for(int i=0;i<10;i++)
				{
					System.out.println("\tPONG");
					try{
						Thread.sleep(600);
					}
					catch(Exception e)
					{
						
					}
				}
				return 0;
			}
		};
		Future<Integer> future1 = executor.submit(callable);
		Future<Integer> future2 = executor.submit(callable2);
		try {
			int result1 = future1.get();
			int result2 = future2.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		executor.shutdown();
	}

}
