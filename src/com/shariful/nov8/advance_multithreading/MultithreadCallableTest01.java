package com.shariful.nov8.advance_multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultithreadCallableTest01 {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(3);
		Callable<Integer> callable = new Callable<Integer>(){
			@Override
			public Integer call() throws Exception 
			{
				System.out.println("Callable Thread started");
				return 1;
			}
		};
		Future<Integer> future = executor.submit(callable);
		try {
			int result = future.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		executor.shutdown();
	}

}
