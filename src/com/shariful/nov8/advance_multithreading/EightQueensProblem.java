//Eight Queens Problem
package com.shariful.nov8.advance_multithreading;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class EightQueensProblem
{

	int y1 =1; int y2 =2; int y3 = 3;
	int y4 =4; int y5 =5; int y6 = 6;
	int y7 =7; int y8 =8; 
	
	public boolean isCorrectNextStep(int nextStepx1  ,int nextStepy1 ,int prevStepx2  ,int prevStepy2) {
	
		double denomator = nextStepx1 - prevStepx2;
		double numerator = nextStepy1 - prevStepy2;

		if (denomator == 0)
			return false;
		else {
			double div = numerator / denomator;
			
			if (div == 0.0) {

				return false;

			} else if (div == 1.0 || div == -1.0) {
				return false;
			}
			else
			{
				return true;
			}
		}
//		return true;
	}

	public void startSolution() {
		int count =0;

		for(int i1=1;i1<=8;i1++)
		{
			for(int i2=1;i2<=8;i2++)
			{
				for(int i3=1;i3<=8;i3++)
				{
					for(int i4=1;i4<=8;i4++)
					{
						for(int i5=1;i5<=8;i5++)
						{
							for(int i6=1;i6<=8;i6++)
							{
								for(int i7=1;i7<=8;i7++)
								{
									for(int i8=1;i8<=8;i8++)
									{
										if(		  isCorrectNextStep(i1, y1, i2, y2) 
												&&isCorrectNextStep(i1, y1, i3, y3)
												&&isCorrectNextStep(i1, y1, i4, y4) 
												&&isCorrectNextStep(i1, y1, i5, y5)  
												&&isCorrectNextStep(i1, y1, i6, y6) 
												&&isCorrectNextStep(i1, y1, i7, y7)  
												&&isCorrectNextStep(i1, y1, i8, y8)//i1 complete  
												&&isCorrectNextStep(i2, y2, i3, y3)  
												&&isCorrectNextStep(i2, y2, i4, y4)  
												&&isCorrectNextStep(i2, y2, i5, y5)  
												&&isCorrectNextStep(i2, y2, i6, y6)  
												&&isCorrectNextStep(i2, y2, i7, y7)
												&&isCorrectNextStep(i2, y2, i8, y8)//i2 complete
												&&isCorrectNextStep(i3, y3, i4, y4)
												&&isCorrectNextStep(i3, y3, i5, y5)
												&&isCorrectNextStep(i3, y3, i6, y6)
												&&isCorrectNextStep(i3, y3, i7, y7)
												&&isCorrectNextStep(i3, y3, i8, y8)//i3 complete
												&&isCorrectNextStep(i4, y4, i5, y5)
												&&isCorrectNextStep(i4, y4, i6, y6)
												&&isCorrectNextStep(i4, y4, i7, y7)
												&&isCorrectNextStep(i4, y4, i8, y8)//i4 complete
												&&isCorrectNextStep(i5, y5, i6, y6)
												&&isCorrectNextStep(i5, y5, i7, y7)
												&&isCorrectNextStep(i5, y5, i8, y8)//i5 complete
												&&isCorrectNextStep(i6, y6, i7, y7)
												&&isCorrectNextStep(i6, y6, i8, y8)//i6 complete
												&&isCorrectNextStep(i7, y7, i8, y8)//i7 complete
												){
											
											System.out.println(++count + " -   ");
											System.out.print("["+i1+","+y1+"]");
											System.out.print("["+i2+","+y2+"]");
											System.out.print("["+i3+","+y3+"]");
											System.out.print("["+i4+","+y4+"]");
											System.out.print("["+i5+","+y5+"]");
											System.out.print("["+i6+","+y6+"]");
											System.out.print("["+i7+","+y7+"]");
											System.out.println("["+i8+","+y8+"]");
											
											
										}
											
									}	
								}	
							}	
						}	
					}	
				}	
			}	
		}
		System.out.println("ENDED");
		ExecutorService executorService = Executors.newFixedThreadPool(8);
		ArrayList<Future<String>> chessFuture = new ArrayList<Future<String>>();
		chessFuture.add(executorService.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				
				
				return null;
			}
		}));

	}

	public static void main(String[] args) {
		EightQueensProblem eightQueensProblem = new EightQueensProblem();
		eightQueensProblem.startSolution();		

	}

}
