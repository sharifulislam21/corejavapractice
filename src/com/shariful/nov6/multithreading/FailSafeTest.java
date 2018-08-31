package com.shariful.nov6.multithreading;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeTest {

	public static void main(String[] args) {

		/*----------------Fail Safe------------------*/
		
		final ConcurrentHashMap<String, String> traineeMap=new ConcurrentHashMap<String,String>();
		traineeMap.put("X3931","Navin");
		traineeMap.put("X3932","Amit");
		traineeMap.put("X3933","Shariful");
		
		Thread thread1=new Thread(){
			
			public void run(){
				try{
					Iterator<String> itr=traineeMap.keySet().iterator();
					
					while(itr.hasNext())
					{
						System.out.println(traineeMap.get(itr.next()));
						Thread.sleep(500);
						//traineeMap.put("X3934","Ruchi");						//it wont allow any changes while iterations going on
				}
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		};
	thread1.start();
	Thread thread2=new Thread(){
		
		public void run(){
			try{
				Iterator<String> itr=traineeMap.keySet().iterator();
				
				while(itr.hasNext())
				{
//					System.out.println(traineeMap.get(itr.next()));
//					Thread.sleep(500);
					traineeMap.put("X3934","Ruchi");						//it wont allow any changes while iterations going on
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	};
thread2.start();
	}

}

